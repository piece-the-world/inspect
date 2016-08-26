/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.aL;
import com.growingio.a.a.d.aP;
import com.growingio.a.a.d.ea;
import com.growingio.a.a.d.kO;
import com.growingio.a.a.k.n;
import java.util.AbstractCollection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

final class aO<E>
extends AbstractCollection<List<E>> {
    final ea<E> a;
    final Comparator<? super E> b;
    final int c;

    aO(Iterable<E> iterable, Comparator<? super E> comparator) {
        this.a = kO.a(comparator).b(iterable);
        this.b = comparator;
        this.c = aO.a(this.a, comparator);
    }

    private static <E> int a(List<E> list, Comparator<? super E> comparator) {
        long l2 = 1;
        int n2 = 1;
        int n3 = 1;
        while (n2 < list.size()) {
            int n4 = comparator.compare(list.get(n2 - 1), list.get(n2));
            if (n4 < 0 && !aL.a(l2 *= n.a(n2, n3 = 0))) {
                return Integer.MAX_VALUE;
            }
            ++n2;
            ++n3;
        }
        if (!aL.a(l2 *= n.a(n2, n3))) {
            return Integer.MAX_VALUE;
        }
        return (int)l2;
    }

    @Override
    public int size() {
        return this.c;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public Iterator<List<E>> iterator() {
        return new aP<E>(this.a, this.b);
    }

    @Override
    public boolean contains(Object object) {
        if (object instanceof List) {
            List list = (List)object;
            return aL.a(this.a, list);
        }
        return false;
    }

    @Override
    public String toString() {
        return "orderedPermutationCollection(" + this.a + ")";
    }
}

