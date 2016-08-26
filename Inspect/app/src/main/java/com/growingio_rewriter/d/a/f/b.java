/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.f;

import com.growingio.d.a.a;
import com.growingio.d.a.f.H;
import com.growingio.d.a.r;
import org.xml.sax.Attributes;

final class b
extends H {
    final /* synthetic */ com.growingio.d.a.f.a a;

    b(com.growingio.d.a.f.a a2) {
        this.a = a2;
        super(a2);
    }

    @Override
    public void a(String string, Attributes attributes) {
        r r2 = (r)this.a.a();
        this.a.a(r2 == null ? null : r2.c());
    }

    @Override
    public void a(String string) {
        a a2 = (a)this.a.b();
        if (a2 != null) {
            a2.b_();
        }
    }
}

