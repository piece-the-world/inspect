/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.n;

import com.growingio.a.a.d.cx;
import com.growingio.a.a.d.ea;
import com.growingio.a.a.d.fg;
import com.growingio.a.a.n.F;
import com.growingio.a.a.n.G;
import com.growingio.a.a.n.P;
import com.growingio.a.a.n.V;
import com.growingio.a.a.n.Y;
import java.util.Collection;
import java.util.Set;

final class L
extends F<T> {
    private transient fg<F<? super T>> c;
    private static final long d = 0;
    final /* synthetic */ F a;

    private L(F f2) {
        this.a = f2;
        super(f2);
    }

    protected Set<F<? super T>> a() {
        fg<F<T>> fg2 = this.c;
        if (fg2 == null) {
            ea<F> ea2 = P.a.a().a(this.a);
            this.c = cx.a(ea2).a((V)V.a).i();
            return this.c;
        }
        return fg2;
    }

    public F<T> c() {
        return this;
    }

    @Override
    public Set<Class<? super T>> d() {
        ea ea2 = P.b.a().a(F.c(this.a));
        return fg.a(ea2);
    }

    public F<T> e() {
        throw new UnsupportedOperationException("classes().interfaces() not supported.");
    }

    private Object f() {
        return this.a.f().c();
    }

    protected /* synthetic */ Collection b() {
        return this.a();
    }

    protected /* synthetic */ Object g() {
        return this.a();
    }

    /* synthetic */ L(F f2, G g2) {
        this(f2);
    }
}

