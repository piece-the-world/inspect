/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.g;

final class p
extends Enum<p> {
    public static final /* enum */ p a = new p();
    public static final /* enum */ p b = new p();
    public static final /* enum */ p c = new p();
    private static final /* synthetic */ p[] d;

    public static p[] a() {
        return (p[])d.clone();
    }

    public static p a(String string) {
        return (p)((Object)Enum.valueOf(p.class, string));
    }

    private p() {
        super(string, n2);
    }

    static {
        d = new p[]{a, b, c};
    }
}

