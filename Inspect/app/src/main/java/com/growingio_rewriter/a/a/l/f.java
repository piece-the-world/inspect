/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.l;

import com.growingio.a.a.b.aC;
import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.bp;
import com.growingio.a.a.b.e;
import com.growingio.a.a.b.m;
import com.growingio.a.a.d.ea;
import com.growingio.a.a.d.ei;
import com.growingio.a.d.a.a;
import com.growingio.a.d.a.b;
import java.util.List;

public final class f {
    private static final m a = m.a(".\u3002\uff0e\uff61");
    private static final bp b = bp.a('.');
    private static final aC c = aC.a('.');
    private static final int d = -1;
    private static final String e = "\\.";
    private static final int f = 127;
    private static final int g = 253;
    private static final int h = 63;
    private final String i;
    private final ea<String> j;
    private final int k;
    private static final m l = m.a("-_");
    private static final m m = m.i().b(l);

    f(String string) {
        string = e.a(a.a((CharSequence)string, '.'));
        if (string.endsWith(".")) {
            string = string.substring(0, string.length() - 1);
        }
        aU.a(string.length() <= 253, "Domain name too long: '%s':", (Object)string);
        this.i = string;
        this.j = ea.a(b.a(string));
        aU.a(this.j.size() <= 127, "Domain has too many parts: '%s'", (Object)string);
        aU.a(f.a(this.j), "Not a valid domain name: '%s'", (Object)string);
        this.k = this.j();
    }

    private int j() {
        int n2 = this.j.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            String string = c.a(this.j.a(i2, n2));
            if (a.a.containsKey(string)) {
                return i2;
            }
            if (a.c.containsKey(string)) {
                return i2 + 1;
            }
            if (!f.d(string)) continue;
            return i2;
        }
        return -1;
    }

    public static f a(String string) {
        return new f(aU.a(string));
    }

    private static boolean a(List<String> list) {
        int n2 = list.size() - 1;
        if (!f.a(list.get(n2), true)) {
            return false;
        }
        for (int i2 = 0; i2 < n2; ++i2) {
            String string = list.get(i2);
            if (f.a(string, false)) continue;
            return false;
        }
        return true;
    }

    private static boolean a(String string, boolean bl2) {
        if (string.length() < 1 || string.length() > 63) {
            return false;
        }
        String string2 = m.e().j(string);
        if (!m.d(string2)) {
            return false;
        }
        if (l.c(string.charAt(0)) || l.c(string.charAt(string.length() - 1))) {
            return false;
        }
        if (bl2 && m.f().c(string.charAt(0))) {
            return false;
        }
        return true;
    }

    public ea<String> a() {
        return this.j;
    }

    public boolean b() {
        return this.k == 0;
    }

    public boolean c() {
        return this.k != -1;
    }

    public f d() {
        return this.c() ? this.a(this.k) : null;
    }

    public boolean e() {
        return this.k > 0;
    }

    public boolean f() {
        return this.k == 1;
    }

    public f g() {
        if (this.f()) {
            return this;
        }
        aU.b(this.e(), "Not under a public suffix: %s", (Object)this.i);
        return this.a(this.k - 1);
    }

    public boolean h() {
        return this.j.size() > 1;
    }

    public f i() {
        aU.b(this.h(), "Domain '%s' has no parent", (Object)this.i);
        return this.a(1);
    }

    private f a(int n2) {
        return f.a(c.a(this.j.a(n2, this.j.size())));
    }

    public f b(String string) {
        return f.a(aU.a(string) + "." + this.i);
    }

    public static boolean c(String string) {
        try {
            f.a(string);
            return true;
        }
        catch (IllegalArgumentException var1_1) {
            return false;
        }
    }

    private static boolean d(String string) {
        String[] arrstring = string.split("\\.", 2);
        return arrstring.length == 2 && a.b.containsKey(arrstring[1]);
    }

    public String toString() {
        return this.i;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof f) {
            f f2 = (f)object;
            return this.i.equals(f2.i);
        }
        return false;
    }

    public int hashCode() {
        return this.i.hashCode();
    }
}

