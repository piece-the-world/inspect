/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a;

import com.growingio.b.a.aP;
import com.growingio.b.a.aX;
import com.growingio.b.a.l;

class aW
extends aX {
    private int a;
    private int b;

    public aW(aP aP2, int n2, int n3) {
        super(aP2);
        this.a = n2;
        this.b = n3;
    }

    @Override
    public int a(int n2, int n3, int n4) {
        if (this.a == n2 + n3) {
            l.a(n3 - this.b, this.e, n2 - 4);
        } else if (this.a == n2) {
            l.a(n3 + this.b, this.e, n2 - 4);
        }
        return super.a(n2, n3, n4);
    }
}

