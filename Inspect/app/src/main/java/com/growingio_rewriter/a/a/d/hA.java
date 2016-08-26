/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.hg;

class hA<K, V>
implements hg<K, V> {
    final hg<? super V, ? super K> a;

    public hA(hg<? super V, ? super K> hg2) {
        this.a = aU.a(hg2);
    }

    @Override
    public void a(K k2, V v2) {
        this.a.a(v2, k2);
    }
}

