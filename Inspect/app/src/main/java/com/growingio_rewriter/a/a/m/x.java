/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.m;

import com.growingio.a.a.b.R;
import java.io.Serializable;

final class x
extends R<String, Long>
implements Serializable {
    static final x a = new x();
    private static final long b = 1;

    private x() {
    }

    @Override
    protected Long a(String string) {
        return Long.decode(string);
    }

    @Override
    protected String a(Long l2) {
        return l2.toString();
    }

    public String toString() {
        return "Longs.stringConverter()";
    }

    private Object c() {
        return a;
    }

    @Override
    protected /* synthetic */ Object b(Object object) {
        return this.a((String)object);
    }
}

