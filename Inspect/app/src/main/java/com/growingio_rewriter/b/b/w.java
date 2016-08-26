/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.b;

import com.growingio.b.b.a.i;
import java.util.HashMap;

public final class w
extends HashMap {
    private w a;

    public w() {
        this(null);
    }

    public w(w w2) {
        this.a = w2;
    }

    public w a() {
        return this.a;
    }

    public i a(String string) {
        i i2 = (i)this.get(string);
        if (i2 == null && this.a != null) {
            return this.a.a(string);
        }
        return i2;
    }

    public void a(String string, i i2) {
        this.put(string, i2);
    }
}

