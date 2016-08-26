/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.c;

import com.growingio.a.a.b.aH;
import com.growingio.a.a.b.aJ;
import com.growingio.a.a.b.aL;
import com.growingio.a.a.b.aU;

public final class I {
    private final long a;
    private final long b;
    private final long c;
    private final long d;
    private final long e;
    private final long f;

    public I(long l2, long l3, long l4, long l5, long l6, long l7) {
        aU.a(l2 >= 0);
        aU.a(l3 >= 0);
        aU.a(l4 >= 0);
        aU.a(l5 >= 0);
        aU.a(l6 >= 0);
        aU.a(l7 >= 0);
        this.a = l2;
        this.b = l3;
        this.c = l4;
        this.d = l5;
        this.e = l6;
        this.f = l7;
    }

    public long a() {
        return this.a + this.b;
    }

    public long b() {
        return this.a;
    }

    public double c() {
        long l2 = this.a();
        return l2 == 0 ? 1.0 : (double)this.a / (double)l2;
    }

    public long d() {
        return this.b;
    }

    public double e() {
        long l2 = this.a();
        return l2 == 0 ? 0.0 : (double)this.b / (double)l2;
    }

    public long f() {
        return this.c + this.d;
    }

    public long g() {
        return this.c;
    }

    public long h() {
        return this.d;
    }

    public double i() {
        long l2 = this.c + this.d;
        return l2 == 0 ? 0.0 : (double)this.d / (double)l2;
    }

    public long j() {
        return this.e;
    }

    public double k() {
        long l2 = this.c + this.d;
        return l2 == 0 ? 0.0 : (double)this.e / (double)l2;
    }

    public long l() {
        return this.f;
    }

    public I a(I i2) {
        return new I(Math.max(0, this.a - i2.a), Math.max(0, this.b - i2.b), Math.max(0, this.c - i2.c), Math.max(0, this.d - i2.d), Math.max(0, this.e - i2.e), Math.max(0, this.f - i2.f));
    }

    public I b(I i2) {
        return new I(this.a + i2.a, this.b + i2.b, this.c + i2.c, this.d + i2.d, this.e + i2.e, this.f + i2.f);
    }

    public int hashCode() {
        return aL.a(this.a, this.b, this.c, this.d, this.e, this.f);
    }

    public boolean equals(Object object) {
        if (object instanceof I) {
            I i2 = (I)object;
            return this.a == i2.a && this.b == i2.b && this.c == i2.c && this.d == i2.d && this.e == i2.e && this.f == i2.f;
        }
        return false;
    }

    public String toString() {
        return aH.a(this).a("hitCount", this.a).a("missCount", this.b).a("loadSuccessCount", this.c).a("loadExceptionCount", this.d).a("totalLoadTime", this.e).a("evictionCount", this.f).toString();
    }
}

