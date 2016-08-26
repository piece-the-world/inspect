/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a;

import com.growingio.b.a.Q;
import com.growingio.b.a.T;
import com.growingio.b.a.h;
import com.growingio.b.a.l;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Map;

public class am
extends h {
    public static final String a = "LocalVariableTable";
    public static final String b = "LocalVariableTypeTable";

    public am(Q q2) {
        super(q2, "LocalVariableTable", new byte[2]);
        l.a(0, this.e, 0);
    }

    public am(Q q2, String string) {
        super(q2, string, new byte[2]);
        l.a(0, this.e, 0);
    }

    am(Q q2, int n2, DataInputStream dataInputStream) throws IOException {
        super(q2, n2, dataInputStream);
    }

    am(Q q2, String string, byte[] arrby) {
        super(q2, string, arrby);
    }

    public void a(int n2, int n3, int n4, int n5, int n6) {
        int n7 = this.e.length;
        byte[] arrby = new byte[n7 + 10];
        l.a(this.a() + 1, arrby, 0);
        for (int i2 = 2; i2 < n7; ++i2) {
            arrby[i2] = this.e[i2];
        }
        l.a(n2, arrby, n7);
        l.a(n3, arrby, n7 + 2);
        l.a(n4, arrby, n7 + 4);
        l.a(n5, arrby, n7 + 6);
        l.a(n6, arrby, n7 + 8);
        this.e = arrby;
    }

    @Override
    void a(String string, String string2) {
        Q q2 = this.d();
        int n2 = this.a();
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3 = i2 * 10 + 2;
            int n4 = l.a(this.e, n3 + 6);
            if (n4 == 0) continue;
            String string3 = q2.E(n4);
            string3 = this.a(string3, string, string2);
            l.a(q2.c(string3), this.e, n3 + 6);
        }
    }

    String a(String string, String string2, String string3) {
        return T.a(string, string2, string3);
    }

    @Override
    void a(Map map) {
        Q q2 = this.d();
        int n2 = this.a();
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3 = i2 * 10 + 2;
            int n4 = l.a(this.e, n3 + 6);
            if (n4 == 0) continue;
            String string = q2.E(n4);
            string = this.a(string, map);
            l.a(q2.c(string), this.e, n3 + 6);
        }
    }

    String a(String string, Map map) {
        return T.a(string, map);
    }

    public void a(int n2, int n3) {
        int n4 = this.e.length;
        for (int i2 = 2; i2 < n4; i2 += 10) {
            int n5 = l.a(this.e, i2 + 8);
            if (n5 < n2) continue;
            l.a(n5 + n3, this.e, i2 + 8);
        }
    }

    public int a() {
        return l.a(this.e, 0);
    }

    public int a(int n2) {
        return l.a(this.e, n2 * 10 + 2);
    }

    public int b(int n2) {
        return l.a(this.e, n2 * 10 + 4);
    }

    void a(int n2, int n3, boolean bl2) {
        int n4 = this.a();
        for (int i2 = 0; i2 < n4; ++i2) {
            int n5 = i2 * 10 + 2;
            int n6 = l.a(this.e, n5);
            int n7 = l.a(this.e, n5 + 2);
            if (n6 > n2 || bl2 && n6 == n2 && n6 != 0) {
                l.a(n6 + n3, this.e, n5);
                continue;
            }
            if (n6 + n7 <= n2 && (!bl2 || n6 + n7 != n2)) continue;
            l.a(n7 + n3, this.e, n5 + 2);
        }
    }

    public int c(int n2) {
        return l.a(this.e, n2 * 10 + 6);
    }

    public String d(int n2) {
        return this.d().E(this.c(n2));
    }

    public int e(int n2) {
        return l.a(this.e, n2 * 10 + 8);
    }

    public int f(int n2) {
        return this.e(n2);
    }

    public String g(int n2) {
        return this.d().E(this.e(n2));
    }

    public String h(int n2) {
        return this.g(n2);
    }

    public int i(int n2) {
        return l.a(this.e, n2 * 10 + 10);
    }

    @Override
    public h a(Q q2, Map map) {
        byte[] arrby = this.f();
        byte[] arrby2 = new byte[arrby.length];
        Q q3 = this.d();
        am am2 = this.a(q2, arrby2);
        int n2 = l.a(arrby, 0);
        l.a(n2, arrby2, 0);
        int n3 = 2;
        for (int i2 = 0; i2 < n2; ++i2) {
            int n4 = l.a(arrby, n3);
            int n5 = l.a(arrby, n3 + 2);
            int n6 = l.a(arrby, n3 + 4);
            int n7 = l.a(arrby, n3 + 6);
            int n8 = l.a(arrby, n3 + 8);
            l.a(n4, arrby2, n3);
            l.a(n5, arrby2, n3 + 2);
            if (n6 != 0) {
                n6 = q3.a(n6, q2, null);
            }
            l.a(n6, arrby2, n3 + 4);
            if (n7 != 0) {
                String string = q3.E(n7);
                string = T.a(string, map);
                n7 = q2.c(string);
            }
            l.a(n7, arrby2, n3 + 6);
            l.a(n8, arrby2, n3 + 8);
            n3 += 10;
        }
        return am2;
    }

    am a(Q q2, byte[] arrby) {
        return new am(q2, "LocalVariableTable", arrby);
    }
}

