/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.android.sdk.snappy;

import com.growingio.android.sdk.snappy.a;
import java.io.OutputStream;

@Deprecated
public class i
extends a {
    static final byte[] a = new byte[]{115, 110, 97, 112, 112, 121, 0};
    private final boolean b;

    @Override
    protected int a(byte[] arrby, int n2, int n3) {
        return this.b ? super.a(arrby, n2, n3) : 0;
    }

    @Override
    protected void a(OutputStream outputStream, byte[] arrby, int n2, int n3, boolean bl2, int n4) {
        outputStream.write(bl2 ? 1 : 0);
        outputStream.write(n3 >>> 8);
        outputStream.write(n3);
        outputStream.write(n4 >>> 24);
        outputStream.write(n4 >>> 16);
        outputStream.write(n4 >>> 8);
        outputStream.write(n4);
        outputStream.write(arrby, n2, n3);
    }
}

