/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.aL;
import com.growingio.a.a.b.aq;
import com.growingio.a.a.b.bG;
import java.io.Serializable;

class bK<F, T>
implements bG<T>,
Serializable {
    final aq<? super F, T> a;
    final bG<F> b;
    private static final long c = 0;

    bK(aq<? super F, T> aq2, bG<F> bG2) {
        this.a = aq2;
        this.b = bG2;
    }

    @Override
    public T a() {
        return this.a.f(this.b.a());
    }

    public boolean equals(Object object) {
        if (object instanceof bK) {
            bK bK2 = (bK)object;
            return this.a.equals(bK2.a) && this.b.equals(bK2.b);
        }
        return false;
    }

    public int hashCode() {
        return aL.a(new Object[]{this.a, this.b});
    }

    public String toString() {
        return "Suppliers.compose(" + this.a + ", " + this.b + ")";
    }
}

