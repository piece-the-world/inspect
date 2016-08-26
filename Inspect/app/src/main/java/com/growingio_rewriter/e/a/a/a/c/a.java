/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.a.a.a.c;

import com.growingio.e.a.a.a.c.k;
import com.growingio.e.a.a.a.c.p;
import java.io.IOException;
import java.io.InputStream;

public class a
extends p {
    public a(InputStream inputStream) {
        super(inputStream);
    }

    @Override
    public void close() throws IOException {
        this.in.close();
        this.in = new k();
    }

    @Override
    protected void a(int n2) throws IOException {
        if (n2 == -1) {
            this.close();
        }
    }

    protected void finalize() throws Throwable {
        this.close();
        super.finalize();
    }
}

