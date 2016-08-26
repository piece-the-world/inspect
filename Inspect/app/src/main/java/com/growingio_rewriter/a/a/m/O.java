/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.m;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.m.P;
import com.growingio.a.a.m.u;
import java.io.Serializable;
import java.math.BigInteger;

public final class O
extends Number
implements Serializable,
Comparable<O> {
    private static final long d = Long.MAX_VALUE;
    public static final O a = new O(0);
    public static final O b = new O(1);
    public static final O c = new O(-1);
    private final long e;

    private O(long l2) {
        this.e = l2;
    }

    public static O a(long l2) {
        return new O(l2);
    }

    public static O b(long l2) {
        aU.a(l2 >= 0, "value (%s) is outside the range for an unsigned long value", l2);
        return O.a(l2);
    }

    public static O a(BigInteger bigInteger) {
        aU.a(bigInteger);
        aU.a(bigInteger.signum() >= 0 && bigInteger.bitLength() <= 64, "value (%s) is outside the range for an unsigned long value", (Object)bigInteger);
        return O.a(bigInteger.longValue());
    }

    public static O a(String string) {
        return O.a(string, 10);
    }

    public static O a(String string, int n2) {
        return O.a(P.a(string, n2));
    }

    public O a(O o2) {
        return O.a(this.e + aU.a(o2).e);
    }

    public O b(O o2) {
        return O.a(this.e - aU.a(o2).e);
    }

    public O c(O o2) {
        return O.a(this.e * aU.a(o2).e);
    }

    public O d(O o2) {
        return O.a(P.b(this.e, aU.a(o2).e));
    }

    public O e(O o2) {
        return O.a(P.c(this.e, aU.a(o2).e));
    }

    @Override
    public int intValue() {
        return (int)this.e;
    }

    @Override
    public long longValue() {
        return this.e;
    }

    @Override
    public float floatValue() {
        float f2 = this.e & Long.MAX_VALUE;
        if (this.e < 0) {
            f2 += 9.223372E18f;
        }
        return f2;
    }

    @Override
    public double doubleValue() {
        double d2 = this.e & Long.MAX_VALUE;
        if (this.e < 0) {
            d2 += 9.223372036854776E18;
        }
        return d2;
    }

    public BigInteger a() {
        BigInteger bigInteger = BigInteger.valueOf(this.e & Long.MAX_VALUE);
        if (this.e < 0) {
            bigInteger = bigInteger.setBit(63);
        }
        return bigInteger;
    }

    public int f(O o2) {
        aU.a(o2);
        return P.a(this.e, o2.e);
    }

    public int hashCode() {
        return u.a(this.e);
    }

    public boolean equals(Object object) {
        if (object instanceof O) {
            O o2 = (O)object;
            return this.e == o2.e;
        }
        return false;
    }

    public String toString() {
        return P.a(this.e);
    }

    public String a(int n2) {
        return P.a(this.e, n2);
    }

    @Override
    public /* synthetic */ int compareTo(Object object) {
        return this.f((O)object);
    }
}

