/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.g;

final class w
extends Enum<w> {
    public static final /* enum */ w a = new w();
    public static final /* enum */ w b = new w();
    private static final /* synthetic */ w[] c;

    public static w[] a() {
        return (w[])c.clone();
    }

    public static w a(String string) {
        return (w)((Object)Enum.valueOf(w.class, string));
    }

    private w() {
        super(string, n2);
    }

    static {
        c = new w[]{a, b};
    }
}

