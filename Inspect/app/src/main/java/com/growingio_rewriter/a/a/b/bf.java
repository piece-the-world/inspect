/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.aV;
import java.io.Serializable;

class bf<T>
implements aV<T>,
Serializable {
    final aV<T> a;
    private static final long b = 0;

    bf(aV<T> aV2) {
        this.a = aU.a(aV2);
    }

    @Override
    public boolean a(T t2) {
        return !this.a.a(t2);
    }

    public int hashCode() {
        return ~ this.a.hashCode();
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof bf) {
            bf bf2 = (bf)object;
            return this.a.equals(bf2.a);
        }
        return false;
    }

    public String toString() {
        return "Predicates.not(" + this.a + ")";
    }
}

