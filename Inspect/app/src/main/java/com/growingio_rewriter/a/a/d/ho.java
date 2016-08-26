/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.hn;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

class ho
implements Iterator<Collection<V>> {
    final /* synthetic */ Iterator a;
    final /* synthetic */ hn b;

    ho(hn hn2, Iterator iterator) {
        this.b = hn2;
        this.a = iterator;
    }

    @Override
    public boolean hasNext() {
        return this.a.hasNext();
    }

    public Collection<V> a() {
        return (Collection)((Map.Entry)this.a.next()).getValue();
    }

    @Override
    public void remove() {
        this.a.remove();
    }

    @Override
    public /* synthetic */ Object next() {
        return this.a();
    }
}

