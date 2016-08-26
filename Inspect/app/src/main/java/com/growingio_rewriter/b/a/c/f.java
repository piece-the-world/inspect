/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a.c;

import com.growingio.b.a.Q;
import com.growingio.b.a.aP;
import com.growingio.b.a.aY;
import com.growingio.b.a.aZ;
import com.growingio.b.a.as;
import com.growingio.b.a.bk;
import com.growingio.b.a.c.a;
import com.growingio.b.a.c.b;
import com.growingio.b.a.c.c;
import com.growingio.b.a.c.g;
import com.growingio.b.a.c.h;
import com.growingio.b.a.c.m;
import com.growingio.b.a.c.t;
import com.growingio.b.a.i;
import com.growingio.b.a.l;
import com.growingio.b.a.y;
import com.growingio.b.ae;
import java.util.ArrayList;

public class f
extends g {
    public static aZ a(com.growingio.b.g g2, as as2) throws i {
        t[] arrt;
        y y2 = as2.j();
        if (y2 == null) {
            return null;
        }
        try {
            arrt = t.a(as2, y2, true);
        }
        catch (c var4_4) {
            return null;
        }
        if (arrt == null) {
            return null;
        }
        f f2 = new f(g2, as2, y2);
        try {
            f2.a(arrt, y2.j());
        }
        catch (i var5_6) {
            throw new i(as2, (Throwable)var5_6);
        }
        return f2.a(arrt);
    }

    public static aP b(com.growingio.b.g g2, as as2) throws i {
        t[] arrt;
        y y2 = as2.j();
        if (y2 == null) {
            return null;
        }
        try {
            arrt = t.a(as2, y2, true);
        }
        catch (c var4_4) {
            return null;
        }
        if (arrt == null) {
            return null;
        }
        f f2 = new f(g2, as2, y2);
        try {
            f2.a(arrt, y2.j());
        }
        catch (i var5_6) {
            throw new i(as2, (Throwable)var5_6);
        }
        return f2.a(as2.c(), arrt);
    }

    public f(com.growingio.b.g g2, as as2, y y2) {
        super(g2, as2.c(), y2.b(), y2.h(), t.a(as2.g()));
    }

    protected f(f f2) {
        super(f2);
    }

    void a(t[] arrt, byte[] arrby) throws i {
        this.a(arrby, arrt[0]);
        this.a(arrby, arrt);
        try {
            this.b(arrby, arrt);
        }
        catch (ae var3_3) {
            throw new i("failed to resolve types", (Throwable)var3_3);
        }
    }

    private void a(byte[] arrby, t t2) throws i {
        int n2;
        f.b(t2.a, t2.d, this.e);
        this.d = t2.a;
        f.b(t2.c.length, t2.c, this.f);
        this.a(arrby, t2.j);
        int n3 = n2 + t2.f;
        for (n2 = t2.e; n2 < n3; n2 += this.a((int)n2, (byte[])arrby)) {
            this.a(arrby, t2.j);
        }
        if (t2.h != null) {
            for (int i2 = 0; i2 < t2.h.length; ++i2) {
                t t3 = (t)t2.h[i2];
                if (t3.a()) {
                    this.a(t3, true);
                    continue;
                }
                this.a(t3);
                f f2 = new f(this);
                f2.a(arrby, t3);
            }
        }
    }

    private void a(byte[] arrby, b b2) throws i {
        while (b2 != null) {
            t t2 = (t)b2.b;
            if (t2.a()) {
                this.a(t2, false);
                if (t2.a < 1) {
                    throw new i("bad catch clause: " + b2.c);
                }
                t2.d[0] = this.a(this.a(b2.c), t2.d[0]);
            } else {
                this.a(t2, b2.c);
                f f2 = new f(this);
                f2.a(arrby, t2);
            }
            b2 = b2.a;
        }
    }

    private void a(t t2, boolean bl2) throws i {
        int n2;
        int n3 = this.f.length;
        for (n2 = 0; n2 < n3; ++n2) {
            t2.c[n2] = this.a(f.a(this.f, n3, n2), t2.c[n2]);
        }
        if (bl2) {
            n3 = this.d;
            for (n2 = 0; n2 < n3; ++n2) {
                t2.d[n2] = this.a(this.e[n2], t2.d[n2]);
            }
        }
    }

    private h a(h h2, h h3) throws i {
        if (h2 == h3) {
            return h3;
        }
        if (h3 instanceof m || h3 instanceof com.growingio.b.a.c.l) {
            return h3;
        }
        if (h3 instanceof com.growingio.b.a.c.i) {
            ((com.growingio.b.a.c.i)h3).b(h2);
            return h3;
        }
        throw new RuntimeException("fatal: this should never happen");
    }

    private void a(t t2) throws i {
        h[] arrh = h.a(this.e.length);
        int n2 = this.d;
        f.a(n2, this.e, arrh);
        this.a(t2, n2, arrh);
    }

    private void a(t t2, int n2) throws i {
        h[] arrh = h.a(this.e.length);
        arrh[0] = this.a(n2).b();
        this.a(t2, 1, arrh);
    }

    private m a(int n2) {
        String string = n2 == 0 ? "java.lang.Throwable" : this.b.d(n2);
        return new m(string);
    }

    private void a(t t2, int n2, h[] arrh) throws i {
        int n3 = this.f.length;
        h[] arrh2 = h.a(n3);
        int n4 = f.a(n3, this.f, arrh2);
        t2.a(n2, arrh, n4, arrh2);
    }

    protected static int a(int n2, h[] arrh, h[] arrh2) {
        int n3 = -1;
        for (int i2 = 0; i2 < n2; ++i2) {
            h h2 = f.a(arrh, n2, i2);
            arrh2[i2] = h2.b();
            if (h2 == h) continue;
            n3 = i2 + 1;
        }
        return n3 + 1;
    }

    protected static void b(int n2, h[] arrh, h[] arrh2) {
        for (int i2 = 0; i2 < n2; ++i2) {
            arrh2[i2] = arrh[i2];
        }
    }

    private static h a(h[] arrh, int n2, int n3) {
        h h2 = arrh[n3];
        if (h2.d() && n3 + 1 < n2 && arrh[n3 + 1] != h) {
            return h;
        }
        return h2;
    }

    private void a(byte[] arrby, t[] arrt) throws i {
        for (t t2 : arrt) {
            t t3;
            if (t2.a()) continue;
            this.b(arrby, t2);
            b b2 = t2.j;
            if (b2 == null || (t3 = (t)b2.b).a()) continue;
            this.a(t3, b2.c);
            this.b(arrby, t3);
            t3.g = 1;
        }
    }

    private void b(byte[] arrby, t t2) throws i {
        int n2 = t2.e;
        int n3 = t2.f - 3;
        if (n3 < 0) {
            if (n3 == -1) {
                arrby[n2] = 0;
            }
            arrby[n2 + t2.f - 1] = -65;
            t2.g = 1;
            this.a(t2, 0);
            return;
        }
        t2.g = 0;
        for (int i2 = 0; i2 < n3; ++i2) {
            arrby[n2 + i2] = 0;
        }
        arrby[n2 + n3] = -89;
        l.a(- n3, arrby, n2 + n3 + 1);
    }

    private void b(byte[] arrby, t[] arrt) throws ae, i {
        ArrayList arrayList = new ArrayList();
        int n2 = arrt.length;
        int n3 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            int n4;
            t t2 = arrt[i2];
            if (!t2.a()) continue;
            int n5 = t2.c.length;
            for (n4 = 0; n4 < n5; ++n4) {
                n3 = t2.c[n4].a(arrayList, n3, this.a);
            }
            n5 = t2.a;
            for (n4 = 0; n4 < n5; ++n4) {
                n3 = t2.d[n4].a(arrayList, n3, this.a);
            }
        }
    }

    public aZ a(t[] arrt) {
        bk bk2 = new bk(32);
        int n2 = arrt.length;
        t t2 = arrt[0];
        int n3 = t2.f;
        if (t2.g > 0) {
            bk2.a(0);
            --n3;
        }
        for (int i2 = 1; i2 < n2; ++i2) {
            t t3 = arrt[i2];
            if (this.a(t3, arrt[i2 - 1])) {
                t3.b();
                int n4 = f.a(t2.b, t2.c, t3.b, t3.c);
                this.a(bk2, t3, n4, n3, t2);
                n3 = t3.f - 1;
                t2 = t3;
                continue;
            }
            if (t3.g == 0) {
                bk2.a(n3);
                n3 = t3.f - 1;
                t2 = t3;
                continue;
            }
            n3 += t3.f;
        }
        return bk2.a(this.b);
    }

    private boolean a(t t2, t t3) {
        int n2 = t2.g;
        if (n2 > 1) {
            return true;
        }
        if (n2 < 1) {
            return false;
        }
        return t3.i;
    }

    private void a(bk bk2, t t2, int n2, int n3, t t3) {
        Object object;
        int n4 = t2.a;
        if (n4 == 0) {
            if (n2 == 0) {
                bk2.a(n3);
                return;
            }
            if (0 > n2 && n2 >= -3) {
                bk2.a(n3, - n2);
                return;
            }
            if (0 < n2 && n2 <= 3) {
                int[] arrn = new int[n2];
                int[] arrn2 = this.a(t2.b - t3.b, t3.b, arrn, t2.c);
                bk2.a(n3, arrn2, arrn);
                return;
            }
        } else {
            if (n4 == 1 && n2 == 0) {
                h h2 = t2.d[0];
                bk2.a(n3, h2.a(), h2.a(this.b));
                return;
            }
            if (n4 == 2 && n2 == 0 && (object = t2.d[0]).d()) {
                bk2.a(n3, object.a(), object.a(this.b));
                return;
            }
        }
        object = new int[n4];
        int[] arrn = this.a(n4, 0, (int[])object, t2.d);
        int[] arrn3 = new int[t2.b];
        int[] arrn4 = this.a(t2.b, 0, arrn3, t2.c);
        bk2.a(n3, arrn4, arrn3, arrn, (int[])object);
    }

    private int[] a(int n2, int n3, int[] arrn, h[] arrh) {
        int n4 = f.b(arrh, n3, n3 + n2);
        Q q2 = this.b;
        int[] arrn2 = new int[n4];
        int n5 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            h h2 = arrh[n3 + i2];
            arrn2[n5] = h2.a();
            arrn[n5] = h2.a(q2);
            if (h2.d()) {
                ++i2;
            }
            ++n5;
        }
        return arrn2;
    }

    private static int a(int n2, h[] arrh, int n3, h[] arrh2) {
        int n4 = n3 - n2;
        int n5 = n4 > 0 ? n2 : n3;
        if (f.a(arrh, arrh2, n5)) {
            if (n4 > 0) {
                return f.b(arrh2, n5, n3);
            }
            return - f.b(arrh, n5, n2);
        }
        return -100;
    }

    private static boolean a(h[] arrh, h[] arrh2, int n2) {
        for (int i2 = 0; i2 < n2; ++i2) {
            if (arrh[i2].a(arrh2[i2])) continue;
            return false;
        }
        return true;
    }

    private static int b(h[] arrh, int n2, int n3) {
        int n4 = 0;
        while (n2 < n3) {
            h h2 = arrh[n2++];
            ++n4;
            if (!h2.d()) continue;
            ++n2;
        }
        return n4;
    }

    public aP a(Q q2, t[] arrt) {
        int n2;
        aY aY2 = new aY();
        int n3 = arrt.length;
        boolean[] arrbl = new boolean[n3];
        t t2 = arrt[0];
        arrbl[0] = t2.g > 0;
        int n4 = arrbl[0] ? 1 : 0;
        for (n2 = 1; n2 < n3; ++n2) {
            t t3 = arrt[n2];
            arrbl[n2] = this.a(t3, arrt[n2 - 1]);
            if (!arrbl[n2]) continue;
            t3.b();
            t2 = t3;
            ++n4;
        }
        if (n4 == 0) {
            return null;
        }
        aY2.a(n4);
        for (n2 = 0; n2 < n3; ++n2) {
            if (!arrbl[n2]) continue;
            this.a(aY2, q2, arrt[n2].e, arrt[n2]);
        }
        return aY2.a(q2);
    }

    private void a(aY aY2, Q q2, int n2, t t2) {
        aY2.a(n2);
        this.a(aY2, q2, t2.c, t2.b);
        this.a(aY2, q2, t2.d, t2.a);
    }

    private void a(aY aY2, Q q2, h[] arrh, int n2) {
        h h2;
        int n3;
        int n4 = 0;
        for (n3 = 0; n3 < n2; ++n3) {
            h2 = arrh[n3];
            if (h2 == null || !h2.d()) continue;
            ++n4;
            ++n3;
        }
        aY2.a(n2 - n4);
        for (n3 = 0; n3 < n2; ++n3) {
            h2 = arrh[n3];
            aY2.a(h2.a(), h2.a(q2));
            if (!h2.d()) continue;
            ++n3;
        }
    }
}

