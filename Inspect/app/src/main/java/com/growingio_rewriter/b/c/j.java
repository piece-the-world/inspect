/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.c;

import com.growingio.b.a.B;
import com.growingio.b.a.Q;
import com.growingio.b.a.as;
import com.growingio.b.a.ay;
import com.growingio.b.a.i;
import com.growingio.b.a.y;
import com.growingio.b.b;
import com.growingio.b.o;

public abstract class j
implements ay {
    private j a;

    public j(j j2) {
        this.a = j2;
    }

    public j c() {
        return this.a;
    }

    public void a(Q q2, y y2) {
    }

    public void a(Q q2, o o2, as as2) throws b {
        this.a(q2, as2.j());
    }

    public void a() {
    }

    public abstract int a(o var1, int var2, B var3, Q var4) throws b, i;

    public int b() {
        return 0;
    }

    public int d() {
        return 0;
    }
}

