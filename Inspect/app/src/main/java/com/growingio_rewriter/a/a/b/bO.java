/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.bG;
import java.io.Serializable;

class bO<T>
implements bG<T>,
Serializable {
    final bG<T> a;
    private static final long b = 0;

    bO(bG<T> bG2) {
        this.a = bG2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public T a() {
        bG<T> bG2 = this.a;
        synchronized (bG2) {
            return this.a.a();
        }
    }

    public String toString() {
        return "Suppliers.synchronizedSupplier(" + this.a + ")";
    }
}

