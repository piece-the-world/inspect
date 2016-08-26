/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.f;

import com.growingio.d.a.f.T;
import java.io.IOException;
import java.io.OutputStream;

final class Z
implements T {
    private final OutputStream a;

    Z(OutputStream outputStream) {
        this.a = outputStream;
    }

    @Override
    public OutputStream a(String string) throws IOException {
        return this.a;
    }

    @Override
    public void a() throws IOException {
        this.a.flush();
    }
}

