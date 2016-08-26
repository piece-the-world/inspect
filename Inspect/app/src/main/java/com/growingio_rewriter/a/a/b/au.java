/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.aL;
import com.growingio.a.a.b.aq;
import java.io.Serializable;

class au<E>
implements aq<Object, E>,
Serializable {
    private final E a;
    private static final long b = 0;

    public au(E e2) {
        this.a = e2;
    }

    @Override
    public E f(Object object) {
        return this.a;
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof au) {
            au au2 = (au)object;
            return aL.a(this.a, au2.a);
        }
        return false;
    }

    public int hashCode() {
        return this.a == null ? 0 : this.a.hashCode();
    }

    public String toString() {
        return "Functions.constant(" + this.a + ")";
    }
}

