/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.e;

import com.growingio.a.a.b.aq;
import com.growingio.a.a.e.h;

public abstract class g {
    private final aq<String, String> a;

    protected g() {
        this.a = new h(this);
    }

    public abstract String a(String var1);

    public final aq<String, String> a() {
        return this.a;
    }
}

