/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.aL;
import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.aV;
import com.growingio.a.a.b.ab;
import java.io.Serializable;

final class ae<T>
implements aV<T>,
Serializable {
    private final ab<T> a;
    private final T b;
    private static final long c = 0;

    ae(ab<T> ab2, T t2) {
        this.a = aU.a(ab2);
        this.b = t2;
    }

    @Override
    public boolean a(T t2) {
        return this.a.a(t2, this.b);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof ae) {
            ae ae2 = (ae)object;
            return this.a.equals(ae2.a) && aL.a(this.b, ae2.b);
        }
        return false;
    }

    public int hashCode() {
        return aL.a(new Object[]{this.a, this.b});
    }

    public String toString() {
        return this.a + ".equivalentTo(" + this.b + ")";
    }
}

