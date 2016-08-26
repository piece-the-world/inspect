/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.j;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.j.I;
import com.growingio.a.a.j.s;
import com.growingio.a.a.j.t;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;

final class u
extends I {
    private final Charset b;
    final /* synthetic */ s a;

    private u(s s2, Charset charset) {
        this.a = s2;
        this.b = aU.a(charset);
    }

    @Override
    public Writer a() throws IOException {
        return new OutputStreamWriter(this.a.a(), this.b);
    }

    public String toString() {
        return this.a.toString() + ".asCharSink(" + this.b + ")";
    }

    /* synthetic */ u(s s2, Charset charset, t t2) {
        this(s2, charset);
    }
}

