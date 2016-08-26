/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.c;

import com.growingio.b.a.B;
import com.growingio.b.a.Q;
import com.growingio.b.a.y;
import com.growingio.b.c.h;
import com.growingio.b.c.j;
import com.growingio.b.g;
import com.growingio.b.o;
import com.growingio.b.t;

public final class i
extends h {
    public i(j j2, t t2, String string, String string2) {
        super(j2, t2, string, string2);
    }

    @Override
    public int a(o o2, int n2, B b2, Q q2) throws com.growingio.b.a.i {
        int n3 = b2.c(n2);
        if (n3 == 181 || n3 == 179) {
            int n4 = b2.e(n2 + 1);
            String string = i.a(o2.a(), q2, this.b, this.a, this.c, n4);
            if (string != null) {
                if (n3 == 179) {
                    y y2 = b2.c();
                    b2.a(n2);
                    char c2 = string.charAt(0);
                    if (c2 == 'J' || c2 == 'D') {
                        n2 = b2.h(3);
                        b2.a(1, n2);
                        b2.a(91, n2 + 1);
                        b2.a(87, n2 + 2);
                        y2.a(y2.b() + 2);
                    } else {
                        n2 = b2.h(2);
                        b2.a(1, n2);
                        b2.a(95, n2 + 1);
                        y2.a(y2.b() + 1);
                    }
                    n2 = b2.f();
                }
                int n5 = q2.a(this.d);
                String string2 = "(Ljava/lang/Object;" + string + ")V";
                int n6 = q2.b(n5, this.e, string2);
                b2.a(184, n2);
                b2.b(n6, n2 + 1);
            }
        }
        return n2;
    }
}

