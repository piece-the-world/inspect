/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.c;

import com.growingio.b.K;
import com.growingio.b.a.B;
import com.growingio.b.a.Q;
import com.growingio.b.a.as;
import com.growingio.b.a.i;
import com.growingio.b.a.y;
import com.growingio.b.ad;
import com.growingio.b.ae;
import com.growingio.b.c.j;
import com.growingio.b.g;
import com.growingio.b.o;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class d
extends j {
    protected String di;
    protected String dj;
    protected String dk;
    protected String dl;
    protected String dm;
    protected boolean dn;
    protected int do;
    protected Q dp;

    public d(j j2, K k2, K k3) {
        this(j2, k2.q(), k3);
        this.di = k2.r_().s();
    }

    public d(j j2, String string, K k2) {
        super(j2);
        this.dj = string;
        this.dk = k2.c().g();
        this.di = this.dl = k2.r_().s();
        this.dm = k2.q();
        this.dp = null;
        this.dn = ad.b(k2.d());
    }

    @Override
    public void a(Q q2, y y2) {
        if (this.dp != q2) {
            this.do = 0;
        }
    }

    @Override
    public int a(o o2, int n2, B b2, Q q2) throws i {
        int n3;
        String string;
        int n4 = b2.c(n2);
        if ((n4 == 185 || n4 == 183 || n4 == 184 || n4 == 182) && (string = q2.b(this.dj, this.dk, n3 = b2.e(n2 + 1))) != null && this.a(string, o2.a())) {
            int n5 = q2.i(n3);
            n2 = this.a(n4, n2, b2, q2.g(n5), q2);
        }
        return n2;
    }

    private boolean a(String string, g g2) {
        if (this.di.equals(string)) {
            return true;
        }
        try {
            o o2 = g2.f(string);
            o o3 = g2.f(this.di);
            if (o2.a(o3)) {
                try {
                    K k2 = o2.a(this.dj, this.dk);
                    return k2.r_().s().equals(this.di);
                }
                catch (ae var5_7) {
                    return true;
                }
            }
        }
        catch (ae var3_4) {
            return false;
        }
        return false;
    }

    protected int a(int n2, int n3, B b2, int n4, Q q2) throws i {
        if (this.do == 0) {
            int n5 = q2.a(q2.c(this.dm), n4);
            int n6 = q2.a(this.dl);
            if (n2 == 185) {
                this.do = q2.d(n6, n5);
            } else {
                if (this.dn && n2 == 182) {
                    b2.a(183, n3);
                }
                this.do = q2.c(n6, n5);
            }
            this.dp = q2;
        }
        b2.b(this.do, n3 + 1);
        return n3;
    }
}

