/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a;

import com.growingio.b.a.Q;
import com.growingio.b.a.h;
import com.growingio.b.a.l;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Map;

public class ab
extends h {
    public static final String a = "Exceptions";

    ab(Q q2, int n2, DataInputStream dataInputStream) throws IOException {
        super(q2, n2, dataInputStream);
    }

    private ab(Q q2, ab ab2, Map map) {
        super(q2, "Exceptions");
        this.a(ab2, map);
    }

    public ab(Q q2) {
        super(q2, "Exceptions");
        byte[] arrby = new byte[2];
        arrby[1] = 0;
        arrby[0] = 0;
        this.e = arrby;
    }

    @Override
    public h a(Q q2, Map map) {
        return new ab(q2, this, map);
    }

    private void a(ab ab2, Map map) {
        Q q2 = ab2.c;
        Q q3 = this.c;
        byte[] arrby = ab2.e;
        int n2 = arrby.length;
        byte[] arrby2 = new byte[n2];
        arrby2[0] = arrby[0];
        arrby2[1] = arrby[1];
        for (int i2 = 2; i2 < n2; i2 += 2) {
            int n3 = l.a(arrby, i2);
            l.a(q2.a(n3, q3, map), arrby2, i2);
        }
        this.e = arrby2;
    }

    public int[] a() {
        byte[] arrby = this.e;
        int n2 = arrby.length;
        if (n2 <= 2) {
            return null;
        }
        int[] arrn = new int[n2 / 2 - 1];
        int n3 = 0;
        for (int i2 = 2; i2 < n2; i2 += 2) {
            arrn[n3++] = (arrby[i2] & 255) << 8 | arrby[i2 + 1] & 255;
        }
        return arrn;
    }

    public String[] b() {
        byte[] arrby = this.e;
        int n2 = arrby.length;
        if (n2 <= 2) {
            return null;
        }
        String[] arrstring = new String[n2 / 2 - 1];
        int n3 = 0;
        for (int i2 = 2; i2 < n2; i2 += 2) {
            int n4 = (arrby[i2] & 255) << 8 | arrby[i2 + 1] & 255;
            arrstring[n3++] = this.c.d(n4);
        }
        return arrstring;
    }

    public void a(int[] arrn) {
        int n2 = arrn.length;
        byte[] arrby = new byte[n2 * 2 + 2];
        l.a(n2, arrby, 0);
        for (int i2 = 0; i2 < n2; ++i2) {
            l.a(arrn[i2], arrby, i2 * 2 + 2);
        }
        this.e = arrby;
    }

    public void a(String[] arrstring) {
        int n2 = arrstring.length;
        byte[] arrby = new byte[n2 * 2 + 2];
        l.a(n2, arrby, 0);
        for (int i2 = 0; i2 < n2; ++i2) {
            l.a(this.c.a(arrstring[i2]), arrby, i2 * 2 + 2);
        }
        this.e = arrby;
    }

    public int g() {
        return this.e.length / 2 - 1;
    }

    public int a(int n2) {
        int n3 = n2 * 2 + 2;
        return (this.e[n3] & 255) << 8 | this.e[n3 + 1] & 255;
    }
}

