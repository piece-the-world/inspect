/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

final class d
extends Enum<d> {
    public static final /* enum */ d a = new d();
    public static final /* enum */ d b = new d();
    public static final /* enum */ d c = new d();
    public static final /* enum */ d d = new d();
    private static final /* synthetic */ d[] e;

    public static d[] a() {
        return (d[])e.clone();
    }

    public static d a(String string) {
        return (d)((Object)Enum.valueOf(d.class, string));
    }

    private d() {
        super(string, n2);
    }

    static {
        e = new d[]{a, b, c, d};
    }
}

