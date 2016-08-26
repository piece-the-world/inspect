/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.f;

import com.growingio.d.a.a;
import com.growingio.d.a.f.H;
import com.growingio.d.a.r;
import org.xml.sax.Attributes;

final class c
extends H {
    final /* synthetic */ com.growingio.d.a.f.a a;

    c(com.growingio.d.a.f.a a2) {
        this.a = a2;
        super(a2);
    }

    @Override
    public void a(String string, Attributes attributes) {
        int n2 = Integer.parseInt(attributes.getValue("parameter"));
        String string2 = attributes.getValue("desc");
        boolean bl2 = Boolean.valueOf(attributes.getValue("visible"));
        this.a.a(((r)this.a.a()).a(n2, string2, bl2));
    }

    @Override
    public void a(String string) {
        a a2 = (a)this.a.b();
        if (a2 != null) {
            a2.b_();
        }
    }
}

