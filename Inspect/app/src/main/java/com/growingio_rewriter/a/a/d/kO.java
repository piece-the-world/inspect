/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.aq;
import com.growingio.a.a.d.aG;
import com.growingio.a.a.d.aK;
import com.growingio.a.a.d.aT;
import com.growingio.a.a.d.aX;
import com.growingio.a.a.d.aj;
import com.growingio.a.a.d.cb;
import com.growingio.a.a.d.ea;
import com.growingio.a.a.d.fL;
import com.growingio.a.a.d.gO;
import com.growingio.a.a.d.gu;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.d.kK;
import com.growingio.a.a.d.kL;
import com.growingio.a.a.d.kM;
import com.growingio.a.a.d.kN;
import com.growingio.a.a.d.kR;
import com.growingio.a.a.d.lC;
import com.growingio.a.a.d.oS;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public abstract class kO<T>
implements Comparator<T> {
    static final int c = 1;
    static final int d = -1;

    public static <C extends Comparable> kO<C> d() {
        return kK.a;
    }

    public static <T> kO<T> a(Comparator<T> comparator) {
        return comparator instanceof kO ? (kO)comparator : new aT<T>(comparator);
    }

    public static <T> kO<T> a(kO<T> kO2) {
        return aU.a(kO2);
    }

    public static <T> kO<T> a(List<T> list) {
        return new cb<T>(list);
    }

    public static /* varargs */ <T> kO<T> a(T t2, T ... arrT) {
        return kO.a(gO.a(t2, arrT));
    }

    public static kO<Object> e() {
        return aj.a;
    }

    public static kO<Object> f() {
        return oS.a;
    }

    public static kO<Object> g() {
        return kR.a;
    }

    protected kO() {
    }

    public <S extends T> kO<S> a() {
        return new lC(this);
    }

    public <S extends T> kO<S> b() {
        return new kL(this);
    }

    public <S extends T> kO<S> c() {
        return new kM(this);
    }

    public <F> kO<F> a(aq<F, ? extends T> aq2) {
        return new aG<F, T>(aq2, this);
    }

    <T2 extends T> kO<Map.Entry<T2, ?>> h() {
        return this.a(ii.a());
    }

    public <U extends T> kO<U> b(Comparator<? super U> comparator) {
        return new aX<U>(this, aU.a(comparator));
    }

    public static <T> kO<T> c(Iterable<? extends Comparator<? super T>> iterable) {
        return new aX(iterable);
    }

    public <S extends T> kO<Iterable<S>> i() {
        return new gu(this);
    }

    @Override
    public abstract int compare(T var1, T var2);

    public <E extends T> E a(Iterator<E> iterator) {
        E e2 = iterator.next();
        while (iterator.hasNext()) {
            e2 = this.a(e2, iterator.next());
        }
        return e2;
    }

    public <E extends T> E d(Iterable<E> iterable) {
        return this.a(iterable.iterator());
    }

    public <E extends T> E a(E e2, E e3) {
        return this.compare(e2, e3) <= 0 ? e2 : e3;
    }

    public /* varargs */ <E extends T> E a(E e2, E e3, E e4, E ... arrE) {
        E e5 = this.a(this.a(e2, e3), e4);
        for (E e6 : arrE) {
            e5 = this.a(e5, e6);
        }
        return e5;
    }

    public <E extends T> E b(Iterator<E> iterator) {
        E e2 = iterator.next();
        while (iterator.hasNext()) {
            e2 = this.b(e2, iterator.next());
        }
        return e2;
    }

    public <E extends T> E e(Iterable<E> iterable) {
        return this.b(iterable.iterator());
    }

    public <E extends T> E b(E e2, E e3) {
        return this.compare(e2, e3) >= 0 ? e2 : e3;
    }

    public /* varargs */ <E extends T> E b(E e2, E e3, E e4, E ... arrE) {
        E e5 = this.b(this.b(e2, e3), e4);
        for (E e6 : arrE) {
            e5 = this.b(e5, e6);
        }
        return e5;
    }

    public <E extends T> List<E> a(Iterable<E> iterable, int n2) {
        Collection collection;
        if (iterable instanceof Collection && (long)(collection = (Collection)iterable).size() <= 2 * (long)n2) {
            Object[] arrobject = collection.toArray();
            Arrays.sort(arrobject, this);
            if (arrobject.length > n2) {
                arrobject = kN.b(arrobject, n2);
            }
            return Collections.unmodifiableList(Arrays.asList(arrobject));
        }
        return this.a(iterable.iterator(), n2);
    }

    public <E extends T> List<E> a(Iterator<E> iterator, int n2) {
        E e2;
        Object object;
        aU.a(iterator);
        aK.a(n2, "k");
        if (n2 == 0 || !iterator.hasNext()) {
            return ea.d();
        }
        if (n2 >= 1073741823) {
            ArrayList<E> arrayList = gO.a(iterator);
            Collections.sort(arrayList, this);
            if (arrayList.size() > n2) {
                arrayList.subList(n2, arrayList.size()).clear();
            }
            arrayList.trimToSize();
            return Collections.unmodifiableList(arrayList);
        }
        int n3 = n2 * 2;
        Object[] arrobject = new Object[n3];
        arrobject[0] = object = iterator.next();
        int n4 = 1;
        while (n4 < n2 && iterator.hasNext()) {
            e2 = iterator.next();
            arrobject[n4++] = e2;
            object = this.b(object, e2);
        }
        while (iterator.hasNext()) {
            int n5;
            e2 = iterator.next();
            if (this.compare(e2, object) >= 0) continue;
            arrobject[n4++] = e2;
            if (n4 != n3) continue;
            int n6 = 0;
            int n7 = n3 - 1;
            int n8 = 0;
            while (n6 < n7) {
                n5 = n6 + n7 + 1 >>> 1;
                int n9 = this.a((E[])arrobject, n6, n7, n5);
                if (n9 > n2) {
                    n7 = n9 - 1;
                    continue;
                }
                if (n9 >= n2) break;
                n6 = Math.max(n9, n6 + 1);
                n8 = n9;
            }
            n4 = n2;
            object = arrobject[n8];
            for (n5 = n8 + 1; n5 < n4; ++n5) {
                object = this.b(object, arrobject[n5]);
            }
        }
        Arrays.sort(arrobject, 0, n4, this);
        n4 = Math.min(n4, n2);
        return Collections.unmodifiableList(Arrays.asList(kN.b(arrobject, n4)));
    }

    private <E extends T> int a(E[] arrE, int n2, int n3, int n4) {
        E e2 = arrE[n4];
        arrE[n4] = arrE[n3];
        arrE[n3] = e2;
        int n5 = n2;
        for (int i2 = n2; i2 < n3; ++i2) {
            if (this.compare(arrE[i2], e2) >= 0) continue;
            kN.b(arrE, n5, i2);
            ++n5;
        }
        kN.b(arrE, n3, n5);
        return n5;
    }

    public <E extends T> List<E> b(Iterable<E> iterable, int n2) {
        return this.a().a(iterable, n2);
    }

    public <E extends T> List<E> b(Iterator<E> iterator, int n2) {
        return this.a().a(iterator, n2);
    }

    public <E extends T> List<E> a(Iterable<E> iterable) {
        Object[] arrobject = fL.e(iterable);
        Arrays.sort(arrobject, this);
        return gO.a(Arrays.asList(arrobject));
    }

    public <E extends T> ea<E> b(Iterable<E> iterable) {
        Object[] arrobject;
        for (Object object : arrobject = fL.e(iterable)) {
            aU.a(object);
        }
        Arrays.sort(arrobject, this);
        return ea.b(arrobject);
    }

    public boolean f(Iterable<? extends T> iterable) {
        Iterator<T> iterator = iterable.iterator();
        if (iterator.hasNext()) {
            T t2 = iterator.next();
            while (iterator.hasNext()) {
                T t3 = iterator.next();
                if (this.compare(t2, t3) > 0) {
                    return false;
                }
                t2 = t3;
            }
        }
        return true;
    }

    public boolean g(Iterable<? extends T> iterable) {
        Iterator<T> iterator = iterable.iterator();
        if (iterator.hasNext()) {
            T t2 = iterator.next();
            while (iterator.hasNext()) {
                T t3 = iterator.next();
                if (this.compare(t2, t3) >= 0) {
                    return false;
                }
                t2 = t3;
            }
        }
        return true;
    }

    public int a(List<? extends T> list, T t2) {
        return Collections.binarySearch(list, t2, this);
    }
}

