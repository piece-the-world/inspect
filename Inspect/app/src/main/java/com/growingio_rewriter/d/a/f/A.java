/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.f;

import com.growingio.d.a.f.H;
import com.growingio.d.a.f.a;
import com.growingio.d.a.r;
import org.xml.sax.Attributes;

final class A
extends H {
    final /* synthetic */ a a;

    A(a a2) {
        this.a = a2;
        super(a2);
    }

    @Override
    public final void a(String string, Attributes attributes) {
        int n2 = Integer.parseInt(attributes.getValue("maxStack"));
        int n3 = Integer.parseInt(attributes.getValue("maxLocals"));
        this.a().d(n2, n3);
    }
}

