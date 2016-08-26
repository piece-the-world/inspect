/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.aK;
import com.growingio.a.a.d.jl;
import com.growingio.a.a.d.jm;
import com.growingio.a.a.d.jp;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Queue;

class jq
implements Iterator<E> {
    private int b;
    private int c;
    private Queue<E> d;
    private List<E> e;
    private E f;
    private boolean g;
    final /* synthetic */ jl a;

    private jq(jl jl2) {
        this.a = jl2;
        this.b = -1;
        this.c = jl.c(this.a);
    }

    @Override
    public boolean hasNext() {
        this.a();
        return this.a(this.b + 1) < this.a.size() || this.d != null && !this.d.isEmpty();
    }

    @Override
    public E next() {
        this.a();
        int n2 = this.a(this.b + 1);
        if (n2 < this.a.size()) {
            this.b = n2;
            this.g = true;
            return this.a.c(this.b);
        }
        if (this.d != null) {
            this.b = this.a.size();
            this.f = this.d.poll();
            if (this.f != null) {
                this.g = true;
                return this.f;
            }
        }
        throw new NoSuchElementException("iterator moved past last element in queue.");
    }

    @Override
    public void remove() {
        aK.a(this.g);
        this.a();
        this.g = false;
        ++this.c;
        if (this.b < this.a.size()) {
            jp jp2 = this.a.d(this.b);
            if (jp2 != null) {
                if (this.d == null) {
                    this.d = new ArrayDeque();
                    this.e = new ArrayList(3);
                }
                this.d.add(jp2.a);
                this.e.add(jp2.b);
            }
            --this.b;
        } else {
            aU.b(this.a(this.f));
            this.f = null;
        }
    }

    private boolean a(Iterable<E> iterable, E e2) {
        for (E e3 : iterable) {
            if (e3 != e2) continue;
            return true;
        }
        return false;
    }

    boolean a(Object object) {
        for (int i2 = 0; i2 < jl.b(this.a); ++i2) {
            if (jl.a(this.a)[i2] != object) continue;
            this.a.d(i2);
            return true;
        }
        return false;
    }

    void a() {
        if (jl.c(this.a) != this.c) {
            throw new ConcurrentModificationException();
        }
    }

    private int a(int n2) {
        if (this.e != null) {
            while (n2 < this.a.size() && this.a(this.e, this.a.c(n2))) {
                ++n2;
            }
        }
        return n2;
    }

    /* synthetic */ jq(jl jl2, jm jm2) {
        this(jl2);
    }
}

