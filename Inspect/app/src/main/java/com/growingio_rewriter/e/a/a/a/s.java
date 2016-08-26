/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.a.a.a;

import com.growingio.e.a.a.a.q;
import java.io.Serializable;

public final class s
extends Enum<s>
implements Serializable {
    public static final /* enum */ s a = new s("Sensitive", true);
    public static final /* enum */ s b = new s("Insensitive", false);
    public static final /* enum */ s c = new s("System", !q.a());
    private static final long d = -6343169151696340687L;
    private final String e;
    private final transient boolean f;
    private static final /* synthetic */ s[] g;

    public static s[] a() {
        return (s[])g.clone();
    }

    public static s a(String string) {
        return (s)Enum.valueOf(s.class, string);
    }

    public static s b(String string) {
        for (s s2 : s.a()) {
            if (!s2.b().equals(string)) continue;
            return s2;
        }
        throw new IllegalArgumentException("Invalid IOCase name: " + string);
    }

    private s(String string2, boolean bl2) {
        super(string, n2);
        this.e = string2;
        this.f = bl2;
    }

    private Object d() {
        return s.b(this.e);
    }

    public String b() {
        return this.e;
    }

    public boolean c() {
        return this.f;
    }

    public int a(String string, String string2) {
        if (string == null || string2 == null) {
            throw new NullPointerException("The strings must not be null");
        }
        return this.f ? string.compareTo(string2) : string.compareToIgnoreCase(string2);
    }

    public boolean b(String string, String string2) {
        if (string == null || string2 == null) {
            throw new NullPointerException("The strings must not be null");
        }
        return this.f ? string.equals(string2) : string.equalsIgnoreCase(string2);
    }

    public boolean c(String string, String string2) {
        return string.regionMatches(!this.f, 0, string2, 0, string2.length());
    }

    public boolean d(String string, String string2) {
        int n2 = string2.length();
        return string.regionMatches(!this.f, string.length() - n2, string2, 0, n2);
    }

    public int a(String string, int n2, String string2) {
        int n3 = string.length() - string2.length();
        if (n3 >= n2) {
            for (int i2 = n2; i2 <= n3; ++i2) {
                if (!this.b(string, i2, string2)) continue;
                return i2;
            }
        }
        return -1;
    }

    public boolean b(String string, int n2, String string2) {
        return string.regionMatches(!this.f, n2, string2, 0, string2.length());
    }

    public String toString() {
        return this.e;
    }

    static {
        g = new s[]{a, b, c};
    }
}

