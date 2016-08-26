/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.ab;
import com.growingio.a.a.d.hE;
import com.growingio.a.a.d.hJ;
import com.growingio.a.a.d.hX;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.concurrent.ConcurrentMap;

final class hW<K, V>
extends hJ<K, V> {
    private static final long a = 3;

    hW(hX hX2, hX hX3, ab<Object> ab2, ab<Object> ab3, int n2, ConcurrentMap<K, V> concurrentMap) {
        super(hX2, hX3, ab2, ab3, n2, concurrentMap);
    }

    private void b(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        this.a(objectOutputStream);
    }

    private void c(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        hE hE2 = this.a(objectInputStream);
        this.g = hE2.h();
        this.b(objectInputStream);
    }

    private Object b() {
        return this.g;
    }
}

