/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.d.a;

final class b
extends Enum<b> {
    public static final /* enum */ b a = new b(':', ',');
    public static final /* enum */ b b = new b('!', '?');
    private final char c;
    private final char d;
    private static final /* synthetic */ b[] e;

    public static b[] a() {
        return (b[])e.clone();
    }

    public static b a(String string) {
        return (b)((Object)Enum.valueOf(b.class, string));
    }

    private b(char c2, char c3) {
        super(string, n2);
        this.c = c2;
        this.d = c3;
    }

    char b() {
        return this.d;
    }

    char c() {
        return this.c;
    }

    static b a(char c2) {
        for (b b2 : b.a()) {
            if (b2.c() != c2 && b2.b() != c2) continue;
            return b2;
        }
        throw new IllegalArgumentException("No enum corresponding to given code: " + c2);
    }

    static b a(boolean bl2) {
        return bl2 ? a : b;
    }

    static {
        e = new b[]{a, b};
    }
}

