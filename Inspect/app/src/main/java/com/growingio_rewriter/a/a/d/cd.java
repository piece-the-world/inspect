/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.cc;
import com.growingio.a.a.d.ce;
import com.growingio.a.a.d.cg;
import com.growingio.a.a.d.ch;
import com.growingio.a.a.d.cl;
import com.growingio.a.a.d.gO;
import com.growingio.a.a.d.jk;
import com.growingio.a.a.d.jr;
import com.growingio.a.a.d.lH;
import com.growingio.a.a.d.lI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class cd
extends jk<K, Collection<V>> {
    final /* synthetic */ cc a;

    cd(cc cc2) {
        this.a = cc2;
    }

    @Override
    public boolean containsKey(Object object) {
        return this.a(object) != null;
    }

    @Override
    public void clear() {
        this.a.h();
    }

    public Collection<V> a(Object object) {
        Collection collection = this.a.a.c().get(object);
        if (collection == null) {
            return null;
        }
        Object object2 = object;
        return (collection = cc.a(collection, new cl(this.a, object2))).isEmpty() ? null : collection;
    }

    public Collection<V> b(Object object) {
        Collection collection = this.a.a.c().get(object);
        if (collection == null) {
            return null;
        }
        Object object2 = object;
        ArrayList arrayList = gO.a();
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            Object v2 = iterator.next();
            if (!cc.a(this.a, object2, v2)) continue;
            iterator.remove();
            arrayList.add(v2);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        if (this.a.a instanceof lH) {
            return Collections.unmodifiableSet(lI.d(arrayList));
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Override
    Set<K> h() {
        return new cg(this);
    }

    @Override
    Set<Map.Entry<K, Collection<V>>> a() {
        return new ce(this);
    }

    @Override
    Collection<Collection<V>> b() {
        return new ch(this);
    }

    @Override
    public /* synthetic */ Object remove(Object object) {
        return this.b(object);
    }

    @Override
    public /* synthetic */ Object get(Object object) {
        return this.a(object);
    }
}

