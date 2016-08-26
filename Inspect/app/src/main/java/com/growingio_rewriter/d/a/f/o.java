/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.f;

import com.growingio.d.a.f;
import com.growingio.d.a.f.H;
import com.growingio.d.a.f.a;
import org.xml.sax.Attributes;

final class o
extends H {
    final /* synthetic */ a a;

    o(a a2) {
        this.a = a2;
        super(a2);
    }

    @Override
    public final void a(String string, Attributes attributes) {
        int n2 = this.c(attributes.getValue("access"));
        String string2 = attributes.getValue("name");
        String string3 = attributes.getValue("outerName");
        String string4 = attributes.getValue("innerName");
        this.a.b.a(string2, string3, string4, n2);
    }
}

