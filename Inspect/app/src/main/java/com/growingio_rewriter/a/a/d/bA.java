/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.aD;
import com.growingio.a.a.d.bO;
import com.growingio.a.a.d.bw;
import java.util.NoSuchElementException;

final class bA
extends bw<Comparable<?>> {
    private static final bA b = new bA();
    private static final long c = 0;

    private bA() {
        super(null);
    }

    @Override
    Comparable<?> c() {
        throw new IllegalStateException("range unbounded on this side");
    }

    @Override
    boolean a(Comparable<?> comparable) {
        return true;
    }

    @Override
    aD a() {
        throw new IllegalStateException();
    }

    @Override
    aD b() {
        throw new AssertionError((Object)"this statement should be unreachable");
    }

    @Override
    bw<Comparable<?>> a(aD aD2, bO<Comparable<?>> bO2) {
        throw new IllegalStateException();
    }

    @Override
    bw<Comparable<?>> b(aD aD2, bO<Comparable<?>> bO2) {
        throw new AssertionError((Object)"this statement should be unreachable");
    }

    @Override
    void a(StringBuilder stringBuilder) {
        stringBuilder.append("(-\u221e");
    }

    @Override
    void b(StringBuilder stringBuilder) {
        throw new AssertionError();
    }

    @Override
    Comparable<?> a(bO<Comparable<?>> bO2) {
        return bO2.d();
    }

    @Override
    Comparable<?> b(bO<Comparable<?>> bO2) {
        throw new AssertionError();
    }

    @Override
    bw<Comparable<?>> c(bO<Comparable<?>> bO2) {
        try {
            return bw.b(bO2.d());
        }
        catch (NoSuchElementException var2_2) {
            return this;
        }
    }

    @Override
    public int a(bw<Comparable<?>> bw2) {
        return bw2 == this ? 0 : -1;
    }

    public String toString() {
        return "-\u221e";
    }

    private Object g() {
        return b;
    }

    @Override
    public /* synthetic */ int compareTo(Object object) {
        return this.a((bw)object);
    }

    static /* synthetic */ bA f() {
        return b;
    }
}

