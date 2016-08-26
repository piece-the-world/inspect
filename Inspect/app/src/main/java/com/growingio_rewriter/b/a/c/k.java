/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a.c;

import com.growingio.b.a.c.h;
import com.growingio.b.a.c.j;
import com.growingio.b.a.c.l;
import com.growingio.b.a.c.m;
import com.growingio.b.a.c.o;
import com.growingio.b.a.i;
import com.growingio.b.ae;
import com.growingio.b.g;
import java.util.ArrayList;

public class k
extends com.growingio.b.a.c.i {
    private com.growingio.b.a.c.i a;

    private k(com.growingio.b.a.c.i i2) {
        this.a = i2;
    }

    static h c(h h2) throws i {
        if (h2 instanceof j) {
            return ((j)h2).i();
        }
        if (h2 instanceof com.growingio.b.a.c.i) {
            return new k((com.growingio.b.a.c.i)h2);
        }
        if (h2 instanceof m && !h2.e()) {
            return new m(k.a(h2.g()));
        }
        throw new i("bad AASTORE: " + h2);
    }

    @Override
    public void b(h h2) {
        try {
            if (!h2.e()) {
                this.a.b(j.c(h2));
            }
        }
        catch (i var2_2) {
            throw new RuntimeException("fatal: " + var2_2);
        }
    }

    @Override
    public String g() {
        return k.a(this.a.g());
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

    public static String a(String string) {
        if (string.charAt(0) == '[') {
            return "[" + string;
        }
        return "[L" + string.replace('.', '/') + ";";
    }

    @Override
    public void a(String string, g g2) throws i {
        this.a.a(j.a(string), g2);
    }

    @Override
    protected o h() {
        return this.a.h();
    }

    @Override
    public int a(ArrayList arrayList, int n2, g g2) throws ae {
        return this.a.a(arrayList, n2, g2);
    }
}

