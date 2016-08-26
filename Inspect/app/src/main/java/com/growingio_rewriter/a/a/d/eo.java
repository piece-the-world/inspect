/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.en;
import com.growingio.a.a.d.ep;
import com.growingio.a.a.d.fg;
import com.growingio.a.a.d.oP;
import java.util.Iterator;
import java.util.Map;

class eo
extends oP<Map.Entry<K, fg<V>>> {
    final /* synthetic */ Iterator a;
    final /* synthetic */ en b;

    eo(en en2, Iterator iterator) {
        this.b = en2;
        this.a = iterator;
    }

    @Override
    public boolean hasNext() {
        return this.a.hasNext();
    }

    public Map.Entry<K, fg<V>> a() {
        Map.Entry entry = (Map.Entry)this.a.next();
        return new ep(this, entry);
    }

    @Override
    public /* synthetic */ Object next() {
        return this.a();
    }
}

