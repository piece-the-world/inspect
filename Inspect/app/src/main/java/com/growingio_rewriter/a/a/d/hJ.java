/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.ab;
import com.growingio.a.a.d.cD;
import com.growingio.a.a.d.hE;
import com.growingio.a.a.d.hX;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;

abstract class hJ<K, V>
extends cD<K, V>
implements Serializable {
    private static final long a = 3;
    final hX b;
    final hX c;
    final ab<Object> d;
    final ab<Object> e;
    final int f;
    transient ConcurrentMap<K, V> g;

    hJ(hX hX2, hX hX3, ab<Object> ab2, ab<Object> ab3, int n2, ConcurrentMap<K, V> concurrentMap) {
        this.b = hX2;
        this.c = hX3;
        this.d = ab2;
        this.e = ab3;
        this.f = n2;
        this.g = concurrentMap;
    }

    @Override
    protected ConcurrentMap<K, V> c() {
        return this.g;
    }

    void a(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.g.size());
        for (Map.Entry<K, V> entry : this.g.entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
        objectOutputStream.writeObject(null);
    }

    hE a(ObjectInputStream objectInputStream) throws IOException {
        int n2 = objectInputStream.readInt();
        return new hE().a(n2).a(this.b).b(this.c).a(this.d).b(this.f);
    }

    void b(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        Object object;
        while ((object = objectInputStream.readObject()) != null) {
            Object object2 = objectInputStream.readObject();
            this.g.put(object, object2);
        }
    }

    @Override
    protected /* synthetic */ Map a() {
        return this.c();
    }

    @Override
    protected /* synthetic */ Object g() {
        return this.c();
    }
}

