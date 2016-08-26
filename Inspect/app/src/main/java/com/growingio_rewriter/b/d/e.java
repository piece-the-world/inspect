/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.d;

import com.growingio.b.a.B;
import com.growingio.b.a.Q;
import com.growingio.b.a.Z;
import com.growingio.b.a.as;
import com.growingio.b.a.i;
import com.growingio.b.a.p;
import com.growingio.b.a.y;
import com.growingio.b.b;
import com.growingio.b.d.a;
import com.growingio.b.d.c;
import com.growingio.b.d.d;
import com.growingio.b.d.f;
import com.growingio.b.d.g;
import com.growingio.b.d.h;
import com.growingio.b.d.k;
import com.growingio.b.d.l;
import com.growingio.b.d.n;
import com.growingio.b.d.q;
import com.growingio.b.o;

public class e {
    public boolean a(o o2, as as2) throws b {
        y y2 = as2.j();
        if (y2 == null) {
            return false;
        }
        B b2 = y2.k();
        boolean bl2 = false;
        f f2 = new f(y2.h());
        while (b2.e()) {
            if (!this.a(b2, o2, as2, f2)) continue;
            bl2 = true;
        }
        Z z2 = y2.l();
        int n2 = z2.a();
        for (int i2 = 0; i2 < n2; ++i2) {
            k k2 = new k(z2, i2, b2, o2, as2);
            this.a(k2);
            if (!k2.k()) continue;
            bl2 = true;
            f2.a(k2.l(), k2.m());
        }
        if (y2.h() < f2.b) {
            y2.b(f2.b);
        }
        y2.a(y2.b() + f2.c);
        try {
            if (bl2) {
                as2.a(o2.a(), o2.j());
            }
        }
        catch (i var9_10) {
            throw new b(var9_10.getMessage(), var9_10);
        }
        return bl2;
    }

    boolean a(o o2, as as2, f f2, B b2, int n2) throws b {
        boolean bl2 = false;
        while (b2.e() && b2.g() < n2) {
            int n3 = b2.d();
            if (!this.a(b2, o2, as2, f2)) continue;
            bl2 = true;
            int n4 = b2.d();
            if (n3 == n4) continue;
            n2 += n4 - n3;
        }
        return bl2;
    }

    final boolean a(B b2, o o2, as as2, f f2) throws b {
        try {
            d d2 = null;
            int n2 = b2.f();
            int n3 = b2.c(n2);
            if (n3 >= 178) {
                if (n3 < 188) {
                    if (n3 == 184 || n3 == 185 || n3 == 182) {
                        d2 = new n(n2, b2, o2, as2);
                        this.a((n)d2);
                    } else if (n3 == 180 || n3 == 178 || n3 == 181 || n3 == 179) {
                        d2 = new h(n2, b2, o2, as2, n3);
                        this.a((h)d2);
                    } else if (n3 == 187) {
                        int n4 = b2.e(n2 + 1);
                        f2.a = new g(f2.a, n2, as2.c().d(n4));
                    } else if (n3 == 183) {
                        g g2 = f2.a;
                        if (g2 != null && as2.c().a(g2.c, b2.e(n2 + 1)) > 0) {
                            d2 = new q(n2, b2, o2, as2, g2.c, g2.b);
                            this.a((q)d2);
                            f2.a = g2.a;
                        } else {
                            n n5 = new n(n2, b2, o2, as2);
                            if (n5.d().equals("<init>")) {
                                c c2;
                                d2 = c2 = new c(n2, b2, o2, as2);
                                this.a(c2);
                            } else {
                                d2 = n5;
                                this.a(n5);
                            }
                        }
                    }
                } else if (n3 == 188 || n3 == 189 || n3 == 197) {
                    d2 = new com.growingio.b.d.o(n2, b2, o2, as2, n3);
                    this.a((com.growingio.b.d.o)d2);
                } else if (n3 == 193) {
                    d2 = new l(n2, b2, o2, as2);
                    this.a((l)d2);
                } else if (n3 == 192) {
                    d2 = new a(n2, b2, o2, as2);
                    this.a((a)d2);
                }
            }
            if (d2 != null && d2.k()) {
                f2.a(d2.l(), d2.m());
                return true;
            }
            return false;
        }
        catch (i var5_6) {
            throw new b(var5_6);
        }
    }

    public void a(q q2) throws b {
    }

    public void a(com.growingio.b.d.o o2) throws b {
    }

    public void a(n n2) throws b {
    }

    public void a(c c2) throws b {
    }

    public void a(h h2) throws b {
    }

    public void a(l l2) throws b {
    }

    public void a(a a2) throws b {
    }

    public void a(k k2) throws b {
    }
}

