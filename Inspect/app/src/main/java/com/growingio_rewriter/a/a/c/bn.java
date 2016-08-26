/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.c;

import com.growingio.a.a.c.bl;
import java.lang.reflect.Field;
import sun.misc.Unsafe;

final class bn {
    volatile long a;
    volatile long b;
    volatile long c;
    volatile long d;
    volatile long e;
    volatile long f;
    volatile long g;
    volatile long h;
    volatile long i;
    volatile long j;
    volatile long k;
    volatile long l;
    volatile long m;
    volatile long n;
    volatile long o;
    private static final Unsafe p;
    private static final long q;

    bn(long l2) {
        this.h = l2;
    }

    final boolean a(long l2, long l3) {
        return p.compareAndSwapLong(this, q, l2, l3);
    }

    static {
        try {
            p = bl.g();
            reference var0 = bn.class;
            q = p.objectFieldOffset(var0.getDeclaredField("value"));
        }
        catch (Exception var0_1) {
            throw new Error(var0_1);
        }
    }
}

