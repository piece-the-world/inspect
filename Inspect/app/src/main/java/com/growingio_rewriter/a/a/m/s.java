/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.m;

import com.growingio.a.a.b.R;
import java.io.Serializable;

final class s
extends R<String, Integer>
implements Serializable {
    static final s a = new s();
    private static final long b = 1;

    private s() {
    }

    @Override
    protected Integer a(String string) {
        return Integer.decode(string);
    }

    @Override
    protected String a(Integer n2) {
        return n2.toString();
    }

    public String toString() {
        return "Ints.stringConverter()";
    }

    private Object c() {
        return a;
    }

    @Override
    protected /* synthetic */ Object b(Object object) {
        return this.a((String)object);
    }
}

