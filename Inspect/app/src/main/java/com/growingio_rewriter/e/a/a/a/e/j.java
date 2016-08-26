/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.a.a.a.e;

import java.io.IOException;
import java.io.OutputStream;

public class j
extends OutputStream {
    private final InheritableThreadLocal<OutputStream> a = new InheritableThreadLocal();

    public OutputStream a(OutputStream outputStream) {
        OutputStream outputStream2 = this.a.get();
        this.a.set(outputStream);
        return outputStream2;
    }

    @Override
    public void close() throws IOException {
        OutputStream outputStream = this.a.get();
        if (null != outputStream) {
            outputStream.close();
        }
    }

    @Override
    public void flush() throws IOException {
        OutputStream outputStream = this.a.get();
        if (null != outputStream) {
            outputStream.flush();
        }
    }

    @Override
    public void write(int n2) throws IOException {
        OutputStream outputStream = this.a.get();
        if (null != outputStream) {
            outputStream.write(n2);
        }
    }
}

