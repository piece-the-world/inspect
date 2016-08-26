/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  com.growingio.a.a.d.mE.com.growingio.a.a.d.mZ
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.gb;
import com.growingio.a.a.d.mE;
import com.growingio.a.a.d.mE.com.growingio.a.a.d.mZ;
import com.growingio.a.a.d.mF;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class mO
extends mZ<C> {
    final /* synthetic */ mE a;

    private mO(mE mE2) {
        this.a = mE2;
        super(mE2, null);
    }

    public Iterator<C> iterator() {
        return this.a.m();
    }

    public int size() {
        return gb.b(this.iterator());
    }

    public boolean remove(Object object) {
        if (object == null) {
            return false;
        }
        boolean bl2 = false;
        Iterator iterator = this.a.a.values().iterator();
        while (iterator.hasNext()) {
            Map map = iterator.next();
            if (!map.keySet().remove(object)) continue;
            bl2 = true;
            if (!map.isEmpty()) continue;
            iterator.remove();
        }
        return bl2;
    }

    public boolean removeAll(Collection<?> collection) {
        aU.a(collection);
        boolean bl2 = false;
        Iterator iterator = this.a.a.values().iterator();
        while (iterator.hasNext()) {
            Map map = iterator.next();
            if (!gb.a(map.keySet().iterator(), collection)) continue;
            bl2 = true;
            if (!map.isEmpty()) continue;
            iterator.remove();
        }
        return bl2;
    }

    public boolean retainAll(Collection<?> collection) {
        aU.a(collection);
        boolean bl2 = false;
        Iterator iterator = this.a.a.values().iterator();
        while (iterator.hasNext()) {
            Map map = iterator.next();
            if (!map.keySet().retainAll(collection)) continue;
            bl2 = true;
            if (!map.isEmpty()) continue;
            iterator.remove();
        }
        return bl2;
    }

    public boolean contains(Object object) {
        return this.a.b(object);
    }

    /* synthetic */ mO(mE mE2, mF mF2) {
        this(mE2);
    }
}

