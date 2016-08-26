/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a;

import com.growingio.b.a.m;
import com.growingio.b.a.s;
import com.growingio.b.a.t;
import com.growingio.b.a.u;
import com.growingio.b.a.v;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class r {
    private m c = new m(512);
    private t d;
    private u e;
    private v f;
    int a;
    int b;

    public r(int n2, int n3) {
        this.c.c(-889275714);
        this.c.b(n3);
        this.c.b(n2);
        this.d = new t(this.c);
        this.e = new u(this.d);
        this.f = new v(this.d);
    }

    public t a() {
        return this.d;
    }

    public u b() {
        return this.e;
    }

    public v c() {
        return this.f;
    }

    public byte[] a(int n2, int n3, int n4, int[] arrn, s s2) {
        this.d.a();
        this.c.b(n2);
        this.c.b(n3);
        this.c.b(n4);
        if (arrn == null) {
            this.c.b(0);
        } else {
            int n5 = arrn.length;
            this.c.b(n5);
            for (int i2 = 0; i2 < n5; ++i2) {
                this.c.b(arrn[i2]);
            }
        }
        this.c.d(this.e.b() + this.f.c() + 6);
        try {
            this.c.b(this.e.a());
            this.e.a(this.c);
            this.c.b(this.f.b());
            this.f.a(this.c);
        }
        catch (IOException var6_7) {
            // empty catch block
        }
        r.a(this.c, s2, 0);
        return this.c.c();
    }

    public void a(DataOutputStream dataOutputStream, int n2, int n3, int n4, int[] arrn, s s2) throws IOException {
        this.d.a();
        this.c.a(dataOutputStream);
        dataOutputStream.writeShort(n2);
        dataOutputStream.writeShort(n3);
        dataOutputStream.writeShort(n4);
        if (arrn == null) {
            dataOutputStream.writeShort(0);
        } else {
            int n5 = arrn.length;
            dataOutputStream.writeShort(n5);
            for (int i2 = 0; i2 < n5; ++i2) {
                dataOutputStream.writeShort(arrn[i2]);
            }
        }
        dataOutputStream.writeShort(this.e.a());
        this.e.a(dataOutputStream);
        dataOutputStream.writeShort(this.f.b());
        this.f.a(dataOutputStream);
        if (s2 == null) {
            dataOutputStream.writeShort(0);
        } else {
            dataOutputStream.writeShort(s2.a());
            s2.a(dataOutputStream);
        }
    }

    static void a(m m2, s s2, int n2) {
        if (s2 == null) {
            m2.b(n2);
            return;
        }
        m2.b(s2.a() + n2);
        DataOutputStream dataOutputStream = new DataOutputStream(m2);
        try {
            s2.a(dataOutputStream);
            dataOutputStream.flush();
        }
        catch (IOException var4_4) {
            // empty catch block
        }
    }
}

