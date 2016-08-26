/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.al;
import com.growingio.a.a.d.am;
import com.growingio.a.a.d.ao;
import com.growingio.a.a.d.ei;

class ar
extends ao<R, V> {
    final int a;
    final /* synthetic */ al b;

    ar(al al2, int n2) {
        this.b = al2;
        super(al.c(al2), null);
        this.a = n2;
    }

    @Override
    String a() {
        return "Row";
    }

    @Override
    V b(int n2) {
        return this.b.a(n2, this.a);
    }

    @Override
    V a(int n2, V v2) {
        return this.b.a(n2, this.a, v2);
    }
}

