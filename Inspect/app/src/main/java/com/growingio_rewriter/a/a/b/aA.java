/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.aq;
import com.growingio.a.a.b.at;
import com.growingio.a.a.b.bG;
import java.io.Serializable;

class aA<T>
implements aq<Object, T>,
Serializable {
    private final bG<T> a;
    private static final long b = 0;

    private aA(bG<T> bG2) {
        this.a = aU.a(bG2);
    }

    @Override
    public T f(Object object) {
        return this.a.a();
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof aA) {
            aA aA2 = (aA)object;
            return this.a.equals(aA2.a);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "Functions.forSupplier(" + this.a + ")";
    }

    /* synthetic */ aA(bG bG2, at at2) {
        this(bG2);
    }
}

