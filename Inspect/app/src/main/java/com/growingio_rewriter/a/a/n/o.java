/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.n;

import com.growingio.a.a.d.cN;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.n.E;
import com.growingio.a.a.n.F;
import com.growingio.a.a.n.q;
import java.util.Map;
import java.util.Set;

public final class o<B>
extends cN<F<? extends B>, B>
implements E<B> {
    private final Map<F<? extends B>, B> a = ii.c();

    @Override
    public <T extends B> T a(Class<T> class_) {
        return this.b(F.a(class_));
    }

    @Override
    public <T extends B> T a(Class<T> class_, T t2) {
        return this.c(F.a(class_), t2);
    }

    @Override
    public <T extends B> T a(F<T> f2) {
        return this.b(f2.m());
    }

    @Override
    public <T extends B> T a(F<T> f2, T t2) {
        return this.c(f2.m(), t2);
    }

    public B b(F<? extends B> f2, B b2) {
        throw new UnsupportedOperationException("Please use putInstance() instead.");
    }

    @Override
    public void putAll(Map<? extends F<? extends B>, ? extends B> map) {
        throw new UnsupportedOperationException("Please use putInstance() instead.");
    }

    @Override
    public Set<Map.Entry<F<? extends B>, B>> entrySet() {
        return q.a(super.entrySet());
    }

    @Override
    protected Map<F<? extends B>, B> a() {
        return this.a;
    }

    private <T extends B> T c(F<T> f2, T t2) {
        return (T)this.a.put(f2, t2);
    }

    private <T extends B> T b(F<T> f2) {
        return (T)this.a.get(f2);
    }

    @Override
    public /* synthetic */ Object put(Object object, Object object2) {
        return this.b((F)object, object2);
    }

    @Override
    protected /* synthetic */ Object g() {
        return this.a();
    }
}

