/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.g;

import com.growingio.a.a.d.gb;
import com.growingio.a.a.g.k;
import com.growingio.a.a.g.m;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Set;

class l
extends AbstractSet<N> {
    final /* synthetic */ k a;

    l(k k2) {
        this.a = k2;
    }

    @Override
    public Iterator<N> iterator() {
        return gb.b(this.a.b().iterator(), new m(this));
    }

    @Override
    public int size() {
        return k.a(this.a);
    }

    @Override
    public boolean contains(Object object) {
        return k.a(this.a, object);
    }
}

