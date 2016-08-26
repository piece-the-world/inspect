/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.j;

import com.growingio.a.a.b.aU;
import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;

final class H
extends Reader {
    private CharSequence a;
    private int b;
    private int c;

    public H(CharSequence charSequence) {
        this.a = aU.a(charSequence);
    }

    private void a() throws IOException {
        if (this.a == null) {
            throw new IOException("reader closed");
        }
    }

    private boolean b() {
        return this.c() > 0;
    }

    private int c() {
        return this.a.length() - this.b;
    }

    @Override
    public synchronized int read(CharBuffer charBuffer) throws IOException {
        aU.a(charBuffer);
        this.a();
        if (!this.b()) {
            return -1;
        }
        int n2 = Math.min(charBuffer.remaining(), this.c());
        for (int i2 = 0; i2 < n2; ++i2) {
            charBuffer.put(this.a.charAt(this.b++));
        }
        return n2;
    }

    @Override
    public synchronized int read() throws IOException {
        this.a();
        int n2 = this.b() ? (int)this.a.charAt(this.b++) : -1;
        return n2;
    }

    @Override
    public synchronized int read(char[] arrc, int n2, int n3) throws IOException {
        aU.a(n2, n2 + n3, arrc.length);
        this.a();
        if (!this.b()) {
            return -1;
        }
        int n4 = Math.min(n3, this.c());
        for (int i2 = 0; i2 < n4; ++i2) {
            arrc[n2 + i2] = this.a.charAt(this.b++);
        }
        return n4;
    }

    @Override
    public synchronized long skip(long l2) throws IOException {
        aU.a(l2 >= 0, "n (%s) may not be negative", l2);
        this.a();
        int n2 = (int)Math.min((long)this.c(), l2);
        this.b += n2;
        return n2;
    }

    @Override
    public synchronized boolean ready() throws IOException {
        this.a();
        return true;
    }

    @Override
    public boolean markSupported() {
        return true;
    }

    @Override
    public synchronized void mark(int n2) throws IOException {
        aU.a(n2 >= 0, "readAheadLimit (%s) may not be negative", n2);
        this.a();
        this.c = this.b;
    }

    @Override
    public synchronized void reset() throws IOException {
        this.a();
        this.b = this.c;
    }

    @Override
    public synchronized void close() throws IOException {
        this.a = null;
    }
}

