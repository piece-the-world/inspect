/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.aV;
import com.growingio.a.a.d.aW;
import java.util.Comparator;

public abstract class aU {
    private static final aU a = new aV();
    private static final aU b = new aW(-1);
    private static final aU c = new aW(1);

    private aU() {
    }

    public static aU a() {
        return a;
    }

    public abstract aU a(Comparable<?> var1, Comparable<?> var2);

    public abstract <T> aU a(T var1, T var2, Comparator<T> var3);

    public abstract aU a(int var1, int var2);

    public abstract aU a(long var1, long var3);

    public abstract aU a(float var1, float var2);

    public abstract aU a(double var1, double var3);

    public final aU a(Boolean bl2, Boolean bl3) {
        return this.b(bl2, bl3);
    }

    public abstract aU a(boolean var1, boolean var2);

    public abstract aU b(boolean var1, boolean var2);

    public abstract int b();

    /* synthetic */ aU(aV aV2) {
        this();
    }

    static /* synthetic */ aU c() {
        return b;
    }

    static /* synthetic */ aU d() {
        return c;
    }

    static /* synthetic */ aU e() {
        return a;
    }
}

