/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.aK;
import com.growingio.a.a.d.gC;
import com.growingio.a.a.d.gJ;
import com.growingio.a.a.d.gK;
import java.util.ListIterator;

class gM
implements ListIterator<V> {
    final Object a;
    int b;
    gK<K, V> c;
    gK<K, V> d;
    gK<K, V> e;
    final /* synthetic */ gC f;

    gM(gC gC2, Object object) {
        this.f = gC2;
        this.a = object;
        gJ gJ2 = (gJ)gC.d(gC2).get(object);
        this.c = gJ2 == null ? null : gJ2.a;
    }

    public gM(gC gC2, Object object, int n2) {
        this.f = gC2;
        gJ gJ2 = (gJ)gC.d(gC2).get(object);
        int n3 = gJ2 == null ? 0 : gJ2.c;
        aU.b(n2, n3);
        if (n2 >= n3 / 2) {
            this.e = gJ2 == null ? null : gJ2.b;
            this.b = n3;
            while (n2++ < n3) {
                this.previous();
            }
        } else {
            gK gK2 = this.c = gJ2 == null ? null : gJ2.a;
            while (n2-- > 0) {
                this.next();
            }
        }
        this.a = object;
        this.d = null;
    }

    @Override
    public boolean hasNext() {
        return this.c != null;
    }

    @Override
    public V next() {
        gC.e(this.c);
        this.e = this.d = this.c;
        this.c = this.c.e;
        ++this.b;
        return this.d.b;
    }

    @Override
    public boolean hasPrevious() {
        return this.e != null;
    }

    @Override
    public V previous() {
        gC.e(this.e);
        this.c = this.d = this.e;
        this.e = this.e.f;
        --this.b;
        return this.d.b;
    }

    @Override
    public int nextIndex() {
        return this.b;
    }

    @Override
    public int previousIndex() {
        return this.b - 1;
    }

    @Override
    public void remove() {
        aK.a(this.d != null);
        if (this.d != this.c) {
            this.e = this.d.f;
            --this.b;
        } else {
            this.c = this.d.e;
        }
        gC.a(this.f, this.d);
        this.d = null;
    }

    @Override
    public void set(V v2) {
        aU.b(this.d != null);
        this.d.b = v2;
    }

    @Override
    public void add(V v2) {
        this.e = gC.a(this.f, this.a, v2, this.c);
        ++this.b;
        this.d = null;
    }
}

