/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a.a;

import com.growingio.b.K;
import com.growingio.b.a.a.a;
import com.growingio.b.a.a.e;
import com.growingio.b.a.a.f;
import com.growingio.b.a.a.g;
import com.growingio.b.a.a.h;
import com.growingio.b.a.a.j;
import com.growingio.b.a.a.k;
import com.growingio.b.a.a.m;
import com.growingio.b.a.as;
import com.growingio.b.a.i;
import com.growingio.b.o;

public class d {
    private o a;
    private as b;
    private com.growingio.b.a.a.i[] c;
    private m[] d;

    public d(K k2) throws i {
        this(k2.r_(), k2.c());
    }

    public d(o o2, as as2) throws i {
        com.growingio.b.a.a.i i2;
        this.a = o2;
        this.b = as2;
        this.d = null;
        this.c = (com.growingio.b.a.a.i[])new e(this).a(as2);
        int n2 = this.c.length;
        int[] arrn = new int[n2];
        int n3 = 0;
        while (n3 < n2) {
            i2 = this.c[n3];
            i2.b = n3++;
            i2.d = new com.growingio.b.a.a.i[i2.e()];
            arrn[n3] = 0;
        }
        for (n3 = 0; n3 < n2; ++n3) {
            reference var8_9;
            i2 = this.c[n3];
            for (int i3 = 0; i3 < i2.f(); ++i3) {
                var8_9 = i2.b(i3);
                int[] arrn2 = arrn;
                int n4 = var8_9.b;
                int n5 = arrn2[n4];
                arrn2[n4] = n5 + 1;
                var8_9.d[n5] = i2;
            }
            j[] arrj = i2.g();
            for (var8_9 = (reference)false ? 1 : 0; var8_9 < arrj.length; ++var8_9) {
                com.growingio.b.a.a.i i4 = j.a(arrj[var8_9]);
                int[] arrn3 = arrn;
                int n6 = i4.b;
                int n7 = arrn3[n6];
                arrn3[n6] = n7 + 1;
                i4.d[n7] = i2;
            }
        }
    }

    public com.growingio.b.a.a.i[] a() {
        return this.c;
    }

    public m a(int n2) throws i {
        if (this.d == null) {
            this.d = new a().a(this.a, this.b);
        }
        return this.d[n2];
    }

    public k[] b() {
        int n2 = this.c.length;
        if (n2 == 0) {
            return null;
        }
        k[] arrk = new k[n2];
        boolean[] arrbl = new boolean[n2];
        int[] arrn = new int[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            arrk[i2] = new k(this.c[i2]);
            arrbl[i2] = false;
        }
        f f2 = new f(this, arrk);
        arrk[0].a(null, arrbl, 0, arrn, f2);
        do {
            for (int i3 = 0; i3 < n2; ++i3) {
                arrbl[i3] = false;
            }
        } while (arrk[0].a(arrbl, arrn, f2));
        k.a(arrk);
        return arrk;
    }

    public k[] c() {
        int n2;
        int n3 = this.c.length;
        if (n3 == 0) {
            return null;
        }
        k[] arrk = new k[n3];
        boolean[] arrbl = new boolean[n3];
        int[] arrn = new int[n3];
        for (int i2 = 0; i2 < n3; ++i2) {
            arrk[i2] = new k(this.c[i2]);
            arrbl[i2] = false;
        }
        g g2 = new g(this, arrk);
        int n4 = 0;
        for (n2 = 0; n2 < n3; ++n2) {
            if (k.a(arrk[n2]).f() != 0) continue;
            n4 = arrk[n2].a(null, arrbl, n4, arrn, g2);
        }
        do {
            int n5;
            for (n5 = 0; n5 < n3; ++n5) {
                arrbl[n5] = false;
            }
            n2 = 0;
            for (n5 = 0; n5 < n3; ++n5) {
                if (k.a(arrk[n5]).f() != 0 || !arrk[n5].a(arrbl, arrn, g2)) continue;
                n2 = 1;
            }
        } while (n2 != 0);
        k.a(arrk);
        return arrk;
    }

    static /* synthetic */ as a(d d2) {
        return d2.b;
    }
}

