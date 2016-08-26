/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.h;

import com.growingio.a.a.h.H;
import com.growingio.a.a.h.i;
import com.growingio.a.a.m.G;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

final class az
extends i {
    private static final int a = 16;
    private static final long b = -8663945395140668459L;
    private static final long c = 5545529020109919103L;
    private long d;
    private long e;
    private int f;

    az(int n2) {
        super(16);
        this.d = n2;
        this.e = n2;
        this.f = 0;
    }

    @Override
    protected void a(ByteBuffer byteBuffer) {
        long l2 = byteBuffer.getLong();
        long l3 = byteBuffer.getLong();
        this.a(l2, l3);
        this.f += 16;
    }

    private void a(long l2, long l3) {
        this.d ^= az.d(l2);
        this.d = Long.rotateLeft(this.d, 27);
        this.d += this.e;
        this.d = this.d * 5 + 1390208809;
        this.e ^= az.e(l3);
        this.e = Long.rotateLeft(this.e, 31);
        this.e += this.d;
        this.e = this.e * 5 + 944331445;
    }

    @Override
    protected void b(ByteBuffer byteBuffer) {
        long l2 = 0;
        long l3 = 0;
        this.f += byteBuffer.remaining();
        switch (byteBuffer.remaining()) {
            case 15: {
                l3 ^= (long)G.a(byteBuffer.get(14)) << 48;
            }
            case 14: {
                l3 ^= (long)G.a(byteBuffer.get(13)) << 40;
            }
            case 13: {
                l3 ^= (long)G.a(byteBuffer.get(12)) << 32;
            }
            case 12: {
                l3 ^= (long)G.a(byteBuffer.get(11)) << 24;
            }
            case 11: {
                l3 ^= (long)G.a(byteBuffer.get(10)) << 16;
            }
            case 10: {
                l3 ^= (long)G.a(byteBuffer.get(9)) << 8;
            }
            case 9: {
                l3 ^= (long)G.a(byteBuffer.get(8));
            }
            case 8: {
                l2 ^= byteBuffer.getLong();
                break;
            }
            case 7: {
                l2 ^= (long)G.a(byteBuffer.get(6)) << 48;
            }
            case 6: {
                l2 ^= (long)G.a(byteBuffer.get(5)) << 40;
            }
            case 5: {
                l2 ^= (long)G.a(byteBuffer.get(4)) << 32;
            }
            case 4: {
                l2 ^= (long)G.a(byteBuffer.get(3)) << 24;
            }
            case 3: {
                l2 ^= (long)G.a(byteBuffer.get(2)) << 16;
            }
            case 2: {
                l2 ^= (long)G.a(byteBuffer.get(1)) << 8;
            }
            case 1: {
                l2 ^= (long)G.a(byteBuffer.get(0));
                break;
            }
            default: {
                throw new AssertionError((Object)"Should never get here.");
            }
        }
        this.d ^= az.d(l2);
        this.e ^= az.e(l3);
    }

    @Override
    public H b() {
        this.d ^= (long)this.f;
        this.e ^= (long)this.f;
        this.d += this.e;
        this.e += this.d;
        this.d = az.c(this.d);
        this.e = az.c(this.e);
        this.d += this.e;
        this.e += this.d;
        return H.b(ByteBuffer.wrap(new byte[16]).order(ByteOrder.LITTLE_ENDIAN).putLong(this.d).putLong(this.e).array());
    }

    private static long c(long l2) {
        l2 ^= l2 >>> 33;
        l2 *= -49064778989728563L;
        l2 ^= l2 >>> 33;
        l2 *= -4265267296055464877L;
        l2 ^= l2 >>> 33;
        return l2;
    }

    private static long d(long l2) {
        l2 *= -8663945395140668459L;
        l2 = Long.rotateLeft(l2, 31);
        return l2 *= 5545529020109919103L;
    }

    private static long e(long l2) {
        l2 *= 5545529020109919103L;
        l2 = Long.rotateLeft(l2, 33);
        return l2 *= -8663945395140668459L;
    }
}

