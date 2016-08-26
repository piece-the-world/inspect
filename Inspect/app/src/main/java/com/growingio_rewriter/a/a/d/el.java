/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.dQ;
import com.growingio.a.a.d.ei;
import com.growingio.a.a.d.em;
import com.growingio.a.a.d.fg;
import com.growingio.a.a.d.oP;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

abstract class el<K, V>
extends ei<K, V> {
    el() {
    }

    abstract oP<Map.Entry<K, V>> d();

    @Override
    fg<Map.Entry<K, V>> l() {
        return new em(this);
    }

    @Override
    public /* synthetic */ Set entrySet() {
        return super.k();
    }

    @Override
    public /* synthetic */ Collection values() {
        return super.h();
    }

    @Override
    public /* synthetic */ Set keySet() {
        return super.m();
    }
}

