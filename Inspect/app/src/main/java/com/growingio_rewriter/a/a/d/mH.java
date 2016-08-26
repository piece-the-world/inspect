/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.aV;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.d.jk;
import com.growingio.a.a.d.mE;
import com.growingio.a.a.d.mF;
import com.growingio.a.a.d.mI;
import com.growingio.a.a.d.mL;
import com.growingio.a.a.d.mM;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class mH
extends jk<R, V> {
    final C a;
    final /* synthetic */ mE b;

    mH(C var1_1) {
        this.b = var1_1;
        this.a = aU.a(c2);
    }

    @Override
    public V put(R r2, V v2) {
        return this.b.a(r2, this.a, v2);
    }

    @Override
    public V get(Object object) {
        return this.b.b(object, this.a);
    }

    @Override
    public boolean containsKey(Object object) {
        return this.b.a(object, this.a);
    }

    @Override
    public V remove(Object object) {
        return this.b.c(object, this.a);
    }

    boolean a(aV<? super Map.Entry<R, V>> aV2) {
        boolean bl2 = false;
        Iterator iterator = this.b.a.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = iterator.next();
            Map map = entry.getValue();
            Object v2 = map.get(this.a);
            if (v2 == null || !aV2.a(ii.a(entry.getKey(), v2))) continue;
            map.remove(this.a);
            bl2 = true;
            if (!map.isEmpty()) continue;
            iterator.remove();
        }
        return bl2;
    }

    @Override
    Set<Map.Entry<R, V>> a() {
        return new mI(this, null);
    }

    @Override
    Set<R> h() {
        return new mL(this);
    }

    @Override
    Collection<V> b() {
        return new mM(this);
    }
}

