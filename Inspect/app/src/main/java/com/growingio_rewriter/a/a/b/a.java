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

final class a<T>
extends aP<T> {
    static final a<Object> a = new a<T>();
    private static final long b = 0;

    static <T> aP<T> a() {
        return a;
    }

    private a() {
    }

    @Override
    public boolean b() {
        return false;
    }

    @Override
    public T c() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override
    public T a(T t2) {
        return aU.a(t2, (Object)"use Optional.orNull() instead of Optional.or(null)");
    }

    @Override
    public aP<T> a(aP<? extends T> aP2) {
        return aU.a(aP2);
    }

    @Override
    public T a(bG<? extends T> bG2) {
        return aU.a(bG2.a(), (Object)"use Optional.orNull() instead of a Supplier that returns null");
    }

    @Override
    public T d() {
        return null;
    }

    @Override
    public Set<T> e() {
        return Collections.emptySet();
    }

    @Override
    public <V> aP<V> a(aq<? super T, V> aq2) {
        aU.a(aq2);
        return aP.f();
    }

    @Override
    public boolean equals(Object object) {
        return object == this;
    }

    @Override
    public int hashCode() {
        return 2040732332;
    }

    @Override
    public String toString() {
        return "Optional.absent()";
    }

    private Object g() {
        return a;
    }
}

