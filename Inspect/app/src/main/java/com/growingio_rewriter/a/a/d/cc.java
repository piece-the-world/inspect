/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aH;
import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.aV;
import com.growingio.a.a.d.N;
import com.growingio.a.a.d.aL;
import com.growingio.a.a.d.cd;
import com.growingio.a.a.d.ci;
import com.growingio.a.a.d.cl;
import com.growingio.a.a.d.cu;
import com.growingio.a.a.d.cv;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.d.jr;
import com.growingio.a.a.d.kl;
import com.growingio.a.a.d.lH;
import com.growingio.a.a.d.lI;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class cc<K, V>
extends N<K, V>
implements cu<K, V> {
    final jr<K, V> a;
    final aV<? super Map.Entry<K, V>> b;

    cc(jr<K, V> jr2, aV<? super Map.Entry<K, V>> aV2) {
        this.a = aU.a(jr2);
        this.b = aU.a(aV2);
    }

    @Override
    public jr<K, V> a() {
        return this.a;
    }

    @Override
    public aV<? super Map.Entry<K, V>> b() {
        return this.b;
    }

    @Override
    public int l_() {
        return this.l().size();
    }

    private boolean d(K k2, V v2) {
        return this.b.a(ii.a(k2, v2));
    }

    static <E> Collection<E> a(Collection<E> collection, aV<? super E> aV2) {
        if (collection instanceof Set) {
            return lI.a((Set)collection, aV2);
        }
        return aL.a(collection, aV2);
    }

    @Override
    public boolean f(Object object) {
        return this.c().get(object) != null;
    }

    @Override
    public Collection<V> d(Object object) {
        return aH.a(this.c().remove(object), this.d());
    }

    Collection<V> d() {
        return this.a instanceof lH ? Collections.emptySet() : Collections.emptyList();
    }

    @Override
    public void h() {
        this.l().clear();
    }

    @Override
    public Collection<V> c(K k2) {
        return cc.a(this.a.c(k2), new cl(this, k2));
    }

    @Override
    Collection<Map.Entry<K, V>> p() {
        return cc.a(this.a.l(), this.b);
    }

    @Override
    Collection<V> t() {
        return new cv(this);
    }

    @Override
    Iterator<Map.Entry<K, V>> m() {
        throw new AssertionError((Object)"should never be called");
    }

    @Override
    Map<K, Collection<V>> n() {
        return new cd(this);
    }

    @Override
    public Set<K> q() {
        return this.c().keySet();
    }

    boolean a(aV<? super Map.Entry<K, Collection<V>>> aV2) {
        Iterator<Map.Entry<K, Collection<V>>> iterator = this.a.c().entrySet().iterator();
        boolean bl2 = false;
        while (iterator.hasNext()) {
            Map.Entry<K, Collection<V>> entry = iterator.next();
            K k2 = entry.getKey();
            Collection<V> collection = cc.a(entry.getValue(), new cl(this, k2));
            if (collection.isEmpty() || !aV2.a(ii.a(k2, collection))) continue;
            if (collection.size() == entry.getValue().size()) {
                iterator.remove();
            } else {
                collection.clear();
            }
            bl2 = true;
        }
        return bl2;
    }

    @Override
    kl<K> s() {
        return new ci(this);
    }

    static /* synthetic */ boolean a(cc cc2, Object object, Object object2) {
        return cc2.d(object, object2);
    }
}

