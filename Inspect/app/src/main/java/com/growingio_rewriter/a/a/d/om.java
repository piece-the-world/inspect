/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  com.growingio.a.a.d.oh.com.growingio.a.a.d.ol.com.growingio.a.a.d.oo
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.bw;
import com.growingio.a.a.d.gb;
import com.growingio.a.a.d.kW;
import com.growingio.a.a.d.oh;
import com.growingio.a.a.d.oh.com.growingio.a.a.d.ol.com.growingio.a.a.d.oo;
import com.growingio.a.a.d.ol;
import com.growingio.a.a.d.on;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;

class om
extends oo {
    final /* synthetic */ ol a;

    om(ol ol2) {
        this.a = ol2;
        super(ol2);
    }

    Iterator<Map.Entry<kW<K>, V>> a() {
        if (ol.a(this.a).j()) {
            return gb.a();
        }
        Iterator iterator = oh.a(this.a.a).headMap(ol.a((ol)this.a).c, false).descendingMap().values().iterator();
        return new on(this, iterator);
    }
}

