/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.b.a;

import com.growingio.b.b.a.b;
import com.growingio.b.b.a.x;
import com.growingio.b.b.e;

public class o
extends b {
    protected int a;

    public o(int n2) {
        this.a = n2;
    }

    public int c() {
        return this.a;
    }

    @Override
    public String toString() {
        return "id:" + this.a;
    }

    @Override
    public void a(x x2) throws e {
        x2.a(this);
    }
}

