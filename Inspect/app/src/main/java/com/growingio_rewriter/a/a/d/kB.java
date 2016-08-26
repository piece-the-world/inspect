/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.aV;
import com.growingio.a.a.d.S;
import com.growingio.a.a.d.aK;
import com.growingio.a.a.d.gb;
import com.growingio.a.a.d.kC;
import com.growingio.a.a.d.kl;
import com.growingio.a.a.d.km;
import com.growingio.a.a.d.lI;
import com.growingio.a.a.d.oP;
import java.util.Iterator;
import java.util.Set;

final class kB<E>
extends S<E> {
    final kl<E> a;
    final aV<? super E> b;

    kB(kl<E> kl2, aV<? super E> aV2) {
        this.a = aU.a(kl2);
        this.b = aU.a(aV2);
    }

    public oP<E> g() {
        return gb.b(this.a.iterator(), this.b);
    }

    @Override
    Set<E> e() {
        return lI.a(this.a.d(), this.b);
    }

    @Override
    Set<km<E>> f() {
        return lI.a(this.a.a(), new kC(this));
    }

    @Override
    Iterator<km<E>> b() {
        throw new AssertionError((Object)"should never be called");
    }

    @Override
    int c() {
        return this.d().size();
    }

    @Override
    public int a(Object object) {
        int n2 = this.a.a(object);
        if (n2 > 0) {
            Object object2 = object;
            return this.b.a((Object)object2) ? n2 : 0;
        }
        return 0;
    }

    @Override
    public int a(E e2, int n2) {
        aU.a(this.b.a(e2), "Element %s does not match predicate %s", e2, this.b);
        return this.a.a(e2, n2);
    }

    @Override
    public int b(Object object, int n2) {
        aK.a(n2, "occurrences");
        if (n2 == 0) {
            return this.a(object);
        }
        return this.contains(object) ? this.a.b(object, n2) : 0;
    }

    @Override
    public void clear() {
        this.d().clear();
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.g();
    }
}

