/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.jW;
import com.growingio.a.a.d.jr;
import com.growingio.a.a.d.kA;
import com.growingio.a.a.d.kl;
import com.growingio.a.a.d.km;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

class jZ
extends kA<K> {
    final /* synthetic */ jW a;

    jZ(jW jW2) {
        this.a = jW2;
    }

    @Override
    kl<K> a() {
        return this.a;
    }

    @Override
    public Iterator<km<K>> iterator() {
        return this.a.b();
    }

    @Override
    public int size() {
        return this.a.c();
    }

    @Override
    public boolean isEmpty() {
        return this.a.b.o();
    }

    @Override
    public boolean contains(Object object) {
        if (object instanceof km) {
            km km2 = (km)object;
            Collection collection = this.a.b.c().get(km2.a());
            return collection != null && collection.size() == km2.b();
        }
        return false;
    }

    @Override
    public boolean remove(Object object) {
        if (object instanceof km) {
            km km2 = (km)object;
            Collection collection = this.a.b.c().get(km2.a());
            if (collection != null && collection.size() == km2.b()) {
                collection.clear();
                return true;
            }
        }
        return false;
    }
}

