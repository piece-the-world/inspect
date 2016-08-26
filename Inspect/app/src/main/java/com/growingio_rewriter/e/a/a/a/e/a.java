/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.a.a.a.e;

import java.io.IOException;
import java.io.OutputStream;

public class a<T extends Appendable>
extends OutputStream {
    private final T a;

    public a(T t2) {
        this.a = t2;
    }

    @Override
    public void write(int n2) throws IOException {
        this.a.append((char)n2);
    }

    public T a() {
        return this.a;
    }
}

