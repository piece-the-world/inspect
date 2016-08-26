/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aV;
import com.growingio.a.a.b.aW;
import com.growingio.a.a.d.fL;
import com.growingio.a.a.d.gO;
import com.growingio.a.a.d.iH;
import com.growingio.a.a.d.iU;
import com.growingio.a.a.d.ii;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class iL
extends iU<K, V> {
    final /* synthetic */ iH a;

    iL(iH iH2) {
        this.a = iH2;
        super(iH2);
    }

    @Override
    public boolean remove(Object object) {
        if (this.a.containsKey(object)) {
            this.a.a.remove(object);
            return true;
        }
        return false;
    }

    private boolean a(aV<? super K> aV2) {
        return fL.a(this.a.a.entrySet(), aW.a(this.a.b, ii.a(aV2)));
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        return this.a(aW.a(collection));
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        return this.a(aW.a(aW.a(collection)));
    }

    @Override
    public Object[] toArray() {
        return gO.a(this.iterator()).toArray();
    }

    @Override
    public <T> T[] toArray(T[] arrT) {
        return gO.a(this.iterator()).toArray(arrT);
    }
}

