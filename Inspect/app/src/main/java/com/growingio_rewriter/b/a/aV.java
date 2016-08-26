/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a;

import com.growingio.b.a.aP;
import com.growingio.b.a.aX;
import com.growingio.b.a.aY;
import com.growingio.b.a.l;

class aV
extends aX {
    aY b = new aY();

    aV(aP aP2) {
        super(aP2);
    }

    byte[] b() {
        this.a();
        return this.b.a();
    }

    @Override
    public void a() {
        int n2 = l.a(this.e, 0);
        this.b.a(n2);
        super.a();
    }

    @Override
    public int a(int n2, int n3, int n4) {
        this.b.a(n3);
        return super.a(n2, n3, n4);
    }

    @Override
    public int a(int n2, int n3, int n4, boolean bl2) {
        this.b.a(n4);
        return super.a(n2, n3, n4, bl2);
    }

    @Override
    public void a(int n2, byte by2) {
        this.b.a(by2, 0);
    }

    @Override
    public void a(int n2, int n3) {
        this.b.a(7, n3);
    }

    @Override
    public void b(int n2, int n3) {
        this.b.a(8, n3);
    }
}

