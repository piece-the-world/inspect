/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.aK;
import com.growingio.a.a.d.ka;
import com.growingio.a.a.d.kb;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

class kc
implements Iterator<V> {
    int a;
    final /* synthetic */ kb b;

    kc(kb kb2) {
        this.b = kb2;
    }

    @Override
    public boolean hasNext() {
        return this.a == 0 && this.b.b.a.containsKey(this.b.a);
    }

    @Override
    public V next() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        ++this.a;
        return this.b.b.a.get(this.b.a);
    }

    @Override
    public void remove() {
        aK.a(this.a == 1);
        this.a = -1;
        this.b.b.a.remove(this.b.a);
    }
}

