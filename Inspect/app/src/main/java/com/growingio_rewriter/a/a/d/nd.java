/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.aL;
import com.growingio.a.a.d.gb;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.d.kN;
import com.growingio.a.a.d.lI;
import com.growingio.a.a.d.ne;
import com.growingio.a.a.d.nw;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class nd<K, V>
extends nw<Map.Entry<K, Collection<V>>> {
    private static final long a = 0;

    nd(Set<Map.Entry<K, Collection<V>>> set, Object object) {
        super(set, object);
    }

    @Override
    public Iterator<Map.Entry<K, Collection<V>>> iterator() {
        return new ne(this, super.iterator());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Object[] toArray() {
        Object object = this.h;
        synchronized (object) {
            return kN.a(this.d());
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public <T> T[] toArray(T[] arrT) {
        Object object = this.h;
        synchronized (object) {
            return kN.a(this.d(), arrT);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean contains(Object object) {
        Object object2 = this.h;
        synchronized (object2) {
            return ii.a(this.d(), object);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean containsAll(Collection<?> collection) {
        Object object = this.h;
        synchronized (object) {
            return aL.a(this.d(), collection);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        Object object2 = this.h;
        synchronized (object2) {
            return lI.a(this.d(), object);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean remove(Object object) {
        Object object2 = this.h;
        synchronized (object2) {
            return ii.b(this.d(), object);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean removeAll(Collection<?> collection) {
        Object object = this.h;
        synchronized (object) {
            return gb.a(this.d().iterator(), collection);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean retainAll(Collection<?> collection) {
        Object object = this.h;
        synchronized (object) {
            return (boolean)gb.b(this.d().iterator(), collection);
        }
    }
}

