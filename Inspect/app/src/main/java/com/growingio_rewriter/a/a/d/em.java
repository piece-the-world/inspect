/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.ei;
import com.growingio.a.a.d.el;
import com.growingio.a.a.d.eu;
import com.growingio.a.a.d.oP;
import java.util.Iterator;
import java.util.Map;

class em
extends eu<K, V> {
    final /* synthetic */ el a;

    em(el el2) {
        this.a = el2;
    }

    @Override
    ei<K, V> c() {
        return this.a;
    }

    @Override
    public oP<Map.Entry<K, V>> k_() {
        return this.a.d();
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.k_();
    }
}

