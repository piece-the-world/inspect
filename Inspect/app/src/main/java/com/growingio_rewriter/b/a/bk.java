/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a;

import com.growingio.b.a.Q;
import com.growingio.b.a.aZ;
import com.growingio.b.a.l;
import java.io.ByteArrayOutputStream;

public class bk {
    ByteArrayOutputStream a;
    int b;

    public bk(int n2) {
        this.a = new ByteArrayOutputStream(n2);
        this.b = 0;
        this.a.write(0);
        this.a.write(0);
    }

    public byte[] a() {
        byte[] arrby = this.a.toByteArray();
        l.a(this.b, arrby, 0);
        return arrby;
    }

    public aZ a(Q q2) {
        return new aZ(q2, this.a());
    }

    public void a(int n2) {
        ++this.b;
        if (n2 < 64) {
            this.a.write(n2);
        } else {
            this.a.write(251);
            this.b(n2);
        }
    }

    public void a(int n2, int n3, int n4) {
        ++this.b;
        if (n2 < 64) {
            this.a.write(n2 + 64);
        } else {
            this.a.write(247);
            this.b(n2);
        }
        this.b(n3, n4);
    }

    public void a(int n2, int n3) {
        ++this.b;
        this.a.write(251 - n3);
        this.b(n2);
    }

    public void a(int n2, int[] arrn, int[] arrn2) {
        ++this.b;
        int n3 = arrn.length;
        this.a.write(n3 + 251);
        this.b(n2);
        for (int i2 = 0; i2 < n3; ++i2) {
            this.b(arrn[i2], arrn2[i2]);
        }
    }

    public void a(int n2, int[] arrn, int[] arrn2, int[] arrn3, int[] arrn4) {
        int n3;
        ++this.b;
        this.a.write(255);
        this.b(n2);
        int n4 = arrn.length;
        this.b(n4);
        for (n3 = 0; n3 < n4; ++n3) {
            this.b(arrn[n3], arrn2[n3]);
        }
        n4 = arrn3.length;
        this.b(n4);
        for (n3 = 0; n3 < n4; ++n3) {
            this.b(arrn3[n3], arrn4[n3]);
        }
    }

    private void b(int n2, int n3) {
        this.a.write(n2);
        if (n2 == 7 || n2 == 8) {
            this.b(n3);
        }
    }

    private void b(int n2) {
        this.a.write(n2 >>> 8 & 255);
        this.a.write(n2 & 255);
    }
}

