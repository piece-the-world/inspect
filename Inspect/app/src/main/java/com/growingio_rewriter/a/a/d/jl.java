/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.jm;
import com.growingio.a.a.d.jn;
import com.growingio.a.a.d.jo;
import com.growingio.a.a.d.jp;
import com.growingio.a.a.d.jq;
import com.growingio.a.a.d.kO;
import com.growingio.a.a.k.f;
import java.util.AbstractQueue;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class jl<E>
extends AbstractQueue<E> {
    private final jl<E> b;
    private final jl<E> c;
    final int a;
    private Object[] d;
    private int e;
    private int f;
    private static final int g = 1431655765;
    private static final int h = -1431655766;
    private static final int i = 11;

    public static <E extends Comparable<E>> jl<E> a() {
        return new jn(kO.d(), null).a();
    }

    public static <E extends Comparable<E>> jl<E> a(Iterable<? extends E> iterable) {
        return new jn(kO.d(), null).a(iterable);
    }

    public static <B> jn<B> a(Comparator<B> comparator) {
        return new jn(comparator, null);
    }

    public static jn<Comparable> a(int n2) {
        return new jn(kO.d(), null).a(n2);
    }

    public static jn<Comparable> b(int n2) {
        return new jn(kO.d(), null).b(n2);
    }

    private jl(jn<? super E> jn2, int n2) {
        kO kO2 = jn.a(jn2);
        this.b = new jo(this, kO2);
        this.b.b = this.c = new jo(this, kO2.a());
        this.c.b = this.b;
        this.a = jn.b(jn2);
        this.d = new Object[n2];
    }

    @Override
    public int size() {
        return this.e;
    }

    @Override
    public boolean add(E e2) {
        this.offer(e2);
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends E> collection) {
        boolean bl2 = false;
        for (E e2 : collection) {
            this.offer(e2);
            bl2 = true;
        }
        return bl2;
    }

    @Override
    public boolean offer(E e2) {
        aU.a(e2);
        ++this.f;
        int n2 = this.e++;
        this.l();
        this.g(n2).a(n2, e2);
        return this.e <= this.a || this.e() != e2;
    }

    @Override
    public E poll() {
        return this.isEmpty() ? null : (E)this.f(0);
    }

    E c(int n2) {
        return (E)this.d[n2];
    }

    @Override
    public E peek() {
        return this.isEmpty() ? null : (E)this.c(0);
    }

    private int k() {
        switch (this.e) {
            case 1: {
                return 0;
            }
            case 2: {
                return 1;
            }
        }
        return this.c.a(1, 2) <= 0 ? 1 : 2;
    }

    public E b() {
        return this.poll();
    }

    public E c() {
        return this.remove();
    }

    public E d() {
        return this.peek();
    }

    public E e() {
        return this.isEmpty() ? null : (E)this.f(this.k());
    }

    public E f() {
        if (this.isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f(this.k());
    }

    public E g() {
        return this.isEmpty() ? null : (E)this.c(this.k());
    }

    jp<E> d(int n2) {
        aU.b(n2, this.e);
        ++this.f;
        --this.e;
        if (this.e == n2) {
            this.d[this.e] = null;
            return null;
        }
        E e2 = this.c(this.e);
        int n3 = this.g(this.e).a(e2);
        E e3 = this.c(this.e);
        this.d[this.e] = null;
        jp<E> jp2 = this.a(n2, e3);
        if (n3 < n2) {
            if (jp2 == null) {
                return new jp<E>(e2, e3);
            }
            return new jp<E>(e2, jp2.b);
        }
        return jp2;
    }

    private jp<E> a(int n2, E e2) {
        int n3;
        jo jo2 = this.g(n2);
        int n4 = jo2.b(n3 = jo2.c(n2), e2);
        if (n4 == n3) {
            return jo2.a(n2, n3, e2);
        }
        return n4 < n2 ? new jp<E>(e2, this.c(n2)) : null;
    }

    private E f(int n2) {
        E e2 = this.c(n2);
        this.d(n2);
        return e2;
    }

    private jl<E> g(int n2) {
        return jl.e(n2) ? this.b : this.c;
    }

    static boolean e(int n2) {
        int n3 = n2 + 1;
        aU.b(n3 > 0, "negative index");
        return (n3 & 1431655765) > (n3 & -1431655766);
    }

    boolean h() {
        for (int i2 = 1; i2 < this.e; ++i2) {
            if (jo.a(this.g(i2), i2)) continue;
            return false;
        }
        return true;
    }

    @Override
    public Iterator<E> iterator() {
        return new jq(this, null);
    }

    @Override
    public void clear() {
        for (int i2 = 0; i2 < this.e; ++i2) {
            this.d[i2] = null;
        }
        this.e = 0;
    }

    @Override
    public Object[] toArray() {
        Object[] arrobject = new Object[this.e];
        System.arraycopy(this.d, 0, arrobject, 0, this.e);
        return arrobject;
    }

    public Comparator<? super E> i() {
        return this.b.a;
    }

    int j() {
        return this.d.length;
    }

    static int a(int n2, int n3, Iterable<?> iterable) {
        int n4;
        int n5 = n4 = n2 == -1 ? 11 : n2;
        if (iterable instanceof Collection) {
            int n6 = ((Collection)iterable).size();
            n4 = Math.max(n4, n6);
        }
        return jl.a(n4, n3);
    }

    private void l() {
        if (this.e > this.d.length) {
            int n2 = this.m();
            Object[] arrobject = new Object[n2];
            System.arraycopy(this.d, 0, arrobject, 0, this.d.length);
            this.d = arrobject;
        }
    }

    private int m() {
        int n2 = this.d.length;
        int n3 = n2 < 64 ? (n2 + 1) * 2 : f.g(n2 / 2, 3);
        return jl.a(n3, this.a);
    }

    private static int a(int n2, int n3) {
        return Math.min(n2 - 1, n3) + 1;
    }

    /* synthetic */ jl(jn jn2, int n2, jm jm2) {
        this(jn2, n2);
    }

    static /* synthetic */ Object[] a(jl jl2) {
        return jl2.d;
    }

    static /* synthetic */ int b(jl jl2) {
        return jl2.e;
    }

    static /* synthetic */ int c(jl jl2) {
        return jl2.f;
    }
}

