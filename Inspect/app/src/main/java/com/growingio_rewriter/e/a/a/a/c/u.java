/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.a.a.a.c;

import com.growingio.e.a.a.a.c.s;
import com.growingio.e.a.a.a.c.t;
import java.io.IOException;
import java.nio.charset.Charset;

class u {
    private final long b;
    private final byte[] c;
    private byte[] d;
    private int e;
    final /* synthetic */ s a;

    private u(s s2, long l2, int n2, byte[] arrby) throws IOException {
        this.a = s2;
        this.b = l2;
        int n3 = n2 + (arrby != null ? arrby.length : 0);
        this.c = new byte[n3];
        long l3 = (l2 - 1) * (long)s.a(s2);
        if (l2 > 0) {
            s.b(s2).seek(l3);
            int n4 = s.b(s2).read(this.c, 0, n2);
            if (n4 != n2) {
                throw new IllegalStateException("Count of requested bytes and actually read bytes don't match");
            }
        }
        if (arrby != null) {
            System.arraycopy(arrby, 0, this.c, n2, arrby.length);
        }
        this.e = this.c.length - 1;
        this.d = null;
    }

    private u a() throws IOException {
        if (this.e > -1) {
            throw new IllegalStateException("Current currentLastCharPos unexpectedly positive... last readLine() should have returned something! currentLastCharPos=" + this.e);
        }
        if (this.b > 1) {
            return new u(this.a, this.b - 1, s.a(this.a), this.d);
        }
        if (this.d != null) {
            throw new IllegalStateException("Unexpected leftover of the last block: leftOverOfThisFilePart=" + new String(this.d, s.c(this.a)));
        }
        return null;
    }

    private String b() throws IOException {
        String string = null;
        boolean bl2 = this.b == 1;
        int n2 = this.e;
        while (n2 > -1) {
            if (!bl2 && n2 < s.d(this.a)) {
                this.c();
                break;
            }
            int n3 = this.a(this.c, n2);
            if (n3 > 0) {
                int n4 = n2 + 1;
                int n5 = this.e - n4 + 1;
                if (n5 < 0) {
                    throw new IllegalStateException("Unexpected negative line length=" + n5);
                }
                byte[] arrby = new byte[n5];
                System.arraycopy(this.c, n4, arrby, 0, n5);
                string = new String(arrby, s.c(this.a));
                this.e = n2 - n3;
                break;
            }
            if ((n2 -= s.e(this.a)) >= 0) continue;
            this.c();
            break;
        }
        if (bl2 && this.d != null) {
            string = new String(this.d, s.c(this.a));
            this.d = null;
        }
        return string;
    }

    private void c() {
        int n2 = this.e + 1;
        if (n2 > 0) {
            this.d = new byte[n2];
            System.arraycopy(this.c, 0, this.d, 0, n2);
        } else {
            this.d = null;
        }
        this.e = -1;
    }

    private int a(byte[] arrby, int n2) {
        for (byte[] arrby2 : s.f(this.a)) {
            boolean bl2 = true;
            for (int i2 = arrby2.length - 1; i2 >= 0; --i2) {
                int n3 = n2 + i2 - (arrby2.length - 1);
                bl2 &= n3 >= 0 && arrby[n3] == arrby2[i2];
            }
            if (!bl2) continue;
            return arrby2.length;
        }
        return 0;
    }

    /* synthetic */ u(s s2, long l2, int n2, byte[] arrby, t t2) throws IOException {
        this(s2, l2, n2, arrby);
    }

    static /* synthetic */ String a(u u2) throws IOException {
        return u2.b();
    }

    static /* synthetic */ u b(u u2) throws IOException {
        return u2.a();
    }
}

