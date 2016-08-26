/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.m;

import com.growingio.a.a.m.f;
import java.util.Comparator;

final class h
extends Enum<h>
implements Comparator<char[]> {
    public static final /* enum */ h a = new h();
    private static final /* synthetic */ h[] b;

    public static h[] a() {
        return (h[])b.clone();
    }

    public static h a(String string) {
        return (h)Enum.valueOf(h.class, string);
    }

    private h() {
        super(string, n2);
    }

    public int a(char[] arrc, char[] arrc2) {
        int n2 = Math.min(arrc.length, arrc2.length);
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3 = f.a(arrc[i2], arrc2[i2]);
            if (n3 == 0) continue;
            return n3;
        }
        return arrc.length - arrc2.length;
    }

    public String toString() {
        return "Chars.lexicographicalComparator()";
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((char[])object, (char[])object2);
    }

    static {
        b = new h[]{a};
    }
}

