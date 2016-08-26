/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.c;

import com.growingio.a.a.c.bg;
import com.growingio.a.a.c.bk;

final class j
extends Enum<j>
implements bg<Object, Object> {
    public static final /* enum */ j a = new j();
    private static final /* synthetic */ j[] b;

    public static j[] a() {
        return (j[])b.clone();
    }

    public static j a(String string) {
        return (j)Enum.valueOf(j.class, string);
    }

    private j() {
        super(string, n2);
    }

    @Override
    public void a(bk<Object, Object> bk2) {
    }

    static {
        b = new j[]{a};
    }
}

