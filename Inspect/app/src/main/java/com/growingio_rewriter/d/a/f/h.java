/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.f;

import com.growingio.d.a.a;
import com.growingio.d.a.f.H;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

final class h
extends H {
    final /* synthetic */ com.growingio.d.a.f.a a;

    h(com.growingio.d.a.f.a a2) {
        this.a = a2;
        super(a2);
    }

    @Override
    public void a(String string, Attributes attributes) throws SAXException {
        a a2 = (a)this.a.a();
        if (a2 != null) {
            a2.a(attributes.getValue("name"), this.a(attributes.getValue("desc"), attributes.getValue("value")));
        }
    }
}

