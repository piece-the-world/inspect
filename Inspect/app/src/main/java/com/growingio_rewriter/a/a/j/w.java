/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.j;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.j.J;
import com.growingio.a.a.j.v;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;

final class w
extends J {
    final Charset a;
    final /* synthetic */ v b;

    w(v v2, Charset charset) {
        this.b = v2;
        this.a = aU.a(charset);
    }

    @Override
    public v a(Charset charset) {
        if (charset.equals(this.a)) {
            return this.b;
        }
        return super.a(charset);
    }

    @Override
    public Reader a() throws IOException {
        return new InputStreamReader(this.b.a(), this.a);
    }

    public String toString() {
        return this.b.toString() + ".asCharSource(" + this.a + ")";
    }
}

