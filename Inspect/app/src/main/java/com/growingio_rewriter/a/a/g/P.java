/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.g;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.fg;
import com.growingio.a.a.d.gb;
import com.growingio.a.a.d.oP;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

final class P<E>
extends AbstractSet<E> {
    private final Map<?, E> a;
    private final Object b;

    P(Map<?, E> map, Object object) {
        this.a = aU.a(map);
        this.b = aU.a(object);
    }

    @Override
    public Iterator<E> iterator() {
        E e2 = this.a();
        return e2 == null ? fg.k().k_() : gb.a(e2);
    }

    @Override
    public int size() {
        return this.a() == null ? 0 : 1;
    }

    @Override
    public boolean contains(Object object) {
        E e2 = this.a();
        return e2 != null && e2.equals(object);
    }

    private E a() {
        return this.a.get(this.b);
    }
}

