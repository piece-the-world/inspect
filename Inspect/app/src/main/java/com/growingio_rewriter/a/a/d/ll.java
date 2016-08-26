/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.ea;
import com.growingio.a.a.d.ei;
import com.growingio.a.a.d.eu;
import com.growingio.a.a.d.li;
import com.growingio.a.a.d.lk;
import com.growingio.a.a.d.lm;
import com.growingio.a.a.d.oP;
import java.util.Iterator;
import java.util.Map;

final class ll
extends eu<V, K> {
    final /* synthetic */ lk a;

    ll(lk lk2) {
        this.a = lk2;
    }

    @Override
    ei<V, K> c() {
        return this.a;
    }

    @Override
    boolean i() {
        return true;
    }

    @Override
    public int hashCode() {
        return li.c(this.a.a);
    }

    @Override
    public oP<Map.Entry<V, K>> k_() {
        return this.h().k_();
    }

    @Override
    ea<Map.Entry<V, K>> m() {
        return new lm(this);
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.k_();
    }
}

