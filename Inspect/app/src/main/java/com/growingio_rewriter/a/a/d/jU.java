/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.bG;
import com.growingio.a.a.d.ae;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;

class jU<K, V>
extends ae<K, V> {
    transient bG<? extends SortedSet<V>> a;
    transient Comparator<? super V> b;
    private static final long c = 0;

    jU(Map<K, Collection<V>> map, bG<? extends SortedSet<V>> bG2) {
        super(map);
        this.a = aU.a(bG2);
        this.b = bG2.a().comparator();
    }

    @Override
    protected SortedSet<V> y() {
        return this.a.a();
    }

    @Override
    public Comparator<? super V> d_() {
        return this.b;
    }

    private void a(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.a);
        objectOutputStream.writeObject(this.f());
    }

    private void a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.a = (bG)objectInputStream.readObject();
        this.b = this.a.a().comparator();
        Map map = (Map)objectInputStream.readObject();
        this.a(map);
    }

    @Override
    protected /* synthetic */ Set a() {
        return this.y();
    }

    @Override
    protected /* synthetic */ Collection d() {
        return this.y();
    }
}

