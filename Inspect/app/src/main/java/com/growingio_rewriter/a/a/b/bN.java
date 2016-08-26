/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.aL;
import com.growingio.a.a.b.bG;
import java.io.Serializable;

class bN<T>
implements bG<T>,
Serializable {
    final T a;
    private static final long b = 0;

    bN(T t2) {
        this.a = t2;
    }

    @Override
    public T a() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (object instanceof bN) {
            bN bN2 = (bN)object;
            return aL.a(this.a, bN2.a);
        }
        return false;
    }

    public int hashCode() {
        return aL.a(new Object[]{this.a});
    }

    public String toString() {
        return "Suppliers.ofInstance(" + this.a + ")";
    }
}

