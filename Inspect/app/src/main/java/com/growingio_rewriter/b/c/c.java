/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.c;

import com.growingio.b.K;
import com.growingio.b.a.B;
import com.growingio.b.a.Q;
import com.growingio.b.a.T;
import com.growingio.b.a.as;
import com.growingio.b.a.i;
import com.growingio.b.a.y;
import com.growingio.b.ae;
import com.growingio.b.c.d;
import com.growingio.b.c.j;
import com.growingio.b.o;

public class c
extends d {
    protected o[] a;
    protected int b;
    protected int c;
    protected byte[] d;
    protected byte[] e;

    public c(j j2, K k2, K k3) throws ae {
        super(j2, k2, k3);
        this.dk = k2.c().g();
        this.a = k2.i();
        this.b = 0;
        this.c = 0;
        this.e = null;
        this.d = null;
    }

    @Override
    public void a(Q q2, y y2) {
        super.a(q2, y2);
        this.b = 0;
        this.c = y2.h();
        this.e = null;
        this.d = null;
    }

    @Override
    protected int a(int n2, int n3, B b2, int n4, Q q2) throws i {
        if (this.do == 0) {
            String string = T.b(this.a) + 'V';
            string = T.b(this.di, string);
            int n5 = q2.a(this.dm, string);
            int n6 = q2.a(this.dl);
            this.do = q2.c(n6, n5);
            this.dp = q2;
        }
        if (this.d == null) {
            this.a(this.a, q2);
        }
        return this.a(n3, b2);
    }

    protected int a(int n2, B b2) throws i {
        b2.a(n2);
        b2.a(this.d);
        b2.a(this.e);
        int n3 = b2.h(3);
        b2.a(184, n3);
        b2.b(this.do, n3 + 1);
        b2.a(this.e);
        return b2.f();
    }

    @Override
    public int b() {
        return this.b;
    }

    protected void a(o[] arro, Q q2) {
        com.growingio.b.a.o o2 = new com.growingio.b.a.o(q2, 0, 0);
        com.growingio.b.a.o o3 = new com.growingio.b.a.o(q2, 0, 0);
        int n2 = this.c;
        int n3 = arro == null ? 0 : arro.length;
        o3.n(n2);
        this.a(o2, o3, 0, n3, arro, n2 + 1);
        o2.o(n2);
        this.d = o2.g();
        this.e = o3.g();
    }

    private void a(com.growingio.b.a.o o2, com.growingio.b.a.o o3, int n2, int n3, o[] arro, int n4) {
        if (n2 < n3) {
            int n5 = o3.a(n4, arro[n2]);
            this.a(o2, o3, n2 + 1, n3, arro, n4 + n5);
            o2.b(n4, arro[n2]);
        } else {
            this.b = n4 - this.c;
        }
    }
}

