/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.f;

import com.growingio.d.a.a;
import com.growingio.d.a.e.i;
import com.growingio.d.a.f.ad;
import com.growingio.d.a.f.ae;
import com.growingio.d.a.f.af;
import com.growingio.d.a.m;
import com.growingio.d.a.p;
import com.growingio.d.a.r;
import com.growingio.d.a.u;
import com.growingio.d.a.v;
import java.util.HashMap;
import java.util.Map;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.AttributesImpl;

public final class ag
extends r {
    static final String[] a = new String[]{"top", "int", "float", "double", "long", "null", "uninitializedThis"};
    ad b;
    int c;
    private final Map<p, String> f;

    public ag(ad ad2, int n2) {
        super(327680);
        this.b = ad2;
        this.c = n2;
        this.f = new HashMap<p, String>();
    }

    @Override
    public void a(String string, int n2) {
        AttributesImpl attributesImpl = new AttributesImpl();
        if (string != null) {
            attributesImpl.addAttribute("", "name", "name", "", string);
        }
        StringBuilder stringBuilder = new StringBuilder();
        af.a(n2, stringBuilder);
        attributesImpl.addAttribute("", "access", "access", "", stringBuilder.toString());
        this.b.b("parameter", attributesImpl);
    }

    @Override
    public final void a_() {
        if ((this.c & 1792) == 0) {
            this.b.a("code", new AttributesImpl());
        }
    }

    @Override
    public void a(int n2, int n3, Object[] arrobject, int n4, Object[] arrobject2) {
        AttributesImpl attributesImpl = new AttributesImpl();
        switch (n2) {
            case -1: 
            case 0: {
                if (n2 == -1) {
                    attributesImpl.addAttribute("", "type", "type", "", "NEW");
                } else {
                    attributesImpl.addAttribute("", "type", "type", "", "FULL");
                }
                this.b.a("frame", attributesImpl);
                this.a(true, n3, arrobject);
                this.a(false, n4, arrobject2);
                break;
            }
            case 1: {
                attributesImpl.addAttribute("", "type", "type", "", "APPEND");
                this.b.a("frame", attributesImpl);
                this.a(true, n3, arrobject);
                break;
            }
            case 2: {
                attributesImpl.addAttribute("", "type", "type", "", "CHOP");
                attributesImpl.addAttribute("", "count", "count", "", Integer.toString(n3));
                this.b.a("frame", attributesImpl);
                break;
            }
            case 3: {
                attributesImpl.addAttribute("", "type", "type", "", "SAME");
                this.b.a("frame", attributesImpl);
                break;
            }
            case 4: {
                attributesImpl.addAttribute("", "type", "type", "", "SAME1");
                this.b.a("frame", attributesImpl);
                this.a(false, 1, arrobject2);
            }
        }
        this.b.a("frame");
    }

    private void a(boolean bl2, int n2, Object[] arrobject) {
        for (int i2 = 0; i2 < n2; ++i2) {
            Object object = arrobject[i2];
            AttributesImpl attributesImpl = new AttributesImpl();
            if (object instanceof String) {
                attributesImpl.addAttribute("", "type", "type", "", (String)object);
            } else if (object instanceof Integer) {
                attributesImpl.addAttribute("", "type", "type", "", a[(Integer)object]);
            } else {
                attributesImpl.addAttribute("", "type", "type", "", "uninitialized");
                attributesImpl.addAttribute("", "label", "label", "", this.b((p)object));
            }
            this.b.b(bl2 ? "local" : "stack", attributesImpl);
        }
    }

    @Override
    public final void a_(int n2) {
        this.b.b(i.d[n2], new AttributesImpl());
    }

    @Override
    public final void a(int n2, int n3) {
        AttributesImpl attributesImpl = new AttributesImpl();
        attributesImpl.addAttribute("", "value", "value", "", Integer.toString(n3));
        this.b.b(i.d[n2], attributesImpl);
    }

    @Override
    public final void b(int n2, int n3) {
        AttributesImpl attributesImpl = new AttributesImpl();
        attributesImpl.addAttribute("", "var", "var", "", Integer.toString(n3));
        this.b.b(i.d[n2], attributesImpl);
    }

    @Override
    public final void a(int n2, String string) {
        AttributesImpl attributesImpl = new AttributesImpl();
        attributesImpl.addAttribute("", "desc", "desc", "", string);
        this.b.b(i.d[n2], attributesImpl);
    }

    @Override
    public final void b(int n2, String string, String string2, String string3) {
        AttributesImpl attributesImpl = new AttributesImpl();
        attributesImpl.addAttribute("", "owner", "owner", "", string);
        attributesImpl.addAttribute("", "name", "name", "", string2);
        attributesImpl.addAttribute("", "desc", "desc", "", string3);
        this.b.b(i.d[n2], attributesImpl);
    }

    @Override
    public final void a(int n2, String string, String string2, String string3, boolean bl2) {
        AttributesImpl attributesImpl = new AttributesImpl();
        attributesImpl.addAttribute("", "owner", "owner", "", string);
        attributesImpl.addAttribute("", "name", "name", "", string2);
        attributesImpl.addAttribute("", "desc", "desc", "", string3);
        attributesImpl.addAttribute("", "itf", "itf", "", bl2 ? "true" : "false");
        this.b.b(i.d[n2], attributesImpl);
    }

    @Override
    public /* varargs */ void a(String string, String string2, m m2, Object ... arrobject) {
        AttributesImpl attributesImpl = new AttributesImpl();
        attributesImpl.addAttribute("", "name", "name", "", string);
        attributesImpl.addAttribute("", "desc", "desc", "", string2);
        attributesImpl.addAttribute("", "bsm", "bsm", "", af.a(m2.toString()));
        this.b.a("INVOKEDYNAMIC", attributesImpl);
        for (int i2 = 0; i2 < arrobject.length; ++i2) {
            this.b.b("bsmArg", ag.b(arrobject[i2]));
        }
        this.b.a("INVOKEDYNAMIC");
    }

    @Override
    public final void a(int n2, p p2) {
        AttributesImpl attributesImpl = new AttributesImpl();
        attributesImpl.addAttribute("", "label", "label", "", this.b(p2));
        this.b.b(i.d[n2], attributesImpl);
    }

    @Override
    public final void a(p p2) {
        AttributesImpl attributesImpl = new AttributesImpl();
        attributesImpl.addAttribute("", "name", "name", "", this.b(p2));
        this.b.b("Label", attributesImpl);
    }

    @Override
    public final void a(Object object) {
        this.b.b(i.d[18], ag.b(object));
    }

    private static AttributesImpl b(Object object) {
        AttributesImpl attributesImpl = new AttributesImpl();
        attributesImpl.addAttribute("", "cst", "cst", "", af.a(object.toString()));
        attributesImpl.addAttribute("", "desc", "desc", "", u.c(object.getClass()));
        return attributesImpl;
    }

    @Override
    public final void c(int n2, int n3) {
        AttributesImpl attributesImpl = new AttributesImpl();
        attributesImpl.addAttribute("", "var", "var", "", Integer.toString(n2));
        attributesImpl.addAttribute("", "inc", "inc", "", Integer.toString(n3));
        this.b.b(i.d[132], attributesImpl);
    }

    @Override
    public final /* varargs */ void a(int n2, int n3, p p2, p ... arrp) {
        AttributesImpl attributesImpl = new AttributesImpl();
        attributesImpl.addAttribute("", "min", "min", "", Integer.toString(n2));
        attributesImpl.addAttribute("", "max", "max", "", Integer.toString(n3));
        attributesImpl.addAttribute("", "dflt", "dflt", "", this.b(p2));
        String string = i.d[170];
        this.b.a(string, attributesImpl);
        for (int i2 = 0; i2 < arrp.length; ++i2) {
            AttributesImpl attributesImpl2 = new AttributesImpl();
            attributesImpl2.addAttribute("", "name", "name", "", this.b(arrp[i2]));
            this.b.b("label", attributesImpl2);
        }
        this.b.a(string);
    }

    @Override
    public final void a(p p2, int[] arrn, p[] arrp) {
        AttributesImpl attributesImpl = new AttributesImpl();
        attributesImpl.addAttribute("", "dflt", "dflt", "", this.b(p2));
        String string = i.d[171];
        this.b.a(string, attributesImpl);
        for (int i2 = 0; i2 < arrp.length; ++i2) {
            AttributesImpl attributesImpl2 = new AttributesImpl();
            attributesImpl2.addAttribute("", "name", "name", "", this.b(arrp[i2]));
            attributesImpl2.addAttribute("", "key", "key", "", Integer.toString(arrn[i2]));
            this.b.b("label", attributesImpl2);
        }
        this.b.a(string);
    }

    @Override
    public final void b(String string, int n2) {
        AttributesImpl attributesImpl = new AttributesImpl();
        attributesImpl.addAttribute("", "desc", "desc", "", string);
        attributesImpl.addAttribute("", "dims", "dims", "", Integer.toString(n2));
        this.b.b(i.d[197], attributesImpl);
    }

    @Override
    public final void a(p p2, p p3, p p4, String string) {
        AttributesImpl attributesImpl = new AttributesImpl();
        attributesImpl.addAttribute("", "start", "start", "", this.b(p2));
        attributesImpl.addAttribute("", "end", "end", "", this.b(p3));
        attributesImpl.addAttribute("", "handler", "handler", "", this.b(p4));
        if (string != null) {
            attributesImpl.addAttribute("", "type", "type", "", string);
        }
        this.b.b("TryCatch", attributesImpl);
    }

    @Override
    public final void d(int n2, int n3) {
        AttributesImpl attributesImpl = new AttributesImpl();
        attributesImpl.addAttribute("", "maxStack", "maxStack", "", Integer.toString(n2));
        attributesImpl.addAttribute("", "maxLocals", "maxLocals", "", Integer.toString(n3));
        this.b.b("Max", attributesImpl);
        this.b.a("code");
    }

    @Override
    public void a(String string, String string2, String string3, p p2, p p3, int n2) {
        AttributesImpl attributesImpl = new AttributesImpl();
        attributesImpl.addAttribute("", "name", "name", "", string);
        attributesImpl.addAttribute("", "desc", "desc", "", string2);
        if (string3 != null) {
            attributesImpl.addAttribute("", "signature", "signature", "", af.a(string3));
        }
        attributesImpl.addAttribute("", "start", "start", "", this.b(p2));
        attributesImpl.addAttribute("", "end", "end", "", this.b(p3));
        attributesImpl.addAttribute("", "var", "var", "", Integer.toString(n2));
        this.b.b("LocalVar", attributesImpl);
    }

    @Override
    public final void b(int n2, p p2) {
        AttributesImpl attributesImpl = new AttributesImpl();
        attributesImpl.addAttribute("", "line", "line", "", Integer.toString(n2));
        attributesImpl.addAttribute("", "start", "start", "", this.b(p2));
        this.b.b("LineNumber", attributesImpl);
    }

    @Override
    public a c() {
        return new ae(this.b, "annotationDefault", 0, null, null);
    }

    @Override
    public a a(String string, boolean bl2) {
        return new ae(this.b, "annotation", bl2 ? 1 : -1, null, string);
    }

    @Override
    public a a(int n2, v v2, String string, boolean bl2) {
        return new ae(this.b, "typeAnnotation", bl2 ? 1 : -1, null, string, n2, v2);
    }

    @Override
    public a a(int n2, String string, boolean bl2) {
        return new ae(this.b, "parameterAnnotation", bl2 ? 1 : -1, n2, string);
    }

    @Override
    public a b(int n2, v v2, String string, boolean bl2) {
        return new ae(this.b, "insnAnnotation", bl2 ? 1 : -1, null, string, n2, v2);
    }

    @Override
    public a c(int n2, v v2, String string, boolean bl2) {
        return new ae(this.b, "tryCatchAnnotation", bl2 ? 1 : -1, null, string, n2, v2);
    }

    @Override
    public a a(int n2, v v2, p[] arrp, p[] arrp2, int[] arrn, String string, boolean bl2) {
        int n3;
        String[] arrstring = new String[arrp.length];
        String[] arrstring2 = new String[arrp2.length];
        for (n3 = 0; n3 < arrstring.length; ++n3) {
            arrstring[n3] = this.b(arrp[n3]);
        }
        for (n3 = 0; n3 < arrstring2.length; ++n3) {
            arrstring2[n3] = this.b(arrp2[n3]);
        }
        return new ae(this.b, "localVariableAnnotation", bl2 ? 1 : -1, null, string, n2, v2, arrstring, arrstring2, arrn);
    }

    @Override
    public void b() {
        this.b.a("method");
    }

    private final String b(p p2) {
        String string = this.f.get(p2);
        if (string == null) {
            string = Integer.toString(this.f.size());
            this.f.put(p2, string);
        }
        return string;
    }
}

