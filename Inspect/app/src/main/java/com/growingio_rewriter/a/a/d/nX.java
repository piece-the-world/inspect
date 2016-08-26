/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.aD;
import com.growingio.a.a.d.aK;
import com.growingio.a.a.d.ac;
import com.growingio.a.a.d.dn;
import com.growingio.a.a.d.fL;
import com.growingio.a.a.d.kO;
import com.growingio.a.a.d.km;
import com.growingio.a.a.d.lE;
import com.growingio.a.a.d.mu;
import com.growingio.a.a.d.nY;
import com.growingio.a.a.d.nZ;
import com.growingio.a.a.d.oa;
import com.growingio.a.a.d.ob;
import com.growingio.a.a.d.oc;
import com.growingio.a.a.d.of;
import com.growingio.a.a.d.og;
import com.growingio.a.a.m.q;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;

public final class nX<E>
extends ac<E>
implements Serializable {
    private final transient og<of<E>> b;
    private final transient dn<E> c;
    private final transient of<E> d;
    private static final long e = 1;

    public static <E extends Comparable> nX<E> r() {
        return new nX(kO.d());
    }

    public static <E> nX<E> a(Comparator<? super E> comparator) {
        return comparator == null ? new nX(kO.d()) : new nX<E>(comparator);
    }

    public static <E extends Comparable> nX<E> a(Iterable<? extends E> iterable) {
        nX<E> nX2 = nX.r();
        fL.a(nX2, iterable);
        return nX2;
    }

    nX(og<of<E>> og2, dn<E> dn2, of<E> of2) {
        super(dn2.a());
        this.b = og2;
        this.c = dn2;
        this.d = of2;
    }

    nX(Comparator<? super E> comparator) {
        super(comparator);
        this.c = dn.a(comparator);
        this.d = new of<Object>(null, 1);
        nX.b(this.d, this.d);
        this.b = new og(null);
    }

    private long a(oc oc2) {
        of<E> of2 = this.b.a();
        long l2 = oc2.b(of2);
        if (this.c.b()) {
            l2 -= this.a(oc2, of2);
        }
        if (this.c.c()) {
            l2 -= this.b(oc2, of2);
        }
        return l2;
    }

    private long a(oc oc2, of<E> of2) {
        if (of2 == null) {
            return 0;
        }
        int n2 = this.comparator().compare(this.c.f(), of.d(of2));
        if (n2 < 0) {
            return this.a(oc2, of.e(of2));
        }
        if (n2 == 0) {
            switch (ob.a[this.c.g().ordinal()]) {
                case 1: {
                    return (long)oc2.a(of2) + oc2.b(of.e(of2));
                }
                case 2: {
                    return oc2.b(of.e(of2));
                }
            }
            throw new AssertionError();
        }
        return oc2.b(of.e(of2)) + (long)oc2.a(of2) + this.a(oc2, of.f(of2));
    }

    private long b(oc oc2, of<E> of2) {
        if (of2 == null) {
            return 0;
        }
        int n2 = this.comparator().compare(this.c.h(), of.d(of2));
        if (n2 > 0) {
            return this.b(oc2, of.f(of2));
        }
        if (n2 == 0) {
            switch (ob.a[this.c.i().ordinal()]) {
                case 1: {
                    return (long)oc2.a(of2) + oc2.b(of.f(of2));
                }
                case 2: {
                    return oc2.b(of.f(of2));
                }
            }
            throw new AssertionError();
        }
        return oc2.b(of.f(of2)) + (long)oc2.a(of2) + this.b(oc2, of.e(of2));
    }

    @Override
    public int size() {
        return q.b(this.a(oc.a));
    }

    @Override
    int c() {
        return q.b(this.a(oc.b));
    }

    @Override
    public int a(Object object) {
        try {
            Object object2 = object;
            of<Object> of2 = this.b.a();
            if (!this.c.c((Object)object2) || of2 == null) {
                return 0;
            }
            return of2.a(this.comparator(), object2);
        }
        catch (ClassCastException var2_3) {
            return 0;
        }
        catch (NullPointerException var2_4) {
            return 0;
        }
    }

    @Override
    public int a(E e2, int n2) {
        aK.a(n2, "occurrences");
        if (n2 == 0) {
            return this.a(e2);
        }
        aU.a(this.c.c(e2));
        of<E> of2 = this.b.a();
        if (of2 == null) {
            this.comparator().compare(e2, e2);
            of<E> of3 = new of<E>(e2, n2);
            nX.b(this.d, of3, this.d);
            this.b.a(of2, of3);
            return 0;
        }
        int[] arrn = new int[1];
        of<E> of4 = of2.a(this.comparator(), e2, n2, arrn);
        this.b.a(of2, of4);
        return arrn[0];
    }

    @Override
    public int b(Object object, int n2) {
        of<Object> of2;
        aK.a(n2, "occurrences");
        if (n2 == 0) {
            return this.a(object);
        }
        of<Object> of3 = this.b.a();
        int[] arrn = new int[1];
        try {
            Object object2 = object;
            if (!this.c.c((Object)object2) || of3 == null) {
                return 0;
            }
            of2 = of3.b(this.comparator(), object2, n2, arrn);
        }
        catch (ClassCastException var6_6) {
            return 0;
        }
        catch (NullPointerException var6_7) {
            return 0;
        }
        this.b.a(of3, of2);
        return arrn[0];
    }

    @Override
    public int c(E e2, int n2) {
        aK.a(n2, "count");
        if (!this.c.c(e2)) {
            aU.a(n2 == 0);
            return 0;
        }
        of<E> of2 = this.b.a();
        if (of2 == null) {
            if (n2 > 0) {
                this.a(e2, n2);
            }
            return 0;
        }
        int[] arrn = new int[1];
        of<E> of3 = of2.c(this.comparator(), e2, n2, arrn);
        this.b.a(of2, of3);
        return arrn[0];
    }

    @Override
    public boolean a(E e2, int n2, int n3) {
        aK.a(n3, "newCount");
        aK.a(n2, "oldCount");
        aU.a(this.c.c(e2));
        of<E> of2 = this.b.a();
        if (of2 == null) {
            if (n2 == 0) {
                if (n3 > 0) {
                    this.a(e2, n3);
                }
                return true;
            }
            return false;
        }
        int[] arrn = new int[1];
        of<E> of3 = of2.a(this.comparator(), e2, n2, n3, arrn);
        this.b.a(of2, of3);
        return arrn[0] == n2;
    }

    private km<E> b(of<E> of2) {
        return new nY(this, of2);
    }

    private of<E> s() {
        of of2;
        of<E> of3 = this.b.a();
        if (of3 == null) {
            return null;
        }
        if (this.c.b()) {
            E e2 = this.c.f();
            of2 = of.a(this.b.a(), this.comparator(), e2);
            if (of2 == null) {
                return null;
            }
            if (this.c.g() == aD.a && this.comparator().compare(e2, of2.a()) == 0) {
                of2 = of.g(of2);
            }
        } else {
            of2 = of.g(this.d);
        }
        return of2 == this.d || !this.c.c(of2.a()) ? null : of2;
    }

    private of<E> t() {
        of of2;
        of<E> of3 = this.b.a();
        if (of3 == null) {
            return null;
        }
        if (this.c.c()) {
            E e2 = this.c.h();
            of2 = of.b(this.b.a(), this.comparator(), e2);
            if (of2 == null) {
                return null;
            }
            if (this.c.i() == aD.a && this.comparator().compare(e2, of2.a()) == 0) {
                of2 = of.h(of2);
            }
        } else {
            of2 = of.h(this.d);
        }
        return of2 == this.d || !this.c.c(of2.a()) ? null : of2;
    }

    @Override
    Iterator<km<E>> b() {
        return new nZ(this);
    }

    @Override
    Iterator<km<E>> m() {
        return new oa(this);
    }

    @Override
    public mu<E> d(E e2, aD aD2) {
        return new nX<E>(this.b, this.c.a(dn.b(this.comparator(), e2, aD2)), this.d);
    }

    @Override
    public mu<E> c(E e2, aD aD2) {
        return new nX<E>(this.b, this.c.a(dn.a(this.comparator(), e2, aD2)), this.d);
    }

    static int a(of<?> of2) {
        return of2 == null ? 0 : of.c(of2);
    }

    private static <T> void b(of<T> of2, of<T> of3) {
        of.a(of2, of3);
        of.b(of3, of2);
    }

    private static <T> void b(of<T> of2, of<T> of3, of<T> of4) {
        nX.b(of2, of3);
        nX.b(of3, of4);
    }

    private void a(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.e_().comparator());
        lE.a(this, objectOutputStream);
    }

    private void a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator)objectInputStream.readObject();
        lE.a(ac.class, "comparator").a(this, comparator);
        lE.a(nX.class, "range").a(this, dn.a(comparator));
        lE.a(nX.class, "rootReference").a(this, new og(null));
        of<Object> of2 = new of<Object>(null, 1);
        lE.a(nX.class, "header").a(this, of2);
        nX.b(of2, of2);
        lE.a(this, objectInputStream);
    }

    static /* synthetic */ of a(nX nX2) {
        return nX2.s();
    }

    static /* synthetic */ dn b(nX nX2) {
        return nX2.c;
    }

    static /* synthetic */ km a(nX nX2, of of2) {
        return nX2.b(of2);
    }

    static /* synthetic */ of c(nX nX2) {
        return nX2.d;
    }

    static /* synthetic */ of d(nX nX2) {
        return nX2.t();
    }

    static /* synthetic */ void a(of of2, of of3, of of4) {
        nX.b(of2, of3, of4);
    }

    static /* synthetic */ void a(of of2, of of3) {
        nX.b(of2, of3);
    }
}

