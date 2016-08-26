/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.gO;
import com.growingio.a.a.d.jj;
import com.growingio.a.a.d.mE;
import com.growingio.a.a.d.mP;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class mS
extends jj<C, Map<R, V>> {
    final /* synthetic */ mP a;

    mS(mP mP2) {
        this.a = mP2;
        super(mP2);
    }

    @Override
    public boolean remove(Object object) {
        for (Map.Entry entry : this.a.entrySet()) {
            if (!((Map)entry.getValue()).equals(object)) continue;
            mE.a(this.a.a, entry.getKey());
            return true;
        }
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        aU.a(collection);
        boolean bl2 = false;
        for (Object c2 : gO.a(this.a.a.b().iterator())) {
            if (!collection.contains(this.a.a.d(c2))) continue;
            mE.a(this.a.a, c2);
            bl2 = true;
        }
        return bl2;
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        aU.a(collection);
        boolean bl2 = false;
        for (Object c2 : gO.a(this.a.a.b().iterator())) {
            if (collection.contains(this.a.a.d(c2))) continue;
            mE.a(this.a.a, c2);
            bl2 = true;
        }
        return bl2;
    }
}

