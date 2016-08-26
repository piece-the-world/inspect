/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.ei;
import com.growingio.a.a.d.lZ;
import java.util.AbstractSet;
import java.util.Iterator;

final class lY<E>
extends AbstractSet<E> {
    private final ei<E, Integer> a;
    private final int b;

    lY(ei<E, Integer> ei2, int n2) {
        this.a = ei2;
        this.b = n2;
    }

    @Override
    public Iterator<E> iterator() {
        return new lZ(this);
    }

    @Override
    public int size() {
        return Integer.bitCount(this.b);
    }

    @Override
    public boolean contains(Object object) {
        Integer n2 = this.a.get(object);
        return n2 != null && (this.b & 1 << n2) != 0;
    }

    static /* synthetic */ ei a(lY lY2) {
        return lY2.a;
    }

    static /* synthetic */ int b(lY lY2) {
        return lY2.b;
    }
}

