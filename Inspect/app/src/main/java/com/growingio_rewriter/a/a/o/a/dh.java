/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.b.bG;
import com.growingio.a.a.d.ea;
import com.growingio.a.a.d.fL;
import com.growingio.a.a.k.f;
import com.growingio.a.a.o.a.di;
import com.growingio.a.a.o.a.dj;
import com.growingio.a.a.o.a.dk;
import com.growingio.a.a.o.a.dl;
import com.growingio.a.a.o.a.dm;
import com.growingio.a.a.o.a.dn;
import com.growingio.a.a.o.a.do;
import com.growingio.a.a.o.a.ds;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;

public abstract class dh<L> {
    private static final int a = 1024;
    private static final bG<ReadWriteLock> b = new dm();
    private static final int c = -1;

    private dh() {
    }

    public abstract L a(Object var1);

    public abstract L a(int var1);

    abstract int b(Object var1);

    public abstract int a();

    public Iterable<L> a(Iterable<?> iterable) {
        int n2;
        ?[] arrobj = fL.a(iterable, Object.class);
        if (arrobj.length == 0) {
            return ea.d();
        }
        int[] arrn = new int[arrobj.length];
        for (n2 = 0; n2 < arrobj.length; ++n2) {
            arrn[n2] = this.b(arrobj[n2]);
        }
        Arrays.sort(arrn);
        n2 = arrn[0];
        arrobj[0] = this.a(n2);
        for (int i2 = 1; i2 < arrobj.length; ++i2) {
            int n3 = arrn[i2];
            if (n3 == n2) {
                arrobj[i2] = arrobj[i2 - 1];
                continue;
            }
            arrobj[i2] = this.a(n3);
            n2 = n3;
        }
        List<?> list = Arrays.asList(arrobj);
        return Collections.unmodifiableList(list);
    }

    public static dh<Lock> b(int n2) {
        return new dn<Lock>(n2, new di(), null);
    }

    public static dh<Lock> c(int n2) {
        return dh.a(n2, new dj());
    }

    private static <L> dh<L> a(int n2, bG<L> bG2) {
        return n2 < 1024 ? new ds<L>(n2, bG2) : new do<L>(n2, bG2);
    }

    public static dh<Semaphore> a(int n2, int n3) {
        return new dn<Semaphore>(n2, new dk(n3), null);
    }

    public static dh<Semaphore> b(int n2, int n3) {
        return dh.a(n2, new dl(n3));
    }

    public static dh<ReadWriteLock> d(int n2) {
        return new dn<ReadWriteLock>(n2, b, null);
    }

    public static dh<ReadWriteLock> e(int n2) {
        return dh.a(n2, b);
    }

    private static int h(int n2) {
        return 1 << f.a(n2, RoundingMode.CEILING);
    }

    private static int i(int n2) {
        n2 ^= n2 >>> 20 ^ n2 >>> 12;
        return n2 ^ n2 >>> 7 ^ n2 >>> 4;
    }

    /* synthetic */ dh(di di2) {
        this();
    }

    static /* synthetic */ int f(int n2) {
        return dh.h(n2);
    }

    static /* synthetic */ int g(int n2) {
        return dh.i(n2);
    }
}

