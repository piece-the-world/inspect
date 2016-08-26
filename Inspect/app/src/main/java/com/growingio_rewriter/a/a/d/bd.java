/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.ab;
import com.growingio.a.a.b.aq;
import com.growingio.a.a.d.hE;
import com.growingio.a.a.d.hJ;
import com.growingio.a.a.d.hX;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.concurrent.ConcurrentMap;

final class bd<K, V>
extends hJ<K, V> {
    final aq<? super K, ? extends V> a;
    private static final long h = 4;

    bd(hX hX2, hX hX3, ab<Object> ab2, ab<Object> ab3, int n2, ConcurrentMap<K, V> concurrentMap, aq<? super K, ? extends V> aq2) {
        super(hX2, hX3, ab2, ab3, n2, concurrentMap);
        this.a = aq2;
    }

    private void b(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        this.a(objectOutputStream);
    }

    private void c(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        hE hE2 = this.a(objectInputStream);
        this.g = hE2.a(this.a);
        this.b(objectInputStream);
    }

    Object b() {
        return this.g;
    }
}

