/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aq;
import com.growingio.a.a.d.ba;
import com.growingio.a.a.d.bb;
import com.growingio.a.a.d.hG;
import com.growingio.a.a.d.hT;
import com.growingio.a.a.d.id;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.ExecutionException;

final class be<K, V>
implements id<K, V> {
    final aq<? super K, ? extends V> a;
    volatile id<K, V> b = hG.d();

    public be(aq<? super K, ? extends V> aq2) {
        this.a = aq2;
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
        return true;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public V c() throws ExecutionException {
        if (this.b == hG.q) {
            boolean bl2 = false;
            try {
                be be2 = this;
                synchronized (be2) {
                    while (this.b == hG.q) {
                        try {
                            this.wait();
                        }
                        catch (InterruptedException var3_3) {
                            bl2 = true;
                        }
                    }
                }
            }
            finally {
                if (bl2) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        return this.b.c();
    }

    @Override
    public void a(id<K, V> id2) {
        this.b(id2);
    }

    V a(K k2, int n2) throws ExecutionException {
        V v2;
        try {
            v2 = this.a.f(k2);
        }
        catch (Throwable var4_4) {
            this.b(new ba(var4_4));
            throw new ExecutionException(var4_4);
        }
        this.b(new bb(v2));
        return v2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void b(id<K, V> id2) {
        be be2 = this;
        synchronized (be2) {
            if (this.b == hG.q) {
                this.b = id2;
                this.notifyAll();
            }
        }
    }
}

