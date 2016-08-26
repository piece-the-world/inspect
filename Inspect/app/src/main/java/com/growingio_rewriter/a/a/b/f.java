/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.R;
import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.e;
import com.growingio.a.a.b.g;
import com.growingio.a.a.b.h;
import com.growingio.a.a.b.i;
import com.growingio.a.a.b.j;
import com.growingio.a.a.b.k;
import com.growingio.a.a.b.l;
import com.growingio.a.a.b.m;

public abstract class f
extends Enum<f> {
    public static final /* enum */ f a = new g("LOWER_HYPHEN", 0, m.a('-'), "-");
    public static final /* enum */ f b = new h("LOWER_UNDERSCORE", 1, m.a('_'), "_");
    public static final /* enum */ f c = new i("LOWER_CAMEL", 2, m.a('A', 'Z'), "");
    public static final /* enum */ f d = new j("UPPER_CAMEL", 3, m.a('A', 'Z'), "");
    public static final /* enum */ f e = new k("UPPER_UNDERSCORE", 4, m.a('_'), "_");
    private final m f;
    private final String g;
    private static final /* synthetic */ f[] h;

    public static f[] a() {
        return (f[])h.clone();
    }

    public static f a(String string) {
        return (f)((Object)Enum.valueOf(f.class, string));
    }

    private f(m m2, String string2) {
        super(string, n2);
        this.f = m2;
        this.g = string2;
    }

    public final String a(f f2, String string) {
        aU.a(f2);
        aU.a(string);
        return f2 == this ? string : this.b(f2, string);
    }

    String b(f f2, String string) {
        StringBuilder stringBuilder = null;
        int n2 = 0;
        int n3 = -1;
        do {
            ++n3;
            if ((n3 = this.f.a((CharSequence)string, n3)) == -1) break;
            if (n2 == 0) {
                stringBuilder = new StringBuilder(string.length() + 4 * this.g.length());
                stringBuilder.append(f2.d(string.substring(n2, n3)));
            } else {
                stringBuilder.append(f2.b(string.substring(n2, n3)));
            }
            stringBuilder.append(f2.g);
            n2 = n3 + this.g.length();
        } while (true);
        return n2 == 0 ? f2.d(string) : stringBuilder.append(f2.b(string.substring(n2))).toString();
    }

    public R<String, String> a(f f2) {
        return new l(this, f2);
    }

    abstract String b(String var1);

    private String d(String string) {
        return this == c ? e.a(string) : this.b(string);
    }

    private static String e(String string) {
        return string.isEmpty() ? string : new StringBuilder(string.length()).append(e.b(string.charAt(0))).append(e.a(string.substring(1))).toString();
    }

    /* synthetic */ f(String string, int n2, m m2, String string2, g g2) {
        this(m2, string2);
    }

    static /* synthetic */ String c(String string) {
        return f.e(string);
    }

    static {
        h = new f[]{a, b, c, d, e};
    }
}

