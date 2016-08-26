/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.hg;
import com.growingio.a.a.d.hq;
import com.growingio.a.a.d.lI;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

class hs<K, V>
extends hq<K, V>
implements Set<Map.Entry<K, V>> {
    hs(Set<Map.Entry<K, V>> set, hg<? super K, ? super V> hg2) {
        super(set, hg2);
    }

    @Override
    public boolean equals(Object object) {
        return lI.a(this, object);
    }

    @Override
    public int hashCode() {
        return lI.b(this);
    }
}

