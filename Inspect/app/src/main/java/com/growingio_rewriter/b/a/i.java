/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a;

import com.growingio.b.a.Q;
import com.growingio.b.a.as;

public class i
extends Exception {
    public i(int n2) {
        super("bytecode " + n2);
    }

    public i(String string) {
        super(string);
    }

    public i(String string, Throwable throwable) {
        super(string, throwable);
    }

    public i(as as2, Throwable throwable) {
        super(as2.toString() + " in " + as2.c().c() + ": " + throwable.getMessage(), throwable);
    }
}

