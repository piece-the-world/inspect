/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.h;

import com.growingio.a.a.h.aC;
import com.growingio.a.a.h.x;

final class z
extends Enum<z>
implements x<byte[]> {
    public static final /* enum */ z a = new z();
    private static final /* synthetic */ z[] b;

    public static z[] a() {
        return (z[])b.clone();
    }

    public static z a(String string) {
        return (z)Enum.valueOf(z.class, string);
    }

    private z() {
        super(string, n2);
    }

    @Override
    public void a(byte[] arrby, aC aC2) {
        aC2.c(arrby);
    }

    public String toString() {
        return "Funnels.byteArrayFunnel()";
    }

    static {
        b = new z[]{a};
    }
}

