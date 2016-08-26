/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.m;

import com.growingio.a.a.b.R;
import java.io.Serializable;

final class D
extends R<String, Short>
implements Serializable {
    static final D a = new D();
    private static final long b = 1;

    private D() {
    }

    @Override
    protected Short a(String string) {
        return Short.decode(string);
    }

    @Override
    protected String a(Short s2) {
        return s2.toString();
    }

    public String toString() {
        return "Shorts.stringConverter()";
    }

    private Object c() {
        return a;
    }

    @Override
    protected /* synthetic */ Object b(Object object) {
        return this.a((String)object);
    }
}

