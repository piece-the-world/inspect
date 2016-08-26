/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.b.b;

import com.growingio.e.b.c;
import com.growingio.e.b.d;
import java.io.ObjectStreamException;
import java.io.Serializable;

abstract class k
implements c,
Serializable {
    private static final long b = 7535258609338176893L;
    protected String c;

    k() {
    }

    @Override
    public String a() {
        return this.c;
    }

    protected Object g() throws ObjectStreamException {
        return d.a(this.a());
    }
}

