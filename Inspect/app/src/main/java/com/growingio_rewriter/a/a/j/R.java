/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.j;

import com.growingio.a.a.b.aU;
import java.io.IOException;
import java.io.Writer;

final class R
extends Writer {
    private static final R a = new R();

    private R() {
    }

    @Override
    public void write(int n2) {
    }

    @Override
    public void write(char[] arrc) {
        aU.a(arrc);
    }

    @Override
    public void write(char[] arrc, int n2, int n3) {
        aU.a(n2, n2 + n3, arrc.length);
    }

    @Override
    public void write(String string) {
        aU.a(string);
    }

    @Override
    public void write(String string, int n2, int n3) {
        aU.a(n2, n2 + n3, string.length());
    }

    @Override
    public Writer append(CharSequence charSequence) {
        aU.a(charSequence);
        return this;
    }

    @Override
    public Writer append(CharSequence charSequence, int n2, int n3) {
        aU.a(n2, n3, charSequence.length());
        return this;
    }

    @Override
    public Writer append(char c2) {
        return this;
    }

    @Override
    public void flush() {
    }

    @Override
    public void close() {
    }

    public String toString() {
        return "CharStreams.nullWriter()";
    }

    static /* synthetic */ R a() {
        return a;
    }
}

