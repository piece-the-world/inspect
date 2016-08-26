/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.aK;
import com.growingio.a.a.d.gv;
import com.growingio.a.a.d.gx;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

class gw
implements Iterator<Map.Entry<K, V>> {
    gx<K, V> a;
    gx<K, V> b;
    final /* synthetic */ gv c;

    gw(gv gv2) {
        this.c = gv2;
        this.a = gv.a((gv)this.c).f;
    }

    @Override
    public boolean hasNext() {
        return this.a != gv.a(this.c);
    }

    public Map.Entry<K, V> a() {
        gx<K, V> gx2;
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        this.b = gx2 = this.a;
        this.a = this.a.f;
        return gx2;
    }

    @Override
    public void remove() {
        aK.a(this.b != null);
        this.c.c(this.b.getKey(), this.b.getValue());
        this.b = null;
    }

    @Override
    public /* synthetic */ Object next() {
        return this.a();
    }
}

