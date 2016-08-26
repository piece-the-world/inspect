/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.c;

import com.growingio.b.a.B;
import com.growingio.b.a.Q;
import com.growingio.b.a.y;
import com.growingio.b.b;
import com.growingio.b.c.j;
import com.growingio.b.o;

public final class g
extends j {
    private int a;
    private String b;
    private String c;
    private int d;
    private int e;
    private int di;

    public g(j j2, String string, String string2) {
        super(j2);
        this.b = string;
        this.c = string2;
    }

    @Override
    public void a(Q q2, y y2) {
        this.a = 0;
        this.di = 0;
        this.e = 0;
        this.d = 0;
    }

    @Override
    public int a(o o2, int n2, B b2, Q q2) throws b {
        int n3;
        int n4;
        int n5 = b2.c(n2);
        if (n5 == 187) {
            int n6 = b2.e(n2 + 1);
            if (q2.d(n6).equals(this.b)) {
                if (b2.c(n2 + 3) != 89) {
                    throw new b("NEW followed by no DUP was found");
                }
                if (this.d == 0) {
                    this.d = q2.a(this.c);
                }
                b2.b(this.d, n2 + 1);
                ++this.a;
            }
        } else if (n5 == 183 && (n4 = q2.a(this.b, n3 = b2.e(n2 + 1))) != 0 && this.a > 0) {
            int n7 = q2.q(n3);
            if (this.e != n7) {
                this.e = n7;
                this.di = q2.c(this.d, n7);
            }
            b2.b(this.di, n2 + 1);
            --this.a;
        }
        return n2;
    }
}

