/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.ab;
import com.growingio.a.a.d.fF;
import com.growingio.a.a.d.fH;
import com.growingio.a.a.d.fK;
import com.growingio.a.a.d.hE;
import com.growingio.a.a.d.hG;
import com.growingio.a.a.d.hT;

class fJ<E>
implements fF<E> {
    private final hG<E, fK> a = new hE().d().a(ab.b()).i();

    private fJ() {
    }

    @Override
    public E a(E e2) {
        Object object;
        do {
            hT<E, fK> hT2;
            if ((hT2 = this.a.c(e2)) == null || (object = hT2.d()) == null) continue;
            return (E)object;
        } while ((object = this.a.putIfAbsent(e2, fK.a)) != null);
        return e2;
    }

    /* synthetic */ fJ(fH fH2) {
        this();
    }
}

