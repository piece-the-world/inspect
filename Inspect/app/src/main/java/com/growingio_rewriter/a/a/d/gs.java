/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.gr;
import com.growingio.a.a.d.kT;
import java.util.Comparator;

class gs
implements Comparator<kT<T>> {
    final /* synthetic */ Comparator a;
    final /* synthetic */ gr b;

    gs(gr gr2, Comparator comparator) {
        this.b = gr2;
        this.a = comparator;
    }

    public int a(kT<T> kT2, kT<T> kT3) {
        return this.a.compare(kT2.a(), kT3.a());
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((kT)object, (kT)object2);
    }
}

