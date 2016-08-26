/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.R;
import com.growingio.a.a.b.S;
import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.aq;
import java.io.Serializable;

final class V<A, B>
extends R<A, B>
implements Serializable {
    private final aq<? super A, ? extends B> a;
    private final aq<? super B, ? extends A> b;

    private V(aq<? super A, ? extends B> aq2, aq<? super B, ? extends A> aq3) {
        this.a = aU.a(aq2);
        this.b = aU.a(aq3);
    }

    @Override
    protected B b(A a2) {
        return this.a.f(a2);
    }

    @Override
    protected A a(B b2) {
        return this.b.f(b2);
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof V) {
            V v2 = (V)object;
            return this.a.equals(v2.a) && this.b.equals(v2.b);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() * 31 + this.b.hashCode();
    }

    public String toString() {
        return "Converter.from(" + this.a + ", " + this.b + ")";
    }

    /* synthetic */ V(aq aq2, aq aq3, S s2) {
        this(aq2, aq3);
    }
}

