/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.m;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.m.M;
import java.math.BigInteger;

public final class L
extends Number
implements Comparable<L> {
    public static final L a = L.a(0);
    public static final L b = L.a(1);
    public static final L c = L.a(-1);
    private final int d;

    private L(int n2) {
        this.d = n2 & -1;
    }

    public static L a(int n2) {
        return new L(n2);
    }

    public static L a(long l2) {
        aU.a((l2 & 0xFFFFFFFFL) == l2, "value (%s) is outside the range for an unsigned integer value", l2);
        return L.a((int)l2);
    }

    public static L a(BigInteger bigInteger) {
        aU.a(bigInteger);
        aU.a(bigInteger.signum() >= 0 && bigInteger.bitLength() <= 32, "value (%s) is outside the range for an unsigned integer value", (Object)bigInteger);
        return L.a(bigInteger.intValue());
    }

    public static L a(String string) {
        return L.a(string, 10);
    }

    public static L a(String string, int n2) {
        return L.a(M.a(string, n2));
    }

    public L a(L l2) {
        return L.a(this.d + aU.a(l2).d);
    }

    public L b(L l2) {
        return L.a(this.d - aU.a(l2).d);
    }

    public L c(L l2) {
        return L.a(this.d * aU.a(l2).d);
    }

    public L d(L l2) {
        return L.a(M.b(this.d, aU.a(l2).d));
    }

    public L e(L l2) {
        return L.a(M.c(this.d, aU.a(l2).d));
    }

    @Override
    public int intValue() {
        return this.d;
    }

    @Override
    public long longValue() {
        return M.b(this.d);
    }

    @Override
    public float floatValue() {
        return this.longValue();
    }

    @Override
    public double doubleValue() {
        return this.longValue();
    }

    public BigInteger a() {
        return BigInteger.valueOf(this.longValue());
    }

    public int f(L l2) {
        aU.a(l2);
        return M.a(this.d, l2.d);
    }

    public int hashCode() {
        return this.d;
    }

    public boolean equals(Object object) {
        if (object instanceof L) {
            L l2 = (L)object;
            return this.d == l2.d;
        }
        return false;
    }

    public String toString() {
        return this.b(10);
    }

    public String b(int n2) {
        return M.d(this.d, n2);
    }

    @Override
    public /* synthetic */ int compareTo(Object object) {
        return this.f((L)object);
    }
}

