/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.b.aP;
import com.growingio.a.a.d.dQ;
import com.growingio.a.a.d.gO;
import com.growingio.a.a.o.a.aC;
import com.growingio.a.a.o.a.aD;
import com.growingio.a.a.o.a.aE;
import com.growingio.a.a.o.a.bU;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class aF
extends aC<V, List<V>> {
    final /* synthetic */ aE c;

    /*
     * WARNING - Possible parameter corruption
     */
    aF(dQ<? extends bU<? extends V>> n2, boolean dQ2) {
        this.c = (aE)n2;
        super((aC)n2, dQ2, bl2);
    }

    public List<V> b(List<aP<V>> list) {
        ArrayList<Object> arrayList = gO.b(list.size());
        for (aP<V> aP2 : list) {
            arrayList.add((aP2 != null ? (Object)aP2.d() : null));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public /* synthetic */ Object a(List list) {
        return this.b(list);
    }
}

