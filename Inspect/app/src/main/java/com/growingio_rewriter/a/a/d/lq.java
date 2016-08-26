/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aL;
import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.dH;
import com.growingio.a.a.d.eM;
import com.growingio.a.a.d.ea;
import com.growingio.a.a.d.fg;
import com.growingio.a.a.d.kD;
import com.growingio.a.a.d.km;
import com.growingio.a.a.d.lr;
import com.growingio.a.a.d.ls;
import com.growingio.a.a.d.lt;
import com.growingio.a.a.m.q;
import java.util.Collection;
import java.util.Set;

class lq<E>
extends eM<E> {
    static final lq<Object> a = new lq<E>(ea.d());
    private final transient kD<E>[] b;
    private final transient kD<E>[] c;
    private final transient int d;
    private final transient int e;
    private transient fg<E> f;

    lq(Collection<? extends km<? extends E>> collection) {
        int n2 = collection.size();
        kD[] arrkD = new kD[n2];
        if (n2 == 0) {
            this.b = arrkD;
            this.c = null;
            this.d = 0;
            this.e = 0;
            this.f = fg.k();
        } else {
            int n3 = dH.a(n2, 1.0);
            int n4 = n3 - 1;
            kD[] arrkD2 = new kD[n3];
            int n5 = 0;
            int n6 = 0;
            long l2 = 0;
            for (km<E> km2 : collection) {
                kD kD22;
                kD kD22;
                E e2 = aU.a(km2.a());
                int n7 = km2.b();
                int n8 = e2.hashCode();
                int n9 = dH.a(n8) & n4;
                kD kD3 = arrkD2[n9];
                if (kD3 == null) {
                    boolean bl2 = km2 instanceof kD && !(km2 instanceof lt);
                    kD22 = bl2 ? (kD)km2 : new kD(e2, n7);
                } else {
                    kD22 = new lt<E>(e2, n7, kD3);
                }
                n6 += n8 ^ n7;
                arrkD[n5++] = kD22;
                arrkD2[n9] = kD22;
                l2 += (long)n7;
            }
            this.b = arrkD;
            this.c = arrkD2;
            this.d = q.b(l2);
            this.e = n6;
        }
    }

    @Override
    boolean i_() {
        return false;
    }

    @Override
    public int a(Object object) {
        kD<E>[] arrkD = this.c;
        if (object == null || arrkD == null) {
            return 0;
        }
        int n2 = dH.a(object);
        int n3 = arrkD.length - 1;
        for (kD<E> kD2 = arrkD[n2 & n3]; kD2 != null; kD2 = kD2.c()) {
            if (!aL.a(object, kD2.a())) continue;
            return kD2.b();
        }
        return 0;
    }

    @Override
    public int size() {
        return this.d;
    }

    public fg<E> c() {
        ls ls2 = this.f;
        ls ls3 = ls2 == null ? (this.f = new ls(this, null)) : ls2;
        return ls3;
    }

    @Override
    km<E> a(int n2) {
        return this.b[n2];
    }

    @Override
    public int hashCode() {
        return this.e;
    }

    @Override
    public /* synthetic */ Set d() {
        return this.c();
    }

    static /* synthetic */ kD[] a(lq lq2) {
        return lq2.b;
    }
}

