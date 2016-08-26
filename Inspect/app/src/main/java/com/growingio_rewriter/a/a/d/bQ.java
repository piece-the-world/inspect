/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.bO;
import java.io.Serializable;

final class bQ
extends bO<Integer>
implements Serializable {
    private static final bQ a = new bQ();
    private static final long b = 0;

    private bQ() {
    }

    @Override
    public Integer a(Integer n2) {
        int n3 = n2;
        return n3 == Integer.MAX_VALUE ? null : Integer.valueOf(n3 + 1);
    }

    @Override
    public Integer b(Integer n2) {
        int n3 = n2;
        return n3 == Integer.MIN_VALUE ? null : Integer.valueOf(n3 - 1);
    }

    @Override
    public long a(Integer n2, Integer n3) {
        return (long)n3.intValue() - (long)n2.intValue();
    }

    public Integer f() {
        return Integer.MIN_VALUE;
    }

    public Integer g() {
        return Integer.MAX_VALUE;
    }

    private Object i() {
        return a;
    }

    public String toString() {
        return "DiscreteDomain.integers()";
    }

    @Override
    public /* synthetic */ Comparable e() {
        return this.g();
    }

    @Override
    public /* synthetic */ Comparable d() {
        return this.f();
    }

    static /* synthetic */ bQ h() {
        return a;
    }
}

