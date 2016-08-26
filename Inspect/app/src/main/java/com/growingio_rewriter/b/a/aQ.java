/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a;

import com.growingio.b.a.Q;
import com.growingio.b.a.aP;
import com.growingio.b.a.aX;
import com.growingio.b.a.l;
import java.util.Map;

class aQ
extends aX {
    byte[] a;
    Q b;
    Q c;
    Map d;

    aQ(aP aP2, Q q2, Map map) {
        super(aP2);
        this.b = aP2.d();
        this.a = new byte[this.e.length];
        this.c = q2;
        this.d = map;
    }

    @Override
    public void a() {
        int n2 = l.a(this.e, 0);
        l.a(n2, this.a, 0);
        super.a();
    }

    @Override
    public int a(int n2, int n3, int n4) {
        l.a(n3, this.a, n2 - 4);
        return super.a(n2, n3, n4);
    }

    @Override
    public int a(int n2, int n3, int n4, boolean bl2) {
        l.a(n4, this.a, n2 - 2);
        return super.a(n2, n3, n4, bl2);
    }

    @Override
    public void a(int n2, byte by2) {
        this.a[n2] = by2;
    }

    @Override
    public void a(int n2, int n3) {
        this.a[n2] = 7;
        int n4 = this.b.a(n3, this.c, this.d);
        l.a(n4, this.a, n2 + 1);
    }

    @Override
    public void b(int n2, int n3) {
        this.a[n2] = 8;
        l.a(n3, this.a, n2 + 1);
    }

    public aP b() {
        return new aP(this.c, this.a);
    }
}

