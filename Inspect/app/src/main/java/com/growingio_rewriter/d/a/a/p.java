/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.a;

import com.growingio.d.a.a;
import com.growingio.d.a.a.c;
import com.growingio.d.a.a.q;
import com.growingio.d.a.m;
import com.growingio.d.a.r;
import com.growingio.d.a.v;

public class p
extends r {
    protected final q a;

    public p(r r2, q q2) {
        this(327680, r2, q2);
    }

    protected p(int n2, r r2, q q2) {
        super(n2, r2);
        this.a = q2;
    }

    @Override
    public a c() {
        a a2 = super.c();
        return a2 == null ? a2 : new c(a2, this.a);
    }

    @Override
    public a a(String string, boolean bl2) {
        a a2 = super.a(this.a.a(string), bl2);
        return a2 == null ? a2 : new c(a2, this.a);
    }

    @Override
    public a a(int n2, v v2, String string, boolean bl2) {
        a a2 = super.a(n2, v2, this.a.a(string), bl2);
        return a2 == null ? a2 : new c(a2, this.a);
    }

    @Override
    public a a(int n2, String string, boolean bl2) {
        a a2 = super.a(n2, this.a.a(string), bl2);
        return a2 == null ? a2 : new c(a2, this.a);
    }

    @Override
    public void a(int n2, int n3, Object[] arrobject, int n4, Object[] arrobject2) {
        super.a(n2, n3, this.a(n3, arrobject), n4, this.a(n4, arrobject2));
    }

    private Object[] a(int n2, Object[] arrobject) {
        for (int i2 = 0; i2 < n2; ++i2) {
            if (!(arrobject[i2] instanceof String)) continue;
            Object[] arrobject2 = new Object[n2];
            if (i2 > 0) {
                System.arraycopy(arrobject, 0, arrobject2, 0, i2);
            }
            do {
                Object object = arrobject[i2];
                Object object2 = arrobject2[i2++] = object instanceof String ? this.a.b((String)object) : object;
            } while (i2 < n2);
            return arrobject2;
        }
        return arrobject;
    }

    @Override
    public void b(int n2, String string, String string2, String string3) {
        super.b(n2, this.a.b(string), this.a.b(string, string2, string3), this.a.a(string3));
    }

    @Override
    public void a(int n2, String string, String string2, String string3) {
        if (this.m_ >= 327680) {
            super.a(n2, string, string2, string3);
            return;
        }
        this.b(n2, string, string2, string3, n2 == 185);
    }

    @Override
    public void a(int n2, String string, String string2, String string3, boolean bl2) {
        if (this.m_ < 327680) {
            super.a(n2, string, string2, string3, bl2);
            return;
        }
        this.b(n2, string, string2, string3, bl2);
    }

    private void b(int n2, String string, String string2, String string3, boolean bl2) {
        if (this.n_ != null) {
            this.n_.a(n2, this.a.b(string), this.a.a(string, string2, string3), this.a.c(string3), bl2);
        }
    }

    @Override
    public /* varargs */ void a(String string, String string2, m m2, Object ... arrobject) {
        for (int i2 = 0; i2 < arrobject.length; ++i2) {
            arrobject[i2] = this.a.a(arrobject[i2]);
        }
        super.a(this.a.a(string, string2), this.a.c(string2), (m)this.a.a(m2), arrobject);
    }

    @Override
    public void a(int n2, String string) {
        super.a(n2, this.a.b(string));
    }

    @Override
    public void a(Object object) {
        super.a(this.a.a(object));
    }

    @Override
    public void b(String string, int n2) {
        super.b(this.a.a(string), n2);
    }

    @Override
    public a b(int n2, v v2, String string, boolean bl2) {
        a a2 = super.b(n2, v2, this.a.a(string), bl2);
        return a2 == null ? a2 : new c(a2, this.a);
    }

    @Override
    public void a(com.growingio.d.a.p p2, com.growingio.d.a.p p3, com.growingio.d.a.p p4, String string) {
        super.a(p2, p3, p4, string == null ? null : this.a.b(string));
    }

    @Override
    public a c(int n2, v v2, String string, boolean bl2) {
        a a2 = super.c(n2, v2, this.a.a(string), bl2);
        return a2 == null ? a2 : new c(a2, this.a);
    }

    @Override
    public void a(String string, String string2, String string3, com.growingio.d.a.p p2, com.growingio.d.a.p p3, int n2) {
        super.a(string, this.a.a(string2), this.a.a(string3, true), p2, p3, n2);
    }

    @Override
    public a a(int n2, v v2, com.growingio.d.a.p[] arrp, com.growingio.d.a.p[] arrp2, int[] arrn, String string, boolean bl2) {
        a a2 = super.a(n2, v2, arrp, arrp2, arrn, this.a.a(string), bl2);
        return a2 == null ? a2 : new c(a2, this.a);
    }
}

