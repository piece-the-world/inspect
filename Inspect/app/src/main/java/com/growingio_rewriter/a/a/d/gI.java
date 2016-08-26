/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.aK;
import com.growingio.a.a.d.gC;
import com.growingio.a.a.d.gD;
import com.growingio.a.a.d.gK;
import com.growingio.a.a.d.lI;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

class gI
implements Iterator<K> {
    final Set<K> a;
    gK<K, V> b;
    gK<K, V> c;
    int d;
    final /* synthetic */ gC e;

    private gI(gC gC2) {
        this.e = gC2;
        this.a = lI.a(this.e.q().size());
        this.b = gC.c(this.e);
        this.d = gC.a(this.e);
    }

    private void a() {
        if (gC.a(this.e) != this.d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override
    public boolean hasNext() {
        this.a();
        return this.b != null;
    }

    @Override
    public K next() {
        this.a();
        gC.e(this.b);
        this.c = this.b;
        this.a.add(this.c.a);
        do {
            this.b = this.b.c;
        } while (this.b != null && !this.a.add(this.b.a));
        return this.c.a;
    }

    @Override
    public void remove() {
        this.a();
        aK.a(this.c != null);
        gC.a(this.e, this.c.a);
        this.c = null;
        this.d = gC.a(this.e);
    }

    /* synthetic */ gI(gC gC2, gD gD2) {
        this(gC2);
    }
}

