/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.R;
import java.io.Serializable;

final class X<A, B>
extends R<B, A>
implements Serializable {
    final R<A, B> a;
    private static final long b = 0;

    X(R<A, B> r2) {
        this.a = r2;
    }

    @Override
    protected A b(B b2) {
        throw new AssertionError();
    }

    @Override
    protected B a(A a2) {
        throw new AssertionError();
    }

    @Override
    A d(B b2) {
        return this.a.e(b2);
    }

    @Override
    B e(A a2) {
        return this.a.d(a2);
    }

    @Override
    public R<A, B> a() {
        return this.a;
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof X) {
            X x2 = (X)object;
            return this.a.equals(x2.a);
        }
        return false;
    }

    public int hashCode() {
        return ~ this.a.hashCode();
    }

    public String toString() {
        return this.a + ".reverse()";
    }
}

