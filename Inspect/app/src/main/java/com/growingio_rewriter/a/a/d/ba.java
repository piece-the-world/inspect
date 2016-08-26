/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.hT;
import com.growingio.a.a.d.id;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.ExecutionException;

final class ba<K, V>
implements id<K, V> {
    final Throwable a;

    ba(Throwable throwable) {
        this.a = throwable;
    }

    @Override
    public V get() {
        return null;
    }

    @Override
    public hT<K, V> a() {
        return null;
    }

    @Override
    public id<K, V> a(ReferenceQueue<V> referenceQueue, V v2, hT<K, V> hT2) {
        return this;
    }

    @Override
    public boolean b() {
        return false;
    }

    @Override
    public V c() throws ExecutionException {
        throw new ExecutionException(this.a);
    }

    @Override
    public void a(id<K, V> id2) {
    }
}

