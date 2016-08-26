/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.h;

import com.growingio.a.a.h.H;
import com.growingio.a.a.h.aA;
import com.growingio.a.a.h.i;
import com.growingio.a.a.m.G;
import java.nio.ByteBuffer;

final class aB
extends i {
    private static final int a = 4;
    private int b;
    private int c;

    aB(int n2) {
        super(4);
        this.b = n2;
        this.c = 0;
    }

    @Override
    protected void a(ByteBuffer byteBuffer) {
        int n2 = aA.c(byteBuffer.getInt());
        this.b = aA.a(this.b, n2);
        this.c += 4;
    }

    @Override
    protected void b(ByteBuffer byteBuffer) {
        this.c += byteBuffer.remaining();
        int n2 = 0;
        int n3 = 0;
        while (byteBuffer.hasRemaining()) {
            n2 ^= G.a(byteBuffer.get()) << n3;
            n3 += 8;
        }
        this.b ^= aA.c(n2);
    }

    @Override
    public H b() {
        return aA.b(this.b, this.c);
    }
}

