/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.bG;
import java.io.Serializable;

class bJ<T>
implements bG<T>,
Serializable {
    final bG<T> a;
    volatile transient boolean b;
    transient T c;
    private static final long d = 0;

    bJ(bG<T> bG2) {
        this.a = bG2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public T a() {
        if (!this.b) {
            bJ bJ2 = this;
            synchronized (bJ2) {
                if (!this.b) {
                    T t2;
                    this.c = t2 = this.a.a();
                    this.b = true;
                    return t2;
                }
            }
        }
        return this.c;
    }

    public String toString() {
        return "Suppliers.memoize(" + this.a + ")";
    }
}

