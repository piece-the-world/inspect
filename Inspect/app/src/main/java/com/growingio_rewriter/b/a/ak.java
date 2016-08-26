/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a;

import com.growingio.b.a.Q;
import com.growingio.b.a.al;
import com.growingio.b.a.h;
import com.growingio.b.a.l;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Map;

public class ak
extends h {
    public static final String a = "LineNumberTable";

    ak(Q q2, int n2, DataInputStream dataInputStream) throws IOException {
        super(q2, n2, dataInputStream);
    }

    private ak(Q q2, byte[] arrby) {
        super(q2, "LineNumberTable", arrby);
    }

    public int a() {
        return l.a(this.e, 0);
    }

    public int a(int n2) {
        return l.a(this.e, n2 * 4 + 2);
    }

    public int b(int n2) {
        return l.a(this.e, n2 * 4 + 4);
    }

    public int c(int n2) {
        int n3;
        int n4 = this.a();
        for (n3 = 0; n3 < n4; ++n3) {
            if (n2 >= this.a(n3)) continue;
            if (n3 != 0) break;
            return this.b(0);
        }
        return this.b(n3 - 1);
    }

    public int d(int n2) {
        int n3 = this.a();
        for (int i2 = 0; i2 < n3; ++i2) {
            if (n2 != this.b(i2)) continue;
            return this.a(i2);
        }
        return -1;
    }

    public al e(int n2) {
        int n3 = this.a();
        int n4 = 0;
        int n5 = 0;
        if (n3 > 0) {
            n5 = this.b(0) - n2;
            n4 = this.a(0);
        }
        for (int i2 = 1; i2 < n3; ++i2) {
            int n6 = this.b(i2) - n2;
            if ((n6 >= 0 || n6 <= n5) && (n6 < 0 || n6 >= n5 && n5 >= 0)) continue;
            n5 = n6;
            n4 = this.a(i2);
        }
        al al2 = new al();
        al2.a = n4;
        al2.b = n2 + n5;
        return al2;
    }

    @Override
    public h a(Q q2, Map map) {
        byte[] arrby = this.e;
        int n2 = arrby.length;
        byte[] arrby2 = new byte[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            arrby2[i2] = arrby[i2];
        }
        ak ak2 = new ak(q2, arrby2);
        return ak2;
    }

    void a(int n2, int n3, boolean bl2) {
        int n4 = this.a();
        for (int i2 = 0; i2 < n4; ++i2) {
            int n5 = i2 * 4 + 2;
            int n6 = l.a(this.e, n5);
            if (n6 <= n2 && (!bl2 || n6 != n2)) continue;
            l.a(n6 + n3, this.e, n5);
        }
    }
}

