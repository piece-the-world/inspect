/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.android.sdk.snappy;

import com.growingio.android.sdk.snappy.b;
import com.growingio.android.sdk.snappy.h;
import java.nio.ByteOrder;
import java.util.Arrays;

final class f {
    private static final boolean b = ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN;

    f() {
    }

    public static int a(int n2) {
        return 32 + n2 + n2 / 6;
    }

    public static int a(byte[] arrby, int n2, int n3, byte[] arrby2, int n4) {
        int n5 = f.a(arrby2, n4, n3);
        int n6 = f.c(n3);
        b b2 = b.a();
        short[] arrs = b2.a(n6);
        for (int i2 = 0; i2 < n3; i2 += 32768) {
            Arrays.fill(arrs, 0);
            n5 = f.a(arrby, n2 + i2, Math.min(n3 - i2, 32768), arrby2, n5, arrs);
        }
        b2.a(arrs);
        return n5 - n4;
    }

    private static int a(byte[] arrby, int n2, int n3, byte[] arrby2, int n4, short[] arrs) {
        int n5 = n2;
        assert (n3 <= 32768);
        int n6 = n2 + n3;
        int n7 = f.c(n3);
        int n8 = 32 - f.d(n7);
        assert ((n7 & n7 - 1) == 0);
        assert (-1 >>> n8 == n7 - 1);
        int n9 = n5;
        if (n3 >= 15) {
            int n10 = n2 + n3 - 15;
            while (n5 <= n10) {
                assert (n9 <= n5);
                int n11 = 32;
                int[] arrn = f.a(arrby, n5, n10, n2, n8, arrs, n11);
                n5 = arrn[0];
                int n12 = arrn[1];
                n11 = arrn[2];
                if (n5 + f.b(n11) > n10) break;
                assert (n9 + 16 <= n6);
                n4 = f.a(arrby2, n4, arrby, n9, n5 - n9, true);
                int[] arrn2 = f.a(arrby, n2, n3, n5, arrby2, n4, arrs, n8, n12);
                n5 = arrn2[0];
                n4 = arrn2[1];
                n9 = n5;
            }
        }
        if (n9 < n6) {
            n4 = f.a(arrby2, n4, arrby, n9, n6 - n9, false);
        }
        return n4;
    }

    private static int[] a(byte[] arrby, int n2, int n3, int n4, int n5, short[] arrs, int n6) {
        int n7 = 0;
        ++n2;
        while (n2 + f.b(n6) <= n3) {
            int n8 = h.a(arrby, n2);
            int n9 = f.a(n8, n5);
            n7 = n4 + arrs[n9];
            assert (n7 >= 0);
            assert (n7 < n2);
            arrs[n9] = (short)(n2 - n4);
            if (n8 == h.a(arrby, n7)) break;
            n2 += f.b(n6++);
        }
        return new int[]{n2, n7, n6};
    }

    private static int b(int n2) {
        return n2 >>> 5;
    }

    private static int[] a(byte[] arrby, int n2, int n3, int n4, byte[] arrby2, int n5, short[] arrs, int n6, int n7) {
        int n8;
        do {
            int n9;
            int n10 = 4 + f.a(arrby, n7 + 4, arrby, n4 + 4, n2 + n3);
            int n11 = n4 - n7;
            assert (h.a(arrby, n4, arrby, n7, n10));
            n5 = f.b(arrby2, n5, n11, n10);
            if ((n4 += n10) >= n2 + n3 - 15) {
                return new int[]{n4, n5};
            }
            if (h.a) {
                long l2 = h.b(arrby, n4 - 1);
                n9 = (int)l2;
                n8 = (int)(l2 >>> 8);
            } else {
                n9 = h.a(arrby, n4 - 1);
                n8 = h.a(arrby, n4);
            }
            int n12 = f.a(n9, n6);
            arrs[n12] = (short)(n4 - n2 - 1);
            int n13 = f.a(n8, n6);
            n7 = n2 + arrs[n13];
            arrs[n13] = (short)(n4 - n2);
        } while (n8 == h.a(arrby, n7));
        return new int[]{n4, n5};
    }

    private static int a(byte[] arrby, int n2, byte[] arrby2, int n3, int n4, boolean bl2) {
        h.a(n3, n3 + n4, arrby2.length);
        int n5 = n4 - 1;
        if (n5 < 60) {
            arrby[n2++] = (byte)(0 | n5 << 2);
            if (bl2 && n4 <= 16) {
                h.a(arrby2, n3, arrby, n2);
                h.a(arrby2, n3 + 8, arrby, n2 + 8);
                return n2 += n4;
            }
        } else if (n5 < 256) {
            arrby[n2++] = -16;
            arrby[n2++] = (byte)n5;
        } else if (n5 < 65536) {
            arrby[n2++] = -12;
            arrby[n2++] = (byte)n5;
            arrby[n2++] = (byte)(n5 >>> 8);
        } else if (n5 < 16777216) {
            arrby[n2++] = -8;
            arrby[n2++] = (byte)n5;
            arrby[n2++] = (byte)(n5 >>> 8);
            arrby[n2++] = (byte)(n5 >>> 16);
        } else {
            arrby[n2++] = -4;
            arrby[n2++] = (byte)n5;
            arrby[n2++] = (byte)(n5 >>> 8);
            arrby[n2++] = (byte)(n5 >>> 16);
            arrby[n2++] = (byte)(n5 >>> 24);
        }
        h.a(n3, n3 + n4, arrby2.length);
        System.arraycopy(arrby2, n3, arrby, n2, n4);
        return n2 += n4;
    }

    private static int a(byte[] arrby, int n2, int n3, int n4) {
        assert (n3 >= 0);
        assert (n4 <= 64);
        assert (n4 >= 4);
        assert (n3 < 65536);
        if (n4 < 12 && n3 < 2048) {
            int n5 = n4 - 4;
            assert (n5 < 8);
            arrby[n2++] = (byte)(1 | n5 << 2 | n3 >>> 8 << 5);
            arrby[n2++] = (byte)n3;
        } else {
            arrby[n2++] = (byte)(2 | n4 - 1 << 2);
            arrby[n2++] = (byte)n3;
            arrby[n2++] = (byte)(n3 >>> 8);
        }
        return n2;
    }

    private static int b(byte[] arrby, int n2, int n3, int n4) {
        while (n4 >= 68) {
            n2 = f.a(arrby, n2, n3, 64);
            n4 -= 64;
        }
        if (n4 > 64) {
            n2 = f.a(arrby, n2, n3, 60);
            n4 -= 60;
        }
        n2 = f.a(arrby, n2, n3, n4);
        return n2;
    }

    private static int a(byte[] arrby, int n2, byte[] arrby2, int n3, int n4) {
        assert (n4 >= n3);
        if (h.a) {
            int n5 = 0;
            while (n3 + n5 <= n4 - 4 && h.a(arrby2, n3 + n5) == h.a(arrby, n2 + n5)) {
                n5 += 4;
            }
            if (b && n3 + n5 <= n4 - 4) {
                int n6 = h.a(arrby2, n3 + n5) ^ h.a(arrby, n2 + n5);
                int n7 = Integer.numberOfTrailingZeros(n6);
                n5 += n7 >> 3;
            } else {
                while (n3 + n5 < n4 && arrby[n2 + n5] == arrby2[n3 + n5]) {
                    ++n5;
                }
            }
            return n5;
        }
        int n8 = n4 - n3;
        for (int i2 = 0; i2 < n8; ++i2) {
            if (arrby[n2 + i2] == arrby2[n3 + i2]) continue;
            return i2;
        }
        return n8;
    }

    private static int c(int n2) {
        int n3;
        for (n3 = 256; n3 < 16384 && n3 < n2; n3 <<= 1) {
        }
        assert (0 == (n3 & n3 - 1));
        assert (n3 <= 16384);
        return n3;
    }

    private static int a(int n2, int n3) {
        int n4 = 506832829;
        return n2 * n4 >>> n3;
    }

    private static int d(int n2) {
        return n2 == 0 ? -1 : 31 ^ Integer.numberOfLeadingZeros(n2);
    }

    private static int a(byte[] arrby, int n2, int n3) {
        int n4 = 128;
        if (n3 < 128 && n3 >= 0) {
            arrby[n2++] = (byte)n3;
        } else if (n3 < 16384 && n3 > 0) {
            arrby[n2++] = (byte)(n3 | n4);
            arrby[n2++] = (byte)(n3 >>> 7);
        } else if (n3 < 2097152 && n3 > 0) {
            arrby[n2++] = (byte)(n3 | n4);
            arrby[n2++] = (byte)(n3 >>> 7 | n4);
            arrby[n2++] = (byte)(n3 >>> 14);
        } else if (n3 < 268435456 && n3 > 0) {
            arrby[n2++] = (byte)(n3 | n4);
            arrby[n2++] = (byte)(n3 >>> 7 | n4);
            arrby[n2++] = (byte)(n3 >>> 14 | n4);
            arrby[n2++] = (byte)(n3 >>> 21);
        } else {
            arrby[n2++] = (byte)(n3 | n4);
            arrby[n2++] = (byte)(n3 >>> 7 | n4);
            arrby[n2++] = (byte)(n3 >>> 14 | n4);
            arrby[n2++] = (byte)(n3 >>> 21 | n4);
            arrby[n2++] = (byte)(n3 >>> 28);
        }
        return n2;
    }
}

