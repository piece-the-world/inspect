/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.aV;
import com.growingio.a.a.b.aX;
import java.io.Serializable;

class bm
implements aV<Class<?>>,
Serializable {
    private final Class<?> a;
    private static final long b = 0;

    private bm(Class<?> class_) {
        this.a = aU.a(class_);
    }

    @Override
    public boolean a(Class<?> class_) {
        return this.a.isAssignableFrom(class_);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof bm) {
            bm bm2 = (bm)object;
            return this.a == bm2.a;
        }
        return false;
    }

    public String toString() {
        return "Predicates.subtypeOf(" + this.a.getName() + ")";
    }

    /* synthetic */ bm(Class class_, aX aX2) {
        this(class_);
    }
}

