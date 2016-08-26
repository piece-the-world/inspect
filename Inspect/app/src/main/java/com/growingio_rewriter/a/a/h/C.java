/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.h;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.h.aC;
import com.growingio.a.a.h.x;
import java.io.Serializable;

class C<E>
implements x<Iterable<? extends E>>,
Serializable {
    private final x<E> a;

    C(x<E> x2) {
        this.a = aU.a(x2);
    }

    @Override
    public void a(Iterable<? extends E> iterable, aC aC2) {
        for (E e2 : iterable) {
            this.a.a(e2, aC2);
        }
    }

    public String toString() {
        return "Funnels.sequentialFunnel(" + this.a + ")";
    }

    public boolean equals(Object object) {
        if (object instanceof C) {
            C c2 = (C)object;
            return this.a.equals(c2.a);
        }
        return false;
    }

    public int hashCode() {
        return C.class.hashCode() ^ this.a.hashCode();
    }
}

