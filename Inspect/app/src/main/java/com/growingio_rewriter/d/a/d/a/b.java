/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.d.a;

import com.growingio.d.a.d.a;
import com.growingio.d.a.d.a.m;

public class b
extends Exception {
    public final a a;

    public b(a a2, String string) {
        super(string);
        this.a = a2;
    }

    public b(a a2, String string, Throwable throwable) {
        super(string, throwable);
        this.a = a2;
    }

    public b(a a2, String string, Object object, m m2) {
        super((string == null ? "Expected " : new StringBuilder().append(string).append(": expected ").toString()) + object + ", but found " + m2);
        this.a = a2;
    }
}

