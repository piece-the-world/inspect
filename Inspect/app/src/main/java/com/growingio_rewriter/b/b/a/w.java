/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.b.a;

import com.growingio.b.b.a.i;
import com.growingio.b.b.a.v;
import com.growingio.b.b.a.x;
import com.growingio.b.b.e;

public class w
extends v {
    protected i b;

    public w(String string, i i2) {
        super(string);
        this.b = i2;
    }

    public i c() {
        return this.b;
    }

    @Override
    public String toString() {
        return this.a + ":" + this.b.g();
    }

    @Override
    public void a(x x2) throws e {
        x2.a(this);
    }
}

