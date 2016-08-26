/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.a.a.a.e;

import java.io.IOException;
import java.io.OutputStream;

public class g
extends OutputStream {
    public static final g a = new g();

    @Override
    public void write(int n2) throws IOException {
        throw new IOException("write(" + n2 + ") failed: stream is closed");
    }
}

