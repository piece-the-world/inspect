/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.f;

import com.growingio.d.a.f.S;
import com.growingio.d.a.f.T;
import java.io.IOException;
import java.io.OutputStream;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

final class V
extends DefaultHandler {
    private final String a = "class";
    private S b;
    private final T c;
    private boolean d;
    private boolean e = false;
    private ContentHandler f;

    V(S s2, T t2, boolean bl2) {
        this.b = s2;
        this.c = t2;
        this.d = bl2;
    }

    @Override
    public final void startElement(String string, String string2, String string3, Attributes attributes) throws SAXException {
        if (this.e) {
            this.f.startElement(string, string2, string3, attributes);
        } else if (string2.equals(this.a)) {
            String string4 = attributes.getValue("name");
            if (string4 == null || string4.length() == 0) {
                throw new SAXException("Class element without name attribute.");
            }
            try {
                this.c.a(this.d ? string4 + ".class.xml" : string4 + ".class");
            }
            catch (IOException var6_6) {
                throw new SAXException(var6_6.toString(), var6_6);
            }
            this.f = this.b.a();
            this.f.startDocument();
            this.f.startElement(string, string2, string3, attributes);
            this.e = true;
        }
    }

    @Override
    public final void endElement(String string, String string2, String string3) throws SAXException {
        if (this.e) {
            this.f.endElement(string, string2, string3);
            if (string2.equals(this.a)) {
                this.f.endDocument();
                this.e = false;
                try {
                    this.c.a();
                }
                catch (IOException var4_4) {
                    throw new SAXException(var4_4.toString(), var4_4);
                }
            }
        }
    }

    @Override
    public final void startDocument() throws SAXException {
    }

    @Override
    public final void endDocument() throws SAXException {
    }

    @Override
    public final void characters(char[] arrc, int n2, int n3) throws SAXException {
        if (this.e) {
            this.f.characters(arrc, n2, n3);
        }
    }
}

