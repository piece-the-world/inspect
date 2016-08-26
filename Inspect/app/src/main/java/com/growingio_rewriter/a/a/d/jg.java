/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.jf;
import com.growingio.a.a.d.lI;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

class jg<K, V>
extends jf<K, V>
implements Set<Map.Entry<K, V>> {
    jg(Set<Map.Entry<K, V>> set) {
        super(set);
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

