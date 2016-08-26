/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a;

import com.growingio.b.a.aZ;
import com.growingio.b.a.bj;
import com.growingio.b.a.l;

class bd
extends bj {
    int a;
    int b;

    public bd(aZ aZ2, int n2, int n3) {
        super(aZ2);
        this.a = n2;
        this.b = n3;
    }

    @Override
    public void a(int n2, int n3, int n4) {
        if (n2 == 8 && this.a <= n3) {
            l.a(n3 + this.b, this.f, n4);
        }
    }
}

