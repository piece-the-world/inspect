/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.j;

import com.growingio.a.a.j.C;
import java.io.ByteArrayOutputStream;

final class F
extends ByteArrayOutputStream {
    private F() {
    }

    void a(byte[] arrby, int n2) {
        System.arraycopy(this.buf, 0, arrby, n2, this.count);
    }

    /* synthetic */ F(C c2) {
        this();
    }
}

