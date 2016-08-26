/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.gb;
import com.growingio.a.a.d.iT;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

abstract class iS<K, V>
extends AbstractMap<K, V> {
    iS() {
    }

    @Override
    public abstract int size();

    abstract Iterator<Map.Entry<K, V>> b();

    @Override
    public Set<Map.Entry<K, V>> entrySet() {
        return new iT(this);
    }

    @Override
    public void clear() {
        gb.i(this.b());
    }
}

