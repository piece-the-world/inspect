/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.mT;
import com.growingio.a.a.d.mV;
import java.util.Iterator;
import java.util.Map;

class mU
implements Iterator<Map.Entry<C, V>> {
    final /* synthetic */ Iterator a;
    final /* synthetic */ mT b;

    mU(mT mT2, Iterator iterator) {
        this.b = mT2;
        this.a = iterator;
    }

    @Override
    public boolean hasNext() {
        return this.a.hasNext();
    }

    public Map.Entry<C, V> a() {
        Map.Entry entry = (Map.Entry)this.a.next();
        return new mV(this, entry);
    }

    @Override
    public void remove() {
        this.a.remove();
        this.b.d();
    }

    @Override
    public /* synthetic */ Object next() {
        return this.a();
    }
}

