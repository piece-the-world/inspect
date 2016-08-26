/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.b.a;

import com.growingio.b.b.a.a;
import com.growingio.b.b.a.b;
import com.growingio.b.b.a.g;
import com.growingio.b.b.a.x;
import com.growingio.b.b.e;

public class m
extends g {
    public m(a a2, int n2, b b2) {
        super(a2, n2, b2);
    }

    public m(int n2, int n3, b b2) {
        super(n2, n3, b2);
    }

    @Override
    public String f() {
        return "instanceof:" + this.a + ":" + this.b;
    }

    @Override
    public void a(x x2) throws e {
        x2.a(this);
    }
}

