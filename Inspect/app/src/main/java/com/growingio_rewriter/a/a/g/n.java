/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.g;

import com.growingio.a.a.d.gb;
import com.growingio.a.a.g.k;
import com.growingio.a.a.g.o;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Set;

class n
extends AbstractSet<N> {
    final /* synthetic */ k a;

    n(k k2) {
        this.a = k2;
    }

    @Override
    public Iterator<N> iterator() {
        return gb.b(this.a.b().iterator(), new o(this));
    }

    @Override
    public int size() {
        return k.b(this.a);
    }

    @Override
    public boolean contains(Object object) {
        return k.b(this.a, object);
    }
}

