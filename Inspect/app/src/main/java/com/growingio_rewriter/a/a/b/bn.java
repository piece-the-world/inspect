/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.aP;
import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.aq;
import com.growingio.a.a.b.bG;
import java.util.Collections;
import java.util.Set;

final class bn<T>
extends aP<T> {
    private final T a;
    private static final long b = 0;

    bn(T t2) {
        this.a = t2;
    }

    @Override
    public boolean b() {
        return true;
    }

    @Override
    public T c() {
        return this.a;
    }

    @Override
    public T a(T t2) {
        aU.a(t2, (Object)"use Optional.orNull() instead of Optional.or(null)");
        return this.a;
    }

    @Override
    public aP<T> a(aP<? extends T> aP2) {
        aU.a(aP2);
        return this;
    }

    @Override
    public T a(bG<? extends T> bG2) {
        aU.a(bG2);
        return this.a;
    }

    @Override
    public T d() {
        return this.a;
    }

    @Override
    public Set<T> e() {
        return Collections.singleton(this.a);
    }

    @Override
    public <V> aP<V> a(aq<? super T, V> aq2) {
        return new bn<V>(aU.a(aq2.f(this.a), (Object)"the Function passed to Optional.transform() must not return null."));
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof bn) {
            bn bn2 = (bn)object;
            return this.a.equals(bn2.a);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 1502476572 + this.a.hashCode();
    }

    @Override
    public String toString() {
        return "Optional.of(" + this.a + ")";
    }
}

