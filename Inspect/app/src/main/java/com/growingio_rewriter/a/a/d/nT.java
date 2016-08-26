/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.j;
import com.growingio.a.a.d.nR;
import java.util.Comparator;
import java.util.Iterator;

class nT
extends j<C> {
    C a;
    final /* synthetic */ Iterator b;
    final /* synthetic */ Comparator c;
    final /* synthetic */ nR d;

    nT(nR nR2, Iterator iterator, Comparator comparator) {
        this.d = nR2;
        this.b = iterator;
        this.c = comparator;
    }

    @Override
    protected C a() {
        while (this.b.hasNext()) {
            Object e2 = this.b.next();
            boolean bl2 = this.a != null && this.c.compare(e2, this.a) == 0;
            if (bl2) continue;
            this.a = e2;
            return this.a;
        }
        this.a = null;
        return (C)this.b();
    }
}

