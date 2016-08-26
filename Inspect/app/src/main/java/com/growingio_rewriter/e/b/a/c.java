/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.b.a;

public final class c
extends Enum<c> {
    public static final /* enum */ c a = new c(40, "ERROR");
    public static final /* enum */ c b = new c(30, "WARN");
    public static final /* enum */ c c = new c(20, "INFO");
    public static final /* enum */ c d = new c(10, "DEBUG");
    public static final /* enum */ c e = new c(0, "TRACE");
    private int f;
    private String g;
    private static final /* synthetic */ c[] h;

    public static c[] a() {
        return (c[])h.clone();
    }

    public static c a(String string) {
        return (c)((Object)Enum.valueOf(c.class, string));
    }

    private c(int n3, String string2) {
        super(string, n2);
        this.f = n3;
        this.g = string2;
    }

    public int b() {
        return this.f;
    }

    public String toString() {
        return this.g;
    }

    static {
        h = new c[]{a, b, c, d, e};
    }
}

