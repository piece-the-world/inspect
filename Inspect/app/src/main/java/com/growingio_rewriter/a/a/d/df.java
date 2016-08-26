/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.cN;
import java.util.Comparator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.SortedMap;

public abstract class df<K, V>
extends cN<K, V>
implements SortedMap<K, V> {
    protected df() {
    }

    protected abstract SortedMap<K, V> o();

    @Override
    public Comparator<? super K> comparator() {
        return this.o().comparator();
    }

    @Override
    public K firstKey() {
        return this.o().firstKey();
    }

    @Override
    public SortedMap<K, V> headMap(K k2) {
        return this.o().headMap(k2);
    }

    @Override
    public K lastKey() {
        return this.o().lastKey();
    }

    @Override
    public SortedMap<K, V> subMap(K k2, K k3) {
        return this.o().subMap(k2, k3);
    }

    @Override
    public SortedMap<K, V> tailMap(K k2) {
        return this.o().tailMap(k2);
    }

    private int b(Object object, Object object2) {
        Comparator<K> comparator = this.comparator();
        if (comparator == null) {
            return ((Comparable)object).compareTo(object2);
        }
        return comparator.compare((Object)object, (Object)object2);
    }

    @Override
    protected boolean d(Object object) {
        try {
            df df2 = this;
            Object object2 = df2.tailMap(object).firstKey();
            return this.b(object2, object) == 0;
        }
        catch (ClassCastException var2_3) {
            return false;
        }
        catch (NoSuchElementException var2_4) {
            return false;
        }
        catch (NullPointerException var2_5) {
            return false;
        }
    }

    protected SortedMap<K, V> a(K k2, K k3) {
        aU.a(this.b(k2, k3) <= 0, (Object)"fromKey must be <= toKey");
        return this.tailMap(k2).headMap(k3);
    }

    @Override
    protected /* synthetic */ Map a() {
        return this.o();
    }

    @Override
    protected /* synthetic */ Object g() {
        return this.o();
    }
}

