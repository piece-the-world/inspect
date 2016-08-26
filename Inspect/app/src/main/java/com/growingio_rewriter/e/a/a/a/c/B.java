/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.a.a.a.c;

import java.io.IOException;
import java.io.InputStream;

public class B
extends InputStream {
    private boolean a = false;
    private boolean b = false;
    private boolean c = false;
    private final InputStream d;
    private final boolean e;

    public B(InputStream inputStream, boolean bl2) {
        this.d = inputStream;
        this.e = bl2;
    }

    private int a() throws IOException {
        int n2 = this.d.read();
        boolean bl2 = this.c = n2 == -1;
        if (this.c) {
            return n2;
        }
        this.a = n2 == 10;
        this.b = n2 == 13;
        return n2;
    }

    @Override
    public int read() throws IOException {
        boolean bl2 = this.b;
        if (this.c) {
            return this.a(bl2);
        }
        int n2 = this.a();
        if (this.c) {
            return this.a(bl2);
        }
        if (this.b) {
            return 10;
        }
        if (bl2 && this.a) {
            return this.read();
        }
        return n2;
    }

    private int a(boolean bl2) {
        if (bl2 || !this.e) {
            return -1;
        }
        if (!this.a) {
            this.a = true;
            return 10;
        }
        return -1;
    }

    @Override
    public void close() throws IOException {
        super.close();
        this.d.close();
    }

    @Override
    public synchronized void mark(int n2) {
        throw new UnsupportedOperationException("Mark notsupported");
    }
}

