/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a.c;

import com.growingio.b.a.c.h;
import com.growingio.b.a.c.k;
import com.growingio.b.a.c.l;
import com.growingio.b.a.c.m;
import com.growingio.b.a.c.o;
import com.growingio.b.a.i;
import com.growingio.b.ae;
import com.growingio.b.g;
import java.util.ArrayList;

public class j
extends com.growingio.b.a.c.i {
    private com.growingio.b.a.c.i a;

    private j(com.growingio.b.a.c.i i2) {
        this.a = i2;
    }

    public static h c(h h2) throws i {
        if (h2 instanceof k) {
            return ((k)h2).i();
        }
        if (h2 instanceof com.growingio.b.a.c.i) {
            return new j((com.growingio.b.a.c.i)h2);
        }
        if (h2 instanceof m && !h2.e()) {
            return new m(j.b(h2.g()));
        }
        throw new i("bad AASTORE: " + h2);
    }

    @Override
    public void b(h h2) {
        try {
            if (!h2.e()) {
                this.a.b(k.c(h2));
            }
        }
        catch (i var2_2) {
            throw new RuntimeException("fatal: " + var2_2);
        }
    }

    @Override
    public String g() {
        return j.b(this.a.g());
    }

    public com.growingio.b.a.c.i i() {
        return this.a;
    }

    @Override
    public l c() {
        return null;
    }

    @Override
    public boolean d() {
        return false;
    }

    private static String b(String string) {
        if (string.length() > 1 && string.charAt(0) == '[') {
            char c2 = string.charAt(1);
            if (c2 == 'L') {
                return string.substring(2, string.length() - 1).replace('/', '.');
            }
            if (c2 == '[') {
                return string.substring(1);
            }
        }
        return "java.lang.Object";
    }

    @Override
    public void a(String string, g g2) throws i {
        this.a.a(k.a(string), g2);
    }

    @Override
    protected o h() {
        return this.a.h();
    }

    @Override
    public int a(ArrayList arrayList, int n2, g g2) throws ae {
        return this.a.a(arrayList, n2, g2);
    }

    static /* synthetic */ String a(String string) {
        return j.b(string);
    }
}

