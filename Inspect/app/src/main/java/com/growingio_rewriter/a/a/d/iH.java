/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aV;
import com.growingio.a.a.d.iI;
import com.growingio.a.a.d.iL;
import com.growingio.a.a.d.ij;
import com.growingio.a.a.d.iu;
import com.growingio.a.a.d.lI;
import java.util.Map;
import java.util.Set;

class iH<K, V>
extends iu<K, V> {
    final Set<Map.Entry<K, V>> c;

    iH(Map<K, V> map, aV<? super Map.Entry<K, V>> aV2) {
        super(map, aV2);
        this.c = lI.a(map.entrySet(), this.b);
    }

    @Override
    protected Set<Map.Entry<K, V>> a() {
        return new iI(this, null);
    }

    @Override
    Set<K> h() {
        return new iL(this);
    }
}

