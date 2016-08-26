/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.f;

import com.growingio.d.a.f.H;
import com.growingio.d.a.f.a;
import com.growingio.d.a.m;
import com.growingio.d.a.r;
import java.util.ArrayList;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

final class t
extends H {
    final /* synthetic */ a a;

    t(a a2) {
        this.a = a2;
        super(a2);
    }

    @Override
    public final void a(String string, Attributes attributes) throws SAXException {
        this.a.a(attributes.getValue("name"));
        this.a.a(attributes.getValue("desc"));
        this.a.a(this.b(attributes.getValue("bsm")));
        this.a.a(new ArrayList());
    }

    @Override
    public final void a(String string) {
        ArrayList arrayList = (ArrayList)this.a.b();
        m m2 = (m)this.a.b();
        String string2 = (String)this.a.b();
        String string3 = (String)this.a.b();
        this.a().a(string3, string2, m2, arrayList.toArray());
    }
}

