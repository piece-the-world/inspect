/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.aK;
import com.growingio.a.a.d.gC;
import com.growingio.a.a.d.gK;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.Map;

class gL
implements ListIterator<Map.Entry<K, V>> {
    int a;
    gK<K, V> b;
    gK<K, V> c;
    gK<K, V> d;
    int e;
    final /* synthetic */ gC f;

    gL(gC gC2, int n2) {
        this.f = gC2;
        this.e = gC.a(this.f);
        int n3 = gC2.l_();
        aU.b(n2, n3);
        if (n2 >= n3 / 2) {
            this.d = gC.b(gC2);
            this.a = n3;
            while (n2++ < n3) {
                this.b();
            }
        } else {
            this.b = gC.c(gC2);
            while (n2-- > 0) {
                this.a();
            }
        }
        this.c = null;
    }

    private void c() {
        if (gC.a(this.f) != this.e) {
            throw new ConcurrentModificationException();
        }
    }

    @Override
    public boolean hasNext() {
        this.c();
        return this.b != null;
    }

    public gK<K, V> a() {
        this.c();
        gC.e(this.b);
        this.d = this.c = this.b;
        this.b = this.b.c;
        ++this.a;
        return this.c;
    }

    @Override
    public void remove() {
        this.c();
        aK.a(this.c != null);
        if (this.c != this.b) {
            this.d = this.c.d;
            --this.a;
        } else {
            this.b = this.c.c;
        }
        gC.a(this.f, this.c);
        this.c = null;
        this.e = gC.a(this.f);
    }

    @Override
    public boolean hasPrevious() {
        this.c();
        return this.d != null;
    }

    public gK<K, V> b() {
        this.c();
        gC.e(this.d);
        this.b = this.c = this.d;
        this.d = this.d.d;
        --this.a;
        return this.c;
    }

    @Override
    public int nextIndex() {
        return this.a;
    }

    @Override
    public int previousIndex() {
        return this.a - 1;
    }

    public void a(Map.Entry<K, V> entry) {
        throw new UnsupportedOperationException();
    }

    public void b(Map.Entry<K, V> entry) {
        throw new UnsupportedOperationException();
    }

    void a(V v2) {
        aU.b(this.c != null);
        this.c.b = v2;
    }

    @Override
    public /* synthetic */ void add(Object object) {
        this.b((Map.Entry)object);
    }

    @Override
    public /* synthetic */ void set(Object object) {
        this.a((V)((Map.Entry)object));
    }

    @Override
    public /* synthetic */ Object previous() {
        return this.b();
    }

    @Override
    public /* synthetic */ Object next() {
        return this.a();
    }
}

