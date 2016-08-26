/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.c;

import com.growingio.b.a.B;
import com.growingio.b.a.Q;
import com.growingio.b.a.y;
import com.growingio.b.ad;
import com.growingio.b.c.h;
import com.growingio.b.c.j;
import com.growingio.b.g;
import com.growingio.b.o;
import com.growingio.b.t;

public final class e
extends j {
    private String a;
    private String b;
    private String c;
    private o d;
    private boolean e;
    private int di;
    private Q dj;

    public e(j j2, t t2, String string, String string2) {
        super(j2);
        this.d = t2.r_();
        this.c = t2.q();
        this.e = ad.b(t2.d());
        this.a = string;
        this.b = string2;
        this.dj = null;
    }

    @Override
    public void a(Q q2, y y2) {
        if (this.dj != q2) {
            this.di = 0;
        }
    }

    @Override
    public int a(o o2, int n2, B b2, Q q2) {
        int n3 = b2.c(n2);
        if (n3 == 180 || n3 == 178 || n3 == 181 || n3 == 179) {
            int n4 = b2.e(n2 + 1);
            String string = h.a(o2.a(), q2, this.d, this.c, this.e, n4);
            if (string != null) {
                if (this.di == 0) {
                    int n5 = q2.a(this.b, string);
                    this.di = q2.b(q2.a(this.a), n5);
                    this.dj = q2;
                }
                b2.b(this.di, n2 + 1);
            }
        }
        return n2;
    }
}

