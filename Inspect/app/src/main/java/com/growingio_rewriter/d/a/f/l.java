/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.f;

import com.growingio.d.a.f;
import com.growingio.d.a.f.H;
import com.growingio.d.a.f.a;
import com.growingio.d.a.j;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

final class l
extends H {
    final /* synthetic */ a a;

    l(a a2) {
        this.a = a2;
        super(a2);
    }

    @Override
    public final void a(String string, Attributes attributes) throws SAXException {
        int n2 = this.c(attributes.getValue("access"));
        String string2 = attributes.getValue("name");
        String string3 = attributes.getValue("signature");
        String string4 = attributes.getValue("desc");
        Object object = this.a(string4, attributes.getValue("value"));
        this.a.a(this.a.b.a(n2, string2, string4, string3, object));
    }

    @Override
    public void a(String string) {
        ((j)this.a.b()).a();
    }
}

