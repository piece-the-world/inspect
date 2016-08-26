/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.nP;
import com.growingio.a.a.d.na;
import com.growingio.a.a.d.ng;
import java.util.Collection;
import java.util.Iterator;

class nh
extends nP<Collection<V>, Collection<V>> {
    final /* synthetic */ ng a;

    nh(ng ng2, Iterator iterator) {
        this.a = ng2;
        super(iterator);
    }

    @Override
    Collection<V> a(Collection<V> collection) {
        return na.a(collection, this.a.h);
    }
}

