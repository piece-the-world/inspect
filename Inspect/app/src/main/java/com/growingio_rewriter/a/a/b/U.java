/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.R;
import java.io.Serializable;

final class U<A, B, C>
extends R<A, C>
implements Serializable {
    final R<A, B> a;
    final R<B, C> b;
    private static final long c = 0;

    U(R<A, B> r2, R<B, C> r3) {
        this.a = r2;
        this.b = r3;
    }

    @Override
    protected C b(A a2) {
        throw new AssertionError();
    }

    @Override
    protected A a(C c2) {
        throw new AssertionError();
    }

    @Override
    C d(A a2) {
        return this.b.d(this.a.d(a2));
    }

    @Override
    A e(C c2) {
        return this.a.e(this.b.e(c2));
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof U) {
            U u2 = (U)object;
            return this.a.equals(u2.a) && this.b.equals(u2.b);
        }
        return false;
    }

    public int hashCode() {
        return 31 * this.a.hashCode() + this.b.hashCode();
    }

    public String toString() {
        return this.a + ".andThen(" + this.b + ")";
    }
}

