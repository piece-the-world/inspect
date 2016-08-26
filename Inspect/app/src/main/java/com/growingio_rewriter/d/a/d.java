/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a;

public class d {
    byte[] a;
    int b;

    public d() {
        this.a = new byte[64];
    }

    public d(int n2) {
        this.a = new byte[n2];
    }

    public d a(int n2) {
        int n3 = this.b;
        if (n3 + 1 > this.a.length) {
            this.d(1);
        }
        this.a[n3++] = (byte)n2;
        this.b = n3;
        return this;
    }

    d a(int n2, int n3) {
        int n4 = this.b;
        if (n4 + 2 > this.a.length) {
            this.d(2);
        }
        byte[] arrby = this.a;
        arrby[n4++] = (byte)n2;
        arrby[n4++] = (byte)n3;
        this.b = n4;
        return this;
    }

    public d b(int n2) {
        int n3 = this.b;
        if (n3 + 2 > this.a.length) {
            this.d(2);
        }
        byte[] arrby = this.a;
        arrby[n3++] = (byte)(n2 >>> 8);
        arrby[n3++] = (byte)n2;
        this.b = n3;
        return this;
    }

    d b(int n2, int n3) {
        int n4 = this.b;
        if (n4 + 3 > this.a.length) {
            this.d(3);
        }
        byte[] arrby = this.a;
        arrby[n4++] = (byte)n2;
        arrby[n4++] = (byte)(n3 >>> 8);
        arrby[n4++] = (byte)n3;
        this.b = n4;
        return this;
    }

    public d c(int n2) {
        int n3 = this.b;
        if (n3 + 4 > this.a.length) {
            this.d(4);
        }
        byte[] arrby = this.a;
        arrby[n3++] = (byte)(n2 >>> 24);
        arrby[n3++] = (byte)(n2 >>> 16);
        arrby[n3++] = (byte)(n2 >>> 8);
        arrby[n3++] = (byte)n2;
        this.b = n3;
        return this;
    }

    public d a(long l2) {
        int n2 = this.b;
        if (n2 + 8 > this.a.length) {
            this.d(8);
        }
        byte[] arrby = this.a;
        int n3 = (int)(l2 >>> 32);
        arrby[n2++] = (byte)(n3 >>> 24);
        arrby[n2++] = (byte)(n3 >>> 16);
        arrby[n2++] = (byte)(n3 >>> 8);
        arrby[n2++] = (byte)n3;
        n3 = (int)l2;
        arrby[n2++] = (byte)(n3 >>> 24);
        arrby[n2++] = (byte)(n3 >>> 16);
        arrby[n2++] = (byte)(n3 >>> 8);
        arrby[n2++] = (byte)n3;
        this.b = n2;
        return this;
    }

    public d a(String string) {
        int n2 = string.length();
        if (n2 > 65535) {
            throw new IllegalArgumentException();
        }
        int n3 = this.b;
        if (n3 + 2 + n2 > this.a.length) {
            this.d(2 + n2);
        }
        byte[] arrby = this.a;
        arrby[n3++] = (byte)(n2 >>> 8);
        arrby[n3++] = (byte)n2;
        for (int i2 = 0; i2 < n2; ++i2) {
            char c2 = string.charAt(i2);
            if (c2 < '\u0001' || c2 > '') {
                this.b = n3;
                return this.a(string, i2, 65535);
            }
            arrby[n3++] = (byte)c2;
        }
        this.b = n3;
        return this;
    }

    d a(String string, int n2, int n3) {
        char c2;
        int n4;
        int n5 = string.length();
        int n6 = n2;
        for (n4 = n2; n4 < n5; ++n4) {
            c2 = string.charAt(n4);
            if (c2 >= '\u0001' && c2 <= '') {
                ++n6;
                continue;
            }
            if (c2 > '\u07ff') {
                n6 += 3;
                continue;
            }
            n6 += 2;
        }
        if (n6 > n3) {
            throw new IllegalArgumentException();
        }
        n4 = this.b - n2 - 2;
        if (n4 >= 0) {
            this.a[n4] = (byte)(n6 >>> 8);
            this.a[n4 + 1] = (byte)n6;
        }
        if (this.b + n6 - n2 > this.a.length) {
            this.d(n6 - n2);
        }
        int n7 = this.b;
        for (int i2 = n2; i2 < n5; ++i2) {
            c2 = string.charAt(i2);
            if (c2 >= '\u0001' && c2 <= '') {
                this.a[n7++] = (byte)c2;
                continue;
            }
            if (c2 > '\u07ff') {
                this.a[n7++] = (byte)(224 | c2 >> 12 & 15);
                this.a[n7++] = (byte)(128 | c2 >> 6 & 63);
                this.a[n7++] = (byte)(128 | c2 & 63);
                continue;
            }
            this.a[n7++] = (byte)(192 | c2 >> 6 & 31);
            this.a[n7++] = (byte)(128 | c2 & 63);
        }
        this.b = n7;
        return this;
    }

    public d a(byte[] arrby, int n2, int n3) {
        if (this.b + n3 > this.a.length) {
            this.d(n3);
        }
        if (arrby != null) {
            System.arraycopy(arrby, n2, this.a, this.b, n3);
        }
        this.b += n3;
        return this;
    }

    private void d(int n2) {
        int n3 = 2 * this.a.length;
        int n4 = this.b + n2;
        byte[] arrby = new byte[n3 > n4 ? n3 : n4];
        System.arraycopy(this.a, 0, arrby, 0, this.b);
        this.a = arrby;
    }
}

