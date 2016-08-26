/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.n;

import com.growingio.a.a.b.aq;
import com.growingio.a.a.n.p;
import com.growingio.a.a.n.q;
import java.util.Map;

final class s
implements aq<Map.Entry<K, V>, Map.Entry<K, V>> {
    s() {
    }

    public Map.Entry<K, V> a(Map.Entry<K, V> entry) {
        return new q(entry, null);
    }

    @Override
    public /* synthetic */ Object f(Object object) {
        return this.a((Map.Entry)object);
    }
}

