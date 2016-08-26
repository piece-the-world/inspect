/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.n;

import com.growingio.a.a.d.cx;
import com.growingio.a.a.d.dd;
import com.growingio.a.a.d.ea;
import com.growingio.a.a.d.fg;
import com.growingio.a.a.n.F;
import com.growingio.a.a.n.G;
import com.growingio.a.a.n.L;
import com.growingio.a.a.n.M;
import com.growingio.a.a.n.P;
import com.growingio.a.a.n.V;
import java.io.Serializable;
import java.util.Collection;
import java.util.Set;

public class Y
extends dd<F<? super T>>
implements Serializable {
    private transient fg<F<? super T>> a;
    private static final long c = 0;
    final /* synthetic */ F b;

    Y(F f2) {
        this.b = f2;
    }

    public F<T> e() {
        return new M(this.b, this);
    }

    public F<T> c() {
        return new L(this.b, null);
    }

    @Override
    protected Set<F<? super T>> a() {
        fg<F<T>> fg2 = this.a;
        if (fg2 == null) {
            ea<F> ea2 = P.a.a(this.b);
            this.a = cx.a(ea2).a((V)V.a).i();
            return this.a;
        }
        return fg2;
    }

    public Set<Class<? super T>> d() {
        ea ea2 = P.b.a(F.c(this.b));
        return fg.a(ea2);
    }

    @Override
    protected /* synthetic */ Collection b() {
        return this.a();
    }

    @Override
    protected /* synthetic */ Object g() {
        return this.a();
    }
}

