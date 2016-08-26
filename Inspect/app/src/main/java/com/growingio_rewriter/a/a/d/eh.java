/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.eD;
import com.growingio.a.a.d.eG;
import com.growingio.a.a.d.eg;
import com.growingio.a.a.d.jr;
import java.util.Comparator;
import java.util.Map;

public final class eh<K, V>
extends eG<K, V> {
    public eh<K, V> a(K k2, V v2) {
        super.b(k2, v2);
        return this;
    }

    public eh<K, V> a(Map.Entry<? extends K, ? extends V> entry) {
        super.b(entry);
        return this;
    }

    public eh<K, V> a(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        super.b(iterable);
        return this;
    }

    public eh<K, V> a(K k2, Iterable<? extends V> iterable) {
        super.b(k2, iterable);
        return this;
    }

    public /* varargs */ eh<K, V> a(K k2, V ... arrV) {
        super.b(k2, arrV);
        return this;
    }

    public eh<K, V> a(jr<? extends K, ? extends V> jr2) {
        super.b(jr2);
        return this;
    }

    public eh<K, V> a(Comparator<? super K> comparator) {
        super.d(comparator);
        return this;
    }

    public eh<K, V> b(Comparator<? super V> comparator) {
        super.c(comparator);
        return this;
    }

    public eg<K, V> a() {
        return (eg)super.b();
    }

    @Override
    public /* synthetic */ eD b() {
        return this.a();
    }

    @Override
    public /* synthetic */ eG c(Comparator comparator) {
        return this.b(comparator);
    }

    @Override
    public /* synthetic */ eG d(Comparator comparator) {
        return this.a(comparator);
    }

    @Override
    public /* synthetic */ eG b(jr jr2) {
        return this.a(jr2);
    }

    @Override
    public /* synthetic */ eG b(Object object, Object[] arrobject) {
        return this.a((K)object, (V[])arrobject);
    }

    @Override
    public /* synthetic */ eG b(Object object, Iterable iterable) {
        return this.a((K)object, iterable);
    }

    @Override
    public /* synthetic */ eG b(Iterable iterable) {
        return this.a(iterable);
    }

    @Override
    public /* synthetic */ eG b(Map.Entry entry) {
        return this.a(entry);
    }

    @Override
    public /* synthetic */ eG b(Object object, Object object2) {
        return this.a((K)object, (V)object2);
    }
}

