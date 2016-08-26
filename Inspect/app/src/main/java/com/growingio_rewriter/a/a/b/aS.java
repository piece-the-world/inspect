/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.ab;
import java.io.Serializable;
import java.util.Iterator;

final class aS<T>
extends ab<Iterable<T>>
implements Serializable {
    final ab<? super T> a;
    private static final long b = 1;

    aS(ab<? super T> ab2) {
        this.a = aU.a(ab2);
    }

    @Override
    protected boolean a(Iterable<T> iterable, Iterable<T> iterable2) {
        Iterator<T> iterator = iterable.iterator();
        Iterator<T> iterator2 = iterable2.iterator();
        while (iterator.hasNext() && iterator2.hasNext()) {
            if (this.a.a(iterator.next(), iterator2.next())) continue;
            return false;
        }
        return !iterator.hasNext() && !iterator2.hasNext();
    }

    @Override
    protected int a(Iterable<T> iterable) {
        int n2 = 78721;
        for (T t2 : iterable) {
            n2 = n2 * 24943 + this.a.a(t2);
        }
        return n2;
    }

    public boolean equals(Object object) {
        if (object instanceof aS) {
            aS aS2 = (aS)object;
            return this.a.equals(aS2.a);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1185147655;
    }

    public String toString() {
        return this.a + ".pairwise()";
    }

    @Override
    protected /* synthetic */ int b(Object object) {
        return this.a((Iterable)object);
    }

    @Override
    protected /* synthetic */ boolean b(Object object, Object object2) {
        return this.a((Iterable)object, (Iterable)object2);
    }
}

