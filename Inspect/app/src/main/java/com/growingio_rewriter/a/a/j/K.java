/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.j;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.j.J;
import com.growingio.a.a.j.aw;
import com.growingio.a.a.j.v;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.charset.Charset;

final class K
extends v {
    final Charset a;
    final /* synthetic */ J b;

    K(J j2, Charset charset) {
        this.b = j2;
        this.a = aU.a(charset);
    }

    @Override
    public J a(Charset charset) {
        if (charset.equals(this.a)) {
            return this.b;
        }
        return super.a(charset);
    }

    @Override
    public InputStream a() throws IOException {
        return new aw(this.b.a(), this.a, 8192);
    }

    public String toString() {
        return this.b.toString() + ".asByteSource(" + this.a + ")";
    }
}

