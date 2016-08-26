/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.h;

import com.growingio.a.a.h.H;
import com.growingio.a.a.h.i;
import java.nio.ByteBuffer;

final class aE
extends i {
    private static final int a = 8;
    private final int b;
    private final int c;
    private long d = 8317987319222330741L;
    private long e = 7237128888997146477L;
    private long f = 7816392313619706465L;
    private long g = 8387220255154660723L;
    private long h = 0;
    private long i = 0;

    aE(int n2, int n3, long l2, long l3) {
        super(8);
        this.b = n2;
        this.c = n3;
        this.d ^= l2;
        this.e ^= l3;
        this.f ^= l2;
        this.g ^= l3;
    }

    @Override
    protected void a(ByteBuffer byteBuffer) {
        this.h += 8;
        this.c(byteBuffer.getLong());
    }

    @Override
    protected void b(ByteBuffer byteBuffer) {
        this.h += (long)byteBuffer.remaining();
        int n2 = 0;
        while (byteBuffer.hasRemaining()) {
            this.i ^= ((long)byteBuffer.get() & 255) << n2;
            n2 += 8;
        }
    }

    @Override
    public H b() {
        this.i ^= this.h << 56;
        this.c(this.i);
        this.f ^= 255;
        this.c(this.c);
        return H.a(this.d ^ this.e ^ this.f ^ this.g);
    }

    private void c(long l2) {
        this.g ^= l2;
        this.c(this.b);
        this.d ^= l2;
    }

    private void c(int n2) {
        for (int i2 = 0; i2 < n2; ++i2) {
            this.d += this.e;
            this.f += this.g;
            this.e = Long.rotateLeft(this.e, 13);
            this.g = Long.rotateLeft(this.g, 16);
            this.e ^= this.d;
            this.g ^= this.f;
            this.d = Long.rotateLeft(this.d, 32);
            this.f += this.e;
            this.d += this.g;
            this.e = Long.rotateLeft(this.e, 17);
            this.g = Long.rotateLeft(this.g, 21);
            this.e ^= this.f;
            this.g ^= this.d;
            this.f = Long.rotateLeft(this.f, 32);
        }
    }
}

