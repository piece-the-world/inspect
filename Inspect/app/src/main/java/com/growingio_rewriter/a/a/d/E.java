/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  com.growingio.a.a.d.n.com.growingio.a.a.d.B.com.growingio.a.a.d.C
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.B;
import com.growingio.a.a.d.C;
import com.growingio.a.a.d.D;
import com.growingio.a.a.d.n;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

class E
extends com.growingio.a.a.d.n.com.growingio.a.a.d.B.com.growingio.a.a.d.C
implements ListIterator<V> {
    final /* synthetic */ D d;

    E(D d2) {
        this.d = d2;
        super((B)((Object)d2));
    }

    public E(D d2, int n2) {
        this.d = d2;
        super((B)((Object)d2), d2.g().listIterator(n2));
    }

    private ListIterator<V> c() {
        return (ListIterator)this.b();
    }

    @Override
    public boolean hasPrevious() {
        return this.c().hasPrevious();
    }

    @Override
    public V previous() {
        return this.c().previous();
    }

    @Override
    public int nextIndex() {
        return this.c().nextIndex();
    }

    @Override
    public int previousIndex() {
        return this.c().previousIndex();
    }

    @Override
    public void set(V v2) {
        this.c().set(v2);
    }

    @Override
    public void add(V v2) {
        boolean bl2 = this.d.isEmpty();
        this.c().add(v2);
        n.c(this.d.g);
        if (bl2) {
            this.d.d();
        }
    }
}

