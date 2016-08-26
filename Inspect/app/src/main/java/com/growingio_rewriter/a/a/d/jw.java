/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.jD;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Map;

final class jw
extends jD<K0> {
    final /* synthetic */ Class a;

    jw(Class class_) {
        this.a = class_;
    }

    @Override
    <K extends K0, V> Map<K, Collection<V>> a() {
        return new EnumMap(this.a);
    }
}

