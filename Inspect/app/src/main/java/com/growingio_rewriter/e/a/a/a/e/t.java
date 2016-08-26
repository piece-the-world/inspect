/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.a.a.a.e;

import java.io.IOException;
import java.io.OutputStream;

public abstract class t
extends OutputStream {
    private final int a;
    private long b;
    private boolean c;

    public t(int n2) {
        this.a = n2;
    }

    @Override
    public void write(int n2) throws IOException {
        this.a(1);
        this.a().write(n2);
        ++this.b;
    }

    @Override
    public void write(byte[] arrby) throws IOException {
        this.a(arrby.length);
        this.a().write(arrby);
        this.b += (long)arrby.length;
    }

    @Override
    public void write(byte[] arrby, int n2, int n3) throws IOException {
        this.a(n3);
        this.a().write(arrby, n2, n3);
        this.b += (long)n3;
    }

    @Override
    public void flush() throws IOException {
        this.a().flush();
    }

    @Override
    public void close() throws IOException {
        try {
            this.flush();
        }
        catch (IOException var1_1) {
            // empty catch block
        }
        this.a().close();
    }

    public int f() {
        return this.a;
    }

    public long g() {
        return this.b;
    }

    public boolean h() {
        return this.b > (long)this.a;
    }

    protected void a(int n2) throws IOException {
        if (!this.c && this.b + (long)n2 > (long)this.a) {
            this.c = true;
            this.b();
        }
    }

    protected void i() {
        this.c = false;
        this.b = 0;
    }

    protected void a(long l2) {
        this.b = l2;
    }

    protected abstract OutputStream a() throws IOException;

    protected abstract void b() throws IOException;
}

