/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.k;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.k.e;
import com.growingio.a.a.k.i;
import com.growingio.a.a.k.j;
import com.growingio.a.a.k.k;
import com.growingio.a.a.k.l;
import com.growingio.a.a.k.m;

public abstract class h {
    public static j a(double d2, double d3) {
        aU.a(e.c(d2) && e.c(d3));
        return new j(d2, d3, null);
    }

    public static h a(double d2) {
        aU.a(e.c(d2));
        return new m(d2);
    }

    public static h b(double d2) {
        aU.a(e.c(d2));
        double d3 = 0.0;
        return new l(d3, d2);
    }

    public static h a() {
        return k.a;
    }

    public abstract boolean b();

    public abstract boolean c();

    public abstract double d();

    public abstract double c(double var1);

    public abstract h e();
}

