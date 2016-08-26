/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.a.a.a;

import java.io.Serializable;

public class a
implements Serializable {
    private static final long g = 1;
    public static final a a = new a("UTF-8", 239, 187, 191);
    public static final a b = new a("UTF-16BE", 254, 255);
    public static final a c = new a("UTF-16LE", 255, 254);
    public static final a d = new a("UTF-32BE", 0, 0, 254, 255);
    public static final a e = new a("UTF-32LE", 255, 254, 0, 0);
    public static final char f = '\ufeff';
    private final String h;
    private final int[] i;

    public /* varargs */ a(String string, int ... arrn) {
        if (string == null || string.isEmpty()) {
            throw new IllegalArgumentException("No charsetName specified");
        }
        if (arrn == null || arrn.length == 0) {
            throw new IllegalArgumentException("No bytes specified");
        }
        this.h = string;
        this.i = new int[arrn.length];
        System.arraycopy(arrn, 0, this.i, 0, arrn.length);
    }

    public String a() {
        return this.h;
    }

    public int b() {
        return this.i.length;
    }

    public int a(int n2) {
        return this.i[n2];
    }

    public byte[] c() {
        byte[] arrby = new byte[this.i.length];
        for (int i2 = 0; i2 < this.i.length; ++i2) {
            arrby[i2] = (byte)this.i[i2];
        }
        return arrby;
    }

    public boolean equals(Object object) {
        if (!(object instanceof a)) {
            return false;
        }
        a a2 = (a)object;
        if (this.i.length != a2.b()) {
            return false;
        }
        for (int i2 = 0; i2 < this.i.length; ++i2) {
            if (this.i[i2] == a2.a(i2)) continue;
            return false;
        }
        return true;
    }

    public int hashCode() {
        int n2 = this.getClass().hashCode();
        for (int n3 : this.i) {
            n2 += n3;
        }
        return n2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getClass().getSimpleName());
        stringBuilder.append('[');
        stringBuilder.append(this.h);
        stringBuilder.append(": ");
        for (int i2 = 0; i2 < this.i.length; ++i2) {
            if (i2 > 0) {
                stringBuilder.append(",");
            }
            stringBuilder.append("0x");
            stringBuilder.append(Integer.toHexString(255 & this.i[i2]).toUpperCase());
        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}

