/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.d;

import com.growingio.b.b.a.a;
import com.growingio.b.b.e;
import com.growingio.b.b.k;
import com.growingio.b.b.l;
import com.growingio.b.b.v;
import com.growingio.b.o;

class b
implements v {
    int a;
    o b;

    b(int n2, o o2) {
        this.a = n2;
        this.b = o2;
    }

    @Override
    public void a(k k2, com.growingio.b.a.o o2, a a2) throws e {
        if (k2.e(a2) != 1) {
            throw new e("$proceed() cannot take more than one parameter for cast");
        }
        k2.a(a2, new int[1], new int[1], new String[1]);
        o2.j(192);
        o2.m(this.a);
        k2.b(this.b);
    }

    @Override
    public void a(l l2, a a2) throws e {
        l2.a(a2, new int[1], new int[1], new String[1]);
        l2.b(this.b);
    }
}

