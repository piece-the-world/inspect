/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.eD;
import com.growingio.a.a.d.eE;
import com.growingio.a.a.d.ei;
import com.growingio.a.a.d.fg;
import com.growingio.a.a.d.gb;
import com.growingio.a.a.d.oP;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

abstract class eJ<T>
extends oP<T> {
    final Iterator<Map.Entry<K, Collection<V>>> b;
    K c;
    Iterator<V> d;
    final /* synthetic */ eD e;

    private eJ(eD eD2) {
        this.e = eD2;
        this.b = this.e.y().k().k_();
        this.c = null;
        this.d = gb.a();
    }

    abstract T b(K var1, V var2);

    @Override
    public boolean hasNext() {
        return this.b.hasNext() || this.d.hasNext();
    }

    @Override
    public T next() {
        if (!this.d.hasNext()) {
            Map.Entry<K, Collection<V>> entry = this.b.next();
            this.c = entry.getKey();
            this.d = entry.getValue().iterator();
        }
        return this.b(this.c, this.d.next());
    }

    /* synthetic */ eJ(eD eD2, eE eE2) {
        this(eD2);
    }
}

