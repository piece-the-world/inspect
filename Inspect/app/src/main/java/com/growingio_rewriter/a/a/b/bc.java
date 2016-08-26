/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.aV;
import com.growingio.a.a.b.aX;
import java.io.Serializable;
import java.util.Collection;

class bc<T>
implements aV<T>,
Serializable {
    private final Collection<?> a;
    private static final long b = 0;

    private bc(Collection<?> collection) {
        this.a = aU.a(collection);
    }

    @Override
    public boolean a(T t2) {
        try {
            return this.a.contains(t2);
        }
        catch (NullPointerException var2_2) {
            return false;
        }
        catch (ClassCastException var2_3) {
            return false;
        }
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof bc) {
            bc bc2 = (bc)object;
            return this.a.equals(bc2.a);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "Predicates.in(" + this.a + ")";
    }

    /* synthetic */ bc(Collection collection, aX aX2) {
        this(collection);
    }
}

