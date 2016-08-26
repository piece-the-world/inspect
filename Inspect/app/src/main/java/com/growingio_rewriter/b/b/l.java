/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.b;

import com.growingio.b.V;
import com.growingio.b.ae;
import com.growingio.b.b.A;
import com.growingio.b.b.a.a;
import com.growingio.b.b.a.b;
import com.growingio.b.b.a.f;
import com.growingio.b.b.a.g;
import com.growingio.b.b.a.p;
import com.growingio.b.b.a.v;
import com.growingio.b.b.a.x;
import com.growingio.b.b.e;
import com.growingio.b.b.k;
import com.growingio.b.b.r;
import com.growingio.b.o;

public class l
extends A {
    private k dn;

    public l(o o2, com.growingio.b.g g2, k k2) {
        super(o2, g2);
        this.dn = k2;
    }

    public void a() {
        if (this.e == 344) {
            this.e = 307;
            this.di = 0;
            this.dj = "java/lang/Object";
        }
    }

    @Override
    public void a(p p2) throws e {
        String string = p2.d();
        if (string.equals(this.dn.ds)) {
            this.e = 307;
            this.di = 1;
            this.dj = "java/lang/Object";
        } else if (string.equals("$sig")) {
            this.e = 307;
            this.di = 1;
            this.dj = "java/lang/Class";
        } else if (string.equals("$type") || string.equals("$class")) {
            this.e = 307;
            this.di = 0;
            this.dj = "java/lang/Class";
        } else {
            super.a(p2);
        }
    }

    @Override
    protected void a(com.growingio.b.b.a.k k2, int n2, b b2, b b3) throws e {
        if (b2 instanceof p && ((p)b2).d().equals(this.dn.ds)) {
            b3.a(this);
            o[] arro = this.dn.du;
            if (arro == null) {
                return;
            }
            int n3 = arro.length;
            for (int i2 = 0; i2 < n3; ++i2) {
                this.a(arro[i2]);
            }
        } else {
            super.a(k2, n2, b2, b3);
        }
    }

    @Override
    public void a(g g2) throws e {
        b b2;
        a a2 = g2.i();
        if (a2 != null && g2.h() == 0 && (b2 = a2.c()) instanceof v && a2.d() == null) {
            String string = ((v)b2).d();
            if (string.equals(this.dn.dz)) {
                this.b(g2);
                return;
            }
            if (string.equals("$w")) {
                this.c(g2);
                return;
            }
        }
        super.a(g2);
    }

    protected void b(g g2) throws e {
        o o2 = this.dn.dy;
        g2.j().a(this);
        if (this.e == 344 || com.growingio.b.b.b.d(this.e) || this.di > 0) {
            this.a(o2);
        } else if (o2 instanceof V) {
            int n2;
            V v2 = (V)o2;
            this.e = n2 = r.a(v2.X());
            this.di = 0;
            this.dj = null;
        }
    }

    protected void c(g g2) throws e {
        g2.j().a(this);
        if (com.growingio.b.b.b.d(this.e) || this.di > 0) {
            return;
        }
        o o2 = this.dk.a(this.e, this.di, this.dj);
        if (o2 instanceof V) {
            this.e = 307;
            this.di = 0;
            this.dj = "java/lang/Object";
        }
    }

    @Override
    public void a(f f2) throws e {
        b b2 = f2.i();
        if (b2 instanceof p) {
            String string = ((p)b2).d();
            if (this.dn.dD != null && string.equals(this.dn.dB)) {
                this.dn.dD.a(this, (a)f2.j());
                return;
            }
            if (string.equals("$cflow")) {
                this.a((a)f2.j());
                return;
            }
        }
        super.a(f2);
    }

    protected void a(a a2) throws e {
        this.e = 324;
        this.di = 0;
        this.dj = null;
    }

    public boolean c(a a2) {
        if (this.dn.du != null && a2 != null && a2.d() == null) {
            b b2 = a2.c();
            return b2 instanceof p && ((p)b2).d().equals(this.dn.dt);
        }
        return false;
    }

    @Override
    public int d(a a2) {
        String string = this.dn.dt;
        int n2 = 0;
        while (a2 != null) {
            b b2 = a2.c();
            if (b2 instanceof p && ((p)b2).d().equals(string)) {
                if (this.dn.du != null) {
                    n2 += this.dn.du.length;
                }
            } else {
                ++n2;
            }
            a2 = a2.d();
        }
        return n2;
    }

    @Override
    public void a(a a2, int[] arrn, int[] arrn2, String[] arrstring) throws e {
        o[] arro = this.dn.du;
        String string = this.dn.dt;
        int n2 = 0;
        while (a2 != null) {
            b b2 = a2.c();
            if (b2 instanceof p && ((p)b2).d().equals(string)) {
                if (arro != null) {
                    int n3 = arro.length;
                    for (int i2 = 0; i2 < n3; ++i2) {
                        o o2 = arro[i2];
                        this.b(o2);
                        arrn[n2] = this.e;
                        arrn2[n2] = this.di;
                        arrstring[n2] = this.dj;
                        ++n2;
                    }
                }
            } else {
                b2.a(this);
                arrn[n2] = this.e;
                arrn2[n2] = this.di;
                arrstring[n2] = this.dj;
                ++n2;
            }
            a2 = a2.d();
        }
    }

    void a(b b2, String string, String string2, String string3, a a2) throws e {
        b2.a(this);
        int n2 = this.d(a2);
        this.a(a2, new int[n2], new int[n2], new String[n2]);
        this.b(string3);
        this.a();
    }

    protected void a(o o2) throws e {
        if (o2 == o.n) {
            this.a();
        } else {
            this.b(o2);
        }
    }

    public void b(o o2) throws e {
        this.a(o2, 0);
    }

    private void a(o o2, int n2) throws e {
        if (o2.r()) {
            V v2 = (V)o2;
            this.e = r.a(v2.X());
            this.di = n2;
            this.dj = null;
        } else if (o2.b()) {
            try {
                this.a(o2.e(), n2 + 1);
            }
            catch (ae var3_4) {
                throw new e("undefined type: " + o2.s());
            }
        } else {
            this.e = 307;
            this.di = n2;
            this.dj = r.c(o2.s());
        }
    }
}

