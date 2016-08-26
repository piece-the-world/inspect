/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.j;
import com.growingio.a.a.d.lM;
import java.util.Iterator;
import java.util.Set;

class lN
extends j<E> {
    final /* synthetic */ Iterator a;
    final /* synthetic */ Iterator b;
    final /* synthetic */ lM c;

    lN(lM lM2, Iterator iterator, Iterator iterator2) {
        this.c = lM2;
        this.a = iterator;
        this.b = iterator2;
    }

    @Override
    public E a() {
        Object e2;
        while (this.a.hasNext()) {
            e2 = this.a.next();
            if (this.c.b.contains(e2)) continue;
            return e2;
        }
        while (this.b.hasNext()) {
            e2 = this.b.next();
            if (this.c.a.contains(e2)) continue;
            return e2;
        }
        return (E)this.b();
    }
}

