/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.a;
import com.growingio.a.a.d.aK;
import com.growingio.a.a.d.c;
import com.growingio.a.a.d.e;
import java.util.Iterator;
import java.util.Map;

class d
implements Iterator<Map.Entry<K, V>> {
    Map.Entry<K, V> a;
    final /* synthetic */ Iterator b;
    final /* synthetic */ c c;

    d(c c2, Iterator iterator) {
        this.c = c2;
        this.b = iterator;
    }

    @Override
    public boolean hasNext() {
        return this.b.hasNext();
    }

    public Map.Entry<K, V> a() {
        Map.Entry entry = this.a = (Map.Entry)this.b.next();
        return new e(this, entry);
    }

    @Override
    public void remove() {
        aK.a(this.a != null);
        V v2 = this.a.getValue();
        this.b.remove();
        a.b(this.c.b, v2);
    }

    @Override
    public /* synthetic */ Object next() {
        return this.a();
    }
}

