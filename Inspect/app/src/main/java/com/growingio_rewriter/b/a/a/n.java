/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a.a;

import com.growingio.b.K;
import com.growingio.b.a.B;
import com.growingio.b.a.Q;
import com.growingio.b.a.T;
import com.growingio.b.a.a.a;
import com.growingio.b.a.a.m;
import com.growingio.b.a.a.v;
import com.growingio.b.a.ag;
import com.growingio.b.a.as;
import com.growingio.b.a.i;
import com.growingio.b.a.y;
import com.growingio.b.ad;
import com.growingio.b.ae;
import com.growingio.b.o;
import java.io.PrintStream;

public final class n {
    private final PrintStream a;

    public n(PrintStream printStream) {
        this.a = printStream;
    }

    public static void a(o o2, PrintStream printStream) {
        new n(printStream).a(o2);
    }

    public void a(o o2) {
        K[] arrk = o2.M();
        for (int i2 = 0; i2 < arrk.length; ++i2) {
            this.a(arrk[i2]);
        }
    }

    private String b(K k2) {
        try {
            return ad.t(k2.d()) + " " + k2.p().s() + " " + k2.q() + T.j(k2.k()) + ";";
        }
        catch (ae var2_2) {
            throw new RuntimeException(var2_2);
        }
    }

    public void a(K k2) {
        m[] arrm;
        this.a.println("\n" + this.b(k2));
        as as2 = k2.c();
        Q q2 = as2.c();
        y y2 = as2.j();
        if (y2 == null) {
            return;
        }
        try {
            arrm = new a().a(k2.r_(), as2);
        }
        catch (i var6_6) {
            throw new RuntimeException(var6_6);
        }
        int n2 = String.valueOf(y2.i()).length();
        B b2 = y2.k();
        while (b2.e()) {
            int n3;
            try {
                n3 = b2.f();
            }
            catch (i var9_11) {
                throw new RuntimeException(var9_11);
            }
            this.a.println("" + n3 + ": " + ag.a(b2, n3, q2));
            this.a(n2 + 3);
            m m2 = arrm[n3];
            if (m2 == null) {
                this.a.println("--DEAD CODE--");
                continue;
            }
            this.a(m2);
            this.a(n2 + 3);
            this.b(m2);
        }
    }

    private void a(m m2) {
        this.a.print("stack [");
        int n2 = m2.b();
        for (int i2 = 0; i2 <= n2; ++i2) {
            if (i2 > 0) {
                this.a.print(", ");
            }
            v v2 = m2.b(i2);
            this.a.print(v2);
        }
        this.a.println("]");
    }

    private void b(m m2) {
        this.a.print("locals [");
        int n2 = m2.c();
        for (int i2 = 0; i2 < n2; ++i2) {
            v v2;
            if (i2 > 0) {
                this.a.print(", ");
            }
            this.a.print((v2 = m2.a(i2)) == null ? "empty" : v2.toString());
        }
        this.a.println("]");
    }

    private void a(int n2) {
        while (n2-- > 0) {
            this.a.print(' ');
        }
    }
}

