/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aV;
import com.growingio.a.a.d.lS;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

class lT<E>
extends lS<E>
implements SortedSet<E> {
    lT(SortedSet<E> sortedSet, aV<? super E> aV2) {
        super(sortedSet, aV2);
    }

    @Override
    public Comparator<? super E> comparator() {
        return ((SortedSet)this.a).comparator();
    }

    @Override
    public SortedSet<E> subSet(E e2, E e3) {
        return new lT<E>(((SortedSet)this.a).subSet(e2, e3), this.b);
    }

    @Override
    public SortedSet<E> headSet(E e2) {
        return new lT<E>(((SortedSet)this.a).headSet(e2), this.b);
    }

    @Override
    public SortedSet<E> tailSet(E e2) {
        return new lT<E>(((SortedSet)this.a).tailSet(e2), this.b);
    }

    @Override
    public E first() {
        return this.iterator().next();
    }

    @Override
    public E last() {
        SortedSet sortedSet = (SortedSet)this.a;
        Object e2;
        while (!this.b.a(e2 = sortedSet.last())) {
            sortedSet = sortedSet.headSet(e2);
        }
        return e2;
    }
}

