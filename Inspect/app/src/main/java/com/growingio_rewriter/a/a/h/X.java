/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.h;

final class X {
    private long a;

    public X(long l2) {
        this.a = l2;
    }

    public double a() {
        this.a = 2862933555777941757L * this.a + 1;
        return (double)((int)(this.a >>> 33) + 1) / 2.147483648E9;
    }
}

