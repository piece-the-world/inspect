/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.k;

import com.growingio.a.a.b.aH;
import com.growingio.a.a.b.aJ;
import com.growingio.a.a.b.aL;
import com.growingio.a.a.b.aU;
import com.growingio.a.a.k.A;
import com.growingio.a.a.k.h;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class t
implements Serializable {
    private final A a;
    private final A b;
    private final double c;
    private static final int d = 88;
    private static final long e = 0;

    t(A a2, A a3, double d2) {
        this.a = a2;
        this.b = a3;
        this.c = d2;
    }

    public long a() {
        return this.a.a();
    }

    public A b() {
        return this.a;
    }

    public A c() {
        return this.b;
    }

    public double d() {
        aU.b(this.a() != 0);
        return this.c / (double)this.a();
    }

    public double e() {
        aU.b(this.a() > 1);
        return this.c / (double)(this.a() - 1);
    }

    public double f() {
        aU.b(this.a() > 1);
        if (Double.isNaN(this.c)) {
            return Double.NaN;
        }
        double d2 = this.b().j();
        double d3 = this.c().j();
        aU.b(d2 > 0.0);
        aU.b(d3 > 0.0);
        double d4 = t.a(d2 * d3);
        return t.b(this.c / Math.sqrt(d4));
    }

    public h g() {
        aU.b(this.a() > 1);
        if (Double.isNaN(this.c)) {
            return h.a();
        }
        double d2 = this.a.j();
        if (d2 > 0.0) {
            if (this.b.j() > 0.0) {
                return h.a(this.a.b(), this.b.b()).a(this.c / d2);
            }
            return h.b(this.b.b());
        }
        aU.b(this.b.j() > 0.0);
        return h.a(this.a.b());
    }

    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (this.getClass() != object.getClass()) {
            return false;
        }
        t t2 = (t)object;
        return this.a.equals(t2.a) && this.b.equals(t2.b) && Double.doubleToLongBits(this.c) == Double.doubleToLongBits(t2.c);
    }

    public int hashCode() {
        return aL.a(this.a, this.b, this.c);
    }

    public String toString() {
        if (this.a() > 0) {
            return aH.a(this).a("xStats", this.a).a("yStats", this.b).a("populationCovariance", this.d()).toString();
        }
        return aH.a(this).a("xStats", this.a).a("yStats", this.b).toString();
    }

    double h() {
        return this.c;
    }

    private static double a(double d2) {
        if (d2 > 0.0) {
            return d2;
        }
        return Double.MIN_VALUE;
    }

    private static double b(double d2) {
        if (d2 >= 1.0) {
            return 1.0;
        }
        if (d2 <= -1.0) {
            return -1.0;
        }
        return d2;
    }

    public byte[] i() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(88).order(ByteOrder.LITTLE_ENDIAN);
        this.a.a(byteBuffer);
        this.b.a(byteBuffer);
        byteBuffer.putDouble(this.c);
        return byteBuffer.array();
    }

    public static t a(byte[] arrby) {
        aU.a(arrby);
        aU.a(arrby.length == 88, "Expected PairedStats.BYTES = %s, got %s", 88, arrby.length);
        ByteBuffer byteBuffer = ByteBuffer.wrap(arrby).order(ByteOrder.LITTLE_ENDIAN);
        A a2 = A.b(byteBuffer);
        A a3 = A.b(byteBuffer);
        double d2 = byteBuffer.getDouble();
        return new t(a2, a3, d2);
    }
}

