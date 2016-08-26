/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.h;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.h.H;
import com.growingio.a.a.h.ai;
import com.growingio.a.a.h.e;

final class w
extends e {
    private static final long a = -4348849565147123417L;
    private static final long b = -5435081209227447693L;
    private static final long c = -7286425919675154353L;

    w() {
    }

    @Override
    public H a(byte[] arrby, int n2, int n3) {
        aU.a(n2, n2 + n3, arrby.length);
        return H.a(w.b(arrby, n2, n3));
    }

    @Override
    public int b() {
        return 64;
    }

    public String toString() {
        return "Hashing.farmHashFingerprint64()";
    }

    static long b(byte[] arrby, int n2, int n3) {
        if (n3 <= 32) {
            if (n3 <= 16) {
                return w.c(arrby, n2, n3);
            }
            return w.d(arrby, n2, n3);
        }
        if (n3 <= 64) {
            return w.e(arrby, n2, n3);
        }
        return w.f(arrby, n2, n3);
    }

    private static long b(long l2) {
        return l2 ^ l2 >>> 47;
    }

    private static long a(long l2, long l3, long l4) {
        long l5 = (l2 ^ l3) * l4;
        l5 ^= l5 >>> 47;
        long l6 = (l3 ^ l5) * l4;
        l6 ^= l6 >>> 47;
        return l6 *= l4;
    }

    private static void a(byte[] arrby, int n2, long l2, long l3, long[] arrl) {
        long l4 = ai.a(arrby, n2);
        long l5 = ai.a(arrby, n2 + 8);
        long l6 = ai.a(arrby, n2 + 16);
        long l7 = ai.a(arrby, n2 + 24);
        l3 = Long.rotateRight(l3 + (l2 += l4) + l7, 21);
        long l8 = l2;
        l2 += l5;
        arrl[0] = l2 + l7;
        arrl[1] = (l3 += Long.rotateRight(l2 += l6, 44)) + l8;
    }

    private static long c(byte[] arrby, int n2, int n3) {
        if (n3 >= 8) {
            long l2 = -7286425919675154353L + (long)(n3 * 2);
            long l3 = ai.a(arrby, n2) + -7286425919675154353L;
            long l4 = ai.a(arrby, n2 + n3 - 8);
            long l5 = Long.rotateRight(l4, 37) * l2 + l3;
            long l6 = (Long.rotateRight(l3, 25) + l4) * l2;
            return w.a(l5, l6, l2);
        }
        if (n3 >= 4) {
            long l7 = -7286425919675154353L + (long)(n3 * 2);
            long l8 = (long)ai.b(arrby, n2) & 0xFFFFFFFFL;
            return w.a((long)n3 + (l8 << 3), (long)ai.b(arrby, n2 + n3 - 4) & 0xFFFFFFFFL, l7);
        }
        if (n3 > 0) {
            byte by2 = arrby[n2];
            byte by3 = arrby[n2 + (n3 >> 1)];
            byte by4 = arrby[n2 + (n3 - 1)];
            int n4 = (by2 & 255) + ((by3 & 255) << 8);
            int n5 = n3 + ((by4 & 255) << 2);
            return w.b((long)n4 * -7286425919675154353L ^ (long)n5 * -4348849565147123417L) * -7286425919675154353L;
        }
        return -7286425919675154353L;
    }

    private static long d(byte[] arrby, int n2, int n3) {
        long l2 = -7286425919675154353L + (long)(n3 * 2);
        long l3 = ai.a(arrby, n2) * -5435081209227447693L;
        long l4 = ai.a(arrby, n2 + 8);
        long l5 = ai.a(arrby, n2 + n3 - 8) * l2;
        long l6 = ai.a(arrby, n2 + n3 - 16) * -7286425919675154353L;
        return w.a(Long.rotateRight(l3 + l4, 43) + Long.rotateRight(l5, 30) + l6, l3 + Long.rotateRight(l4 + -7286425919675154353L, 18) + l5, l2);
    }

    private static long e(byte[] arrby, int n2, int n3) {
        long l2 = -7286425919675154353L + (long)(n3 * 2);
        long l3 = ai.a(arrby, n2) * -7286425919675154353L;
        long l4 = ai.a(arrby, n2 + 8);
        long l5 = ai.a(arrby, n2 + n3 - 8) * l2;
        long l6 = ai.a(arrby, n2 + n3 - 16) * -7286425919675154353L;
        long l7 = Long.rotateRight(l3 + l4, 43) + Long.rotateRight(l5, 30) + l6;
        long l8 = w.a(l7, l3 + Long.rotateRight(l4 + -7286425919675154353L, 18) + l5, l2);
        long l9 = ai.a(arrby, n2 + 16) * l2;
        long l10 = ai.a(arrby, n2 + 24);
        long l11 = (l7 + ai.a(arrby, n2 + n3 - 32)) * l2;
        long l12 = (l8 + ai.a(arrby, n2 + n3 - 24)) * l2;
        return w.a(Long.rotateRight(l9 + l10, 43) + Long.rotateRight(l11, 30) + l12, l9 + Long.rotateRight(l10 + l3, 18) + l11, l2);
    }

    private static long f(byte[] arrby, int n2, int n3) {
        long l2;
        int n4 = 81;
        long l3 = 81;
        long l4 = 2480279821605975764L;
        long l5 = w.b(l4 * -7286425919675154353L + 113) * -7286425919675154353L;
        long[] arrl = new long[2];
        long[] arrl2 = new long[2];
        l3 = l3 * -7286425919675154353L + ai.a(arrby, n2);
        int n5 = n2 + (n3 - 1) / 64 * 64;
        int n6 = n5 + (n3 - 1 & 63) - 63;
        do {
            l3 = Long.rotateRight(l3 + l4 + arrl[0] + ai.a(arrby, n2 + 8), 37) * -5435081209227447693L;
            l4 = Long.rotateRight(l4 + arrl[1] + ai.a(arrby, n2 + 48), 42) * -5435081209227447693L;
            l5 = Long.rotateRight(l5 + arrl2[0], 33) * -5435081209227447693L;
            w.a(arrby, n2, arrl[1] * -5435081209227447693L, (l3 ^= arrl2[1]) + arrl2[0], arrl);
            w.a(arrby, n2 + 32, l5 + arrl2[1], (l4 += arrl[0] + ai.a(arrby, n2 + 40)) + ai.a(arrby, n2 + 16), arrl2);
            l2 = l3;
            l3 = l5;
            l5 = l2;
        } while ((n2 += 64) != n5);
        l2 = -5435081209227447693L + ((l5 & 255) << 1);
        n2 = n6;
        long[] arrl3 = arrl2;
        arrl3[0] = arrl3[0] + (long)(n3 - 1 & 63);
        long[] arrl4 = arrl;
        arrl4[0] = arrl4[0] + arrl2[0];
        long[] arrl5 = arrl2;
        arrl5[0] = arrl5[0] + arrl[0];
        l3 = Long.rotateRight(l3 + l4 + arrl[0] + ai.a(arrby, n2 + 8), 37) * l2;
        l4 = Long.rotateRight(l4 + arrl[1] + ai.a(arrby, n2 + 48), 42) * l2;
        l5 = Long.rotateRight(l5 + arrl2[0], 33) * l2;
        w.a(arrby, n2, arrl[1] * l2, (l3 ^= arrl2[1] * 9) + arrl2[0], arrl);
        w.a(arrby, n2 + 32, l5 + arrl2[1], (l4 += arrl[0] * 9 + ai.a(arrby, n2 + 40)) + ai.a(arrby, n2 + 16), arrl2);
        return w.a(w.a(arrl[0], arrl2[0], l2) + w.b(l4) * -4348849565147123417L + l3, w.a(arrl[1], arrl2[1], l2) + l5, l2);
    }
}

