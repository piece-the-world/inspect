/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.gN;
import com.growingio.a.a.d.gO;
import com.growingio.a.a.d.iE;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.d.jr;
import com.growingio.a.a.d.ke;
import java.util.Collection;
import java.util.List;

final class kd<K, V1, V2>
extends ke<K, V1, V2>
implements gN<K, V2> {
    kd(gN<K, V1> gN2, iE<? super K, ? super V1, V2> iE2) {
        super(gN2, iE2);
    }

    @Override
    List<V2> a(K k2, Collection<V1> collection) {
        return gO.a((List)collection, ii.a(this.b, k2));
    }

    @Override
    public List<V2> a(K k2) {
        return this.a(k2, this.a.c(k2));
    }

    @Override
    public List<V2> b(Object object) {
        return this.a((K)object, this.a.d(object));
    }

    @Override
    public List<V2> a(K k2, Iterable<? extends V2> iterable) {
        throw new UnsupportedOperationException();
    }

    @Override
    public /* synthetic */ Collection b(Object object, Iterable iterable) {
        return this.a(object, iterable);
    }

    @Override
    public /* synthetic */ Collection d(Object object) {
        return this.b(object);
    }

    @Override
    public /* synthetic */ Collection c(Object object) {
        return this.a(object);
    }

    @Override
    /* synthetic */ Collection b(Object object, Collection collection) {
        return this.a((K)object, collection);
    }
}

