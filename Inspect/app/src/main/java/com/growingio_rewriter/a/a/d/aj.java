/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.ea;
import com.growingio.a.a.d.gO;
import com.growingio.a.a.d.kO;
import java.io.Serializable;
import java.util.List;

final class aj
extends kO<Object>
implements Serializable {
    static final aj a = new aj();
    private static final long b = 0;

    aj() {
    }

    @Override
    public int compare(Object object, Object object2) {
        return 0;
    }

    @Override
    public <E> List<E> a(Iterable<E> iterable) {
        return gO.a(iterable);
    }

    @Override
    public <E> ea<E> b(Iterable<E> iterable) {
        return ea.a(iterable);
    }

    @Override
    public <S> kO<S> a() {
        return this;
    }

    private Object j() {
        return a;
    }

    public String toString() {
        return "Ordering.allEqual()";
    }
}

