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

public class at
extends h {
    public static final String a = "MethodParameters";

    at(Q q2, int n2, DataInputStream dataInputStream) throws IOException {
        super(q2, n2, dataInputStream);
    }

    public at(Q q2, String[] arrstring, int[] arrn) {
        super(q2, "MethodParameters");
        byte[] arrby = new byte[arrstring.length * 4 + 1];
        arrby[0] = (byte)arrstring.length;
        for (int i2 = 0; i2 < arrstring.length; ++i2) {
            l.a(q2.c(arrstring[i2]), arrby, i2 * 4 + 1);
            l.a(arrn[i2], arrby, i2 * 4 + 3);
        }
        this.a(arrby);
    }

    public int a() {
        return this.e[0] & 255;
    }

    public int a(int n2) {
        return l.a(this.e, n2 * 4 + 1);
    }

    public int b(int n2) {
        return l.a(this.e, n2 * 4 + 3);
    }

    @Override
    public h a(Q q2, Map map) {
        int n2 = this.a();
        Q q3 = this.d();
        String[] arrstring = new String[n2];
        int[] arrn = new int[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            arrstring[i2] = q3.E(this.a(i2));
            arrn[i2] = this.b(i2);
        }
        return new at(q2, arrstring, arrn);
    }
}

