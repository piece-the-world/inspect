/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.dc;
import com.growingio.a.a.d.kU;
import java.io.Serializable;
import java.util.Collection;
import java.util.Queue;

public final class ca<E>
extends dc<E>
implements Serializable {
    private final Queue<E> b;
    final int a;
    private static final long c = 0;

    private ca(int n2) {
        aU.a(n2 >= 0, "maxSize (%s) must >= 0", n2);
        this.b = kU.a(n2);
        this.a = n2;
    }

    public static <E> ca<E> a(int n2) {
        return new ca<E>(n2);
    }

    public int a() {
        return this.a - this.size();
    }

    @Override
    protected Queue<E> c() {
        return this.b;
    }

    @Override
    public boolean offer(E e2) {
        return this.add(e2);
    }

    @Override
    public boolean add(E e2) {
        aU.a(e2);
        if (this.a == 0) {
            return true;
        }
        if (this.size() == this.a) {
            this.b.remove();
        }
        this.b.add(e2);
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends E> collection) {
        return this.b(collection);
    }

    @Override
    public boolean contains(Object object) {
        return this.c().contains(aU.a(object));
    }

    @Override
    public boolean remove(Object object) {
        return this.c().remove(aU.a(object));
    }

    @Override
    protected /* synthetic */ Collection b() {
        return this.c();
    }

    @Override
    protected /* synthetic */ Object g() {
        return this.c();
    }
}

