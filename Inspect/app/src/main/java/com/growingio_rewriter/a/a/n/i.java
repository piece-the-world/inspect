/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.n;

import com.growingio.a.a.d.cN;
import com.growingio.a.a.d.ei;
import com.growingio.a.a.n.E;
import com.growingio.a.a.n.F;
import com.growingio.a.a.n.j;
import com.growingio.a.a.n.k;
import java.util.Map;

public final class i<B>
extends cN<F<? extends B>, B>
implements E<B> {
    private final ei<F<? extends B>, B> a;

    public static <B> i<B> b() {
        return new i(ei.i());
    }

    public static <B> k<B> c() {
        return new k(null);
    }

    private i(ei<F<? extends B>, B> ei2) {
        this.a = ei2;
    }

    @Override
    public <T extends B> T a(F<T> f2) {
        return this.b(f2.m());
    }

    @Override
    public <T extends B> T a(F<T> f2, T t2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public <T extends B> T a(Class<T> class_) {
        return this.b(F.a(class_));
    }

    @Override
    public <T extends B> T a(Class<T> class_, T t2) {
        throw new UnsupportedOperationException();
    }

    public B b(F<? extends B> f2, B b2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void putAll(Map<? extends F<? extends B>, ? extends B> map) {
        throw new UnsupportedOperationException();
    }

    @Override
    protected Map<F<? extends B>, B> a() {
        return this.a;
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

    /* synthetic */ i(ei ei2, j j2) {
        this(ei2);
    }
}

