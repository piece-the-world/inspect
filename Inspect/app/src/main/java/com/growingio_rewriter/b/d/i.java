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

class i
implements v {
    o a;
    int b;
    int c;
    int d;

    i(o o2, int n2, int n3, int n4) {
        this.a = o2;
        this.c = n4;
        this.b = n2;
        this.d = n3;
    }

    @Override
    public void a(k k2, com.growingio.b.a.o o2, a a2) throws e {
        int n2;
        if (a2 != null && !k2.d(a2)) {
            throw new e("$proceed() cannot take a parameter for field reading");
        }
        if (h.a(this.b)) {
            n2 = 0;
        } else {
            n2 = -1;
            o2.n(this.c);
        }
        n2 = this.a instanceof V ? (n2 += ((V)this.a).ad()) : ++n2;
        o2.b(this.b);
        o2.m(this.d);
        o2.k(n2);
        k2.b(this.a);
    }

    @Override
    public void a(l l2, a a2) throws e {
        l2.b(this.a);
    }
}

