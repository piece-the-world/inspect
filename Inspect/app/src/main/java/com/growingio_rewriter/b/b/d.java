/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.b;

import com.growingio.b.a.o;
import com.growingio.b.b.b;

public abstract class d {
    d c;

    protected abstract boolean a(o var1, int var2);

    protected d(b b2) {
        this.c = b2.dn;
        b2.dn = this;
    }

    protected void a(b b2) {
        b2.dn = this.c;
    }
}

