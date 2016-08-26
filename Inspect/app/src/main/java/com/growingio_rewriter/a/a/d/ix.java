/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.R;
import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.av;
import java.io.Serializable;

final class ix<A, B>
extends R<A, B>
implements Serializable {
    private final av<A, B> a;
    private static final long b = 0;

    ix(av<A, B> av2) {
        this.a = aU.a(av2);
    }

    @Override
    protected B b(A a2) {
        return ix.a(this.a, a2);
    }

    @Override
    protected A a(B b2) {
        return ix.a(this.a.m_(), b2);
    }

    private static <X, Y> Y a(av<X, Y> av2, X x2) {
        Y y2 = av2.get(x2);
        aU.a(y2 != null, "No non-null mapping present for input: %s", x2);
        return y2;
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof ix) {
            ix ix2 = (ix)object;
            return this.a.equals(ix2.a);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "Maps.asConverter(" + this.a + ")";
    }
}

