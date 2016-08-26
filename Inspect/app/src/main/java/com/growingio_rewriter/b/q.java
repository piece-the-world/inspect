/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

class q
extends OutputStream {
    private FileOutputStream a = null;
    private String b;

    q(String string) {
        this.b = string;
    }

    private void a() throws IOException {
        if (this.a == null) {
            this.a = new FileOutputStream(this.b);
        }
    }

    @Override
    public void write(int n2) throws IOException {
        this.a();
        this.a.write(n2);
    }

    @Override
    public void write(byte[] arrby) throws IOException {
        this.a();
        this.a.write(arrby);
    }

    @Override
    public void write(byte[] arrby, int n2, int n3) throws IOException {
        this.a();
        this.a.write(arrby, n2, n3);
    }

    @Override
    public void flush() throws IOException {
        this.a();
        this.a.flush();
    }

    @Override
    public void close() throws IOException {
        this.a();
        this.a.close();
    }
}

