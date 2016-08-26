/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a;

class n
implements Cloneable {
    private byte[] a = new byte[64];
    private int b = 0;

    public Object clone() throws CloneNotSupportedException {
        n n2 = (n)super.clone();
        n2.a = (byte[])this.a.clone();
        return n2;
    }

    public final int a() {
        return this.b;
    }

    public final byte[] b() {
        byte[] arrby = new byte[this.b];
        System.arraycopy(this.a, 0, arrby, 0, this.b);
        return arrby;
    }

    public int a(int n2) {
        if (n2 < 0 || this.b <= n2) {
            throw new ArrayIndexOutOfBoundsException(n2);
        }
        return this.a[n2];
    }

    public void a(int n2, int n3) {
        if (n2 < 0 || this.b <= n2) {
            throw new ArrayIndexOutOfBoundsException(n2);
        }
        this.a[n2] = (byte)n3;
    }

    public void b(int n2) {
        this.c(1);
        this.a[this.b - 1] = (byte)n2;
    }

    public void b(int n2, int n3) {
        this.c(2);
        this.a[this.b - 2] = (byte)n2;
        this.a[this.b - 1] = (byte)n3;
    }

    public void a(int n2, int n3, int n4, int n5) {
        this.c(4);
        this.a[this.b - 4] = (byte)n2;
        this.a[this.b - 3] = (byte)n3;
        this.a[this.b - 2] = (byte)n4;
        this.a[this.b - 1] = (byte)n5;
    }

    public void c(int n2) {
        if (this.b + n2 > this.a.length) {
            int n3 = this.b << 1;
            if (n3 < this.b + n2) {
                n3 = this.b + n2;
            }
            byte[] arrby = new byte[n3];
            System.arraycopy(this.a, 0, arrby, 0, this.b);
            this.a = arrby;
        }
        this.b += n2;
    }
}

