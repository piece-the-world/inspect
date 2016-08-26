/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aq;
import com.growingio.a.a.d.jO;
import com.growingio.a.a.d.jP;
import java.util.Collection;

class jQ
implements aq<K, Collection<V>> {
    final /* synthetic */ jP a;

    jQ(jP jP2) {
        this.a = jP2;
    }

    public Collection<V> a(K k2) {
        return jO.a(this.a.a).c(k2);
    }

    @Override
    public /* synthetic */ Object f(Object object) {
        return this.a(object);
    }
}

