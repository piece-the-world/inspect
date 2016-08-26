/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.bO;
import java.io.Serializable;
import java.math.BigInteger;

final class bP
extends bO<BigInteger>
implements Serializable {
    private static final bP a = new bP();
    private static final BigInteger b = BigInteger.valueOf(Long.MIN_VALUE);
    private static final BigInteger c = BigInteger.valueOf(Long.MAX_VALUE);
    private static final long d = 0;

    private bP() {
    }

    @Override
    public BigInteger a(BigInteger bigInteger) {
        return bigInteger.add(BigInteger.ONE);
    }

    @Override
    public BigInteger b(BigInteger bigInteger) {
        return bigInteger.subtract(BigInteger.ONE);
    }

    @Override
    public long a(BigInteger bigInteger, BigInteger bigInteger2) {
        return bigInteger2.subtract(bigInteger).max(b).min(c).longValue();
    }

    private Object g() {
        return a;
    }

    public String toString() {
        return "DiscreteDomain.bigIntegers()";
    }

    static /* synthetic */ bP f() {
        return a;
    }
}

