/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.a.a.a.e;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class d
extends FilterOutputStream {
    private static final int a = 4096;
    private final int b;

    public d(OutputStream outputStream, int n2) {
        super(outputStream);
        if (n2 <= 0) {
            throw new IllegalArgumentException();
        }
        this.b = n2;
    }

    public d(OutputStream outputStream) {
        this(outputStream, 4096);
    }

    @Override
    public void write(byte[] arrby, int n2, int n3) throws IOException {
        int n4 = n3;
        int n5 = n2;
        while (n4 > 0) {
            int n6 = Math.min(n4, this.b);
            this.out.write(arrby, n5, n6);
            n4 -= n6;
            n5 += n6;
        }
    }
}

