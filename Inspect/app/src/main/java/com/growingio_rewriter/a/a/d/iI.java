/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.dd;
import com.growingio.a.a.d.iH;
import com.growingio.a.a.d.iJ;
import com.growingio.a.a.d.ij;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class iI
extends dd<Map.Entry<K, V>> {
    final /* synthetic */ iH a;

    private iI(iH iH2) {
        this.a = iH2;
    }

    @Override
    protected Set<Map.Entry<K, V>> a() {
        return this.a.c;
    }

    @Override
    public Iterator<Map.Entry<K, V>> iterator() {
        return new iJ(this, this.a.c.iterator());
    }

    @Override
    protected /* synthetic */ Collection b() {
        return this.a();
    }

    @Override
    protected /* synthetic */ Object g() {
        return this.a();
    }

    /* synthetic */ iI(iH iH2, ij ij2) {
        this(iH2);
    }
}

