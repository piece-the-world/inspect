/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.dH;
import com.growingio.a.a.d.gA;
import com.growingio.a.a.d.gv;
import com.growingio.a.a.d.gx;
import com.growingio.a.a.d.gz;
import com.growingio.a.a.d.lU;
import java.util.Arrays;
import java.util.Iterator;

final class gy
extends lU<V>
implements gA<K, V> {
    private final K c;
    gx<K, V>[] a;
    private int d;
    private int e;
    private gA<K, V> f;
    private gA<K, V> g;
    final /* synthetic */ gv b;

    /*
     * WARNING - Possible parameter corruption
     */
    gy(K n2, int k2) {
        gx[] arrgx;
        this.b = (gv)n2;
        this.d = 0;
        this.e = 0;
        this.c = k2;
        this.f = this;
        this.g = this;
        int n4 = dH.a(n3, 1.0);
        this.a = arrgx = new gx[n4];
    }

    private int c() {
        return this.a.length - 1;
    }

    @Override
    public gA<K, V> a() {
        return this.g;
    }

    @Override
    public gA<K, V> b() {
        return this.f;
    }

    @Override
    public void a(gA<K, V> gA2) {
        this.g = gA2;
    }

    @Override
    public void b(gA<K, V> gA2) {
        this.f = gA2;
    }

    @Override
    public Iterator<V> iterator() {
        return new gz(this);
    }

    @Override
    public int size() {
        return this.d;
    }

    @Override
    public boolean contains(Object object) {
        int n2 = dH.a(object);
        gx<K, V> gx2 = this.a[n2 & this.c()];
        while (gx2 != null) {
            if (gx2.a(object, n2)) {
                return true;
            }
            gx2 = gx2.b;
        }
        return false;
    }

    @Override
    public boolean add(V v2) {
        gx<K, V> gx2;
        int n2 = dH.a(v2);
        int n3 = n2 & this.c();
        gx<K, V> gx3 = gx2 = this.a[n3];
        while (gx3 != null) {
            if (gx3.a(v2, n2)) {
                return false;
            }
            gx3 = gx3.b;
        }
        gx3 = new gx<K, V>(this.c, v2, n2, gx2);
        gv.a(this.g, gx3);
        gv.a(gx3, this);
        gv.a(gv.a(this.b).c(), gx3);
        gv.a(gx3, gv.a(this.b));
        this.a[n3] = gx3;
        ++this.d;
        ++this.e;
        this.d();
        return true;
    }

    private void d() {
        if (dH.a(this.d, this.a.length, 1.0)) {
            gx[] arrgx;
            this.a = arrgx = new gx[this.a.length * 2];
            int n2 = arrgx.length - 1;
            for (gA<K, V> gA2 = this.f; gA2 != this; gA2 = gA2.b()) {
                gx gx2 = (gx)gA2;
                int n3 = gx2.a & n2;
                gx2.b = arrgx[n3];
                arrgx[n3] = gx2;
            }
        }
    }

    @Override
    public boolean remove(Object object) {
        int n2 = dH.a(object);
        int n3 = n2 & this.c();
        gx<K, V> gx2 = null;
        gx<K, V> gx3 = this.a[n3];
        while (gx3 != null) {
            if (gx3.a(object, n2)) {
                if (gx2 == null) {
                    this.a[n3] = gx3.b;
                } else {
                    gx2.b = gx3.b;
                }
                gv.a(gx3);
                gv.a(gx3);
                --this.d;
                ++this.e;
                return true;
            }
            gx2 = gx3;
            gx3 = gx3.b;
        }
        return false;
    }

    @Override
    public void clear() {
        Arrays.fill(this.a, null);
        this.d = 0;
        for (gA<K, V> gA2 = this.f; gA2 != this; gA2 = gA2.b()) {
            gx gx2 = (gx)gA2;
            gv.a(gx2);
        }
        gv.a(this, this);
        ++this.e;
    }

    static /* synthetic */ gA a(gy gy2) {
        return gy2.f;
    }

    static /* synthetic */ int b(gy gy2) {
        return gy2.e;
    }
}

