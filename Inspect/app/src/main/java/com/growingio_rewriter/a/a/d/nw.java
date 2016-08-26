/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.nb;
import com.growingio.a.a.d.nj;
import java.util.Collection;
import java.util.Set;

class nw<E>
extends nj<E>
implements Set<E> {
    private static final long a = 0;

    nw(Set<E> set, Object object) {
        super(set, object, null);
    }

    Set<E> d() {
        return (Set)super.b();
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
            return this.d().equals(object);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public int hashCode() {
        Object object = this.h;
        synchronized (object) {
            return this.d().hashCode();
        }
    }

    @Override
    /* synthetic */ Collection b() {
        return this.d();
    }

    @Override
    /* synthetic */ Object e() {
        return this.d();
    }
}

