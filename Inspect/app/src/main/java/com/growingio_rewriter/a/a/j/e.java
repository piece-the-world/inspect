/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.j;

import com.growingio.a.a.b.m;
import java.io.IOException;
import java.io.Reader;

final class e
extends Reader {
    final /* synthetic */ Reader a;
    final /* synthetic */ m b;

    e(Reader reader, m m2) {
        this.a = reader;
        this.b = m2;
    }

    @Override
    public int read() throws IOException {
        int n2;
        while ((n2 = this.a.read()) != -1 && this.b.c((char)n2)) {
        }
        return n2;
    }

    @Override
    public int read(char[] arrc, int n2, int n3) throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override
    public void close() throws IOException {
        this.a.close();
    }
}

