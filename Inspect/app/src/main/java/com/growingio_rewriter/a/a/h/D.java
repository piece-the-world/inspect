/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.h;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.h.aC;
import java.io.OutputStream;

class D
extends OutputStream {
    final aC a;

    D(aC aC2) {
        this.a = aU.a(aC2);
    }

    @Override
    public void write(int n2) {
        this.a.c((byte)n2);
    }

    @Override
    public void write(byte[] arrby) {
        this.a.c(arrby);
    }

    @Override
    public void write(byte[] arrby, int n2, int n3) {
        this.a.c(arrby, n2, n3);
    }

    public String toString() {
        return "Funnels.asOutputStream(" + this.a + ")";
    }
}

