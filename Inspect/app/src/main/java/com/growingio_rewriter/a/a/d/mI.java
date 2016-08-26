/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aV;
import com.growingio.a.a.b.aW;
import com.growingio.a.a.d.lU;
import com.growingio.a.a.d.mE;
import com.growingio.a.a.d.mF;
import com.growingio.a.a.d.mH;
import com.growingio.a.a.d.mJ;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

class mI
extends lU<Map.Entry<R, V>> {
    final /* synthetic */ mH a;

    private mI(mH mH2) {
        this.a = mH2;
    }

    @Override
    public Iterator<Map.Entry<R, V>> iterator() {
        return new mJ(this.a, null);
    }

    @Override
    public int size() {
        int n2 = 0;
        for (Map map : this.a.b.a.values()) {
            if (!map.containsKey(this.a.a)) continue;
            ++n2;
        }
        return n2;
    }

    @Override
    public boolean isEmpty() {
        return !this.a.b.b(this.a.a);
    }

    @Override
    public void clear() {
        this.a.a(aW.a());
    }

    @Override
    public boolean contains(Object object) {
        if (object instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry)object;
            return mE.a(this.a.b, entry.getKey(), this.a.a, entry.getValue());
        }
        return false;
    }

    @Override
    public boolean remove(Object object) {
        if (object instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry)object;
            return mE.b(this.a.b, entry.getKey(), this.a.a, entry.getValue());
        }
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        return this.a.a(aW.a(aW.a(collection)));
    }

    /* synthetic */ mI(mH mH2, mF mF2) {
        this(mH2);
    }
}

