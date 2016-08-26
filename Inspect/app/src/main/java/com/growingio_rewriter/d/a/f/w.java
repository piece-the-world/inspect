/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.f;

import com.growingio.d.a.f.H;
import com.growingio.d.a.f.a;
import com.growingio.d.a.p;
import com.growingio.d.a.r;
import org.xml.sax.Attributes;

final class w
extends H {
    final /* synthetic */ a a;

    w(a a2) {
        this.a = a2;
        super(a2);
    }

    @Override
    public final void a(String string, Attributes attributes) {
        String string2 = attributes.getValue("name");
        String string3 = attributes.getValue("desc");
        String string4 = attributes.getValue("signature");
        p p2 = this.a((Object)attributes.getValue("start"));
        p p3 = this.a((Object)attributes.getValue("end"));
        int n2 = Integer.parseInt(attributes.getValue("var"));
        this.a().a(string2, string3, string4, p2, p3, n2);
    }
}

