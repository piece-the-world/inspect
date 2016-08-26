/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aq;
import com.growingio.a.a.d.iE;
import com.growingio.a.a.d.ii;
import java.util.Map;

final class il
implements aq<Map.Entry<K, V1>, Map.Entry<K, V2>> {
    final /* synthetic */ iE a;

    il(iE iE2) {
        this.a = iE2;
    }

    public Map.Entry<K, V2> a(Map.Entry<K, V1> entry) {
        return ii.a(this.a, entry);
    }

    @Override
    public /* synthetic */ Object f(Object object) {
        return this.a((Map.Entry)object);
    }
}

