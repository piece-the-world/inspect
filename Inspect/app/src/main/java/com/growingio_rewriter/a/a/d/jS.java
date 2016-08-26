/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.bG;
import com.growingio.a.a.d.n;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Map;

class jS<K, V>
extends n<K, V> {
    transient bG<? extends Collection<V>> a;
    private static final long b = 0;

    jS(Map<K, Collection<V>> map, bG<? extends Collection<V>> bG2) {
        super(map);
        this.a = aU.a(bG2);
    }

    @Override
    protected Collection<V> d() {
        return this.a.a();
    }

    private void a(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.a);
        objectOutputStream.writeObject(this.f());
    }

    private void a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.a = (bG)objectInputStream.readObject();
        Map map = (Map)objectInputStream.readObject();
        this.a(map);
    }
}

