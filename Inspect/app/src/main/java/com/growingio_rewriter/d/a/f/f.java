/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.f;

import com.growingio.d.a.a;
import com.growingio.d.a.f.H;
import org.xml.sax.Attributes;

final class f
extends H {
    final /* synthetic */ com.growingio.d.a.f.a a;

    f(com.growingio.d.a.f.a a2) {
        this.a = a2;
        super(a2);
    }

    @Override
    public void a(String string, Attributes attributes) {
        a a2 = (a)this.a.a();
        this.a.a(a2 == null ? null : a2.a(attributes.getValue("name")));
    }

    @Override
    public void a(String string) {
        a a2 = (a)this.a.b();
        if (a2 != null) {
            a2.b_();
        }
    }
}

