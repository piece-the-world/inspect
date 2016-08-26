/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.aD;
import com.growingio.a.a.d.bO;
import com.growingio.a.a.d.bw;

final class by
extends bw<Comparable<?>> {
    private static final by b = new by();
    private static final long c = 0;

    private by() {
        super(null);
    }

    @Override
    Comparable<?> c() {
        throw new IllegalStateException("range unbounded on this side");
    }

    @Override
    boolean a(Comparable<?> comparable) {
        return false;
    }

    @Override
    aD a() {
        throw new AssertionError((Object)"this statement should be unreachable");
    }

    @Override
    aD b() {
        throw new IllegalStateException();
    }

    @Override
    bw<Comparable<?>> a(aD aD2, bO<Comparable<?>> bO2) {
        throw new AssertionError((Object)"this statement should be unreachable");
    }

    @Override
    bw<Comparable<?>> b(aD aD2, bO<Comparable<?>> bO2) {
        throw new IllegalStateException();
    }

    @Override
    void a(StringBuilder stringBuilder) {
        throw new AssertionError();
    }

    @Override
    void b(StringBuilder stringBuilder) {
        stringBuilder.append("+\u221e)");
    }

    @Override
    Comparable<?> a(bO<Comparable<?>> bO2) {
        throw new AssertionError();
    }

    @Override
    Comparable<?> b(bO<Comparable<?>> bO2) {
        return bO2.e();
    }

    @Override
    public int a(bw<Comparable<?>> bw2) {
        return bw2 == this ? 0 : 1;
    }

    public String toString() {
        return "+\u221e";
    }

    private Object g() {
        return b;
    }

    @Override
    public /* synthetic */ int compareTo(Object object) {
        return this.a((bw)object);
    }

    static /* synthetic */ by f() {
        return b;
    }
}

