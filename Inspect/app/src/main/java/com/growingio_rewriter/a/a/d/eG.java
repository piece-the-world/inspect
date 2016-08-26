/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.aK;
import com.growingio.a.a.d.eD;
import com.growingio.a.a.d.ea;
import com.growingio.a.a.d.fL;
import com.growingio.a.a.d.gN;
import com.growingio.a.a.d.jC;
import com.growingio.a.a.d.jr;
import com.growingio.a.a.d.js;
import com.growingio.a.a.d.kO;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class eG<K, V> {
    jr<K, V> a;
    Comparator<? super K> b;
    Comparator<? super V> c;

    public eG() {
        this(js.b().b().e());
    }

    eG(jr<K, V> jr2) {
        this.a = jr2;
    }

    public eG<K, V> b(K k2, V v2) {
        aK.a(k2, v2);
        this.a.a(k2, v2);
        return this;
    }

    public eG<K, V> b(Map.Entry<? extends K, ? extends V> entry) {
        return this.b(entry.getKey(), entry.getValue());
    }

    public eG<K, V> b(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        for (Map.Entry<K, V> entry : iterable) {
            this.b(entry);
        }
        return this;
    }

    public eG<K, V> b(K k2, Iterable<? extends V> iterable) {
        if (k2 == null) {
            throw new NullPointerException("null key in entry: null=" + fL.c(iterable));
        }
        Collection<V> collection = this.a.c(k2);
        for (V v2 : iterable) {
            aK.a(k2, v2);
            collection.add(v2);
        }
        return this;
    }

    public /* varargs */ eG<K, V> b(K k2, V ... arrV) {
        return this.b(k2, (Iterable<? extends V>)Arrays.asList(arrV));
    }

    public eG<K, V> b(jr<? extends K, ? extends V> jr2) {
        for (Map.Entry<K, Collection<V>> entry : jr2.c().entrySet()) {
            this.b(entry.getKey(), (Iterable)entry.getValue());
        }
        return this;
    }

    public eG<K, V> d(Comparator<? super K> comparator) {
        this.b = aU.a(comparator);
        return this;
    }

    public eG<K, V> c(Comparator<? super V> comparator) {
        this.c = aU.a(comparator);
        return this;
    }

    public eD<K, V> b() {
        if (this.c != null) {
            for (Collection ea2 : this.a.c().values()) {
                List list = (List)ea2;
                Collections.sort(list, this.c);
            }
        }
        if (this.b != null) {
            gN gN2 = js.b().b().e();
            ea<Map.Entry<K, Collection<V>>> ea2 = kO.a(this.b).h().b(this.a.c().entrySet());
            for (Map.Entry entry : ea2) {
                gN2.c(entry.getKey(), (Iterable)entry.getValue());
            }
            this.a = gN2;
        }
        return eD.c(this.a);
    }
}

