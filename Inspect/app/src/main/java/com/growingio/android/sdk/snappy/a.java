/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.android.sdk.snappy;

import com.growingio.android.sdk.snappy.b;
import com.growingio.android.sdk.snappy.c;
import com.growingio.android.sdk.snappy.e;
import com.growingio.android.sdk.snappy.h;
import java.io.IOException;
import java.io.OutputStream;

abstract class a
extends OutputStream {
    private final b a;
    private final int b;
    private final byte[] c;
    private final byte[] d;
    private final double e;
    private final OutputStream f;
    private int g;
    private boolean h;

    @Override
    public void write(int b2) {
        if (this.h) {
            throw new IOException("Stream is closed");
        }
        if (this.g >= this.b) {
            this.a();
        }
        this.c[this.g++] = (byte)b2;
    }

    @Override
    public void write(byte[] input, int offset, int length) {
        h.a((Object)input, "input is null", new Object[0]);
        h.a(offset, offset + length, input.length);
        if (this.h) {
            throw new IOException("Stream is closed");
        }
        int n2 = this.b - this.g;
        if (n2 >= length) {
            this.b(input, offset, length);
            return;
        }
        if (this.g > 0) {
            this.b(input, offset, n2);
            this.a();
            offset += n2;
            length -= n2;
        }
        while (length >= this.b) {
            this.c(input, offset, this.b);
            offset += this.b;
            length -= this.b;
        }
        this.b(input, offset, length);
    }

    @Override
    public final void flush() {
        if (this.h) {
            throw new IOException("Stream is closed");
        }
        this.a();
        this.f.flush();
    }

    @Override
    public final void close() {
        if (this.h) {
            return;
        }
        try {
            this.flush();
            this.f.close();
        }
        finally {
            this.h = true;
            this.a.b(this.d);
            this.a.a(this.c);
        }
    }

    private void b(byte[] arrby, int n2, int n3) {
        System.arraycopy(arrby, n2, this.c, this.g, n3);
        this.g += n3;
    }

    private void a() {
        if (this.g > 0) {
            this.c(this.c, 0, this.g);
            this.g = 0;
        }
    }

    private void c(byte[] arrby, int n2, int n3) {
        int n4 = this.a(arrby, n2, n3);
        int n5 = e.a(arrby, n2, n3, this.d, 0);
        if ((double)n5 / (double)n3 <= this.e) {
            this.a(this.f, this.d, 0, n5, true, n4);
        } else {
            this.a(this.f, arrby, n2, n3, false, n4);
        }
    }

    protected int a(byte[] arrby, int n2, int n3) {
        return c.a(arrby, n2, n3);
    }

    protected abstract void a(OutputStream var1, byte[] var2, int var3, int var4, boolean var5, int var6);
}

