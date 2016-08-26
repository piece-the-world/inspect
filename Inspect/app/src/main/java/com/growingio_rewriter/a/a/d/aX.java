/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.ea;
import com.growingio.a.a.d.kO;
import java.io.Serializable;
import java.util.Comparator;

final class aX<T>
extends kO<T>
implements Serializable {
    final ea<Comparator<? super T>> a;
    private static final long b = 0;

    aX(Comparator<? super T> comparator, Comparator<? super T> comparator2) {
        this.a = ea.a(comparator, comparator2);
    }

    aX(Iterable<? extends Comparator<? super T>> iterable) {
        this.a = ea.a(iterable);
    }

    @Override
    public int compare(T t2, T t3) {
        int n2 = this.a.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3 = this.a.get(i2).compare(t2, t3);
            if (n3 == 0) continue;
            return n3;
        }
        return 0;
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof aX) {
            aX aX2 = (aX)object;
            return this.a.equals(aX2.a);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "Ordering.compound(" + this.a + ")";
    }
}

