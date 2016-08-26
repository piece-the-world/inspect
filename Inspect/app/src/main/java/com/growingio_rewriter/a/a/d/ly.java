/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.nC;
import java.util.Comparator;

final class ly
implements Comparator<nC<R, C, V>> {
    final /* synthetic */ Comparator a;
    final /* synthetic */ Comparator b;

    ly(Comparator comparator, Comparator comparator2) {
        this.a = comparator;
        this.b = comparator2;
    }

    public int a(nC<R, C, V> nC2, nC<R, C, V> nC3) {
        int n2;
        int n3 = n2 = this.a == null ? 0 : this.a.compare(nC2.a(), nC3.a());
        if (n2 != 0) {
            return n2;
        }
        return this.b == null ? 0 : this.b.compare(nC2.b(), nC3.b());
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((nC)object, (nC)object2);
    }
}

