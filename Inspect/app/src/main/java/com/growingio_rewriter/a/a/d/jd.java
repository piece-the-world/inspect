/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.iE;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.d.jb;
import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;

class jd<K, V1, V2>
extends jb<K, V1, V2>
implements SortedMap<K, V2> {
    protected SortedMap<K, V1> c() {
        return (SortedMap)this.a;
    }

    jd(SortedMap<K, V1> sortedMap, iE<? super K, ? super V1, V2> iE2) {
        super(sortedMap, iE2);
    }

    @Override
    public Comparator<? super K> comparator() {
        return this.c().comparator();
    }

    @Override
    public K firstKey() {
        return this.c().firstKey();
    }

    @Override
    public SortedMap<K, V2> headMap(K k2) {
        return ii.a(this.c().headMap(k2), this.b);
    }

    @Override
    public K lastKey() {
        return this.c().lastKey();
    }

    @Override
    public SortedMap<K, V2> subMap(K k2, K k3) {
        return ii.a(this.c().subMap(k2, k3), this.b);
    }

    @Override
    public SortedMap<K, V2> tailMap(K k2) {
        return ii.a(this.c().tailMap(k2), this.b);
    }
}

