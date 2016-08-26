/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.m;

import com.growingio.a.a.b.R;
import java.io.Serializable;

final class o
extends R<String, Float>
implements Serializable {
    static final o a = new o();
    private static final long b = 1;

    private o() {
    }

    @Override
    protected Float a(String string) {
        return Float.valueOf(string);
    }

    @Override
    protected String a(Float f2) {
        return f2.toString();
    }

    public String toString() {
        return "Floats.stringConverter()";
    }

    private Object c() {
        return a;
    }

    @Override
    protected /* synthetic */ Object b(Object object) {
        return this.a((String)object);
    }
}

