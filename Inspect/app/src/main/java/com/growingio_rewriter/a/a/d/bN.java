/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.bM;
import com.growingio.a.a.d.kA;
import com.growingio.a.a.d.kl;
import com.growingio.a.a.d.km;
import com.growingio.a.a.d.mu;
import java.util.Iterator;
import java.util.Set;

class bN
extends kA<E> {
    final /* synthetic */ bM a;

    bN(bM bM2) {
        this.a = bM2;
    }

    @Override
    kl<E> a() {
        return this.a;
    }

    @Override
    public Iterator<km<E>> iterator() {
        return this.a.e();
    }

    @Override
    public int size() {
        return this.a.c().a().size();
    }
}

