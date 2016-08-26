/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.c;

import com.growingio.a.a.b.ab;
import com.growingio.a.a.b.bR;
import com.growingio.a.a.c.B;
import com.growingio.a.a.c.J;
import com.growingio.a.a.c.O;
import com.growingio.a.a.c.aw;
import com.growingio.a.a.c.bg;
import com.growingio.a.a.c.bo;
import com.growingio.a.a.c.e;
import com.growingio.a.a.c.f;
import com.growingio.a.a.c.k;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.concurrent.TimeUnit;

class aq<K, V>
extends J<K, V>
implements Serializable {
    private static final long a = 1;
    final aw b;
    final aw c;
    final ab<Object> d;
    final ab<Object> e;
    final long f;
    final long g;
    final long h;
    final bo<K, V> i;
    final int j;
    final bg<? super K, ? super V> k;
    final bR l;
    final B<? super K, V> m;
    transient e<K, V> n;

    aq(O<K, V> o2) {
        this(o2.m, o2.n, o2.k, o2.l, o2.r, o2.q, o2.o, o2.p, o2.j, o2.u, o2.v, o2.y);
    }

    private aq(aw aw2, aw aw3, ab<Object> ab2, ab<Object> ab3, long l2, long l3, long l4, bo<K, V> bo2, int n2, bg<? super K, ? super V> bg2, bR bR2, B<? super K, V> b2) {
        this.b = aw2;
        this.c = aw3;
        this.d = ab2;
        this.e = ab3;
        this.f = l2;
        this.g = l3;
        this.h = l4;
        this.i = bo2;
        this.j = n2;
        this.k = bg2;
        this.l = bR2 == bR.b() || bR2 == f.d ? null : bR2;
        this.m = b2;
    }

    f<K, V> h() {
        f<K, V> f2 = f.a().a(this.b).b(this.c).a(this.d).b(this.e).b(this.j).a(this.k);
        f2.f = false;
        if (this.f > 0) {
            f2.a(this.f, TimeUnit.NANOSECONDS);
        }
        if (this.g > 0) {
            f2.b(this.g, TimeUnit.NANOSECONDS);
        }
        if (this.i != k.a) {
            f2.a(this.i);
            if (this.h != -1) {
                f2.b(this.h);
            }
        } else if (this.h != -1) {
            f2.a(this.h);
        }
        if (this.l != null) {
            f2.a(this.l);
        }
        return f2;
    }

    private void a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        f<K, V> f2 = this.h();
        this.n = f2.u();
    }

    private Object i() {
        return this.n;
    }

    @Override
    protected e<K, V> f() {
        return this.n;
    }

    @Override
    protected /* synthetic */ Object g() {
        return this.f();
    }
}

