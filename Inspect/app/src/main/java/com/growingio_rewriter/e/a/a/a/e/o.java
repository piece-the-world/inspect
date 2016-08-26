/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.a.a.a.e;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class o
extends FilterOutputStream {
    public o(OutputStream outputStream) {
        super(outputStream);
    }

    @Override
    public void write(int n2) throws IOException {
        try {
            this.a(1);
            this.out.write(n2);
            this.b(1);
        }
        catch (IOException var2_2) {
            this.a(var2_2);
        }
    }

    @Override
    public void write(byte[] arrby) throws IOException {
        try {
            int n2 = arrby != null ? arrby.length : 0;
            this.a(n2);
            this.out.write(arrby);
            this.b(n2);
        }
        catch (IOException var2_3) {
            this.a(var2_3);
        }
    }

    @Override
    public void write(byte[] arrby, int n2, int n3) throws IOException {
        try {
            this.a(n3);
            this.out.write(arrby, n2, n3);
            this.b(n3);
        }
        catch (IOException var4_4) {
            this.a(var4_4);
        }
    }

    @Override
    public void flush() throws IOException {
        try {
            this.out.flush();
        }
        catch (IOException var1_1) {
            this.a(var1_1);
        }
    }

    @Override
    public void close() throws IOException {
        try {
            this.out.close();
        }
        catch (IOException var1_1) {
            this.a(var1_1);
        }
    }

    protected void a(int n2) throws IOException {
    }

    protected void b(int n2) throws IOException {
    }

    protected void a(IOException iOException) throws IOException {
        throw iOException;
    }
}

