/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.dQ;
import com.growingio.a.a.d.eD;
import com.growingio.a.a.d.ei;
import com.growingio.a.a.d.oP;
import java.util.Iterator;

final class eL<K, V>
extends dQ<V> {
    private final transient eD<K, V> a;
    private static final long b = 0;

    eL(eD<K, V> eD2) {
        this.a = eD2;
    }

    @Override
    public boolean contains(Object object) {
        return this.a.g(object);
    }

    @Override
    public oP<V> k_() {
        return this.a.G();
    }

    @Override
    int a(Object[] arrobject, int n2) {
        oP oP2 = this.a.b.h().k_();
        while (oP2.hasNext()) {
            dQ dQ2 = oP2.next();
            n2 = dQ2.a(arrobject, n2);
        }
        return n2;
    }

    @Override
    public int size() {
        return this.a.l_();
    }

    @Override
    boolean i_() {
        return true;
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.k_();
    }
}

