/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.ei;
import com.growingio.a.a.d.ek;
import com.growingio.a.a.d.er;
import com.growingio.a.a.d.fp;
import java.util.Comparator;
import java.util.Map;

public class fs<K, V>
extends ek<K, V> {
    private final Comparator<? super K> e;

    public fs(Comparator<? super K> comparator) {
        this.e = aU.a(comparator);
    }

    public fs<K, V> a(K k2, V v2) {
        super.b(k2, v2);
        return this;
    }

    public fs<K, V> a(Map.Entry<? extends K, ? extends V> entry) {
        super.b(entry);
        return this;
    }

    public fs<K, V> a(Map<? extends K, ? extends V> map) {
        super.b(map);
        return this;
    }

    public fs<K, V> a(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        super.b(iterable);
        return this;
    }

    public fs<K, V> a(Comparator<? super V> comparator) {
        throw new UnsupportedOperationException("Not available on ImmutableSortedMap.Builder");
    }

    public fp<K, V> a() {
        switch (this.c) {
            case 0: {
                return fp.a(this.e);
            }
            case 1: {
                return fp.a(this.e, this.b[0].getKey(), this.b[0].getValue());
            }
        }
        return fp.a(this.e, false, this.b, this.c);
    }

    @Override
    public /* synthetic */ ei b() {
        return this.a();
    }

    @Override
    public /* synthetic */ ek b(Comparator comparator) {
        return this.a(comparator);
    }

    @Override
    public /* synthetic */ ek b(Iterable iterable) {
        return this.a(iterable);
    }

    @Override
    public /* synthetic */ ek b(Map map) {
        return this.a(map);
    }

    @Override
    public /* synthetic */ ek b(Map.Entry entry) {
        return this.a(entry);
    }

    @Override
    public /* synthetic */ ek b(Object object, Object object2) {
        return this.a(object, object2);
    }
}

