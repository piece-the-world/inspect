/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.bO;
import java.io.Serializable;

final class bR
extends bO<Long>
implements Serializable {
    private static final bR a = new bR();
    private static final long b = 0;

    private bR() {
    }

    @Override
    public Long a(Long l2) {
        long l3 = l2;
        return l3 == Long.MAX_VALUE ? null : Long.valueOf(l3 + 1);
    }

    @Override
    public Long b(Long l2) {
        long l3 = l2;
        return l3 == Long.MIN_VALUE ? null : Long.valueOf(l3 - 1);
    }

    @Override
    public long a(Long l2, Long l3) {
        long l4 = l3 - l2;
        if (l3 > l2 && l4 < 0) {
            return Long.MAX_VALUE;
        }
        if (l3 < l2 && l4 > 0) {
            return Long.MIN_VALUE;
        }
        return l4;
    }

    public Long f() {
        return Long.MIN_VALUE;
    }

    public Long g() {
        return Long.MAX_VALUE;
    }

    private Object i() {
        return a;
    }

    public String toString() {
        return "DiscreteDomain.longs()";
    }

    @Override
    public /* synthetic */ Comparable e() {
        return this.g();
    }

    @Override
    public /* synthetic */ Comparable d() {
        return this.f();
    }

    static /* synthetic */ bR h() {
        return a;
    }
}

