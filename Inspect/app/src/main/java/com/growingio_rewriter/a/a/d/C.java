/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.B;
import com.growingio.a.a.d.n;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

class C
implements Iterator<V> {
    final Iterator<V> a;
    final Collection<V> b;
    final /* synthetic */ B c;

    C(B b2) {
        this.c = b2;
        this.b = this.c.c;
        this.a = n.a(b2.f, b2.c);
    }

    C(Iterator<V> var1_1) {
        this.c = var1_1;
        this.b = this.c.c;
        this.a = iterator;
    }

    void a() {
        this.c.a();
        if (this.c.c != this.b) {
            throw new ConcurrentModificationException();
        }
    }

    @Override
    public boolean hasNext() {
        this.a();
        return this.a.hasNext();
    }

    @Override
    public V next() {
        this.a();
        return this.a.next();
    }

    @Override
    public void remove() {
        this.a.remove();
        n.b(this.c.f);
        this.c.b();
    }

    Iterator<V> b() {
        this.a();
        return this.a;
    }
}

