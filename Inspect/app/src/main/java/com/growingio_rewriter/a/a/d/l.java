/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

final class l
extends Enum<l> {
    public static final /* enum */ l a = new l();
    public static final /* enum */ l b = new l();
    public static final /* enum */ l c = new l();
    public static final /* enum */ l d = new l();
    private static final /* synthetic */ l[] e;

    public static l[] a() {
        return (l[])e.clone();
    }

    public static l a(String string) {
        return (l)((Object)Enum.valueOf(l.class, string));
    }

    private l() {
        super(string, n2);
    }

    static {
        e = new l[]{a, b, c, d};
    }
}

