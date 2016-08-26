/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.b;

import com.growingio.e.b.e;
import com.growingio.e.b.f;
import java.io.Closeable;

public class g
implements Closeable {
    private final String a;

    private g(String string) {
        this.a = string;
    }

    @Override
    public void close() {
        e.b(this.a);
    }

    /* synthetic */ g(String string, f f2) {
        this(string);
    }
}

