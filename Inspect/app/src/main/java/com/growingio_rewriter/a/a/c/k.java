/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.c;

import com.growingio.a.a.c.bo;

final class k
extends Enum<k>
implements bo<Object, Object> {
    public static final /* enum */ k a = new k();
    private static final /* synthetic */ k[] b;

    public static k[] a() {
        return (k[])b.clone();
    }

    public static k a(String string) {
        return (k)Enum.valueOf(k.class, string);
    }

    private k() {
        super(string, n2);
    }

    @Override
    public int a(Object object, Object object2) {
        return 1;
    }

    static {
        b = new k[]{a};
    }
}

