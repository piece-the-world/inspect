/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aV;
import com.growingio.a.a.b.aW;
import com.growingio.a.a.d.fL;
import com.growingio.a.a.d.gO;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.d.jj;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class iR<K, V>
extends jj<K, V> {
    final Map<K, V> a;
    final aV<? super Map.Entry<K, V>> b;

    iR(Map<K, V> map, Map<K, V> map2, aV<? super Map.Entry<K, V>> aV2) {
        super(map);
        this.a = map2;
        this.b = aV2;
    }

    @Override
    public boolean remove(Object object) {
        return fL.b(this.a.entrySet(), aW.a(this.b, ii.b(aW.a(object)))) != null;
    }

    private boolean a(aV<? super V> aV2) {
        return fL.a(this.a.entrySet(), aW.a(this.b, ii.b(aV2)));
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

