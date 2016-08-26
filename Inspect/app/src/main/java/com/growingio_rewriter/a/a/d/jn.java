/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.jl;
import com.growingio.a.a.d.jm;
import com.growingio.a.a.d.kO;
import java.util.Collections;
import java.util.Comparator;

public final class jn<B> {
    private static final int a = -1;
    private final Comparator<B> b;
    private int c = -1;
    private int d = Integer.MAX_VALUE;

    private jn(Comparator<B> comparator) {
        this.b = aU.a(comparator);
    }

    public jn<B> a(int n2) {
        aU.a(n2 >= 0);
        this.c = n2;
        return this;
    }

    public jn<B> b(int n2) {
        aU.a(n2 > 0);
        this.d = n2;
        return this;
    }

    public <T extends B> jl<T> a() {
        return this.a(Collections.emptySet());
    }

    public <T extends B> jl<T> a(Iterable<? extends T> iterable) {
        jl<T> jl2 = new jl<T>(this, jl.a(this.c, this.d, iterable), null);
        for (T t2 : iterable) {
            jl2.offer(t2);
        }
        return jl2;
    }

    private <T extends B> kO<T> b() {
        return kO.a(this.b);
    }

    /* synthetic */ jn(Comparator comparator, jm jm2) {
        this(comparator);
    }

    static /* synthetic */ kO a(jn jn2) {
        return jn2.b();
    }

    static /* synthetic */ int b(jn jn2) {
        return jn2.d;
    }
}

