/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.j;

import com.growingio.a.a.j.J;
import com.growingio.a.a.j.b;
import com.growingio.a.a.j.v;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

class d
extends v {
    final /* synthetic */ J a;
    final /* synthetic */ b b;

    d(b b2, J j2) {
        this.b = b2;
        this.a = j2;
    }

    @Override
    public InputStream a() throws IOException {
        return this.b.a(this.a.a());
    }
}

