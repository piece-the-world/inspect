/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.I;
import com.growingio.a.a.d.K;
import com.growingio.a.a.d.aK;
import com.growingio.a.a.d.bv;
import com.growingio.a.a.d.km;
import java.util.Iterator;
import java.util.Map;

class J
implements Iterator<km<E>> {
    Map.Entry<E, bv> a;
    final /* synthetic */ Iterator b;
    final /* synthetic */ I c;

    J(I i2, Iterator iterator) {
        this.c = i2;
        this.b = iterator;
    }

    @Override
    public boolean hasNext() {
        return this.b.hasNext();
    }

    public km<E> a() {
        Map.Entry entry;
        this.a = entry = (Map.Entry)this.b.next();
        return new K(this, entry);
    }

    @Override
    public void remove() {
        aK.a(this.a != null);
        I.a(this.c, I.b(this.c) - (long)this.a.getValue().d(0));
        this.b.remove();
        this.a = null;
    }

    @Override
    public /* synthetic */ Object next() {
        return this.a();
    }
}

