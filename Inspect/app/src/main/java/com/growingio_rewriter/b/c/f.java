/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.c;

import com.growingio.b.a.B;
import com.growingio.b.a.Q;
import com.growingio.b.a.T;
import com.growingio.b.a.aP;
import com.growingio.b.a.aZ;
import com.growingio.b.a.h;
import com.growingio.b.a.y;
import com.growingio.b.b;
import com.growingio.b.c.j;
import com.growingio.b.o;

public final class f
extends j {
    private int a;
    private String b;
    private String c;
    private String d;

    public f(j j2, String string, String string2, String string3) {
        super(j2);
        this.b = string;
        this.c = string2;
        this.d = string3;
    }

    @Override
    public void a(Q q2, y y2) {
        this.a = 0;
    }

    @Override
    public int a(o o2, int n2, B b2, Q q2) throws b {
        int n3;
        int n4;
        int n5 = b2.c(n2);
        if (n5 == 187) {
            int n6 = b2.e(n2 + 1);
            if (q2.d(n6).equals(this.b)) {
                aP aP2;
                if (b2.c(n2 + 3) != 89) {
                    throw new b("NEW followed by no DUP was found");
                }
                b2.a(0, n2);
                b2.a(0, n2 + 1);
                b2.a(0, n2 + 2);
                b2.a(0, n2 + 3);
                ++this.a;
                aZ aZ2 = (aZ)b2.c().a("StackMapTable");
                if (aZ2 != null) {
                    aZ2.a(n2);
                }
                if ((aP2 = (aP)b2.c().a("StackMap")) != null) {
                    aP2.a(n2);
                }
            }
        } else if (n5 == 183 && (n4 = q2.a(this.b, n3 = b2.e(n2 + 1))) != 0 && this.a > 0) {
            int n7 = this.a(n4, q2);
            b2.a(184, n2);
            b2.b(n7, n2 + 1);
            --this.a;
        }
        return n2;
    }

    private int a(int n2, Q q2) {
        int n3 = q2.a(this.c);
        int n4 = q2.c(this.d);
        n2 = q2.c(T.c(this.b, q2.E(n2)));
        return q2.c(n3, q2.a(n4, n2));
    }
}

