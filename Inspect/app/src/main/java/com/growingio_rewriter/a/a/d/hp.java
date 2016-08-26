/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.av;
import com.growingio.a.a.d.hA;
import com.growingio.a.a.d.hg;
import com.growingio.a.a.d.hu;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

class hp<K, V>
extends hu<K, V>
implements av<K, V> {
    volatile av<V, K> a;

    hp(av<K, V> av2, av<V, K> av3, hg<? super K, ? super V> hg2) {
        super(av2, hg2);
        this.a = av3;
    }

    protected av<K, V> d() {
        return (av)super.a();
    }

    @Override
    public V a(K k2, V v2) {
        this.b.a(k2, v2);
        return this.d().a(k2, v2);
    }

    @Override
    public av<V, K> m_() {
        if (this.a == null) {
            this.a = new hp<K, V>(this.d().m_(), this, new hA(this.b));
        }
        return this.a;
    }

    @Override
    public Set<V> o_() {
        return this.d().o_();
    }

    @Override
    protected /* synthetic */ Map a() {
        return this.d();
    }

    @Override
    public /* synthetic */ Collection values() {
        return this.o_();
    }

    @Override
    protected /* synthetic */ Object g() {
        return this.d();
    }
}

