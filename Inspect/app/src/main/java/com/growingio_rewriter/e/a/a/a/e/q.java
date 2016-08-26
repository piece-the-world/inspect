/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.a.a.a.e;

import java.io.IOException;
import java.io.Serializable;
import java.io.Writer;

public class q
extends Writer
implements Serializable {
    private static final long a = -146927496096066153L;
    private final StringBuilder b;

    public q() {
        this.b = new StringBuilder();
    }

    public q(int n2) {
        this.b = new StringBuilder(n2);
    }

    public q(StringBuilder stringBuilder) {
        this.b = stringBuilder != null ? stringBuilder : new StringBuilder();
    }

    @Override
    public Writer append(char c2) {
        this.b.append(c2);
        return this;
    }

    @Override
    public Writer append(CharSequence charSequence) {
        this.b.append(charSequence);
        return this;
    }

    @Override
    public Writer append(CharSequence charSequence, int n2, int n3) {
        this.b.append(charSequence, n2, n3);
        return this;
    }

    @Override
    public void close() {
    }

    @Override
    public void flush() {
    }

    @Override
    public void write(String string) {
        if (string != null) {
            this.b.append(string);
        }
    }

    @Override
    public void write(char[] arrc, int n2, int n3) {
        if (arrc != null) {
            this.b.append(arrc, n2, n3);
        }
    }

    public StringBuilder a() {
        return this.b;
    }

    public String toString() {
        return this.b.toString();
    }
}

