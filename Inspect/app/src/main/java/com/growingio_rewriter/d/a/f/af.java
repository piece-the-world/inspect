/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.f;

import com.growingio.d.a.a;
import com.growingio.d.a.f;
import com.growingio.d.a.f.ad;
import com.growingio.d.a.f.ae;
import com.growingio.d.a.f.ag;
import com.growingio.d.a.f.ah;
import com.growingio.d.a.j;
import com.growingio.d.a.r;
import com.growingio.d.a.v;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.helpers.AttributesImpl;

public final class af
extends f {
    ad a;
    private final boolean b;
    private static final int c = 262144;
    private static final int d = 524288;
    private static final int e = 1048576;

    public af(ContentHandler contentHandler, boolean bl2) {
        super(327680);
        this.a = new ad(contentHandler);
        this.b = bl2;
        if (!bl2) {
            this.a.b();
        }
    }

    @Override
    public void a_(String string, String string2) {
        AttributesImpl attributesImpl = new AttributesImpl();
        if (string != null) {
            attributesImpl.addAttribute("", "file", "file", "", af.a(string));
        }
        if (string2 != null) {
            attributesImpl.addAttribute("", "debug", "debug", "", af.a(string2));
        }
        this.a.b("source", attributesImpl);
    }

    @Override
    public void a(String string, String string2, String string3) {
        AttributesImpl attributesImpl = new AttributesImpl();
        attributesImpl.addAttribute("", "owner", "owner", "", string);
        if (string2 != null) {
            attributesImpl.addAttribute("", "name", "name", "", string2);
        }
        if (string3 != null) {
            attributesImpl.addAttribute("", "desc", "desc", "", string3);
        }
        this.a.b("outerclass", attributesImpl);
    }

    @Override
    public a a(String string, boolean bl2) {
        return new ae(this.a, "annotation", bl2 ? 1 : -1, null, string);
    }

    @Override
    public a a(int n2, v v2, String string, boolean bl2) {
        return new ae(this.a, "typeAnnotation", bl2 ? 1 : -1, null, string, n2, v2);
    }

    @Override
    public void a(int n2, int n3, String string, String string2, String string3, String[] arrstring) {
        StringBuilder stringBuilder = new StringBuilder();
        af.a(n3 | 262144, stringBuilder);
        AttributesImpl attributesImpl = new AttributesImpl();
        attributesImpl.addAttribute("", "access", "access", "", stringBuilder.toString());
        if (string != null) {
            attributesImpl.addAttribute("", "name", "name", "", string);
        }
        if (string2 != null) {
            attributesImpl.addAttribute("", "signature", "signature", "", af.a(string2));
        }
        if (string3 != null) {
            attributesImpl.addAttribute("", "parent", "parent", "", string3);
        }
        attributesImpl.addAttribute("", "major", "major", "", Integer.toString(n2 & 65535));
        attributesImpl.addAttribute("", "minor", "minor", "", Integer.toString(n2 >>> 16));
        this.a.a("class", attributesImpl);
        this.a.a("interfaces", new AttributesImpl());
        if (arrstring != null && arrstring.length > 0) {
            for (int i2 = 0; i2 < arrstring.length; ++i2) {
                AttributesImpl attributesImpl2 = new AttributesImpl();
                attributesImpl2.addAttribute("", "name", "name", "", arrstring[i2]);
                this.a.b("interface", attributesImpl2);
            }
        }
        this.a.a("interfaces");
    }

    @Override
    public j a(int n2, String string, String string2, String string3, Object object) {
        StringBuilder stringBuilder = new StringBuilder();
        af.a(n2 | 524288, stringBuilder);
        AttributesImpl attributesImpl = new AttributesImpl();
        attributesImpl.addAttribute("", "access", "access", "", stringBuilder.toString());
        attributesImpl.addAttribute("", "name", "name", "", string);
        attributesImpl.addAttribute("", "desc", "desc", "", string2);
        if (string3 != null) {
            attributesImpl.addAttribute("", "signature", "signature", "", af.a(string3));
        }
        if (object != null) {
            attributesImpl.addAttribute("", "value", "value", "", af.a(object.toString()));
        }
        return new ah(this.a, attributesImpl);
    }

    @Override
    public r a(int n2, String string, String string2, String string3, String[] arrstring) {
        StringBuilder stringBuilder = new StringBuilder();
        af.a(n2, stringBuilder);
        AttributesImpl attributesImpl = new AttributesImpl();
        attributesImpl.addAttribute("", "access", "access", "", stringBuilder.toString());
        attributesImpl.addAttribute("", "name", "name", "", string);
        attributesImpl.addAttribute("", "desc", "desc", "", string2);
        if (string3 != null) {
            attributesImpl.addAttribute("", "signature", "signature", "", string3);
        }
        this.a.a("method", attributesImpl);
        this.a.a("exceptions", new AttributesImpl());
        if (arrstring != null && arrstring.length > 0) {
            for (int i2 = 0; i2 < arrstring.length; ++i2) {
                AttributesImpl attributesImpl2 = new AttributesImpl();
                attributesImpl2.addAttribute("", "name", "name", "", arrstring[i2]);
                this.a.b("exception", attributesImpl2);
            }
        }
        this.a.a("exceptions");
        return new ag(this.a, n2);
    }

    @Override
    public final void a(String string, String string2, String string3, int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        af.a(n2 | 1048576, stringBuilder);
        AttributesImpl attributesImpl = new AttributesImpl();
        attributesImpl.addAttribute("", "access", "access", "", stringBuilder.toString());
        if (string != null) {
            attributesImpl.addAttribute("", "name", "name", "", string);
        }
        if (string2 != null) {
            attributesImpl.addAttribute("", "outerName", "outerName", "", string2);
        }
        if (string3 != null) {
            attributesImpl.addAttribute("", "innerName", "innerName", "", string3);
        }
        this.a.b("innerclass", attributesImpl);
    }

    @Override
    public final void a() {
        this.a.a("class");
        if (!this.b) {
            this.a.c();
        }
    }

    static final String a(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i2 = 0; i2 < string.length(); ++i2) {
            char c2 = string.charAt(i2);
            if (c2 == '\\') {
                stringBuilder.append("\\\\");
                continue;
            }
            if (c2 < ' ' || c2 > '') {
                stringBuilder.append("\\u");
                if (c2 < '\u0010') {
                    stringBuilder.append("000");
                } else if (c2 < '\u0100') {
                    stringBuilder.append("00");
                } else if (c2 < '\u1000') {
                    stringBuilder.append('0');
                }
                stringBuilder.append(Integer.toString(c2, 16));
                continue;
            }
            stringBuilder.append(c2);
        }
        return stringBuilder.toString();
    }

    static void a(int n2, StringBuilder stringBuilder) {
        if ((n2 & 1) != 0) {
            stringBuilder.append("public ");
        }
        if ((n2 & 2) != 0) {
            stringBuilder.append("private ");
        }
        if ((n2 & 4) != 0) {
            stringBuilder.append("protected ");
        }
        if ((n2 & 16) != 0) {
            stringBuilder.append("final ");
        }
        if ((n2 & 8) != 0) {
            stringBuilder.append("static ");
        }
        if ((n2 & 32) != 0) {
            if ((n2 & 262144) == 0) {
                stringBuilder.append("synchronized ");
            } else {
                stringBuilder.append("super ");
            }
        }
        if ((n2 & 64) != 0) {
            if ((n2 & 524288) == 0) {
                stringBuilder.append("bridge ");
            } else {
                stringBuilder.append("volatile ");
            }
        }
        if ((n2 & 128) != 0) {
            if ((n2 & 524288) == 0) {
                stringBuilder.append("varargs ");
            } else {
                stringBuilder.append("transient ");
            }
        }
        if ((n2 & 256) != 0) {
            stringBuilder.append("native ");
        }
        if ((n2 & 2048) != 0) {
            stringBuilder.append("strict ");
        }
        if ((n2 & 512) != 0) {
            stringBuilder.append("interface ");
        }
        if ((n2 & 1024) != 0) {
            stringBuilder.append("abstract ");
        }
        if ((n2 & 4096) != 0) {
            stringBuilder.append("synthetic ");
        }
        if ((n2 & 8192) != 0) {
            stringBuilder.append("annotation ");
        }
        if ((n2 & 16384) != 0) {
            stringBuilder.append("enum ");
        }
        if ((n2 & 131072) != 0) {
            stringBuilder.append("deprecated ");
        }
        if ((n2 & 32768) != 0) {
            stringBuilder.append("mandated ");
        }
    }
}

