/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.aK;
import com.growingio.a.a.d.cc;
import com.growingio.a.a.d.cj;
import com.growingio.a.a.d.jW;
import com.growingio.a.a.d.jr;
import com.growingio.a.a.d.km;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class ci
extends jW<K, V> {
    final /* synthetic */ cc a;

    ci(cc cc2) {
        this.a = cc2;
        super(cc2);
    }

    @Override
    public int b(Object object, int n2) {
        aK.a(n2, "occurrences");
        if (n2 == 0) {
            return this.a(object);
        }
        Collection collection = this.a.a.c().get(object);
        if (collection == null) {
            return 0;
        }
        Object object2 = object;
        int n3 = 0;
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            Object v2 = iterator.next();
            if (!cc.a(this.a, object2, v2) || ++n3 > n2) continue;
            iterator.remove();
        }
        return n3;
    }

    @Override
    public Set<km<K>> a() {
        return new cj(this);
    }
}

