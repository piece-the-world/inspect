/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.c;

import com.growingio.a.a.c.I;
import com.growingio.a.a.c.e;
import com.growingio.a.a.d.ei;
import com.growingio.a.a.d.ii;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;

public abstract class a<K, V>
implements e<K, V> {
    protected a() {
    }

    @Override
    public V a(K k2, Callable<? extends V> callable) throws ExecutionException {
        throw new UnsupportedOperationException();
    }

    @Override
    public ei<K, V> a(Iterable<?> iterable) {
        LinkedHashMap linkedHashMap = ii.d();
        for (Object obj : iterable) {
            if (linkedHashMap.containsKey(obj)) continue;
            Object obj2 = obj;
            Object v2 = this.d(obj);
            if (v2 == null) continue;
            linkedHashMap.put(obj2, v2);
        }
        return ei.b(linkedHashMap);
    }

    @Override
    public void a(K k2, V v2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void a(Map<? extends K, ? extends V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.a(entry.getKey(), entry.getValue());
        }
    }

    @Override
    public void a() {
    }

    @Override
    public long b() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void a(Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void b(Iterable<?> iterable) {
        for (Object obj : iterable) {
            this.a(obj);
        }
    }

    @Override
    public void c() {
        throw new UnsupportedOperationException();
    }

    @Override
    public I d() {
        throw new UnsupportedOperationException();
    }

    @Override
    public ConcurrentMap<K, V> e() {
        throw new UnsupportedOperationException();
    }
}

