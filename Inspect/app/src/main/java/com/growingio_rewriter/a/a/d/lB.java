/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.kK;
import com.growingio.a.a.d.kO;
import java.io.Serializable;
import java.util.Iterator;

final class lB
extends kO<Comparable>
implements Serializable {
    static final lB a = new lB();
    private static final long b = 0;

    @Override
    public int a(Comparable comparable, Comparable comparable2) {
        aU.a(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    @Override
    public <S extends Comparable> kO<S> a() {
        return kO.d();
    }

    @Override
    public <E extends Comparable> E b(E e2, E e3) {
        return (E)((Comparable)kK.a.b(e2, e3));
    }

    @Override
    public /* varargs */ <E extends Comparable> E a(E e2, E e3, E e4, E ... arrE) {
        return (E)((Comparable)kK.a.b(e2, e3, e4, arrE));
    }

    public <E extends Comparable> E c(Iterator<E> iterator) {
        return (E)((Comparable)kK.a.b(iterator));
    }

    public <E extends Comparable> E h(Iterable<E> iterable) {
        return (E)((Comparable)kK.a.e(iterable));
    }

    public <E extends Comparable> E c(E e2, E e3) {
        return (E)((Comparable)kK.a.a(e2, e3));
    }

    @Override
    public /* varargs */ <E extends Comparable> E b(E e2, E e3, E e4, E ... arrE) {
        return (E)((Comparable)kK.a.a(e2, e3, e4, arrE));
    }

    @Override
    public <E extends Comparable> E d(Iterator<E> iterator) {
        return (E)((Comparable)kK.a.a(iterator));
    }

    public <E extends Comparable> E i(Iterable<E> iterable) {
        return (E)((Comparable)kK.a.d(iterable));
    }

    private Object j() {
        return a;
    }

    public String toString() {
        return "Ordering.natural().reverse()";
    }

    private lB() {
    }

    @Override
    public /* synthetic */ Object b(Object object, Object object2) {
        return this.c((Comparable)object, (Comparable)object2);
    }

    @Override
    public /* synthetic */ Object e(Iterable iterable) {
        return this.i(iterable);
    }

    @Override
    public /* synthetic */ Object b(Iterator iterator) {
        return this.d(iterator);
    }

    @Override
    public /* synthetic */ Object a(Object object, Object object2) {
        return this.b((E)((Comparable)object), (E)((Comparable)object2));
    }

    @Override
    public /* synthetic */ Object d(Iterable iterable) {
        return this.h(iterable);
    }

    @Override
    public /* synthetic */ Object a(Iterator iterator) {
        return this.c(iterator);
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((Comparable)object, (Comparable)object2);
    }
}

