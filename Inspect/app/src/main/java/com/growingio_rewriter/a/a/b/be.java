/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.aV;
import com.growingio.a.a.b.aX;
import java.io.Serializable;

class be<T>
implements aV<T>,
Serializable {
    private final T a;
    private static final long b = 0;

    private be(T t2) {
        this.a = t2;
    }

    @Override
    public boolean a(T t2) {
        return this.a.equals(t2);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof be) {
            be be2 = (be)object;
            return this.a.equals(be2.a);
        }
        return false;
    }

    public String toString() {
        return "Predicates.equalTo(" + this.a + ")";
    }

    /* synthetic */ be(Object object, aX aX2) {
        this(object);
    }
}

