/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.ii;
import com.growingio.a.a.d.jD;
import java.util.Collection;
import java.util.Map;

final class ju
extends jD<Object> {
    final /* synthetic */ int a;

    ju(int n2) {
        this.a = n2;
    }

    @Override
    <K, V> Map<K, Collection<V>> a() {
        return ii.c(this.a);
    }
}

