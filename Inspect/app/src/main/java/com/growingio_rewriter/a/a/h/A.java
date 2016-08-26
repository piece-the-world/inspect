/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.h;

import com.growingio.a.a.h.aC;
import com.growingio.a.a.h.x;

final class A
extends Enum<A>
implements x<Integer> {
    public static final /* enum */ A a = new A();
    private static final /* synthetic */ A[] b;

    public static A[] a() {
        return (A[])b.clone();
    }

    public static A a(String string) {
        return (A)Enum.valueOf(A.class, string);
    }

    private A() {
        super(string, n2);
    }

    @Override
    public void a(Integer n2, aC aC2) {
        aC2.b(n2);
    }

    public String toString() {
        return "Funnels.integerFunnel()";
    }

    static {
        b = new A[]{a};
    }
}

