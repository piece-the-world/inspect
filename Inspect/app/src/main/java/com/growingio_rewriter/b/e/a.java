/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.e;

import com.growingio.b.e.b;

public class a
extends ThreadLocal {
    protected synchronized Object initialValue() {
        return new b();
    }

    public void a() {
        ((b)this.get()).b();
    }

    public void b() {
        ((b)this.get()).c();
    }

    public int c() {
        return ((b)this.get()).a();
    }
}

