/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.h;

import com.growingio.a.a.h.aC;
import com.growingio.a.a.h.x;

final class B
extends Enum<B>
implements x<Long> {
    public static final /* enum */ B a = new B();
    private static final /* synthetic */ B[] b;

    public static B[] a() {
        return (B[])b.clone();
    }

    public static B a(String string) {
        return (B)Enum.valueOf(B.class, string);
    }

    private B() {
        super(string, n2);
    }

    @Override
    public void a(Long l2, aC aC2) {
        aC2.b(l2);
    }

    public String toString() {
        return "Funnels.longFunnel()";
    }

    static {
        b = new B[]{a};
    }
}

