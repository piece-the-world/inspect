/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.aU;

public final class bT {
    public static int a(CharSequence charSequence) {
        int n2;
        int n3;
        int n4 = n2 = charSequence.length();
        for (n3 = 0; n3 < n2 && charSequence.charAt(n3) < ''; ++n3) {
        }
        while (n3 < n2) {
            char c2 = charSequence.charAt(n3);
            if (c2 < '\u0800') {
                n4 += 127 - c2 >>> 31;
            } else {
                n4 += bT.a(charSequence, n3);
                break;
            }
            ++n3;
        }
        if (n4 < n2) {
            throw new IllegalArgumentException("UTF-8 length does not fit in int: " + ((long)n4 + 0x100000000L));
        }
        return n4;
    }

    private static int a(CharSequence charSequence, int n2) {
        int n3 = charSequence.length();
        int n4 = 0;
        for (int i2 = n2; i2 < n3; ++i2) {
            char c2 = charSequence.charAt(i2);
            if (c2 < '\u0800') {
                n4 += 127 - c2 >>> 31;
                continue;
            }
            n4 += 2;
            if ('\ud800' > c2 || c2 > '\udfff') continue;
            if (Character.codePointAt(charSequence, i2) == c2) {
                throw new IllegalArgumentException(bT.a(i2));
            }
            ++i2;
        }
        return n4;
    }

    public static boolean a(byte[] arrby) {
        return bT.a(arrby, 0, arrby.length);
    }

    public static boolean a(byte[] arrby, int n2, int n3) {
        int n4 = n2 + n3;
        aU.a(n2, n4, arrby.length);
        for (int i2 = n2; i2 < n4; ++i2) {
            if (arrby[i2] >= 0) continue;
            return bT.b(arrby, i2, n4);
        }
        return true;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private static boolean b(byte[] var0, int var1_1, int var2_2) {
        var3_3 = var1_1;
        do lbl-1000: // 5 sources:
        {
            if (var3_3 >= var2_2) {
                return true;
            }
            if ((var4_4 = var0[var3_3++]) >= 0) ** GOTO lbl-1000
            if (var4_4 >= -32) ** GOTO lbl12
            if (var3_3 == var2_2) {
                return false;
            }
            if (var4_4 < -62) return false;
            if (var0[var3_3++] <= -65) ** GOTO lbl-1000
            return false;
lbl12: // 1 sources:
            if (var4_4 >= -16) ** GOTO lbl22
            if (var3_3 + 1 >= var2_2) {
                return false;
            }
            if ((var5_5 = var0[var3_3++]) > -65) return false;
            if (var4_4 == -32) {
                if (var5_5 < -96) return false;
            }
            if (var4_4 == -19) {
                if (-96 <= var5_5) return false;
            }
            if (var0[var3_3++] <= -65) ** GOTO lbl-1000
            return false;
lbl22: // 1 sources:
            if (var3_3 + 2 >= var2_2) {
                return false;
            }
            if ((var5_5 = var0[var3_3++]) > -65) return false;
            if ((var4_4 << 28) + (var5_5 - -112) >> 30 != 0) return false;
            if (var0[var3_3++] > -65) return false;
        } while (var0[var3_3++] <= -65);
        return false;
    }

    private static String a(int n2) {
        return "Unpaired surrogate at index " + n2;
    }

    private bT() {
    }
}

