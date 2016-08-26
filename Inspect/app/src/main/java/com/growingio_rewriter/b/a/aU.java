/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a;

import com.growingio.b.a.aP;
import com.growingio.b.a.aX;
import com.growingio.b.a.l;

class aU
extends aX {
    private int a;
    private int b;
    private boolean c;

    public aU(aP aP2, int n2, int n3, boolean bl2) {
        super(aP2);
        this.a = n2;
        this.b = n3;
        this.c = bl2;
    }

    @Override
    public int a(int n2, int n3, int n4) {
        if (this.c ? this.a <= n3 : this.a < n3) {
            l.a(n3 + this.b, this.e, n2 - 4);
        }
        return super.a(n2, n3, n4);
    }

    @Override
    public void b(int n2, int n3) {
        if (this.a <= n3) {
            l.a(n3 + this.b, this.e, n2 + 1);
        }
    }
}

