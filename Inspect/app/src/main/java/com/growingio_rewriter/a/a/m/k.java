/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.m;

import com.growingio.a.a.b.R;
import java.io.Serializable;

final class k
extends R<String, Double>
implements Serializable {
    static final k a = new k();
    private static final long b = 1;

    private k() {
    }

    @Override
    protected Double a(String string) {
        return Double.valueOf(string);
    }

    @Override
    protected String a(Double d2) {
        return d2.toString();
    }

    public String toString() {
        return "Doubles.stringConverter()";
    }

    private Object c() {
        return a;
    }

    @Override
    protected /* synthetic */ Object b(Object object) {
        return this.a((String)object);
    }
}

