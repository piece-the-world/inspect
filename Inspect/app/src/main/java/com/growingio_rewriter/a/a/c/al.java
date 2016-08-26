/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.c;

import com.growingio.a.a.b.bD;
import com.growingio.a.a.c.B;
import com.growingio.a.a.c.O;
import com.growingio.a.a.c.aG;
import com.growingio.a.a.c.am;
import com.growingio.a.a.c.as;
import com.growingio.a.a.o.a.bU;
import com.growingio.a.a.o.a.bp;
import com.growingio.a.a.o.a.cZ;
import com.growingio.a.a.o.a.dF;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

class al<K, V>
implements aG<K, V> {
    volatile aG<K, V> a;
    final cZ<V> b = cZ.f();
    final bD c = bD.a();

    public al() {
        this(O.p());
    }

    public al(aG<K, V> aG2) {
        this.a = aG2;
    }

    @Override
    public boolean c() {
        return true;
    }

    @Override
    public boolean d() {
        return this.a.d();
    }

    @Override
    public int a() {
        return this.a.a();
    }

    public boolean b(V v2) {
        return this.b.b(v2);
    }

    public boolean a(Throwable throwable) {
        return this.b.a(throwable);
    }

    private bU<V> b(Throwable throwable) {
        return bp.a(throwable);
    }

    @Override
    public void a(V v2) {
        if (v2 != null) {
            this.b(v2);
        } else {
            this.a = O.p();
        }
    }

    public bU<V> a(K k2, B<? super K, V> b2) {
        try {
            this.c.d();
            V v2 = this.a.get();
            if (v2 == null) {
                V v3 = b2.a(k2);
                return this.b(v3) ? this.b : bp.a(v3);
            }
            bU<V> bU2 = b2.a(k2, v2);
            if (bU2 == null) {
                return bp.a(null);
            }
            return bp.b(bU2, new am(this));
        }
        catch (Throwable var3_4) {
            bU bU3;
            bU bU4 = bU3 = this.a(var3_4) ? this.b : this.b(var3_4);
            if (var3_4 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            return bU3;
        }
    }

    public long f() {
        return this.c.a(TimeUnit.NANOSECONDS);
    }

    @Override
    public V e() throws ExecutionException {
        return dF.a(this.b);
    }

    @Override
    public V get() {
        return this.a.get();
    }

    public aG<K, V> g() {
        return this.a;
    }

    @Override
    public as<K, V> b() {
        return null;
    }

    @Override
    public aG<K, V> a(ReferenceQueue<V> referenceQueue, V v2, as<K, V> as2) {
        return this;
    }
}

