/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.kO;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;

final class gu<T>
extends kO<Iterable<T>>
implements Serializable {
    final Comparator<? super T> a;
    private static final long b = 0;

    gu(Comparator<? super T> comparator) {
        this.a = comparator;
    }

    @Override
    public int a(Iterable<T> iterable, Iterable<T> iterable2) {
        Iterator<T> iterator = iterable.iterator();
        Iterator<T> iterator2 = iterable2.iterator();
        while (iterator.hasNext()) {
            if (!iterator2.hasNext()) {
                return 1;
            }
            int n2 = this.a.compare(iterator.next(), iterator2.next());
            if (n2 == 0) continue;
            return n2;
        }
        if (iterator2.hasNext()) {
            return -1;
        }
        return 0;
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof gu) {
            gu gu2 = (gu)object;
            return this.a.equals(gu2.a);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 2075626741;
    }

    public String toString() {
        return this.a + ".lexicographical()";
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((Iterable)object, (Iterable)object2);
    }
}

