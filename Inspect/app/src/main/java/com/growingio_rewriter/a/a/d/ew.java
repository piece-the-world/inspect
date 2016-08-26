/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.dQ;
import com.growingio.a.a.d.ea;
import com.growingio.a.a.d.ei;
import com.growingio.a.a.d.eu;
import com.growingio.a.a.d.lh;
import com.growingio.a.a.d.oP;
import java.util.Iterator;
import java.util.Map;

final class ew<K, V>
extends eu<K, V> {
    private final transient ei<K, V> a;
    private final transient Map.Entry<K, V>[] c;

    ew(ei<K, V> ei2, Map.Entry<K, V>[] arrentry) {
        this.a = ei2;
        this.c = arrentry;
    }

    @Override
    ei<K, V> c() {
        return this.a;
    }

    @Override
    public oP<Map.Entry<K, V>> k_() {
        return this.h().k_();
    }

    @Override
    ea<Map.Entry<K, V>> m() {
        return new lh<Map.Entry<K, V>>(this, this.c);
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.k_();
    }
}

