/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.f;

import com.growingio.d.a.f.H;
import com.growingio.d.a.f.a;
import com.growingio.d.a.r;
import org.xml.sax.Attributes;

final class B
extends H {
    final /* synthetic */ a a;

    B(a a2) {
        this.a = a2;
        super(a2);
    }

    @Override
    public void a(String string, Attributes attributes) {
        String string2 = attributes.getValue("name");
        int n2 = this.c(attributes.getValue("access"));
        this.a().a(string2, n2);
    }
}

