/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.a;
import com.growingio.a.a.d.av;
import com.growingio.a.a.d.b;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

class f<K, V>
extends a<K, V> {
    private static final long b = 0;

    private f(Map<K, V> map, a<V, K> a2) {
        super(map, a2, null);
    }

    @Override
    K a(K k2) {
        return this.a.b(k2);
    }

    @Override
    V b(V v2) {
        return this.a.a(v2);
    }

    @Override
    private void a(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.m_());
    }

    @Override
    private void a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.a((a)objectInputStream.readObject());
    }

    Object d() {
        return this.m_().m_();
    }

    @Override
    public /* synthetic */ Collection values() {
        return super.o_();
    }

    @Override
    protected /* synthetic */ Object g() {
        return super.a();
    }

    /* synthetic */ f(Map map, a a2, b b2) {
        this(map, a2);
    }
}

