/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.f;

import com.growingio.d.a.f.H;
import com.growingio.d.a.f.a;
import com.growingio.d.a.p;
import com.growingio.d.a.r;
import org.xml.sax.Attributes;

final class u
extends H {
    final /* synthetic */ a a;

    u(a a2) {
        this.a = a2;
        super(a2);
    }

    @Override
    public final void a(String string, Attributes attributes) {
        this.a().a(this.a((Object)attributes.getValue("name")));
    }
}

