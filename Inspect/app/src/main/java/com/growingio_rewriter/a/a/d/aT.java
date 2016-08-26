/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.kO;
import java.io.Serializable;
import java.util.Comparator;

final class aT<T>
extends kO<T>
implements Serializable {
    final Comparator<T> a;
    private static final long b = 0;

    aT(Comparator<T> comparator) {
        this.a = aU.a(comparator);
    }

    @Override
    public int compare(T t2, T t3) {
        return this.a.compare(t2, t3);
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof aT) {
            aT aT2 = (aT)object;
            return this.a.equals(aT2.a);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return this.a.toString();
    }
}

