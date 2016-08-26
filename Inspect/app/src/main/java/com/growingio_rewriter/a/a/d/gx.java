/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aL;
import com.growingio.a.a.d.dT;
import com.growingio.a.a.d.gA;

final class gx<K, V>
extends dT<K, V>
implements gA<K, V> {
    final int a;
    gx<K, V> b;
    gA<K, V> c;
    gA<K, V> d;
    gx<K, V> e;
    gx<K, V> f;

    gx(K k2, V v2, int n2, gx<K, V> gx2) {
        super(k2, v2);
        this.a = n2;
        this.b = gx2;
    }

    boolean a(Object object, int n2) {
        return this.a == n2 && aL.a(this.getValue(), object);
    }

    @Override
    public gA<K, V> a() {
        return this.c;
    }

    @Override
    public gA<K, V> b() {
        return this.d;
    }

    @Override
    public void a(gA<K, V> gA2) {
        this.c = gA2;
    }

    @Override
    public void b(gA<K, V> gA2) {
        this.d = gA2;
    }

    public gx<K, V> c() {
        return this.e;
    }

    public gx<K, V> d() {
        return this.f;
    }

    @Override
    public void a(gx<K, V> gx2) {
        this.f = gx2;
    }

    @Override
    public void b(gx<K, V> gx2) {
        this.e = gx2;
    }
}

