/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aV;
import com.growingio.a.a.d.iu;
import com.growingio.a.a.d.lI;
import java.util.Map;
import java.util.Set;

class iQ<K, V>
extends iu<K, V> {
    final aV<? super K> c;

    iQ(Map<K, V> map, aV<? super K> aV2, aV<? super Map.Entry<K, V>> aV3) {
        super(map, aV3);
        this.c = aV2;
    }

    @Override
    protected Set<Map.Entry<K, V>> a() {
        return lI.a(this.a.entrySet(), this.b);
    }

    @Override
    Set<K> h() {
        return lI.a(this.a.keySet(), this.c);
    }

    @Override
    public boolean containsKey(Object object) {
        return this.a.containsKey(object) && this.c.a((Object)object);
    }
}

