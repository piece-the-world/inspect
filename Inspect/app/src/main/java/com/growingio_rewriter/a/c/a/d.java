/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.c.a;

public final class d
extends Enum<d> {
    public static final /* enum */ d a = new d();
    public static final /* enum */ d b = new d();
    private static final /* synthetic */ d[] c;

    public static d[] a() {
        return (d[])c.clone();
    }

    public static d a(String string) {
        return (d)((Object)Enum.valueOf(d.class, string));
    }

    private d() {
        super(string, n2);
    }

    static {
        c = new d[]{a, b};
    }
}

