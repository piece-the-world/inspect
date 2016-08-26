/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.S;
import com.growingio.a.a.d.aK;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.d.jX;
import com.growingio.a.a.d.jZ;
import com.growingio.a.a.d.jr;
import com.growingio.a.a.d.km;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class jW<K, V>
extends S<K> {
    final jr<K, V> b;

    jW(jr<K, V> jr2) {
        this.b = jr2;
    }

    @Override
    Iterator<km<K>> b() {
        return new jX(this, this.b.c().entrySet().iterator());
    }

    @Override
    int c() {
        return this.b.c().size();
    }

    @Override
    Set<km<K>> f() {
        return new jZ(this);
    }

    @Override
    public boolean contains(Object object) {
        return this.b.f(object);
    }

    @Override
    public Iterator<K> iterator() {
        return ii.a(this.b.l().iterator());
    }

    @Override
    public int a(Object object) {
        Collection<V> collection = ii.a(this.b.c(), object);
        return collection == null ? 0 : collection.size();
    }

    @Override
    public int b(Object object, int n2) {
        aK.a(n2, "occurrences");
        if (n2 == 0) {
            return this.a(object);
        }
        Collection<V> collection = ii.a(this.b.c(), object);
        if (collection == null) {
            return 0;
        }
        int n3 = collection.size();
        if (n2 >= n3) {
            collection.clear();
        } else {
            Iterator<V> iterator = collection.iterator();
            for (int i2 = 0; i2 < n2; ++i2) {
                iterator.next();
                iterator.remove();
            }
        }
        return n3;
    }

    @Override
    public void clear() {
        this.b.h();
    }

    @Override
    public Set<K> d() {
        return this.b.q();
    }
}

