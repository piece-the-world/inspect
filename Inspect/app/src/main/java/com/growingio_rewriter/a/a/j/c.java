/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.j;

import com.growingio.a.a.j.I;
import com.growingio.a.a.j.b;
import com.growingio.a.a.j.s;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;

class c
extends s {
    final /* synthetic */ I a;
    final /* synthetic */ b b;

    c(b b2, I i2) {
        this.b = b2;
        this.a = i2;
    }

    @Override
    public OutputStream a() throws IOException {
        return this.b.a(this.a.a());
    }
}

