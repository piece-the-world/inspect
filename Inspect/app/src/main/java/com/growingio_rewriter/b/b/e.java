/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.b;

import com.growingio.b.ae;
import com.growingio.b.b;
import com.growingio.b.b.n;

public class e
extends Exception {
    private n a;
    private String b;

    public e(String string, n n2) {
        this.b = string;
        this.a = n2;
    }

    public e(String string) {
        this.b = string;
        this.a = null;
    }

    public e(b b2) {
        this(b2.a());
    }

    public e(ae ae2) {
        this("cannot find " + ae2.getMessage());
    }

    public n a() {
        return this.a;
    }

    @Override
    public String getMessage() {
        return this.b;
    }

    @Override
    public String toString() {
        return "compile error: " + this.b;
    }
}

