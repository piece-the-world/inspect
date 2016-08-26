/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.aV;
import com.growingio.a.a.b.aq;
import com.growingio.a.a.b.at;
import java.io.Serializable;

class az<T>
implements aq<T, Boolean>,
Serializable {
    private final aV<T> a;
    private static final long b = 0;

    private az(aV<T> aV2) {
        this.a = aU.a(aV2);
    }

    public Boolean a(T t2) {
        return this.a.a(t2);
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof az) {
            az az2 = (az)object;
            return this.a.equals(az2.a);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "Functions.forPredicate(" + this.a + ")";
    }

    @Override
    public /* synthetic */ Object f(Object object) {
        return this.a(object);
    }

    /* synthetic */ az(aV aV2, at at2) {
        this(aV2);
    }
}

