/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.al;
import com.growingio.a.a.d.am;
import com.growingio.a.a.d.ao;
import com.growingio.a.a.d.ei;

class at
extends ao<C, V> {
    final int a;
    final /* synthetic */ al b;

    at(al al2, int n2) {
        this.b = al2;
        super(al.d(al2), null);
        this.a = n2;
    }

    @Override
    String a() {
        return "Column";
    }

    @Override
    V b(int n2) {
        return this.b.a(this.a, n2);
    }

    @Override
    V a(int n2, V v2) {
        return this.b.a(this.a, n2, v2);
    }
}

