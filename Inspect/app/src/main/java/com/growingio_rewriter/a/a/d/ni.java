/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.av;
import com.growingio.a.a.d.na;
import com.growingio.a.a.d.nb;
import com.growingio.a.a.d.no;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

class ni<K, V>
extends no<K, V>
implements av<K, V>,
Serializable {
    private transient Set<V> a;
    private transient av<V, K> b;
    private static final long f = 0;

    private ni(av<K, V> av2, Object object, av<V, K> av3) {
        super(av2, object);
        this.b = av3;
    }

    av<K, V> a() {
        return (av)super.d();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Set<V> o_() {
        Object object = this.h;
        synchronized (object) {
            if (this.a == null) {
                this.a = na.a(this.a().o_(), this.h);
            }
            return this.a;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public V a(K k2, V v2) {
        Object object = this.h;
        synchronized (object) {
            return this.a().a(k2, v2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public av<V, K> m_() {
        Object object = this.h;
        synchronized (object) {
            if (this.b == null) {
                this.b = new ni<K, V>(this.a().m_(), this.h, this);
            }
            return this.b;
        }
    }

    @Override
    public /* synthetic */ Collection values() {
        return this.o_();
    }

    @Override
    /* synthetic */ Map d() {
        return this.a();
    }

    @Override
    /* synthetic */ Object e() {
        return this.a();
    }

    /* synthetic */ ni(av av2, Object object, av av3, nb nb2) {
        this(av2, object, av3);
    }
}

