/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.f;

import com.growingio.d.a.f.H;
import com.growingio.d.a.f.a;
import com.growingio.d.a.p;
import com.growingio.d.a.r;
import org.xml.sax.Attributes;

final class v
extends H {
    final /* synthetic */ a a;

    v(a a2) {
        this.a = a2;
        super(a2);
    }

    @Override
    public final void a(String string, Attributes attributes) {
        int n2 = Integer.parseInt(attributes.getValue("line"));
        p p2 = this.a((Object)attributes.getValue("start"));
        this.a().b(n2, p2);
    }
}

