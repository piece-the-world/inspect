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

public class af
extends h {
    public static final String a = "InnerClasses";

    af(Q q2, int n2, DataInputStream dataInputStream) throws IOException {
        super(q2, n2, dataInputStream);
    }

    private af(Q q2, byte[] arrby) {
        super(q2, "InnerClasses", arrby);
    }

    public af(Q q2) {
        super(q2, "InnerClasses", new byte[2]);
        l.a(0, this.f(), 0);
    }

    public int a() {
        return l.a(this.f(), 0);
    }

    public int a(int n2) {
        return l.a(this.f(), n2 * 8 + 2);
    }

    public String b(int n2) {
        int n3 = this.a(n2);
        if (n3 == 0) {
            return null;
        }
        return this.c.d(n3);
    }

    public void a(int n2, int n3) {
        l.a(n3, this.f(), n2 * 8 + 2);
    }

    public int c(int n2) {
        return l.a(this.f(), n2 * 8 + 4);
    }

    public String d(int n2) {
        int n3 = this.c(n2);
        if (n3 == 0) {
            return null;
        }
        return this.c.d(n3);
    }

    public void b(int n2, int n3) {
        l.a(n3, this.f(), n2 * 8 + 4);
    }

    public int e(int n2) {
        return l.a(this.f(), n2 * 8 + 6);
    }

    public String f(int n2) {
        int n3 = this.e(n2);
        if (n3 == 0) {
            return null;
        }
        return this.c.E(n3);
    }

    public void c(int n2, int n3) {
        l.a(n3, this.f(), n2 * 8 + 6);
    }

    public int g(int n2) {
        return l.a(this.f(), n2 * 8 + 8);
    }

    public void d(int n2, int n3) {
        l.a(n3, this.f(), n2 * 8 + 8);
    }

    public void a(String string, String string2, String string3, int n2) {
        int n3 = this.c.a(string);
        int n4 = this.c.a(string2);
        int n5 = this.c.c(string3);
        this.a(n3, n4, n5, n2);
    }

    public void a(int n2, int n3, int n4, int n5) {
        int n6;
        byte[] arrby = this.f();
        int n7 = arrby.length;
        byte[] arrby2 = new byte[n7 + 8];
        for (n6 = 2; n6 < n7; ++n6) {
            arrby2[n6] = arrby[n6];
        }
        n6 = l.a(arrby, 0);
        l.a(n6 + 1, arrby2, 0);
        l.a(n2, arrby2, n7);
        l.a(n3, arrby2, n7 + 2);
        l.a(n4, arrby2, n7 + 4);
        l.a(n5, arrby2, n7 + 6);
        this.a(arrby2);
    }

    public int h(int n2) {
        byte[] arrby = this.f();
        int n3 = arrby.length;
        if (n3 < 10) {
            return 0;
        }
        int n4 = l.a(arrby, 0);
        int n5 = 2 + n2 * 8;
        if (n4 <= n2) {
            return n4;
        }
        byte[] arrby2 = new byte[n3 - 8];
        l.a(n4 - 1, arrby2, 0);
        int n6 = 2;
        int n7 = 2;
        while (n6 < n3) {
            if (n6 == n5) {
                n6 += 8;
                continue;
            }
            arrby2[n7++] = arrby[n6++];
        }
        this.a(arrby2);
        return n4 - 1;
    }

    @Override
    public h a(Q q2, Map map) {
        byte[] arrby = this.f();
        byte[] arrby2 = new byte[arrby.length];
        Q q3 = this.d();
        af af2 = new af(q2, arrby2);
        int n2 = l.a(arrby, 0);
        l.a(n2, arrby2, 0);
        int n3 = 2;
        for (int i2 = 0; i2 < n2; ++i2) {
            int n4 = l.a(arrby, n3);
            int n5 = l.a(arrby, n3 + 2);
            int n6 = l.a(arrby, n3 + 4);
            int n7 = l.a(arrby, n3 + 6);
            if (n4 != 0) {
                n4 = q3.a(n4, q2, map);
            }
            l.a(n4, arrby2, n3);
            if (n5 != 0) {
                n5 = q3.a(n5, q2, map);
            }
            l.a(n5, arrby2, n3 + 2);
            if (n6 != 0) {
                n6 = q3.a(n6, q2, map);
            }
            l.a(n6, arrby2, n3 + 4);
            l.a(n7, arrby2, n3 + 6);
            n3 += 8;
        }
        return af2;
    }
}

