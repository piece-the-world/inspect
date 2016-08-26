/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.d;

import com.growingio.b.V;
import com.growingio.b.b.a.a;
import com.growingio.b.b.e;
import com.growingio.b.b.k;
import com.growingio.b.b.l;
import com.growingio.b.b.v;
import com.growingio.b.d.h;
import com.growingio.b.o;

class j
implements v {
    o a;
    int b;
    int c;
    int d;

    j(o o2, int n2, int n3, int n4) {
        this.a = o2;
        this.c = n4;
        this.b = n2;
        this.d = n3;
    }

    @Override
    public void a(k k2, com.growingio.b.a.o o2, a a2) throws e {
        int n2;
        if (k2.e(a2) != 1) {
            throw new e("$proceed() cannot take more than one parameter for field writing");
        }
        if (h.a(this.b)) {
            n2 = 0;
        } else {
            n2 = -1;
            o2.n(this.c);
        }
        k2.a(a2, new int[1], new int[1], new String[1]);
        k2.c(this.a);
        n2 = this.a instanceof V ? (n2 -= ((V)this.a).ad()) : --n2;
        o2.b(this.b);
        o2.m(this.d);
        o2.k(n2);
        k2.b(o.n);
        k2.g();
    }

    @Override
    public void a(l l2, a a2) throws e {
        l2.a(a2, new int[1], new int[1], new String[1]);
        l2.b(o.n);
        l2.a();
    }
}

