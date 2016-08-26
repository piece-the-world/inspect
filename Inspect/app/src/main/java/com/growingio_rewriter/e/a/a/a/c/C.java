/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.a.a.a.c;

import java.io.IOException;
import java.io.InputStream;

public class C
extends InputStream {
    private boolean a = false;
    private boolean b = false;
    private boolean c = false;
    private boolean d = false;
    private final InputStream e;
    private final boolean f;

    public C(InputStream inputStream, boolean bl2) {
        this.e = inputStream;
        this.f = bl2;
    }

    private int a() throws IOException {
        int n2 = this.e.read();
        boolean bl2 = this.d = n2 == -1;
        if (this.d) {
            return n2;
        }
        this.a = n2 == 13;
        this.b = n2 == 10;
        return n2;
    }

    @Override
    public int read() throws IOException {
        if (this.d) {
            return this.b();
        }
        if (this.c) {
            this.c = false;
            return 10;
        }
        boolean bl2 = this.a;
        int n2 = this.a();
        if (this.d) {
            return this.b();
        }
        if (n2 == 10 && !bl2) {
            this.c = true;
            return 13;
        }
        return n2;
    }

    private int b() {
        if (!this.f) {
            return -1;
        }
        if (!this.b && !this.a) {
            this.a = true;
            return 13;
        }
        if (!this.b) {
            this.a = false;
            this.b = true;
            return 10;
        }
        return -1;
    }

    @Override
    public void close() throws IOException {
        super.close();
        this.e.close();
    }

    @Override
    public synchronized void mark(int n2) {
        throw new UnsupportedOperationException("Mark not supported");
    }
}

