/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.f;

import com.growingio.d.a.f.H;
import com.growingio.d.a.f.a;
import com.growingio.d.a.p;
import com.growingio.d.a.r;
import org.xml.sax.Attributes;

final class N
extends H {
    final /* synthetic */ a a;

    N(a a2) {
        this.a = a2;
        super(a2);
    }

    @Override
    public final void a(String string, Attributes attributes) {
        p p2 = this.a((Object)attributes.getValue("start"));
        p p3 = this.a((Object)attributes.getValue("end"));
        p p4 = this.a((Object)attributes.getValue("handler"));
        String string2 = attributes.getValue("type");
        this.a().a(p2, p3, p4, string2);
    }
}

