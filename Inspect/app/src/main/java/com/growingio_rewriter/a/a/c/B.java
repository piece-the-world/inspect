/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.c;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.aq;
import com.growingio.a.a.b.bG;
import com.growingio.a.a.c.C;
import com.growingio.a.a.c.E;
import com.growingio.a.a.c.G;
import com.growingio.a.a.c.H;
import com.growingio.a.a.o.a.bU;
import com.growingio.a.a.o.a.bp;
import java.util.Map;
import java.util.concurrent.Executor;

public abstract class B<K, V> {
    protected B() {
    }

    public abstract V a(K var1) throws Exception;

    public bU<V> a(K k2, V v2) throws Exception {
        aU.a(k2);
        aU.a(v2);
        return bp.a(this.a(k2));
    }

    public Map<K, V> a(Iterable<? extends K> iterable) throws Exception {
        throw new H();
    }

    public static <K, V> B<K, V> a(aq<K, V> aq2) {
        return new E<K, V>(aq2);
    }

    public static <V> B<Object, V> a(bG<V> bG2) {
        return new G<V>(bG2);
    }

    public static <K, V> B<K, V> a(B<K, V> b2, Executor executor) {
        aU.a(b2);
        aU.a(executor);
        return new C(b2, executor);
    }
}

