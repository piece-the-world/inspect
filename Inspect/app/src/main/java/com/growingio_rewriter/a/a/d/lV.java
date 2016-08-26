/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.ei;
import com.growingio.a.a.d.fg;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.d.lW;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

final class lV<E>
extends AbstractSet<Set<E>> {
    final ei<E, Integer> a;

    lV(Set<E> set) {
        this.a = ii.a(set);
        aU.a(this.a.size() <= 30, "Too many elements to create power set: %s > 30", this.a.size());
    }

    @Override
    public int size() {
        return 1 << this.a.size();
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public Iterator<Set<E>> iterator() {
        return new lW(this, this.size());
    }

    @Override
    public boolean contains(Object object) {
        if (object instanceof Set) {
            Set set = (Set)object;
            return this.a.m().containsAll(set);
        }
        return false;
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof lV) {
            lV lV2 = (lV)object;
            return this.a.equals(lV2.a);
        }
        return super.equals(object);
    }

    @Override
    public int hashCode() {
        return this.a.m().hashCode() << this.a.size() - 1;
    }

    @Override
    public String toString() {
        return "powerSet(" + this.a + ")";
    }
}

