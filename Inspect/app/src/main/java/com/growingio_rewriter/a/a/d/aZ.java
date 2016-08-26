/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.ab;
import com.growingio.a.a.b.aq;
import com.growingio.a.a.d.bc;
import com.growingio.a.a.d.bd;
import com.growingio.a.a.d.hE;
import com.growingio.a.a.d.hG;
import com.growingio.a.a.d.hV;
import com.growingio.a.a.d.hX;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;

class aZ<K, V>
extends hG<K, V> {
    final aq<? super K, ? extends V> a;
    private static final long u = 4;

    aZ(hE hE2, aq<? super K, ? extends V> aq2) {
        super(hE2);
        this.a = aU.a(aq2);
    }

    @Override
    hV<K, V> a(int n2, int n3) {
        return new bc(this, n2, n3);
    }

    bc<K, V> a(int n2) {
        return (bc)super.b(n2);
    }

    V a(K k2) throws ExecutionException {
        int n2 = this.b(aU.a(k2));
        return this.a((K)n2).a(k2, n2, this.a);
    }

    @Override
    Object a() {
        return new bd<K, V>(this.n, this.o, this.l, this.m, this.k, this, this.a);
    }

    @Override
    /* synthetic */ hV b(int n2) {
        return this.a((K)n2);
    }
}

