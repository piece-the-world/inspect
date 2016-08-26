/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.f;

import java.io.IOException;
import java.io.Writer;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.ext.LexicalHandler;
import org.xml.sax.helpers.DefaultHandler;

final class X
extends DefaultHandler
implements LexicalHandler {
    private static final char[] a = "                                                                                                        ".toCharArray();
    private Writer b;
    private final boolean c;
    private boolean d = false;
    private int e = 0;

    X(Writer writer, boolean bl2) {
        this.b = writer;
        this.c = bl2;
    }

    @Override
    public final void startElement(String string, String string2, String string3, Attributes attributes) throws SAXException {
        try {
            this.b();
            this.a();
            this.b.write("" + '<' + string3);
            if (attributes != null && attributes.getLength() > 0) {
                this.a(attributes);
            }
            if (this.c) {
                this.d = true;
            } else {
                this.b.write(">\n");
            }
            this.e += 2;
        }
        catch (IOException var5_5) {
            throw new SAXException(var5_5);
        }
    }

    @Override
    public final void endElement(String string, String string2, String string3) throws SAXException {
        this.e -= 2;
        try {
            if (this.d) {
                this.b.write("/>\n");
                this.d = false;
            } else {
                this.a();
                this.b.write("</" + string3 + ">\n");
            }
        }
        catch (IOException var4_4) {
            throw new SAXException(var4_4);
        }
    }

    @Override
    public final void endDocument() throws SAXException {
        try {
            this.b.flush();
        }
        catch (IOException var1_1) {
            throw new SAXException(var1_1);
        }
    }

    @Override
    public final void comment(char[] arrc, int n2, int n3) throws SAXException {
        try {
            this.b();
            this.a();
            this.b.write("<!-- ");
            this.b.write(arrc, n2, n3);
            this.b.write(" -->\n");
        }
        catch (IOException var4_4) {
            throw new SAXException(var4_4);
        }
    }

    @Override
    public final void startDTD(String string, String string2, String string3) throws SAXException {
    }

    @Override
    public final void endDTD() throws SAXException {
    }

    @Override
    public final void startEntity(String string) throws SAXException {
    }

    @Override
    public final void endEntity(String string) throws SAXException {
    }

    @Override
    public final void startCDATA() throws SAXException {
    }

    @Override
    public final void endCDATA() throws SAXException {
    }

    private final void a(Attributes attributes) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = attributes.getLength();
        for (int i2 = 0; i2 < n2; ++i2) {
            stringBuilder.append(' ').append(attributes.getLocalName(i2)).append("=\"").append(X.a(attributes.getValue(i2))).append('\"');
        }
        this.b.write(stringBuilder.toString());
    }

    private static final String a(String string) {
        StringBuilder stringBuilder = new StringBuilder(string.length());
        block6 : for (int i2 = 0; i2 < string.length(); ++i2) {
            char c2 = string.charAt(i2);
            switch (c2) {
                case '&': {
                    stringBuilder.append("&amp;");
                    continue block6;
                }
                case '<': {
                    stringBuilder.append("&lt;");
                    continue block6;
                }
                case '>': {
                    stringBuilder.append("&gt;");
                    continue block6;
                }
                case '\"': {
                    stringBuilder.append("&quot;");
                    continue block6;
                }
                default: {
                    if (c2 > '') {
                        stringBuilder.append("&#").append(Integer.toString(c2)).append(';');
                        continue block6;
                    }
                    stringBuilder.append(c2);
                }
            }
        }
        return stringBuilder.toString();
    }

    private final void a() throws IOException {
        int n2 = this.e;
        while (n2 > 0) {
            if (n2 > a.length) {
                this.b.write(a);
                n2 -= a.length;
                continue;
            }
            this.b.write(a, 0, n2);
            n2 = 0;
        }
    }

    private final void b() throws IOException {
        if (this.d) {
            this.b.write(">\n");
        }
        this.d = false;
    }
}

