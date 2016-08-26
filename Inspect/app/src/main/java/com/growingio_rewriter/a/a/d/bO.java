/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.bP;
import com.growingio.a.a.d.bQ;
import com.growingio.a.a.d.bR;
import java.math.BigInteger;
import java.util.NoSuchElementException;

public abstract class bO<C extends Comparable> {
    public static bO<Integer> a() {
        return bQ.h();
    }

    public static bO<Long> b() {
        return bR.h();
    }

    public static bO<BigInteger> c() {
        return bP.f();
    }

    protected bO() {
    }

    public abstract C a(C var1);

    public abstract C b(C var1);

    public abstract long a(C var1, C var2);

    public C d() {
        throw new NoSuchElementException();
    }

    public C e() {
        throw new NoSuchElementException();
    }
}

