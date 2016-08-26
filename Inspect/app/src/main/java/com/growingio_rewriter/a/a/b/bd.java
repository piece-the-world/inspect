/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.aV;
import com.growingio.a.a.b.aX;
import java.io.Serializable;

class bd
implements aV<Object>,
Serializable {
    private final Class<?> a;
    private static final long b = 0;

    private bd(Class<?> class_) {
        this.a = aU.a(class_);
    }

    @Override
    public boolean a(Object object) {
        return this.a.isInstance(object);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof bd) {
            bd bd2 = (bd)object;
            return this.a == bd2.a;
        }
        return false;
    }

    public String toString() {
        return "Predicates.instanceOf(" + this.a.getName() + ")";
    }

    /* synthetic */ bd(Class class_, aX aX2) {
        this(class_);
    }
}

