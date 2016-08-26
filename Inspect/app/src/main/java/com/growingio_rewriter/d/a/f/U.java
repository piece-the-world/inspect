/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.f;

import com.growingio.d.a.f.S;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

final class U
extends DefaultHandler {
    private String a;
    private final ContentHandler b;
    private S c;
    private boolean d = false;
    private ContentHandler e;

    U(String string, ContentHandler contentHandler, S s2) {
        this.a = string;
        this.b = contentHandler;
        this.c = s2;
    }

    @Override
    public final void startElement(String string, String string2, String string3, Attributes attributes) throws SAXException {
        if (this.d) {
            this.e.startElement(string, string2, string3, attributes);
        } else if (string2.equals(this.a)) {
            this.e = this.c.a();
            this.e.startDocument();
            this.e.startElement(string, string2, string3, attributes);
            this.d = true;
        } else if (this.b != null) {
            this.b.startElement(string, string2, string3, attributes);
        }
    }

    @Override
    public final void endElement(String string, String string2, String string3) throws SAXException {
        if (this.d) {
            this.e.endElement(string, string2, string3);
            if (string2.equals(this.a)) {
                this.e.endDocument();
                this.d = false;
            }
        } else if (this.b != null) {
            this.b.endElement(string, string2, string3);
        }
    }

    @Override
    public final void startDocument() throws SAXException {
        if (this.b != null) {
            this.b.startDocument();
        }
    }

    @Override
    public final void endDocument() throws SAXException {
        if (this.b != null) {
            this.b.endDocument();
        }
    }

    @Override
    public final void characters(char[] arrc, int n2, int n3) throws SAXException {
        if (this.d) {
            this.e.characters(arrc, n2, n3);
        } else if (this.b != null) {
            this.b.characters(arrc, n2, n3);
        }
    }
}

