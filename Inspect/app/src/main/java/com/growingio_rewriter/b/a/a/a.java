/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a.a;

import com.growingio.b.K;
import com.growingio.b.a.B;
import com.growingio.b.a.Q;
import com.growingio.b.a.T;
import com.growingio.b.a.Z;
import com.growingio.b.a.a.b;
import com.growingio.b.a.a.c;
import com.growingio.b.a.a.l;
import com.growingio.b.a.a.m;
import com.growingio.b.a.a.t;
import com.growingio.b.a.a.u;
import com.growingio.b.a.a.v;
import com.growingio.b.a.a.w;
import com.growingio.b.a.as;
import com.growingio.b.a.ay;
import com.growingio.b.a.i;
import com.growingio.b.a.y;
import com.growingio.b.ae;
import com.growingio.b.g;
import com.growingio.b.o;
import java.util.Collection;
import java.util.Iterator;

public class a
implements ay {
    private final u a = new u();
    private o b;
    private c[] c;
    private m[] d;
    private t[] e;

    public m[] a(o o2, as as2) throws i {
        this.b = o2;
        y y2 = as2.j();
        if (y2 == null) {
            return null;
        }
        int n2 = y2.h();
        int n3 = y2.b();
        int n4 = y2.i();
        B b2 = y2.k();
        com.growingio.b.a.a.o o3 = new com.growingio.b.a.a.o();
        this.c = this.a(as2);
        this.e = this.a.a(as2);
        l l2 = new l(o2.a(), as2.c());
        this.d = new m[n4];
        this.d[b2.g()] = this.a(as2, n2, n3);
        o3.a(b2.f());
        while (!o3.a()) {
            this.a(as2, b2, o3, l2);
        }
        return this.d;
    }

    public m[] a(K k2) throws i {
        return this.a(k2.r_(), k2.c());
    }

    private void a(as as2, B b2, com.growingio.b.a.a.o o2, l l2) throws i {
        int n2 = o2.b();
        b2.a(n2);
        b2.f();
        m m2 = this.d[n2].f();
        t t2 = this.e[n2];
        try {
            l2.a(as2, n2, b2, m2, t2);
        }
        catch (RuntimeException var8_8) {
            throw new i(var8_8.getMessage() + "[pos = " + n2 + "]", (Throwable)var8_8);
        }
        int n3 = b2.c(n2);
        if (n3 == 170) {
            this.b(o2, n2, b2, m2);
        } else if (n3 == 171) {
            this.a(o2, n2, b2, m2);
        } else if (n3 == 169) {
            this.a(o2, b2, n2, m2, t2);
        } else if (w.a(n3)) {
            int n4 = w.a(n2, b2);
            if (w.c(n3)) {
                this.a(o2, this.d[n2], this.e[n4], n2, this.a(b2, n2));
            } else if (!w.b(n3)) {
                this.a(o2, m2, this.a(b2, n2));
            }
            this.a(o2, m2, n4);
        } else if (n3 != 191 && !w.d(n3)) {
            this.a(o2, m2, this.a(b2, n2));
        }
        this.a(o2, as2, n2, m2);
    }

    private c[] a(as as2) {
        Q q2 = as2.c();
        g g2 = this.b.a();
        Z z2 = as2.j().l();
        c[] arrc = new c[z2.a()];
        for (int i2 = 0; i2 < z2.a(); ++i2) {
            v v2;
            int n2 = z2.d(i2);
            try {
                v2 = n2 == 0 ? v.q : v.a(g2.f(q2.d(n2)));
            }
            catch (ae var9_9) {
                throw new IllegalStateException(var9_9.getMessage());
            }
            arrc[i2] = new c(z2.a(i2), z2.b(i2), z2.c(i2), v2, null);
        }
        return arrc;
    }

    private m a(as as2, int n2, int n3) {
        o[] arro;
        int n4 = 0;
        m m2 = new m(n2, n3);
        if ((as2.f() & 8) == 0) {
            m2.a(n4++, v.a(this.b));
        }
        try {
            arro = T.a(as2.g(), this.b.a());
        }
        catch (ae var7_7) {
            throw new RuntimeException(var7_7);
        }
        for (int i2 = 0; i2 < arro.length; ++i2) {
            v v2 = this.a(v.a(arro[i2]));
            m2.a(n4++, v2);
            if (v2.e() != 2) continue;
            m2.a(n4++, v.l);
        }
        return m2;
    }

    private int a(B b2, int n2, int n3) throws i {
        b2.a(n2);
        b2.f();
        int n4 = b2.g();
        b2.a(n3);
        b2.f();
        return n4;
    }

    private int a(B b2, int n2) throws i {
        if (!b2.e()) {
            throw new i("Execution falls off end! [pos = " + n2 + "]");
        }
        return b2.g();
    }

    private void a(com.growingio.b.a.a.o o2, m m2, int n2) {
        boolean bl2;
        m m3 = this.d[n2];
        if (m3 == null) {
            this.d[n2] = m2.f();
            bl2 = true;
        } else {
            bl2 = m3.b(m2);
        }
        if (bl2) {
            o2.a(n2);
        }
    }

    private void a(com.growingio.b.a.a.o o2, as as2, int n2, m m2) {
        for (int i2 = 0; i2 < this.c.length; ++i2) {
            c c2 = this.c[i2];
            if (n2 < c.a(c2) || n2 >= c.b(c2)) continue;
            m m3 = m2.f();
            m3.a();
            m3.a(c.c(c2));
            this.a(o2, m3, c.d(c2));
        }
    }

    private void a(com.growingio.b.a.a.o o2, m m2, t t2, int n2, int n3) throws i {
        if (t2 == null) {
            throw new i("No subroutine at jsr target! [pos = " + n2 + "]");
        }
        m m3 = this.d[n3];
        boolean bl2 = false;
        if (m3 == null) {
            m3 = this.d[n3] = m2.f();
            bl2 = true;
        } else {
            for (int i2 = 0; i2 < m2.c(); ++i2) {
                if (t2.c(i2)) continue;
                v v2 = m3.a(i2);
                v v3 = m2.a(i2);
                if (v2 == null) {
                    m3.a(i2, v3);
                    bl2 = true;
                    continue;
                }
                v3 = v2.c(v3);
                m3.a(i2, v3);
                if (v3.equals(v2) && !v3.b()) continue;
                bl2 = true;
            }
        }
        if (!m3.h()) {
            m3.a(true);
            bl2 = true;
        }
        if (bl2 && m3.i()) {
            o2.a(n3);
        }
    }

    private void a(com.growingio.b.a.a.o o2, int n2, B b2, m m2) throws i {
        int n3 = (n2 & -4) + 4;
        this.a(o2, m2, n2 + b2.g(n3));
        int n4 = b2.g(n3 += 4);
        int n5 = n4 * 8 + (n3 += 4);
        n3 += 4;
        while (n3 < n5) {
            int n6 = b2.g(n3) + n2;
            this.a(o2, m2, n6);
            n3 += 8;
        }
    }

    private void a(com.growingio.b.a.a.o o2, B b2, int n2, m m2, t t2) throws i {
        if (t2 == null) {
            throw new i("Ret on no subroutine! [pos = " + n2 + "]");
        }
        Iterator iterator = t2.c().iterator();
        while (iterator.hasNext()) {
            int n3 = (Integer)iterator.next();
            int n4 = this.a(b2, n3, n2);
            boolean bl2 = false;
            m m3 = this.d[n4];
            if (m3 == null) {
                m3 = this.d[n4] = m2.g();
                bl2 = true;
            } else {
                bl2 = m3.a(m2);
            }
            Iterator iterator2 = t2.b().iterator();
            while (iterator2.hasNext()) {
                v v2;
                int n5 = (Integer)iterator2.next();
                v v3 = m3.a(n5);
                if (v3 == (v2 = m2.a(n5))) continue;
                m3.a(n5, v2);
                bl2 = true;
            }
            if (!m3.i()) {
                m3.b(true);
                bl2 = true;
            }
            if (!bl2 || !m3.h()) continue;
            o2.a(n4);
        }
    }

    private void b(com.growingio.b.a.a.o o2, int n2, B b2, m m2) throws i {
        int n3 = (n2 & -4) + 4;
        this.a(o2, m2, n2 + b2.g(n3));
        int n4 = b2.g(n3 += 4);
        int n5 = b2.g(n3 += 4);
        int n6 = (n5 - n4 + 1) * 4 + (n3 += 4);
        while (n3 < n6) {
            int n7 = b2.g(n3) + n2;
            this.a(o2, m2, n7);
            n3 += 4;
        }
    }

    private v a(v v2) {
        if (v2 == v.f || v2 == v.e || v2 == v.d || v2 == v.b) {
            return v.g;
        }
        return v2;
    }
}

