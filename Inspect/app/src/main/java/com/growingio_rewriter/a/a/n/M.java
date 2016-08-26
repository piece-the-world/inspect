/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.n;

import com.growingio.a.a.d.cx;
import com.growingio.a.a.d.ea;
import com.growingio.a.a.d.fg;
import com.growingio.a.a.n.F;
import com.growingio.a.a.n.N;
import com.growingio.a.a.n.P;
import com.growingio.a.a.n.V;
import com.growingio.a.a.n.Y;
import java.util.Collection;
import java.util.Set;

final class M
extends F<T> {
    private final transient F<T> c;
    private transient fg<F<? super T>> d;
    private static final long e = 0;
    final /* synthetic */ F a;

    M(F<T> var1_1) {
        this.a = var1_1;
        super(var1_1);
        this.c = f2;
    }

    protected Set<F<? super T>> a() {
        fg<F<T>> fg2 = this.d;
        if (fg2 == null) {
            this.d = cx.a(this.c).a((V)V.b).i();
            return this.d;
        }
        return fg2;
    }

    public F<T> e() {
        return this;
    }

    @Override
    public Set<Class<? super T>> d() {
        ea ea2 = P.b.a(F.c(this.a));
        return cx.a(ea2).a((N)new N(this)).i();
    }

    public F<T> c() {
        throw new UnsupportedOperationException("interfaces().classes() not supported.");
    }

    private Object f() {
        return this.a.f().e();
    }

    protected /* synthetic */ Collection b() {
        return this.a();
    }

    protected /* synthetic */ Object g() {
        return this.a();
    }
}

