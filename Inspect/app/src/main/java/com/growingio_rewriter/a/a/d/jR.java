/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.bG;
import com.growingio.a.a.d.m;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Map;

class jR<K, V>
extends m<K, V> {
    transient bG<? extends List<V>> a;
    private static final long b = 0;

    jR(Map<K, Collection<V>> map, bG<? extends List<V>> bG2) {
        super(map);
        this.a = aU.a(bG2);
    }

    @Override
    protected List<V> a() {
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

    @Override
    protected /* synthetic */ Collection d() {
        return this.a();
    }
}

