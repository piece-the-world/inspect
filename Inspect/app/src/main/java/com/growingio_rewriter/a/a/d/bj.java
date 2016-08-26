/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.S;
import com.growingio.a.a.d.U;
import com.growingio.a.a.d.bf;
import com.growingio.a.a.d.bg;
import com.growingio.a.a.d.gO;
import com.growingio.a.a.d.gb;
import com.growingio.a.a.d.kl;
import com.growingio.a.a.d.km;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class bj
extends S<E> {
    final /* synthetic */ bf b;

    private bj(bf bf2) {
        this.b = bf2;
        super(bf2);
    }

    bf<E> b() {
        return this.b;
    }

    @Override
    public Object[] toArray() {
        return this.c().toArray();
    }

    @Override
    public <T> T[] toArray(T[] arrT) {
        return this.c().toArray(arrT);
    }

    private List<km<E>> c() {
        ArrayList<km<E>> arrayList = gO.c(this.size());
        gb.a(arrayList, this.iterator());
        return arrayList;
    }

    /* synthetic */ kl a() {
        return this.b();
    }

    /* synthetic */ bj(bf bf2, bg bg2) {
        this(bf2);
    }
}

