/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.N;
import com.growingio.a.a.d.O;
import com.growingio.a.a.d.P;
import com.growingio.a.a.d.lI;
import java.util.Map;
import java.util.Set;

class Q
extends N<K, V>
implements Set<Map.Entry<K, V>> {
    final /* synthetic */ N b;

    private Q(N n2) {
        this.b = n2;
        super(n2, null);
    }

    @Override
    public int hashCode() {
        return lI.b(this);
    }

    @Override
    public boolean equals(Object object) {
        return lI.a(this, object);
    }

    /* synthetic */ Q(N n2, O o2) {
        this(n2);
    }
}

