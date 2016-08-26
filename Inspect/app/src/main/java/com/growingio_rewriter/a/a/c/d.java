/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.c;

import com.growingio.a.a.c.N;
import com.growingio.a.a.c.a;
import com.growingio.a.a.d.ei;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.o.a.dD;
import java.util.LinkedHashMap;
import java.util.concurrent.ExecutionException;

public abstract class d<K, V>
extends a<K, V>
implements N<K, V> {
    protected d() {
    }

    @Override
    public V b(K k2) {
        try {
            return this.e(k2);
        }
        catch (ExecutionException var2_2) {
            throw new dD(var2_2.getCause());
        }
    }

    @Override
    public ei<K, V> c(Iterable<? extends K> iterable) throws ExecutionException {
        LinkedHashMap linkedHashMap = ii.d();
        for (K k2 : iterable) {
            if (linkedHashMap.containsKey(k2)) continue;
            linkedHashMap.put(k2, this.e(k2));
        }
        return ei.b(linkedHashMap);
    }

    @Override
    public final V f(K k2) {
        return this.b(k2);
    }

    @Override
    public void c(K k2) {
        throw new UnsupportedOperationException();
    }
}

