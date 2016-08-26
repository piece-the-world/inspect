/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aq;
import com.growingio.a.a.d.iD;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.d.iv;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class iw
extends iD<K, V> {
    final /* synthetic */ iv a;

    iw(iv iv2) {
        this.a = iv2;
    }

    @Override
    Map<K, V> a() {
        return this.a;
    }

    @Override
    public Iterator<Map.Entry<K, V>> iterator() {
        return ii.b(this.a.c(), this.a.a);
    }
}

