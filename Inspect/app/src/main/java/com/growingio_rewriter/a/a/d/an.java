/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.al;
import com.growingio.a.a.d.am;
import com.growingio.a.a.d.nF;

class an
extends nF<R, C, V> {
    final int a;
    final int b;
    final /* synthetic */ int c;
    final /* synthetic */ am d;

    an(am am2, int n2) {
        this.d = am2;
        this.c = n2;
        this.a = this.c / al.a(this.d.a).size();
        this.b = this.c % al.a(this.d.a).size();
    }

    @Override
    public R a() {
        return (R)al.b(this.d.a).get(this.a);
    }

    @Override
    public C b() {
        return (C)al.a(this.d.a).get(this.b);
    }

    @Override
    public V c() {
        return this.d.a.a(this.a, this.b);
    }
}

