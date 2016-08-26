/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aq;
import com.growingio.a.a.d.iE;
import java.util.Map;

final class it
implements aq<Map.Entry<K, V1>, V2> {
    final /* synthetic */ iE a;

    it(iE iE2) {
        this.a = iE2;
    }

    public V2 a(Map.Entry<K, V1> entry) {
        return this.a.a(entry.getKey(), entry.getValue());
    }

    @Override
    public /* synthetic */ Object f(Object object) {
        return this.a((Map.Entry)object);
    }
}

