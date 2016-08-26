/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.S;
import com.growingio.a.a.b.U;
import com.growingio.a.a.b.V;
import com.growingio.a.a.b.W;
import com.growingio.a.a.b.X;
import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.aq;

public abstract class R<A, B>
implements aq<A, B> {
    private final boolean a;
    private transient R<B, A> b;

    protected R() {
        this(true);
    }

    R(boolean bl2) {
        this.a = bl2;
    }

    protected abstract B b(A var1);

    protected abstract A a(B var1);

    public final B c(A a2) {
        return this.d(a2);
    }

    B d(A a2) {
        if (this.a) {
            return a2 == null ? null : (B)aU.a(this.b(a2));
        }
        return this.b(a2);
    }

    A e(B b2) {
        if (this.a) {
            return b2 == null ? null : (A)aU.a(this.a(b2));
        }
        return this.a(b2);
    }

    public Iterable<B> a(Iterable<? extends A> iterable) {
        aU.a(iterable, (Object)"fromIterable");
        return new S(this, iterable);
    }

    public R<B, A> a() {
        R r2 = this.b;
        R r3 = r2 == null ? (this.b = new X<A, B>(this)) : r2;
        return r3;
    }

    public final <C> R<A, C> a(R<B, C> r2) {
        return this.b(r2);
    }

    <C> R<A, C> b(R<B, C> r2) {
        return new U<A, B, C>(this, aU.a(r2));
    }

    @Override
    public final B f(A a2) {
        return this.c(a2);
    }

    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }

    public static <A, B> R<A, B> a(aq<? super A, ? extends B> aq2, aq<? super B, ? extends A> aq3) {
        return new V<A, B>(aq2, aq3, null);
    }

    public static <T> R<T, T> b() {
        return W.a;
    }
}

