/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aV;
import com.growingio.a.a.b.aW;
import com.growingio.a.a.d.cc;
import com.growingio.a.a.d.cd;
import com.growingio.a.a.d.cl;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.d.jj;
import com.growingio.a.a.d.jr;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class ch
extends jj<K, Collection<V>> {
    final /* synthetic */ cd a;

    ch(cd cd2) {
        this.a = cd2;
        super(cd2);
    }

    @Override
    public boolean remove(Object object) {
        if (object instanceof Collection) {
            Collection collection = (Collection)object;
            Iterator iterator = this.a.a.a.c().entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry entry = iterator.next();
                Object k2 = entry.getKey();
                Collection collection2 = cc.a(entry.getValue(), new cl(this.a.a, k2));
                if (collection2.isEmpty() || !collection.equals(collection2)) continue;
                if (collection2.size() == entry.getValue().size()) {
                    iterator.remove();
                } else {
                    collection2.clear();
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        return this.a.a.a(ii.b(aW.a(collection)));
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        return this.a.a.a(ii.b(aW.a(aW.a(collection))));
    }
}

