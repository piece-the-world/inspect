/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.a.a.a.e;

import com.growingio.e.a.a.a.e.g;
import com.growingio.e.a.a.a.e.o;
import java.io.OutputStream;

public class f
extends o {
    public f(OutputStream outputStream) {
        super(outputStream);
    }

    @Override
    public void close() {
        this.out = new g();
    }
}

