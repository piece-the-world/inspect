/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a.c;

import com.growingio.b.a.Q;
import com.growingio.b.a.c.h;

public abstract class i
extends h {
    public abstract void b(h var1);

    @Override
    public int a() {
        return 7;
    }

    @Override
    public int a(Q q2) {
        return q2.a(this.g());
    }

    @Override
    public boolean a(h h2) {
        return this.g().equals(h2.g());
    }
}

