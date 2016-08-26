/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.kl;
import com.growingio.a.a.d.km;
import com.growingio.a.a.d.na;
import com.growingio.a.a.d.nb;
import com.growingio.a.a.d.nj;
import java.util.Collection;
import java.util.Set;

class nq<E>
extends nj<E>
implements kl<E> {
    transient Set<E> a;
    transient Set<km<E>> b;
    private static final long c = 0;

    nq(kl<E> kl2, Object object) {
        super(kl2, object, null);
    }

    kl<E> c() {
        return (kl)super.b();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public int a(Object object) {
        Object object2 = this.h;
        synchronized (object2) {
            return this.c().a(object);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public int a(E e2, int n2) {
        Object object = this.h;
        synchronized (object) {
            return this.c().a(e2, n2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public int b(Object object, int n2) {
        Object object2 = this.h;
        synchronized (object2) {
            return this.c().b(object, n2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public int c(E e2, int n2) {
        Object object = this.h;
        synchronized (object) {
            return this.c().c(e2, n2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean a(E e2, int n2, int n3) {
        Object object = this.h;
        synchronized (object) {
            return this.c().a(e2, n2, n3);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Set<E> d() {
        Object object = this.h;
        synchronized (object) {
            if (this.a == null) {
                this.a = na.b(this.c().d(), this.h);
            }
            return this.a;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Set<km<E>> a() {
        Object object = this.h;
        synchronized (object) {
            if (this.b == null) {
                this.b = na.b(this.c().a(), this.h);
            }
            return this.b;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        Object object2 = this.h;
        synchronized (object2) {
            return this.c().equals(object);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public int hashCode() {
        Object object = this.h;
        synchronized (object) {
            return this.c().hashCode();
        }
    }

    @Override
    /* synthetic */ Collection b() {
        return this.c();
    }

    @Override
    /* synthetic */ Object e() {
        return this.c();
    }
}

