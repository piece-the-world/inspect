/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.aK;
import com.growingio.a.a.d.hG;
import com.growingio.a.a.d.hT;
import com.growingio.a.a.d.hV;
import com.growingio.a.a.d.ih;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReferenceArray;

abstract class hQ<E>
implements Iterator<E> {
    int b;
    int c;
    hV<K, V> d;
    AtomicReferenceArray<hT<K, V>> e;
    hT<K, V> f;
    hG<K, V> g;
    hG<K, V> h;
    final /* synthetic */ hG i;

    hQ(hG hG2) {
        this.i = hG2;
        this.b = hG2.j.length - 1;
        this.c = -1;
        this.b();
    }

    @Override
    public abstract E next();

    final void b() {
        this.g = null;
        if (this.c()) {
            return;
        }
        if (this.d()) {
            return;
        }
        while (this.b >= 0) {
            this.d = this.i.j[this.b--];
            if (this.d.b == 0) continue;
            this.e = this.d.e;
            this.c = this.e.length() - 1;
            if (!this.d()) continue;
            return;
        }
    }

    boolean c() {
        if (this.f != null) {
            this.f = this.f.b();
            while (this.f != null) {
                if (this.a(this.f)) {
                    return true;
                }
                this.f = this.f.b();
            }
        }
        return false;
    }

    boolean d() {
        while (this.c >= 0) {
            if ((this.f = this.e.get(this.c--)) == null || !this.a(this.f) && !this.c()) continue;
            return true;
        }
        return false;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    boolean a(hT<K, V> hT2) {
        try {
            K k2 = hT2.d();
            V v2 = this.i.c(hT2);
            if (v2 != null) {
                this.g = new ih(this.i, k2, v2);
                boolean bl2 = true;
                return bl2;
            }
            boolean bl3 = false;
            return bl3;
        }
        finally {
            this.d.j();
        }
    }

    @Override
    public boolean hasNext() {
        return this.g != null;
    }

    hG<K, V> e() {
        if (this.g == null) {
            throw new NoSuchElementException();
        }
        this.h = this.g;
        this.b();
        return this.h;
    }

    @Override
    public void remove() {
        aK.a(this.h != null);
        this.i.remove(this.h.getKey());
        this.h = null;
    }
}

