/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.eM;
import com.growingio.a.a.d.km;
import com.growingio.a.a.d.oP;
import java.util.Iterator;

class eN
extends oP<E> {
    int a;
    E b;
    final /* synthetic */ Iterator c;
    final /* synthetic */ eM d;

    eN(eM eM2, Iterator iterator) {
        this.d = eM2;
        this.c = iterator;
    }

    @Override
    public boolean hasNext() {
        return this.a > 0 || this.c.hasNext();
    }

    @Override
    public E next() {
        if (this.a <= 0) {
            km km2 = (km)this.c.next();
            this.b = km2.a();
            this.a = km2.b();
        }
        --this.a;
        return this.b;
    }
}

