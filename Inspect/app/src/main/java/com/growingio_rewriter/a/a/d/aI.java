/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.aH;
import com.growingio.a.a.d.ea;
import java.util.List;

class aI
extends ea<E> {
    final /* synthetic */ int a;
    final /* synthetic */ aH b;

    aI(aH aH2, int n2) {
        this.b = aH2;
        this.a = n2;
    }

    @Override
    public int size() {
        return aH.a(this.b).size();
    }

    @Override
    public E get(int n2) {
        aU.a(n2, this.size());
        int n3 = aH.a(this.b, this.a, n2);
        return ((List)aH.a(this.b).get(n2)).get(n3);
    }

    @Override
    boolean i_() {
        return true;
    }
}

