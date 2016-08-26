/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.h;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.h.H;
import java.io.Serializable;

final class I
extends H
implements Serializable {
    final byte[] a;
    private static final long b = 0;

    I(byte[] arrby) {
        this.a = aU.a(arrby);
    }

    @Override
    public int a() {
        return this.a.length * 8;
    }

    @Override
    public byte[] e() {
        return (byte[])this.a.clone();
    }

    @Override
    public int b() {
        aU.b(this.a.length >= 4, "HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", this.a.length);
        return this.a[0] & 255 | (this.a[1] & 255) << 8 | (this.a[2] & 255) << 16 | (this.a[3] & 255) << 24;
    }

    @Override
    public long c() {
        aU.b(this.a.length >= 8, "HashCode#asLong() requires >= 8 bytes (it only has %s bytes).", this.a.length);
        return this.d();
    }

    @Override
    public long d() {
        long l2 = this.a[0] & 255;
        for (int i2 = 1; i2 < Math.min(this.a.length, 8); ++i2) {
            l2 |= ((long)this.a[i2] & 255) << i2 * 8;
        }
        return l2;
    }

    @Override
    void b(byte[] arrby, int n2, int n3) {
        System.arraycopy(this.a, 0, arrby, n2, n3);
    }

    @Override
    byte[] f() {
        return this.a;
    }

    @Override
    boolean a(H h2) {
        if (this.a.length != h2.f().length) {
            return false;
        }
        boolean bl2 = true;
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            bl2 &= this.a[i2] == h2.f()[i2];
        }
        return bl2;
    }
}

