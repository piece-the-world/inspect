/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.c.a.b;

public final class g
extends Enum<g> {
    public static final /* enum */ g a = new g();
    public static final /* enum */ g b = new g();
    public static final /* enum */ g c = new g();
    public static final /* enum */ g d = new g();
    private static final /* synthetic */ g[] e;

    public static g[] a() {
        return (g[])e.clone();
    }

    public static g a(String string) {
        return (g)((Object)Enum.valueOf(g.class, string));
    }

    private g() {
        super(string, n2);
    }

    static {
        e = new g[]{a, b, c, d};
    }
}

