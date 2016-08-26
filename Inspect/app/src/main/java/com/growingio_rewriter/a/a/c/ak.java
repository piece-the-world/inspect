/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.c;

import com.growingio.a.a.c.B;
import com.growingio.a.a.c.N;
import com.growingio.a.a.c.O;
import com.growingio.a.a.c.aq;
import com.growingio.a.a.c.f;
import com.growingio.a.a.d.ei;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.concurrent.ExecutionException;

final class ak<K, V>
extends aq<K, V>
implements N<K, V>,
Serializable {
    private static final long o = 1;
    transient N<K, V> a;

    ak(O<K, V> o2) {
        super(o2);
    }

    private void a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        f f2 = this.h();
        this.a = f2.a(this.m);
    }

    @Override
    public V e(K k2) throws ExecutionException {
        return this.a.e(k2);
    }

    @Override
    public V b(K k2) {
        return this.a.b(k2);
    }

    @Override
    public ei<K, V> c(Iterable<? extends K> iterable) throws ExecutionException {
        return this.a.c(iterable);
    }

    @Override
    public final V f(K k2) {
        return this.a.f(k2);
    }

    @Override
    public void c(K k2) {
        this.a.c(k2);
    }

    private Object i() {
        return this.a;
    }
}

