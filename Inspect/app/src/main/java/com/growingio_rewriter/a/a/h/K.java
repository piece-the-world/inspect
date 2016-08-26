/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.h;

import com.growingio.a.a.h.H;
import java.io.Serializable;

final class K
extends H
implements Serializable {
    final long a;
    private static final long b = 0;

    K(long l2) {
        this.a = l2;
    }

    @Override
    public int a() {
        return 64;
    }

    @Override
    public byte[] e() {
        return new byte[]{(byte)this.a, (byte)(this.a >> 8), (byte)(this.a >> 16), (byte)(this.a >> 24), (byte)(this.a >> 32), (byte)(this.a >> 40), (byte)(this.a >> 48), (byte)(this.a >> 56)};
    }

    @Override
    public int b() {
        return (int)this.a;
    }

    @Override
    public long c() {
        return this.a;
    }

    @Override
    public long d() {
        return this.a;
    }

    @Override
    void b(byte[] arrby, int n2, int n3) {
        for (int i2 = 0; i2 < n3; ++i2) {
            arrby[n2 + i2] = (byte)(this.a >> i2 * 8);
        }
    }

    @Override
    boolean a(H h2) {
        return this.a == h2.c();
    }
}

