/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a.a;

import com.growingio.b.a.B;
import com.growingio.b.a.Z;
import com.growingio.b.a.a.t;
import com.growingio.b.a.a.w;
import com.growingio.b.a.as;
import com.growingio.b.a.ay;
import com.growingio.b.a.i;
import com.growingio.b.a.y;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class u
implements ay {
    private t[] c;
    Map a = new HashMap();
    Set b = new HashSet();

    public t[] a(as as2) throws i {
        y y2 = as2.j();
        B b2 = y2.k();
        this.c = new t[y2.i()];
        this.a.clear();
        this.b.clear();
        this.a(0, b2, null);
        Z z2 = y2.l();
        for (int i2 = 0; i2 < z2.a(); ++i2) {
            int n2 = z2.c(i2);
            this.a(n2, b2, this.c[z2.a(i2)]);
        }
        return this.c;
    }

    private void a(int n2, B b2, t t2) throws i {
        boolean bl2;
        if (this.b.contains(new Integer(n2))) {
            return;
        }
        this.b.add(new Integer(n2));
        int n3 = b2.g();
        b2.a(n2);
        while (bl2 = this.b(n2 = b2.f(), b2, t2) && b2.e()) {
        }
        b2.a(n3);
    }

    private boolean b(int n2, B b2, t t2) throws i {
        this.c[n2] = t2;
        int n3 = b2.c(n2);
        if (n3 == 170) {
            this.d(n2, b2, t2);
            return false;
        }
        if (n3 == 171) {
            this.c(n2, b2, t2);
            return false;
        }
        if (w.d(n3) || n3 == 169 || n3 == 191) {
            return false;
        }
        if (w.a(n3)) {
            int n4 = w.a(n2, b2);
            if (n3 == 168 || n3 == 201) {
                t t3 = (t)this.a.get(new Integer(n4));
                if (t3 == null) {
                    t3 = new t(n4, n2);
                    this.a.put(new Integer(n4), t3);
                    this.a(n4, b2, t3);
                } else {
                    t3.a(n2);
                }
            } else {
                this.a(n4, b2, t2);
                if (w.b(n3)) {
                    return false;
                }
            }
        }
        return true;
    }

    private void c(int n2, B b2, t t2) throws i {
        int n3 = (n2 & -4) + 4;
        this.a(n2 + b2.g(n3), b2, t2);
        int n4 = b2.g(n3 += 4);
        int n5 = n4 * 8 + (n3 += 4);
        n3 += 4;
        while (n3 < n5) {
            int n6 = b2.g(n3) + n2;
            this.a(n6, b2, t2);
            n3 += 8;
        }
    }

    private void d(int n2, B b2, t t2) throws i {
        int n3 = (n2 & -4) + 4;
        this.a(n2 + b2.g(n3), b2, t2);
        int n4 = b2.g(n3 += 4);
        int n5 = b2.g(n3 += 4);
        int n6 = (n5 - n4 + 1) * 4 + (n3 += 4);
        while (n3 < n6) {
            int n7 = b2.g(n3) + n2;
            this.a(n7, b2, t2);
            n3 += 4;
        }
    }
}

