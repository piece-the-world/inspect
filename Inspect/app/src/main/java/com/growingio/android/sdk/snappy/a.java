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
    public void write(int n2) {
        if (this.h) {
            throw new IOException("Stream is closed");
        }
        if (this.g >= this.b) {
            this.a();
        }
        this.c[this.g++] = (byte)n2;
    }

    @Override
    public void write(byte[] arrby, int n2, int n3) {
        h.a((Object)arrby, "input is null", new Object[0]);
        h.a(n2, n2 + n3, arrby.length);
        if (this.h) {
            throw new IOException("Stream is closed");
        }
        int n4 = this.b - this.g;
        if (n4 >= n3) {
            this.b(arrby, n2, n3);
            return;
        }
        if (this.g > 0) {
            this.b(arrby, n2, n4);
            this.a();
            n2 += n4;
            n3 -= n4;
        }
        while (n3 >= this.b) {
            this.c(arrby, n2, this.b);
            n2 += this.b;
            n3 -= this.b;
        }
        this.b(arrby, n2, n3);
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

