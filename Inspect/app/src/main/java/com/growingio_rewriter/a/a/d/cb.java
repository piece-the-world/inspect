/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.ei;
import com.growingio.a.a.d.fg;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.d.kO;
import com.growingio.a.a.d.kS;
import java.io.Serializable;
import java.util.List;

final class cb<T>
extends kO<T>
implements Serializable {
    final ei<T, Integer> a;
    private static final long b = 0;

    cb(List<T> list) {
        this(ii.a(list));
    }

    cb(ei<T, Integer> ei2) {
        this.a = ei2;
    }

    @Override
    public int compare(T t2, T t3) {
        return this.a(t2) - this.a(t3);
    }

    private int a(T t2) {
        Integer n2 = this.a.get(t2);
        if (n2 == null) {
            throw new kS(t2);
        }
        return n2;
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof cb) {
            cb cb2 = (cb)object;
            return this.a.equals(cb2.a);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "Ordering.explicit(" + this.a.m() + ")";
    }
}

