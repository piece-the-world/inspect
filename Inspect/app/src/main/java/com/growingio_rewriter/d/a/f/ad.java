/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.f;

import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;

public class ad {
    private final ContentHandler a;

    protected ad(ContentHandler contentHandler) {
        this.a = contentHandler;
    }

    protected ContentHandler a() {
        return this.a;
    }

    protected void b() {
        try {
            this.a.startDocument();
        }
        catch (SAXException var1_1) {
            throw new RuntimeException(var1_1.getMessage(), var1_1.getException());
        }
    }

    protected void c() {
        try {
            this.a.endDocument();
        }
        catch (SAXException var1_1) {
            throw new RuntimeException(var1_1.getMessage(), var1_1.getException());
        }
    }

    protected final void a(String string, Attributes attributes) {
        try {
            this.a.startElement("", string, string, attributes);
        }
        catch (SAXException var3_3) {
            throw new RuntimeException(var3_3.getMessage(), var3_3.getException());
        }
    }

    protected final void a(String string) {
        try {
            this.a.endElement("", string, string);
        }
        catch (SAXException var2_2) {
            throw new RuntimeException(var2_2.getMessage(), var2_2.getException());
        }
    }

    protected final void b(String string, Attributes attributes) {
        this.a(string, attributes);
        this.a(string);
    }
}

