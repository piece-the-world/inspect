/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.android.sdk.snappy;

import com.growingio.android.sdk.snappy.f;
import com.growingio.android.sdk.snappy.g;
import com.growingio.android.sdk.snappy.i;
import java.util.Arrays;

public final class e {
    private static final int a = Math.max(i.a.length, g.a.length);

    public static int a(int n2) {
        return f.a(n2);
    }

    public static int a(byte[] arrby, int n2, int n3, byte[] arrby2, int n4) {
        return f.a(arrby, n2, n3, arrby2, n4);
    }

    public static byte[] a(byte[] arrby) {
        byte[] arrby2 = new byte[e.a(arrby.length)];
        int n2 = e.a(arrby, 0, arrby.length, arrby2, 0);
        byte[] arrby3 = Arrays.copyOf(arrby2, n2);
        return arrby3;
    }
}

