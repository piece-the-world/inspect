/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.ac;
import com.growingio.a.a.d.bM;
import com.growingio.a.a.d.km;
import com.growingio.a.a.d.mu;
import java.util.Iterator;

class ad
extends bM<E> {
    final /* synthetic */ ac a;

    ad(ac ac2) {
        this.a = ac2;
    }

    @Override
    mu<E> c() {
        return this.a;
    }

    @Override
    Iterator<km<E>> e() {
        return this.a.m();
    }

    @Override
    public Iterator<E> iterator() {
        return this.a.n();
    }
}

