/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.a.a.a.e;

import java.io.FilterWriter;
import java.io.IOException;
import java.io.Writer;

public class e
extends FilterWriter {
    private static final int a = 4096;
    private final int b;

    public e(Writer writer, int n2) {
        super(writer);
        if (n2 <= 0) {
            throw new IllegalArgumentException();
        }
        this.b = n2;
    }

    public e(Writer writer) {
        this(writer, 4096);
    }

    @Override
    public void write(char[] arrc, int n2, int n3) throws IOException {
        int n4 = n3;
        int n5 = n2;
        while (n4 > 0) {
            int n6 = Math.min(n4, this.b);
            this.out.write(arrc, n5, n6);
            n4 -= n6;
            n5 += n6;
        }
    }
}

