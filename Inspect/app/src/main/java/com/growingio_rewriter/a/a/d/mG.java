/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.gb;
import com.growingio.a.a.d.mE;
import com.growingio.a.a.d.mF;
import com.growingio.a.a.d.nC;
import com.growingio.a.a.d.nD;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class mG
implements Iterator<nC<R, C, V>> {
    final Iterator<Map.Entry<R, Map<C, V>>> a;
    Map.Entry<R, Map<C, V>> b;
    Iterator<Map.Entry<C, V>> c;
    final /* synthetic */ mE d;

    private mG(mE mE2) {
        this.d = mE2;
        this.a = this.d.a.entrySet().iterator();
        this.c = gb.c();
    }

    @Override
    public boolean hasNext() {
        return this.a.hasNext() || this.c.hasNext();
    }

    public nC<R, C, V> a() {
        if (!this.c.hasNext()) {
            this.b = this.a.next();
            this.c = this.b.getValue().entrySet().iterator();
        }
        Map.Entry<C, V> entry = this.c.next();
        return nD.a(this.b.getKey(), entry.getKey(), entry.getValue());
    }

    @Override
    public void remove() {
        this.c.remove();
        if (this.b.getValue().isEmpty()) {
            this.a.remove();
        }
    }

    @Override
    public /* synthetic */ Object next() {
        return this.a();
    }

    /* synthetic */ mG(mE mE2, mF mF2) {
        this(mE2);
    }
}

