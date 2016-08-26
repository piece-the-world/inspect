/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  com.growingio.a.a.c.O.com.growingio.a.a.c.aT
 */
package com.growingio.a.a.c;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.bR;
import com.growingio.a.a.c.O;
import com.growingio.a.a.c.aT;
import com.growingio.a.a.c.as;
import com.growingio.a.a.c.at;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReferenceArray;

abstract class ah<T>
implements Iterator<T> {
    int b;
    int c;
    at<K, V> d;
    AtomicReferenceArray<as<K, V>> e;
    as<K, V> f;
    com.growingio.a.a.c.O.com.growingio.a.a.c.aT g;
    com.growingio.a.a.c.O.com.growingio.a.a.c.aT h;
    final /* synthetic */ O i;

    ah(O o2) {
        this.i = o2;
        this.b = o2.i.length - 1;
        this.c = -1;
        this.b();
    }

    @Override
    public abstract T next();

    final void b() {
        this.g = null;
        if (this.c()) {
            return;
        }
        if (this.d()) {
            return;
        }
        while (this.b >= 0) {
            this.d = this.i.i[this.b--];
            if (this.d.b == 0) continue;
            this.e = this.d.f;
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
    boolean a(as<K, V> as2) {
        try {
            long l2 = this.i.v.a();
            K k2 = as2.d();
            V v2 = this.i.b(as2, l2);
            if (v2 != null) {
                this.g = new aT(this.i, k2, v2);
                boolean bl2 = true;
                return bl2;
            }
            boolean bl3 = false;
            return bl3;
        }
        finally {
            this.d.l();
        }
    }

    @Override
    public boolean hasNext() {
        return this.g != null;
    }

    com.growingio.a.a.c.O.com.growingio.a.a.c.aT e() {
        if (this.g == null) {
            throw new NoSuchElementException();
        }
        this.h = this.g;
        this.b();
        return this.h;
    }

    @Override
    public void remove() {
        aU.b(this.h != null);
        this.i.remove(this.h.getKey());
        this.h = null;
    }
}

