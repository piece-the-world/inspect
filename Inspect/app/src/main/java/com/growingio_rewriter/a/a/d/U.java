/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.S;
import com.growingio.a.a.d.kA;
import com.growingio.a.a.d.kl;
import com.growingio.a.a.d.km;
import java.util.Iterator;

class U
extends kA<E> {
    final /* synthetic */ S a;

    U(S s2) {
        this.a = s2;
    }

    @Override
    kl<E> a() {
        return this.a;
    }

    @Override
    public Iterator<km<E>> iterator() {
        return this.a.b();
    }

    @Override
    public int size() {
        return this.a.c();
    }
}

