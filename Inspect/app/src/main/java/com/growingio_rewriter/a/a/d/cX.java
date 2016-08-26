/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.aK;
import com.growingio.a.a.d.cW;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NoSuchElementException;

class cX
implements Iterator<Map.Entry<K, V>> {
    private Map.Entry<K, V> b;
    private Map.Entry<K, V> c;
    final /* synthetic */ cW a;

    cX(cW cW2) {
        this.a = cW2;
        this.b = null;
        this.c = this.a.b().lastEntry();
    }

    @Override
    public boolean hasNext() {
        return this.c != null;
    }

    public Map.Entry<K, V> a() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        try {
            Map.Entry<K, V> entry = this.c;
            return entry;
        }
        finally {
            this.b = this.c;
            this.c = this.a.b().lowerEntry(this.c.getKey());
        }
    }

    @Override
    public void remove() {
        aK.a(this.b != null);
        this.a.b().remove(this.b.getKey());
        this.b = null;
    }

    @Override
    public /* synthetic */ Object next() {
        return this.a();
    }
}

