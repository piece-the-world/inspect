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

class p
implements v {
    o a;
    int b;
    int c;
    int d;

    p(o o2, int n2, int n3, int n4) {
        this.a = o2;
        this.b = n2;
        this.c = n3;
        this.d = n4;
    }

    @Override
    public void a(k k2, com.growingio.b.a.o o2, a a2) throws e {
        int n2 = k2.e(a2);
        if (n2 != this.d) {
            throw new e("$proceed() with a wrong number of parameters");
        }
        k2.a(a2, new int[n2], new int[n2], new String[n2]);
        o2.j(this.b);
        if (this.b == 189) {
            o2.m(this.c);
        } else if (this.b == 188) {
            o2.b(this.c);
        } else {
            o2.m(this.c);
            o2.b(this.d);
            o2.k(1 - this.d);
        }
        k2.b(this.a);
    }

    @Override
    public void a(l l2, a a2) throws e {
        l2.b(this.a);
    }
}

