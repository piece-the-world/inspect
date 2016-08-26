/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.aK;
import com.growingio.a.a.d.gA;
import com.growingio.a.a.d.gx;
import com.growingio.a.a.d.gy;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

class gz
implements Iterator<V> {
    gA<K, V> a;
    gx<K, V> b;
    int c;
    final /* synthetic */ gy d;

    gz(gy gy2) {
        this.d = gy2;
        this.a = gy.a(this.d);
        this.c = gy.b(this.d);
    }

    private void a() {
        if (gy.b(this.d) != this.c) {
            throw new ConcurrentModificationException();
        }
    }

    @Override
    public boolean hasNext() {
        this.a();
        return this.a != this.d;
    }

    @Override
    public V next() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        gx gx2 = (gx)this.a;
        Object v2 = gx2.getValue();
        this.b = gx2;
        this.a = gx2.b();
        return v2;
    }

    @Override
    public void remove() {
        this.a();
        aK.a(this.b != null);
        this.d.remove(this.b.getValue());
        this.c = gy.b(this.d);
        this.b = null;
    }
}

