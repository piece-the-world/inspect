/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a;

import com.growingio.b.a.Q;
import com.growingio.b.a.h;
import com.growingio.b.a.k;
import com.growingio.b.a.l;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Map;

public class j
extends h {
    public static final String a = "BootstrapMethods";

    j(Q q2, int n2, DataInputStream dataInputStream) throws IOException {
        super(q2, n2, dataInputStream);
    }

    public j(Q q2, k[] arrk) {
        super(q2, "BootstrapMethods");
        int n2 = 2;
        for (int i2 = 0; i2 < arrk.length; ++i2) {
            n2 += 4 + arrk[i2].b.length * 2;
        }
        byte[] arrby = new byte[n2];
        l.a(arrk.length, arrby, 0);
        int n3 = 2;
        for (int i3 = 0; i3 < arrk.length; ++i3) {
            l.a(arrk[i3].a, arrby, n3);
            l.a(arrk[i3].b.length, arrby, n3 + 2);
            int[] arrn = arrk[i3].b;
            n3 += 4;
            for (int i4 = 0; i4 < arrn.length; ++i4) {
                l.a(arrn[i4], arrby, n3);
                n3 += 2;
            }
        }
        this.a(arrby);
    }

    public k[] a() {
        byte[] arrby = this.f();
        int n2 = l.a(arrby, 0);
        k[] arrk = new k[n2];
        int n3 = 2;
        for (int i2 = 0; i2 < n2; ++i2) {
            int n4 = l.a(arrby, n3);
            int n5 = l.a(arrby, n3 + 2);
            int[] arrn = new int[n5];
            n3 += 4;
            for (int i3 = 0; i3 < n5; ++i3) {
                arrn[i3] = l.a(arrby, n3);
                n3 += 2;
            }
            arrk[i2] = new k(n4, arrn);
        }
        return arrk;
    }

    @Override
    public h a(Q q2, Map map) {
        k[] arrk = this.a();
        Q q3 = this.d();
        for (int i2 = 0; i2 < arrk.length; ++i2) {
            k k2 = arrk[i2];
            k2.a = q3.a(k2.a, q2, map);
            for (int i3 = 0; i3 < k2.b.length; ++i3) {
                k2.b[i3] = q3.a(k2.b[i3], q2, map);
            }
        }
        return new j(q2, arrk);
    }
}

