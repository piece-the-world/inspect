/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.dQ;
import com.growingio.a.a.d.ea;
import com.growingio.a.a.d.fz;
import com.growingio.a.a.d.lh;
import com.growingio.a.a.d.lw;
import com.growingio.a.a.d.mf;
import java.util.Comparator;

final class fo<E>
extends lh<E>
implements mf<E> {
    fo(fz<E> fz2, ea<E> ea2) {
        super(fz2, ea2);
    }

    fz<E> i() {
        return (fz)super.c();
    }

    @Override
    public Comparator<? super E> comparator() {
        return this.i().comparator();
    }

    @Override
    public int indexOf(Object object) {
        int n2 = this.i().c(object);
        return n2 >= 0 && this.get(n2).equals(object) ? n2 : -1;
    }

    @Override
    public int lastIndexOf(Object object) {
        return this.indexOf(object);
    }

    @Override
    public boolean contains(Object object) {
        return this.indexOf(object) >= 0;
    }

    @Override
    ea<E> b(int n2, int n3) {
        ea ea2 = super.b(n2, n3);
        return new lw(ea2, this.comparator()).h();
    }

    @Override
    /* synthetic */ dQ c() {
        return this.i();
    }
}

