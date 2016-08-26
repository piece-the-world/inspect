/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.j;

import com.growingio.a.a.b.aU;
import java.io.OutputStream;

final class C
extends OutputStream {
    C() {
    }

    @Override
    public void write(int n2) {
    }

    @Override
    public void write(byte[] arrby) {
        aU.a(arrby);
    }

    @Override
    public void write(byte[] arrby, int n2, int n3) {
        aU.a(arrby);
    }

    public String toString() {
        return "ByteStreams.nullOutputStream()";
    }
}

