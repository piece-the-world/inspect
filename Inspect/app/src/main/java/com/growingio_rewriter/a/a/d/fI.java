/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aq;
import com.growingio.a.a.d.fF;

class fI<E>
implements aq<E, E> {
    private final fF<E> a;

    public fI(fF<E> fF2) {
        this.a = fF2;
    }

    @Override
    public E f(E e2) {
        return this.a.a(e2);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof fI) {
            fI fI2 = (fI)object;
            return this.a.equals(fI2.a);
        }
        return false;
    }
}

