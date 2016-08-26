/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.c.a;

public final class h
extends Enum<h> {
    public static final /* enum */ h a = new h();
    public static final /* enum */ h b = new h();
    private static final /* synthetic */ h[] c;

    public static h[] a() {
        return (h[])c.clone();
    }

    public static h a(String string) {
        return (h)((Object)Enum.valueOf(h.class, string));
    }

    private h() {
        super(string, n2);
    }

    static {
        c = new h[]{a, b};
    }
}

