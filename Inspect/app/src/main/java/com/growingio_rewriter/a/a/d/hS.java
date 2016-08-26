/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.hG;
import com.growingio.a.a.d.hH;
import com.growingio.a.a.d.hR;
import com.growingio.a.a.d.hU;
import java.util.Iterator;

final class hS
extends hU<K> {
    final /* synthetic */ hG a;

    hS(hG hG2) {
        this.a = hG2;
        super(null);
    }

    @Override
    public Iterator<K> iterator() {
        return new hR(this.a);
    }

    @Override
    public int size() {
        return this.a.size();
    }

    @Override
    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override
    public boolean contains(Object object) {
        return this.a.containsKey(object);
    }

    @Override
    public boolean remove(Object object) {
        return this.a.remove(object) != null;
    }

    @Override
    public void clear() {
        this.a.clear();
    }
}

