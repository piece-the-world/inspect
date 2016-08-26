/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.j;

public final class ad
extends Enum<ad> {
    public static final /* enum */ ad a = new ad();
    private static final /* synthetic */ ad[] b;

    public static ad[] a() {
        return (ad[])b.clone();
    }

    public static ad a(String string) {
        return (ad)((Object)Enum.valueOf(ad.class, string));
    }

    private ad() {
        super(string, n2);
    }

    static {
        b = new ad[]{a};
    }
}

