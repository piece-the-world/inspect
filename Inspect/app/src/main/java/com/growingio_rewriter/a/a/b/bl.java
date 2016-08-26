/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.aV;
import com.growingio.a.a.b.aW;
import com.growingio.a.a.b.aX;
import java.io.Serializable;
import java.util.List;

class bl<T>
implements aV<T>,
Serializable {
    private final List<? extends aV<? super T>> a;
    private static final long b = 0;

    private bl(List<? extends aV<? super T>> list) {
        this.a = list;
    }

    @Override
    public boolean a(T t2) {
        for (int i2 = 0; i2 < this.a.size(); ++i2) {
            if (!this.a.get(i2).a(t2)) continue;
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() + 87855567;
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof bl) {
            bl bl2 = (bl)object;
            return this.a.equals(bl2.a);
        }
        return false;
    }

    public String toString() {
        return "Predicates.or(" + aW.e().a(this.a) + ")";
    }

    /* synthetic */ bl(List list, aX aX2) {
        this(list);
    }
}

