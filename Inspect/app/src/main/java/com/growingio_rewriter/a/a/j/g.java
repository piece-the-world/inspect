/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.j;

import java.io.IOException;
import java.io.Writer;

final class g
extends Writer {
    final /* synthetic */ Appendable a;
    final /* synthetic */ Writer b;

    g(Appendable appendable, Writer writer) {
        this.a = appendable;
        this.b = writer;
    }

    @Override
    public void write(int n2) throws IOException {
        this.a.append((char)n2);
    }

    @Override
    public void write(char[] arrc, int n2, int n3) throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override
    public void flush() throws IOException {
        this.b.flush();
    }

    @Override
    public void close() throws IOException {
        this.b.close();
    }
}

