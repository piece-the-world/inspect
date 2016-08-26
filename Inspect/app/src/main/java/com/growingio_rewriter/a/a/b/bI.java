/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.aT;
import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.bG;
import java.io.Serializable;
import java.util.concurrent.TimeUnit;

class bI<T>
implements bG<T>,
Serializable {
    final bG<T> a;
    final long b;
    volatile transient T c;
    volatile transient long d;
    private static final long e = 0;

    bI(bG<T> bG2, long l2, TimeUnit timeUnit) {
        this.a = aU.a(bG2);
        this.b = timeUnit.toNanos(l2);
        aU.a(l2 > 0);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public T a() {
        long l2 = this.d;
        long l3 = aT.a();
        if (l2 == 0 || l3 - l2 >= 0) {
            bI bI2 = this;
            synchronized (bI2) {
                if (l2 == this.d) {
                    T t2;
                    this.c = t2 = this.a.a();
                    l2 = l3 + this.b;
                    this.d = l2 == 0 ? 1 : l2;
                    return t2;
                }
            }
        }
        return this.c;
    }

    public String toString() {
        return "Suppliers.memoizeWithExpiration(" + this.a + ", " + this.b + ", NANOS)";
    }
}

