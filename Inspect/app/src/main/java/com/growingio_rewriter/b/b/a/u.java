/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.b.a;

import com.growingio.b.b.a.b;
import com.growingio.b.b.a.x;
import com.growingio.b.b.e;

public class u
extends b {
    protected String a;

    public u(String string) {
        this.a = string;
    }

    public String c() {
        return this.a;
    }

    @Override
    public String toString() {
        return "\"" + this.a + "\"";
    }

    @Override
    public void a(x x2) throws e {
        x2.a(this);
    }
}

