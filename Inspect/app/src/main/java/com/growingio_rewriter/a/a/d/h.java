/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.a;
import com.growingio.a.a.d.b;
import com.growingio.a.a.d.dd;
import com.growingio.a.a.d.ii;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class h
extends dd<V> {
    final Set<V> a;
    final /* synthetic */ a b;

    private h(a a2) {
        this.b = a2;
        this.a = this.b.a.keySet();
    }

    @Override
    protected Set<V> a() {
        return this.a;
    }

    @Override
    public Iterator<V> iterator() {
        return ii.b(this.b.entrySet().iterator());
    }

    @Override
    public Object[] toArray() {
        return this.r();
    }

    @Override
    public <T> T[] toArray(T[] arrT) {
        return this.a(arrT);
    }

    @Override
    public String toString() {
        return this.p();
    }

    @Override
    protected /* synthetic */ Collection b() {
        return this.a();
    }

    @Override
    protected /* synthetic */ Object g() {
        return this.a();
    }

    /* synthetic */ h(a a2, b b2) {
        this(a2);
    }
}

