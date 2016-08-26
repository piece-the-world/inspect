/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.k;

import com.growingio.a.a.b.aH;
import com.growingio.a.a.b.aJ;
import com.growingio.a.a.b.aL;
import com.growingio.a.a.b.aU;
import com.growingio.a.a.k.B;
import com.growingio.a.a.k.e;
import com.growingio.a.a.m.i;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;

public final class A
implements Serializable {
    private final long b;
    private final double c;
    private final double d;
    private final double e;
    private final double f;
    static final int a = 40;
    private static final long g = 0;

    A(long l2, double d2, double d3, double d4, double d5) {
        this.b = l2;
        this.c = d2;
        this.d = d3;
        this.e = d4;
        this.f = d5;
    }

    public static A a(Iterable<? extends Number> iterable) {
        B b2 = new B();
        b2.a(iterable);
        return b2.a();
    }

    public static A a(Iterator<? extends Number> iterator) {
        B b2 = new B();
        b2.a(iterator);
        return b2.a();
    }

    public static /* varargs */ A a(double ... arrd) {
        B b2 = new B();
        b2.a(arrd);
        return b2.a();
    }

    public static /* varargs */ A a(int ... arrn) {
        B b2 = new B();
        b2.a(arrn);
        return b2.a();
    }

    public static /* varargs */ A a(long ... arrl) {
        B b2 = new B();
        b2.a(arrl);
        return b2.a();
    }

    public long a() {
        return this.b;
    }

    public double b() {
        aU.b(this.b != 0);
        return this.c;
    }

    public double c() {
        return this.c * (double)this.b;
    }

    public double d() {
        aU.b(this.b > 0);
        if (Double.isNaN(this.d)) {
            return Double.NaN;
        }
        if (this.b == 1) {
            return 0.0;
        }
        return e.f(this.d) / (double)this.a();
    }

    public double e() {
        return Math.sqrt(this.d());
    }

    public double f() {
        aU.b(this.b > 1);
        if (Double.isNaN(this.d)) {
            return Double.NaN;
        }
        return e.f(this.d) / (double)(this.b - 1);
    }

    public double g() {
        return Math.sqrt(this.f());
    }

    public double h() {
        aU.b(this.b != 0);
        return this.e;
    }

    public double i() {
        aU.b(this.b != 0);
        return this.f;
    }

    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (this.getClass() != object.getClass()) {
            return false;
        }
        A a2 = (A)object;
        return this.b == a2.b && Double.doubleToLongBits(this.c) == Double.doubleToLongBits(a2.c) && Double.doubleToLongBits(this.d) == Double.doubleToLongBits(a2.d) && Double.doubleToLongBits(this.e) == Double.doubleToLongBits(a2.e) && Double.doubleToLongBits(this.f) == Double.doubleToLongBits(a2.f);
    }

    public int hashCode() {
        return aL.a(this.b, this.c, this.d, this.e, this.f);
    }

    public String toString() {
        if (this.a() > 0) {
            return aH.a(this).a("count", this.b).a("mean", this.c).a("populationStandardDeviation", this.e()).a("min", this.e).a("max", this.f).toString();
        }
        return aH.a(this).a("count", this.b).toString();
    }

    double j() {
        return this.d;
    }

    public static double b(Iterable<? extends Number> iterable) {
        return A.b(iterable.iterator());
    }

    public static double b(Iterator<? extends Number> iterator) {
        aU.a(iterator.hasNext());
        long l2 = 1;
        double d2 = iterator.next().doubleValue();
        while (iterator.hasNext()) {
            double d3 = iterator.next().doubleValue();
            ++l2;
            if (i.b(d3) && i.b(d2)) {
                d2 += (d3 - d2) / (double)l2;
                continue;
            }
            d2 = B.a(d2, d3);
        }
        return d2;
    }

    public static /* varargs */ double b(double ... arrd) {
        aU.a(arrd.length > 0);
        double d2 = arrd[0];
        for (int i2 = 1; i2 < arrd.length; ++i2) {
            double d3 = arrd[i2];
            if (i.b(d3) && i.b(d2)) {
                d2 += (d3 - d2) / (double)(i2 + 1);
                continue;
            }
            d2 = B.a(d2, d3);
        }
        return d2;
    }

    public static /* varargs */ double b(int ... arrn) {
        aU.a(arrn.length > 0);
        double d2 = arrn[0];
        for (int i2 = 1; i2 < arrn.length; ++i2) {
            double d3 = arrn[i2];
            if (i.b(d3) && i.b(d2)) {
                d2 += (d3 - d2) / (double)(i2 + 1);
                continue;
            }
            d2 = B.a(d2, d3);
        }
        return d2;
    }

    public static /* varargs */ double b(long ... arrl) {
        aU.a(arrl.length > 0);
        double d2 = arrl[0];
        for (int i2 = 1; i2 < arrl.length; ++i2) {
            double d3 = arrl[i2];
            if (i.b(d3) && i.b(d2)) {
                d2 += (d3 - d2) / (double)(i2 + 1);
                continue;
            }
            d2 = B.a(d2, d3);
        }
        return d2;
    }

    public byte[] k() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(40).order(ByteOrder.LITTLE_ENDIAN);
        this.a(byteBuffer);
        return byteBuffer.array();
    }

    void a(ByteBuffer byteBuffer) {
        aU.a(byteBuffer);
        aU.a(byteBuffer.remaining() >= 40, "Expected at least Stats.BYTES = %s remaining , got %s", 40, byteBuffer.remaining());
        byteBuffer.putLong(this.b).putDouble(this.c).putDouble(this.d).putDouble(this.e).putDouble(this.f);
    }

    public static A a(byte[] arrby) {
        aU.a(arrby);
        aU.a(arrby.length == 40, "Expected Stats.BYTES = %s remaining , got %s", 40, arrby.length);
        return A.b(ByteBuffer.wrap(arrby).order(ByteOrder.LITTLE_ENDIAN));
    }

    static A b(ByteBuffer byteBuffer) {
        aU.a(byteBuffer);
        aU.a(byteBuffer.remaining() >= 40, "Expected at least Stats.BYTES = %s remaining , got %s", 40, byteBuffer.remaining());
        return new A(byteBuffer.getLong(), byteBuffer.getDouble(), byteBuffer.getDouble(), byteBuffer.getDouble(), byteBuffer.getDouble());
    }
}

