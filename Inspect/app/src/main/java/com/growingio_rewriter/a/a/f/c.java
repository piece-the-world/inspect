/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.f;

import com.growingio.a.a.b.aH;
import com.growingio.a.a.b.aJ;
import com.growingio.a.a.b.aU;

public class c {
    private final Object a;
    private final Object b;

    public c(Object object, Object object2) {
        this.a = aU.a(object);
        this.b = aU.a(object2);
    }

    public Object a() {
        return this.a;
    }

    public Object b() {
        return this.b;
    }

    public String toString() {
        return aH.a(this).a("source", this.a).a("event", this.b).toString();
    }
}

