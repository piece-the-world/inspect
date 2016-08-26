/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.a;
import com.growingio.a.a.b.aQ;
import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.aq;
import com.growingio.a.a.b.bG;
import com.growingio.a.a.b.bn;
import java.io.Serializable;
import java.util.Set;

public abstract class aP<T>
implements Serializable {
    private static final long a = 0;

    public static <T> aP<T> f() {
        return a.a();
    }

    public static <T> aP<T> b(T t2) {
        return new bn<T>(aU.a(t2));
    }

    public static <T> aP<T> c(T t2) {
        return t2 == null ? aP.f() : new bn<T>(t2);
    }

    aP() {
    }

    public abstract boolean b();

    public abstract T c();

    public abstract T a(T var1);

    public abstract aP<T> a(aP<? extends T> var1);

    public abstract T a(bG<? extends T> var1);

    public abstract T d();

    public abstract Set<T> e();

    public abstract <V> aP<V> a(aq<? super T, V> var1);

    public abstract boolean equals(Object var1);

    public abstract int hashCode();

    public abstract String toString();

    public static <T> Iterable<T> a(Iterable<? extends aP<? extends T>> iterable) {
        aU.a(iterable);
        return new aQ(iterable);
    }
}

