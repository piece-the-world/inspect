/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.a.a.a.c;

import java.io.Reader;
import java.io.Serializable;

public class h
extends Reader
implements Serializable {
    private static final long a = 3724187752191401220L;
    private final CharSequence b;
    private int c;
    private int d;

    public h(CharSequence charSequence) {
        this.b = charSequence != null ? charSequence : "";
    }

    @Override
    public void close() {
        this.c = 0;
        this.d = 0;
    }

    @Override
    public void mark(int n2) {
        this.d = this.c;
    }

    @Override
    public boolean markSupported() {
        return true;
    }

    @Override
    public int read() {
        if (this.c >= this.b.length()) {
            return -1;
        }
        return this.b.charAt(this.c++);
    }

    @Override
    public int read(char[] arrc, int n2, int n3) {
        if (this.c >= this.b.length()) {
            return -1;
        }
        if (arrc == null) {
            throw new NullPointerException("Character array is missing");
        }
        if (n3 < 0 || n2 < 0 || n2 + n3 > arrc.length) {
            throw new IndexOutOfBoundsException("Array Size=" + arrc.length + ", offset=" + n2 + ", length=" + n3);
        }
        int n4 = 0;
        for (int i2 = 0; i2 < n3; ++i2) {
            int n5 = this.read();
            if (n5 == -1) {
                return n4;
            }
            arrc[n2 + i2] = (char)n5;
            ++n4;
        }
        return n4;
    }

    @Override
    public void reset() {
        this.c = this.d;
    }

    @Override
    public long skip(long l2) {
        if (l2 < 0) {
            throw new IllegalArgumentException("Number of characters to skip is less than zero: " + l2);
        }
        if (this.c >= this.b.length()) {
            return -1;
        }
        int n2 = (int)Math.min((long)this.b.length(), (long)this.c + l2);
        int n3 = n2 - this.c;
        this.c = n2;
        return n3;
    }

    public String toString() {
        return this.b.toString();
    }
}

