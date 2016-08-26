/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a;

import com.growingio.b.a.Q;
import com.growingio.b.a.b.a;
import com.growingio.b.a.b.d;
import com.growingio.b.a.b.f;
import com.growingio.b.a.b.h;
import com.growingio.b.a.b.i;
import com.growingio.b.a.b.j;
import com.growingio.b.a.b.k;
import com.growingio.b.a.b.l;
import com.growingio.b.a.b.m;
import com.growingio.b.a.b.n;
import com.growingio.b.a.b.o;
import com.growingio.b.a.b.p;
import com.growingio.b.a.b.s;
import com.growingio.b.a.b.t;
import com.growingio.b.a.g;

class e
extends g {
    Q a;
    a[][] b;
    a[] c;
    a d;
    p e;

    e(byte[] arrby, Q q2) {
        super(arrby);
        this.a = q2;
    }

    a[][] a() throws Exception {
        this.d();
        return this.b;
    }

    a[] b() throws Exception {
        this.e();
        return this.c;
    }

    p c() throws Exception {
        this.g(0);
        return this.e;
    }

    @Override
    void a(int n2, int n3) throws Exception {
        a[][] arrarra = new a[n2][];
        for (int i2 = 0; i2 < n2; ++i2) {
            n3 = this.d(n3);
            arrarra[i2] = this.c;
        }
        this.b = arrarra;
    }

    @Override
    int b(int n2, int n3) throws Exception {
        a[] arra = new a[n3];
        for (int i2 = 0; i2 < n3; ++i2) {
            n2 = this.e(n2);
            arra[i2] = this.d;
        }
        this.c = arra;
        return n2;
    }

    @Override
    int a(int n2, int n3, int n4) throws Exception {
        this.d = new a(n3, this.a);
        return super.a(n2, n3, n4);
    }

    @Override
    int c(int n2, int n3) throws Exception {
        n2 = super.c(n2, n3);
        this.d.a(n3, this.e);
        return n2;
    }

    @Override
    void d(int n2, int n3) throws Exception {
        p p22;
        Q q2 = this.a;
        switch (n2) {
            p p22;
            case 66: {
                p22 = new h(n3, q2);
                break;
            }
            case 67: {
                p22 = new i(n3, q2);
                break;
            }
            case 68: {
                p22 = new k(n3, q2);
                break;
            }
            case 70: {
                p22 = new m(n3, q2);
                break;
            }
            case 73: {
                p22 = new n(n3, q2);
                break;
            }
            case 74: {
                p22 = new o(n3, q2);
                break;
            }
            case 83: {
                p22 = new s(n3, q2);
                break;
            }
            case 90: {
                p22 = new com.growingio.b.a.b.g(n3, q2);
                break;
            }
            case 115: {
                p22 = new t(n3, q2);
                break;
            }
            default: {
                throw new RuntimeException("unknown tag:" + n2);
            }
        }
        this.e = p22;
        super.d(n2, n3);
    }

    @Override
    void b(int n2, int n3, int n4) throws Exception {
        this.e = new l(n3, n4, this.a);
        super.b(n2, n3, n4);
    }

    @Override
    void e(int n2, int n3) throws Exception {
        this.e = new j(n3, this.a);
        super.e(n2, n3);
    }

    @Override
    int a(int n2) throws Exception {
        a a2 = this.d;
        n2 = super.a(n2);
        this.e = new d(this.d, this.a);
        this.d = a2;
        return n2;
    }

    @Override
    int f(int n2, int n3) throws Exception {
        f f2 = new f(this.a);
        p[] arrp = new p[n3];
        for (int i2 = 0; i2 < n3; ++i2) {
            n2 = this.g(n2);
            arrp[i2] = this.e;
        }
        f2.a(arrp);
        this.e = f2;
        return n2;
    }
}

