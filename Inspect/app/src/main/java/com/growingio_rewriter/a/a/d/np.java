/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.jr;
import com.growingio.a.a.d.kl;
import com.growingio.a.a.d.na;
import com.growingio.a.a.d.nc;
import com.growingio.a.a.d.nt;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

class np<K, V>
extends nt
implements jr<K, V> {
    transient Set<K> a;
    transient Collection<V> b;
    transient Collection<Map.Entry<K, V>> c;
    transient Map<K, Collection<V>> d;
    transient kl<K> e;
    private static final long f = 0;

    jr<K, V> b() {
        return (jr)super.e();
    }

    np(jr<K, V> jr2, Object object) {
        super(jr2, object);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public int l_() {
        Object object = this.h;
        synchronized (object) {
            return this.b().l_();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean o() {
        Object object = this.h;
        synchronized (object) {
            return this.b().o();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean f(Object object) {
        Object object2 = this.h;
        synchronized (object2) {
            return this.b().f(object);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean g(Object object) {
        Object object2 = this.h;
        synchronized (object2) {
            return this.b().g(object);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean b(Object object, Object object2) {
        Object object3 = this.h;
        synchronized (object3) {
            return this.b().b(object, object2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Collection<V> c(K k2) {
        Object object = this.h;
        synchronized (object) {
            return na.a(this.b().c(k2), this.h);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean a(K k2, V v2) {
        Object object = this.h;
        synchronized (object) {
            return this.b().a(k2, v2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean c(K k2, Iterable<? extends V> iterable) {
        Object object = this.h;
        synchronized (object) {
            return this.b().c(k2, iterable);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean a(jr<? extends K, ? extends V> jr2) {
        Object object = this.h;
        synchronized (object) {
            return this.b().a(jr2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Collection<V> b(K k2, Iterable<? extends V> iterable) {
        Object object = this.h;
        synchronized (object) {
            return this.b().b(k2, iterable);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean c(Object object, Object object2) {
        Object object3 = this.h;
        synchronized (object3) {
            return this.b().c(object, object2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Collection<V> d(Object object) {
        Object object2 = this.h;
        synchronized (object2) {
            return this.b().d(object);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void h() {
        Object object = this.h;
        synchronized (object) {
            this.b().h();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Set<K> q() {
        Object object = this.h;
        synchronized (object) {
            if (this.a == null) {
                this.a = na.b(this.b().q(), this.h);
            }
            return this.a;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Collection<V> j() {
        Object object = this.h;
        synchronized (object) {
            if (this.b == null) {
                this.b = na.b(this.b().j(), this.h);
            }
            return this.b;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Collection<Map.Entry<K, V>> l() {
        Object object = this.h;
        synchronized (object) {
            if (this.c == null) {
                this.c = na.a(this.b().l(), this.h);
            }
            return this.c;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Map<K, Collection<V>> c() {
        Object object = this.h;
        synchronized (object) {
            if (this.d == null) {
                this.d = new nc<K, V>(this.b().c(), this.h);
            }
            return this.d;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public kl<K> r() {
        Object object = this.h;
        synchronized (object) {
            if (this.e == null) {
                this.e = na.a(this.b().r(), this.h);
            }
            return this.e;
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
            return this.b().equals(object);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public int hashCode() {
        Object object = this.h;
        synchronized (object) {
            return this.b().hashCode();
        }
    }

    @Override
    /* synthetic */ Object e() {
        return this.b();
    }
}

