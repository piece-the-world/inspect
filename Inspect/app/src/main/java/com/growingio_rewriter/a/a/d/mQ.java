/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  com.growingio.a.a.d.mE.com.growingio.a.a.d.mZ
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.gO;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.d.lI;
import com.growingio.a.a.d.mE;
import com.growingio.a.a.d.mE.com.growingio.a.a.d.mZ;
import com.growingio.a.a.d.mF;
import com.growingio.a.a.d.mP;
import com.growingio.a.a.d.mR;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class mQ
extends mZ<Map.Entry<C, Map<R, V>>> {
    final /* synthetic */ mP a;

    mQ(mP mP2) {
        this.a = mP2;
        super(mP2.a, null);
    }

    public Iterator<Map.Entry<C, Map<R, V>>> iterator() {
        return ii.b(this.a.a.b(), new mR(this));
    }

    public int size() {
        return this.a.a.b().size();
    }

    public boolean contains(Object object) {
        Map.Entry entry;
        if (object instanceof Map.Entry && this.a.a.b((entry = (Map.Entry)object).getKey())) {
            Object k2 = entry.getKey();
            return this.a.a(k2).equals(entry.getValue());
        }
        return false;
    }

    public boolean remove(Object object) {
        if (this.contains(object)) {
            Map.Entry entry = (Map.Entry)object;
            mE.a(this.a.a, entry.getKey());
            return true;
        }
        return false;
    }

    public boolean removeAll(Collection<?> collection) {
        aU.a(collection);
        return lI.a(this, collection.iterator());
    }

    public boolean retainAll(Collection<?> collection) {
        aU.a(collection);
        boolean bl2 = false;
        for (Object c2 : gO.a(this.a.a.b().iterator())) {
            if (collection.contains(ii.a(c2, this.a.a.d(c2)))) continue;
            mE.a(this.a.a, c2);
            bl2 = true;
        }
        return bl2;
    }
}

