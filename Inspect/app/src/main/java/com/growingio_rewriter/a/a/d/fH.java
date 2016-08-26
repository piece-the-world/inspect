/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.fF;
import java.util.concurrent.ConcurrentMap;

final class fH
implements fF<E> {
    final /* synthetic */ ConcurrentMap a;

    fH(ConcurrentMap concurrentMap) {
        this.a = concurrentMap;
    }

    @Override
    public E a(E e2) {
        E e3 = this.a.putIfAbsent(aU.a(e2), e2);
        return e3 == null ? e2 : e3;
    }
}

