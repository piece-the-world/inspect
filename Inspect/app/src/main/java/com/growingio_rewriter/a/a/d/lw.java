/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.ea;
import com.growingio.a.a.d.fo;
import com.growingio.a.a.d.fz;
import com.growingio.a.a.d.gb;
import com.growingio.a.a.d.kO;
import com.growingio.a.a.d.kT;
import com.growingio.a.a.d.kl;
import com.growingio.a.a.d.mg;
import com.growingio.a.a.d.mh;
import com.growingio.a.a.d.mj;
import com.growingio.a.a.d.mn;
import com.growingio.a.a.d.oP;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

final class lw<E>
extends fz<E> {
    static final lw<Comparable> a = new lw(ea.d(), kO.d());
    private final transient ea<E> e;

    lw(ea<E> ea2, Comparator<? super E> comparator) {
        super(comparator);
        this.e = ea2;
    }

    @Override
    public oP<E> k_() {
        return this.e.k_();
    }

    @Override
    public oP<E> d() {
        return this.e.f().k_();
    }

    @Override
    public int size() {
        return this.e.size();
    }

    @Override
    public boolean contains(Object object) {
        try {
            return object != null && this.f(object) >= 0;
        }
        catch (ClassCastException var2_2) {
            return false;
        }
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        if (collection instanceof kl) {
            collection = ((kl)collection).d();
        }
        if (!mg.a(this.comparator(), collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        kT<E> kT2 = gb.k(this.k_());
        Iterator iterator = collection.iterator();
        Object obj = iterator.next();
        try {
            while (kT2.hasNext()) {
                int n2 = this.c(kT2.a(), obj);
                if (n2 < 0) {
                    kT2.next();
                    continue;
                }
                if (n2 == 0) {
                    if (!iterator.hasNext()) {
                        return true;
                    }
                    obj = iterator.next();
                    continue;
                }
                if (n2 <= 0) continue;
                return false;
            }
        }
        catch (NullPointerException var5_6) {
            return false;
        }
        catch (ClassCastException var5_7) {
            return false;
        }
        return false;
    }

    private int f(Object object) throws ClassCastException {
        return Collections.binarySearch(this.e, object, this.f());
    }

    @Override
    boolean i_() {
        return this.e.i_();
    }

    @Override
    int a(Object[] arrobject, int n2) {
        return this.e.a(arrobject, n2);
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof Set)) {
            return false;
        }
        Set set = (Set)object;
        if (this.size() != set.size()) {
            return false;
        }
        if (this.isEmpty()) {
            return true;
        }
        if (mg.a(this.c, set)) {
            Iterator iterator = set.iterator();
            try {
                oP<E> oP2 = this.k_();
                while (oP2.hasNext()) {
                    E e2 = oP2.next();
                    Object e3 = iterator.next();
                    if (e3 != null && this.c(e2, e3) == 0) continue;
                    return false;
                }
                return true;
            }
            catch (ClassCastException var4_5) {
                return false;
            }
            catch (NoSuchElementException var4_6) {
                return false;
            }
        }
        return this.containsAll(set);
    }

    @Override
    public E first() {
        if (this.isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.e.get(0);
    }

    @Override
    public E last() {
        if (this.isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.e.get(this.size() - 1);
    }

    @Override
    public E lower(E e2) {
        int n2 = this.e(e2, false) - 1;
        return n2 == -1 ? null : (E)this.e.get(n2);
    }

    @Override
    public E floor(E e2) {
        int n2 = this.e(e2, true) - 1;
        return n2 == -1 ? null : (E)this.e.get(n2);
    }

    @Override
    public E ceiling(E e2) {
        int n2 = this.f(e2, true);
        return n2 == this.size() ? null : (E)this.e.get(n2);
    }

    @Override
    public E higher(E e2) {
        int n2 = this.f(e2, false);
        return n2 == this.size() ? null : (E)this.e.get(n2);
    }

    @Override
    fz<E> b(E e2, boolean bl2) {
        return this.a(0, this.e(e2, bl2));
    }

    int e(E e2, boolean bl2) {
        return mh.a(this.e, aU.a(e2), this.comparator(), bl2 ? mn.d : mn.c, mj.b);
    }

    @Override
    fz<E> a(E e2, boolean bl2, E e3, boolean bl3) {
        return this.a(e2, bl2).b(e3, bl3);
    }

    @Override
    fz<E> a(E e2, boolean bl2) {
        return this.a(this.f(e2, bl2), this.size());
    }

    int f(E e2, boolean bl2) {
        return mh.a(this.e, aU.a(e2), this.comparator(), bl2 ? mn.c : mn.d, mj.b);
    }

    Comparator<Object> f() {
        return this.c;
    }

    @Override
    lw<E> a(int n2, int n3) {
        if (n2 == 0 && n3 == this.size()) {
            return this;
        }
        if (n2 < n3) {
            return new lw<E>(this.e.a(n2, n3), this.c);
        }
        return lw.a(this.c);
    }

    @Override
    int c(Object object) {
        int n2;
        if (object == null) {
            return -1;
        }
        try {
            n2 = mh.a(this.e, object, this.f(), mn.a, mj.c);
        }
        catch (ClassCastException var3_3) {
            return -1;
        }
        return n2 >= 0 ? n2 : -1;
    }

    @Override
    ea<E> m() {
        return this.size() <= 1 ? this.e : new fo<E>(this, this.e);
    }

    @Override
    fz<E> e() {
        kO kO2 = kO.a(this.c).a();
        return this.isEmpty() ? lw.a(kO2) : new lw<E>(this.e.f(), kO2);
    }

    @Override
    public /* synthetic */ Iterator descendingIterator() {
        return this.d();
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.k_();
    }
}

