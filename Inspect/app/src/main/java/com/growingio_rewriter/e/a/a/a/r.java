/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.a.a.a;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;

public class r {
    public static final String a = System.getProperty("line.separator");
    private static final char[] b = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private static final int[] c = new int[]{28, 24, 20, 16, 12, 8, 4, 0};

    public static void a(byte[] arrby, long l2, OutputStream outputStream, int n2) throws IOException, ArrayIndexOutOfBoundsException, IllegalArgumentException {
        if (n2 < 0 || n2 >= arrby.length) {
            throw new ArrayIndexOutOfBoundsException("illegal index: " + n2 + " into array of length " + arrby.length);
        }
        if (outputStream == null) {
            throw new IllegalArgumentException("cannot write to nullstream");
        }
        long l3 = l2 + (long)n2;
        StringBuilder stringBuilder = new StringBuilder(74);
        for (int i2 = n2; i2 < arrby.length; i2 += 16) {
            int n3;
            int n4 = arrby.length - i2;
            if (n4 > 16) {
                n4 = 16;
            }
            r.a(stringBuilder, l3).append(' ');
            for (n3 = 0; n3 < 16; ++n3) {
                if (n3 < n4) {
                    r.a(stringBuilder, arrby[n3 + i2]);
                } else {
                    stringBuilder.append("  ");
                }
                stringBuilder.append(' ');
            }
            for (n3 = 0; n3 < n4; ++n3) {
                if (arrby[n3 + i2] >= 32 && arrby[n3 + i2] < 127) {
                    stringBuilder.append(arrby[n3 + i2]);
                    continue;
                }
                stringBuilder.append('.');
            }
            stringBuilder.append(a);
            outputStream.write(stringBuilder.toString().getBytes(Charset.defaultCharset()));
            outputStream.flush();
            stringBuilder.setLength(0);
            l3 += (long)n4;
        }
    }

    private static StringBuilder a(StringBuilder stringBuilder, long l2) {
        for (int i2 = 0; i2 < 8; ++i2) {
            stringBuilder.append(b[(int)(l2 >> c[i2]) & 15]);
        }
        return stringBuilder;
    }

    private static StringBuilder a(StringBuilder stringBuilder, byte by2) {
        for (int i2 = 0; i2 < 2; ++i2) {
            stringBuilder.append(b[by2 >> c[i2 + 6] & 15]);
        }
        return stringBuilder;
    }
}

