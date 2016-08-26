/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.h;

import com.growingio.a.a.h.H;
import com.growingio.a.a.m.M;
import java.io.Serializable;

final class J
extends H
implements Serializable {
    final int a;
    private static final long b = 0;

    J(int n2) {
        this.a = n2;
    }

    @Override
    public int a() {
        return 32;
    }

    @Override
    public byte[] e() {
        return new byte[]{(byte)this.a, (byte)(this.a >> 8), (byte)(this.a >> 16), (byte)(this.a >> 24)};
    }

    @Override
    public int b() {
        return this.a;
    }

    @Override
    public long c() {
        throw new IllegalStateException("this HashCode only has 32 bits; cannot create a long");
    }

    @Override
    public long d() {
        return M.b(this.a);
    }

    @Override
    void b(byte[] arrby, int n2, int n3) {
        for (int i2 = 0; i2 < n3; ++i2) {
            arrby[n2 + i2] = (byte)(this.a >> i2 * 8);
        }
    }

    @Override
    boolean a(H h2) {
        return this.a == h2.b();
    }
}

