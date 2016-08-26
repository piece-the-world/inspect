/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.aL;
import com.growingio.a.a.d.af;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.d.nC;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class ah
extends AbstractSet<nC<R, C, V>> {
    final /* synthetic */ af a;

    ah(af af2) {
        this.a = af2;
    }

    @Override
    public boolean contains(Object object) {
        if (object instanceof nC) {
            nC nC2 = (nC)object;
            Map map = ii.a(this.a.r(), nC2.a());
            return map != null && aL.a(map.entrySet(), ii.a(nC2.b(), nC2.c()));
        }
        return false;
    }

    @Override
    public boolean remove(Object object) {
        if (object instanceof nC) {
            nC nC2 = (nC)object;
            Map map = ii.a(this.a.r(), nC2.a());
            return map != null && aL.b(map.entrySet(), ii.a(nC2.b(), nC2.c()));
        }
        return false;
    }

    @Override
    public void clear() {
        this.a.d();
    }

    @Override
    public Iterator<nC<R, C, V>> iterator() {
        return this.a.g();
    }

    @Override
    public int size() {
        return this.a.n();
    }
}

