/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.h;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.h.I;
import com.growingio.a.a.h.J;
import com.growingio.a.a.h.K;
import com.growingio.a.a.m.q;

public abstract class H {
    private static final char[] a = "0123456789abcdef".toCharArray();

    H() {
    }

    public abstract int a();

    public abstract int b();

    public abstract long c();

    public abstract long d();

    public abstract byte[] e();

    public int a(byte[] arrby, int n2, int n3) {
        n3 = q.a(new int[]{n3, this.a() / 8});
        aU.a(n2, n2 + n3, arrby.length);
        this.b(arrby, n2, n3);
        return n3;
    }

    abstract void b(byte[] var1, int var2, int var3);

    byte[] f() {
        return this.e();
    }

    abstract boolean a(H var1);

    public static H a(int n2) {
        return new J(n2);
    }

    public static H a(long l2) {
        return new K(l2);
    }

    public static H a(byte[] arrby) {
        aU.a(arrby.length >= 1, (Object)"A HashCode must contain at least 1 byte.");
        return H.b((byte[])arrby.clone());
    }

    static H b(byte[] arrby) {
        return new I(arrby);
    }

    public static H a(String string) {
        aU.a(string.length() >= 2, "input string (%s) must have at least 2 characters", (Object)string);
        aU.a(string.length() % 2 == 0, "input string (%s) must have an even number of characters", (Object)string);
        byte[] arrby = new byte[string.length() / 2];
        for (int i2 = 0; i2 < string.length(); i2 += 2) {
            int n2 = H.a(string.charAt(i2)) << 4;
            int n3 = H.a(string.charAt(i2 + 1));
            arrby[i2 / 2] = (byte)(n2 + n3);
        }
        return H.b(arrby);
    }

    private static int a(char c2) {
        if (c2 >= '0' && c2 <= '9') {
            return c2 - 48;
        }
        if (c2 >= 'a' && c2 <= 'f') {
            return c2 - 97 + 10;
        }
        throw new IllegalArgumentException("Illegal hexadecimal character: " + c2);
    }

    public final boolean equals(Object object) {
        if (object instanceof H) {
            H h2 = (H)object;
            return this.a() == h2.a() && this.a(h2);
        }
        return false;
    }

    public final int hashCode() {
        if (this.a() >= 32) {
            return this.b();
        }
        byte[] arrby = this.f();
        int n2 = arrby[0] & 255;
        for (int i2 = 1; i2 < arrby.length; ++i2) {
            n2 |= (arrby[i2] & 255) << i2 * 8;
        }
        return n2;
    }

    public final String toString() {
        byte[] arrby = this.f();
        StringBuilder stringBuilder = new StringBuilder(2 * arrby.length);
        for (byte by2 : arrby) {
            stringBuilder.append(a[by2 >> 4 & 15]).append(a[by2 & 15]);
        }
        return stringBuilder.toString();
    }
}

