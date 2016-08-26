/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.cc;
import com.growingio.a.a.d.cd;
import com.growingio.a.a.d.ce;
import com.growingio.a.a.d.cl;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.d.j;
import com.growingio.a.a.d.jr;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class cf
extends j<Map.Entry<K, Collection<V>>> {
    final Iterator<Map.Entry<K, Collection<V>>> a;
    final /* synthetic */ ce b;

    cf(ce ce2) {
        this.b = ce2;
        this.a = this.b.a.a.a.c().entrySet().iterator();
    }

    protected Map.Entry<K, Collection<V>> d() {
        while (this.a.hasNext()) {
            Map.Entry<K, Collection<V>> entry = this.a.next();
            K k2 = entry.getKey();
            Collection<V> collection = cc.a(entry.getValue(), new cl(this.b.a.a, k2));
            if (collection.isEmpty()) continue;
            return ii.a(k2, collection);
        }
        return (Map.Entry)this.b();
    }

    @Override
    protected /* synthetic */ Object a() {
        return this.d();
    }
}

