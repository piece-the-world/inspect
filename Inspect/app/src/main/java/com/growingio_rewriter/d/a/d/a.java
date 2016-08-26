/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.d;

import com.growingio.d.a.d.B;
import com.growingio.d.a.d.o;
import com.growingio.d.a.r;
import com.growingio.d.a.v;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class a {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    public static final int f = 5;
    public static final int g = 6;
    public static final int h = 7;
    public static final int i = 8;
    public static final int j = 9;
    public static final int k = 10;
    public static final int l = 11;
    public static final int m = 12;
    public static final int n = 13;
    public static final int o = 14;
    public static final int p = 15;
    protected int q;
    public List<B> r;
    public List<B> s;
    a t;
    a u;
    int v;

    protected a(int n2) {
        this.q = n2;
        this.v = -1;
    }

    public int a() {
        return this.q;
    }

    public abstract int b();

    public a c() {
        return this.t;
    }

    public a d() {
        return this.u;
    }

    public abstract void a(r var1);

    protected final void b(r r2) {
        B b2;
        int n2;
        int n3 = this.r == null ? 0 : this.r.size();
        for (n2 = 0; n2 < n3; ++n2) {
            b2 = this.r.get(n2);
            b2.a(r2.b(b2.h, b2.i, b2.a, true));
        }
        n3 = this.s == null ? 0 : this.s.size();
        for (n2 = 0; n2 < n3; ++n2) {
            b2 = this.s.get(n2);
            b2.a(r2.b(b2.h, b2.i, b2.a, false));
        }
    }

    public abstract a a(Map<o, o> var1);

    static o a(o o2, Map<o, o> map) {
        return map.get(o2);
    }

    static o[] a(List<o> list, Map<o, o> map) {
        o[] arro = new o[list.size()];
        for (int i2 = 0; i2 < arro.length; ++i2) {
            arro[i2] = map.get(list.get(i2));
        }
        return arro;
    }

    protected final a a(a a2) {
        B b2;
        B b3;
        int n2;
        if (a2.r != null) {
            this.r = new ArrayList<B>();
            for (n2 = 0; n2 < a2.r.size(); ++n2) {
                b3 = a2.r.get(n2);
                b2 = new B(b3.h, b3.i, b3.a);
                b3.a(b2);
                this.r.add(b2);
            }
        }
        if (a2.s != null) {
            this.s = new ArrayList<B>();
            for (n2 = 0; n2 < a2.s.size(); ++n2) {
                b3 = a2.s.get(n2);
                b2 = new B(b3.h, b3.i, b3.a);
                b3.a(b2);
                this.s.add(b2);
            }
        }
        return this;
    }
}

