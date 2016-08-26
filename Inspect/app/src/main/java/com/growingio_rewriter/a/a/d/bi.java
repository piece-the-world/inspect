/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.aK;
import com.growingio.a.a.d.bf;
import com.growingio.a.a.d.cJ;
import com.growingio.a.a.d.km;
import java.util.Iterator;

class bi
extends cJ<km<E>> {
    private km<E> c;
    final /* synthetic */ Iterator a;
    final /* synthetic */ bf b;

    bi(bf bf2, Iterator iterator) {
        this.b = bf2;
        this.a = iterator;
    }

    @Override
    protected Iterator<km<E>> a() {
        return this.a;
    }

    public km<E> b() {
        this.c = (km)super.next();
        return this.c;
    }

    @Override
    public void remove() {
        aK.a(this.c != null);
        this.b.c(this.c.a(), 0);
        this.c = null;
    }

    @Override
    public /* synthetic */ Object next() {
        return this.b();
    }

    @Override
    protected /* synthetic */ Object g() {
        return this.a();
    }
}

