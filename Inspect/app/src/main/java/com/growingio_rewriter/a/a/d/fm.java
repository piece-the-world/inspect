/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.eD;
import com.growingio.a.a.d.eG;
import com.growingio.a.a.d.ea;
import com.growingio.a.a.d.fl;
import com.growingio.a.a.d.jK;
import com.growingio.a.a.d.jr;
import com.growingio.a.a.d.js;
import com.growingio.a.a.d.kO;
import com.growingio.a.a.d.lH;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;

public final class fm<K, V>
extends eG<K, V> {
    public fm() {
        super(js.b().e().e());
    }

    public fm<K, V> a(K k2, V v2) {
        this.a.a(aU.a(k2), aU.a(v2));
        return this;
    }

    public fm<K, V> a(Map.Entry<? extends K, ? extends V> entry) {
        this.a.a(aU.a(entry.getKey()), aU.a(entry.getValue()));
        return this;
    }

    public fm<K, V> a(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        super.b(iterable);
        return this;
    }

    public fm<K, V> a(K k2, Iterable<? extends V> iterable) {
        Collection collection = this.a.c(aU.a(k2));
        for (V v2 : iterable) {
            collection.add(aU.a(v2));
        }
        return this;
    }

    public /* varargs */ fm<K, V> a(K k2, V ... arrV) {
        return this.a(k2, (Iterable<? extends V>)Arrays.asList(arrV));
    }

    public fm<K, V> a(jr<? extends K, ? extends V> jr2) {
        for (Map.Entry<K, Collection<V>> entry : jr2.c().entrySet()) {
            this.a(entry.getKey(), (Iterable)entry.getValue());
        }
        return this;
    }

    public fm<K, V> a(Comparator<? super K> comparator) {
        this.b = aU.a(comparator);
        return this;
    }

    public fm<K, V> b(Comparator<? super V> comparator) {
        super.c(comparator);
        return this;
    }

    public fl<K, V> a() {
        if (this.b != null) {
            lH lH2 = js.b().e().e();
            ea ea2 = kO.a(this.b).h().b(this.a.c().entrySet());
            for (Map.Entry entry : ea2) {
                lH2.c(entry.getKey(), entry.getValue());
            }
            this.a = lH2;
        }
        return fl.a(this.a, this.c);
    }

    @Override
    public /* synthetic */ eD b() {
        return this.a();
    }

    @Override
    public /* synthetic */ eG c(Comparator comparator) {
        return this.b(comparator);
    }

    @Override
    public /* synthetic */ eG d(Comparator comparator) {
        return this.a(comparator);
    }

    @Override
    public /* synthetic */ eG b(jr jr2) {
        return this.a(jr2);
    }

    @Override
    public /* synthetic */ eG b(Object object, Object[] arrobject) {
        return this.a((K)object, (V[])arrobject);
    }

    @Override
    public /* synthetic */ eG b(Object object, Iterable iterable) {
        return this.a((K)object, iterable);
    }

    @Override
    public /* synthetic */ eG b(Iterable iterable) {
        return this.a(iterable);
    }

    @Override
    public /* synthetic */ eG b(Map.Entry entry) {
        return this.a(entry);
    }

    @Override
    public /* synthetic */ eG b(Object object, Object object2) {
        return this.a((K)object, (V)object2);
    }
}

