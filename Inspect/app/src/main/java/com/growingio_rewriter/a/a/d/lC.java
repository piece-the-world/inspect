/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.kO;
import java.io.Serializable;
import java.util.Iterator;

final class lC<T>
extends kO<T>
implements Serializable {
    final kO<? super T> a;
    private static final long b = 0;

    lC(kO<? super T> kO2) {
        this.a = aU.a(kO2);
    }

    @Override
    public int compare(T t2, T t3) {
        return this.a.compare(t3, t2);
    }

    @Override
    public <S extends T> kO<S> a() {
        return this.a;
    }

    @Override
    public <E extends T> E a(E e2, E e3) {
        return this.a.b(e2, e3);
    }

    @Override
    public /* varargs */ <E extends T> E a(E e2, E e3, E e4, E ... arrE) {
        return this.a.b(e2, e3, e4, arrE);
    }

    @Override
    public <E extends T> E a(Iterator<E> iterator) {
        return this.a.b(iterator);
    }

    @Override
    public <E extends T> E d(Iterable<E> iterable) {
        return this.a.e(iterable);
    }

    @Override
    public <E extends T> E b(E e2, E e3) {
        return this.a.a(e2, e3);
    }

    @Override
    public /* varargs */ <E extends T> E b(E e2, E e3, E e4, E ... arrE) {
        return this.a.a(e2, e3, e4, arrE);
    }

    @Override
    public <E extends T> E b(Iterator<E> iterator) {
        return this.a.a(iterator);
    }

    @Override
    public <E extends T> E e(Iterable<E> iterable) {
        return this.a.d(iterable);
    }

    public int hashCode() {
        return - this.a.hashCode();
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof lC) {
            lC lC2 = (lC)object;
            return this.a.equals(lC2.a);
        }
        return false;
    }

    public String toString() {
        return this.a + ".reverse()";
    }
}

