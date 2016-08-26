/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a;

import com.growingio.d.a.d;
import com.growingio.d.a.e;
import com.growingio.d.a.g;
import com.growingio.d.a.p;

public class c {
    public final String a;
    byte[] b;
    c c;

    protected c(String string) {
        this.a = string;
    }

    public boolean a() {
        return true;
    }

    public boolean b() {
        return false;
    }

    protected p[] c() {
        return null;
    }

    protected c a(e e2, int n2, int n3, char[] arrc, int n4, p[] arrp) {
        c c2 = new c(this.a);
        c2.b = new byte[n3];
        System.arraycopy(e2.j, n2, c2.b, 0, n3);
        return c2;
    }

    protected d a(g g2, byte[] arrby, int n2, int n3, int n4) {
        d d2 = new d();
        d2.a = this.b;
        d2.b = this.b.length;
        return d2;
    }

    final int d() {
        int n2 = 0;
        c c2 = this;
        while (c2 != null) {
            ++n2;
            c2 = c2.c;
        }
        return n2;
    }

    final int b(g g2, byte[] arrby, int n2, int n3, int n4) {
        c c2 = this;
        int n5 = 0;
        while (c2 != null) {
            g2.a(c2.a);
            n5 += c2.a((g)g2, (byte[])arrby, (int)n2, (int)n3, (int)n4).b + 6;
            c2 = c2.c;
        }
        return n5;
    }

    final void a(g g2, byte[] arrby, int n2, int n3, int n4, d d2) {
        c c2 = this;
        while (c2 != null) {
            d d3 = c2.a(g2, arrby, n2, n3, n4);
            d2.b(g2.a(c2.a)).c(d3.b);
            d2.a(d3.a, 0, d3.b);
            c2 = c2.c;
        }
    }
}

