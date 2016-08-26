/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.aS;
import com.growingio.a.a.b.aV;
import com.growingio.a.a.b.ac;
import com.growingio.a.a.b.ad;
import com.growingio.a.a.b.ae;
import com.growingio.a.a.b.af;
import com.growingio.a.a.b.ag;
import com.growingio.a.a.b.aq;
import com.growingio.a.a.b.ar;

public abstract class ab<T> {
    protected ab() {
    }

    public final boolean a(T t2, T t3) {
        if (t2 == t3) {
            return true;
        }
        if (t2 == null || t3 == null) {
            return false;
        }
        return this.b(t2, t3);
    }

    protected abstract boolean b(T var1, T var2);

    public final int a(T t2) {
        if (t2 == null) {
            return 0;
        }
        return this.b(t2);
    }

    protected abstract int b(T var1);

    public final <F> ab<F> a(aq<F, ? extends T> aq2) {
        return new ar<F, T>(aq2, this);
    }

    public final <S extends T> ag<S> c(S s2) {
        return new ag<T>(this, s2, null);
    }

    public final <S extends T> ab<Iterable<S>> a() {
        return new aS<T>(this);
    }

    public final aV<T> d(T t2) {
        return new ae<T>(this, t2);
    }

    public static ab<Object> b() {
        return ad.a;
    }

    public static ab<Object> c() {
        return af.a;
    }
}

