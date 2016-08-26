/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.h;

import com.growingio.a.a.h.y;
import java.io.Serializable;
import java.nio.charset.Charset;

class F
implements Serializable {
    private final String a;
    private static final long b = 0;

    F(Charset charset) {
        this.a = charset.name();
    }

    private Object a() {
        return y.a(Charset.forName(this.a));
    }
}

