/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.b.a;

import com.growingio.b.b.a.v;
import com.growingio.b.b.a.x;
import com.growingio.b.b.e;
import com.growingio.b.t;

public class p
extends v {
    private t b = null;

    public p(String string) {
        super(string);
    }

    public void a(t t2) {
        this.b = t2;
    }

    public t c() {
        return this.b;
    }

    @Override
    public void a(x x2) throws e {
        x2.a(this);
    }
}

