/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.f;

import com.growingio.d.a.f.S;
import javax.xml.transform.Result;
import javax.xml.transform.Templates;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.sax.SAXResult;
import javax.xml.transform.sax.SAXTransformerFactory;
import javax.xml.transform.sax.TransformerHandler;
import org.xml.sax.ContentHandler;

final class ab
implements S {
    private SAXTransformerFactory a;
    private final Templates b;
    private ContentHandler c;

    ab(SAXTransformerFactory sAXTransformerFactory, Templates templates, ContentHandler contentHandler) {
        this.a = sAXTransformerFactory;
        this.b = templates;
        this.c = contentHandler;
    }

    @Override
    public final ContentHandler a() {
        try {
            TransformerHandler transformerHandler = this.a.newTransformerHandler(this.b);
            transformerHandler.setResult(new SAXResult(this.c));
            return transformerHandler;
        }
        catch (TransformerConfigurationException var1_2) {
            throw new RuntimeException(var1_2.toString());
        }
    }
}

