/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.gC;
import com.growingio.a.a.d.gD;
import com.growingio.a.a.d.gI;
import com.growingio.a.a.d.lU;
import java.util.Iterator;
import java.util.List;

class gF
extends lU<K> {
    final /* synthetic */ gC a;

    gF(gC gC2) {
        this.a = gC2;
    }

    @Override
    public int size() {
        return gC.d(this.a).size();
    }

    @Override
    public Iterator<K> iterator() {
        return new gI(this.a, null);
    }

    @Override
    public boolean contains(Object object) {
        return this.a.f(object);
    }

    @Override
    public boolean remove(Object object) {
        return !this.a.b(object).isEmpty();
    }
}

