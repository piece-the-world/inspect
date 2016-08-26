/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.j;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.j.J;
import com.growingio.a.a.j.x;
import java.nio.charset.Charset;

final class z
extends x {
    static final z d = new z();

    z() {
        super(new byte[0]);
    }

    @Override
    public J a(Charset charset) {
        aU.a(charset);
        return J.i();
    }

    @Override
    public byte[] f() {
        return this.a;
    }

    @Override
    public String toString() {
        return "ByteSource.empty()";
    }
}

