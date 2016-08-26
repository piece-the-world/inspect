/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.android.sdk.snappy;

import java.lang.ref.SoftReference;

class b {
    protected static final ThreadLocal a = new ThreadLocal();
    private byte[] b;
    private byte[] c;
    private short[] d;

    b() {
    }

    public static b a() {
        SoftReference softReference = (SoftReference)a.get();
        b b2 = softReference == null ? null : (b)softReference.get();
        if (b2 == null) {
            b2 = new b();
            a.set(new SoftReference<b>(b2));
        }
        return b2;
    }

    public void a(byte[] arrby) {
        if (this.c == null || arrby.length > this.c.length) {
            this.c = arrby;
        }
    }

    public void b(byte[] arrby) {
        if (this.b == null || arrby != null && arrby.length > this.b.length) {
            this.b = arrby;
        }
    }

    public short[] a(int n2) {
        short[] arrs = this.d;
        if (arrs == null || arrs.length < n2) {
            arrs = new short[n2];
        } else {
            this.d = null;
        }
        return arrs;
    }

    public void a(short[] arrs) {
        if (this.d == null || arrs != null && arrs.length > this.d.length) {
            this.d = arrs;
        }
    }
}

