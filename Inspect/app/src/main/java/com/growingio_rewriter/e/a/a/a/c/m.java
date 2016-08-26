/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.a.a.a.c;

import java.io.IOException;
import java.io.InputStream;

public class m
extends InputStream {
    private final InheritableThreadLocal<InputStream> a = new InheritableThreadLocal();

    public InputStream a(InputStream inputStream) {
        InputStream inputStream2 = this.a.get();
        this.a.set(inputStream);
        return inputStream2;
    }

    @Override
    public void close() throws IOException {
        InputStream inputStream = this.a.get();
        if (null != inputStream) {
            inputStream.close();
        }
    }

    @Override
    public int read() throws IOException {
        InputStream inputStream = this.a.get();
        if (null != inputStream) {
            return inputStream.read();
        }
        return -1;
    }
}

