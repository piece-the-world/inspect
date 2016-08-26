/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.hg;
import com.growingio.a.a.d.hh;
import com.growingio.a.a.d.hq;
import com.growingio.a.a.d.nP;
import java.util.Iterator;
import java.util.Map;

class hr
extends nP<Map.Entry<K, V>, Map.Entry<K, V>> {
    final /* synthetic */ hq a;

    hr(hq hq2, Iterator iterator) {
        this.a = hq2;
        super(iterator);
    }

    @Override
    Map.Entry<K, V> a(Map.Entry<K, V> entry) {
        return hh.a(entry, this.a.a);
    }
}

