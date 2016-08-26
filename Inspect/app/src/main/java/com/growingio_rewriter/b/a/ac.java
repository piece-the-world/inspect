/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a;

import com.growingio.b.a.Q;
import com.growingio.b.a.R;
import com.growingio.b.a.h;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class ac {
    Q a;
    int b;
    int c;
    String d;
    String e;
    int f;
    ArrayList g;

    private ac(Q q2) {
        this.a = q2;
        this.b = 0;
        this.g = null;
    }

    public ac(Q q2, String string, String string2) {
        this(q2);
        this.c = q2.c(string);
        this.d = string;
        this.f = q2.c(string2);
    }

    ac(Q q2, DataInputStream dataInputStream) throws IOException {
        this(q2);
        this.a(dataInputStream);
    }

    public String toString() {
        return this.b() + " " + this.d();
    }

    void a(Q q2) {
        this.c = q2.c(this.b());
        this.f = q2.c(this.d());
        this.g = h.a(this.g, q2);
        this.a = q2;
    }

    void b(Q q2) {
        h h2;
        int n2;
        h h3;
        ArrayList<h> arrayList = new ArrayList<h>();
        h h4 = this.c("RuntimeInvisibleAnnotations");
        if (h4 != null) {
            h4 = h4.a(q2, null);
            arrayList.add(h4);
        }
        if ((h3 = this.c("RuntimeVisibleAnnotations")) != null) {
            h3 = h3.a(q2, null);
            arrayList.add(h3);
        }
        if ((h2 = this.c("Signature")) != null) {
            h2 = h2.a(q2, null);
            arrayList.add(h2);
        }
        if ((n2 = this.e()) != 0) {
            n2 = this.a.a(n2, q2, null);
            arrayList.add(new R(q2, n2));
        }
        this.g = arrayList;
        this.c = q2.c(this.b());
        this.f = q2.c(this.d());
        this.a = q2;
    }

    public Q a() {
        return this.a;
    }

    public String b() {
        if (this.d == null) {
            this.d = this.a.E(this.c);
        }
        return this.d;
    }

    public void a(String string) {
        this.c = this.a.c(string);
        this.d = string;
    }

    public int c() {
        return this.b;
    }

    public void a(int n2) {
        this.b = n2;
    }

    public String d() {
        return this.a.E(this.f);
    }

    public void b(String string) {
        if (!string.equals(this.d())) {
            this.f = this.a.c(string);
        }
    }

    public int e() {
        if ((this.b & 8) == 0) {
            return 0;
        }
        R r2 = (R)this.c("ConstantValue");
        if (r2 == null) {
            return 0;
        }
        return r2.a();
    }

    public List f() {
        if (this.g == null) {
            this.g = new ArrayList();
        }
        return this.g;
    }

    public h c(String string) {
        return h.a(this.g, string);
    }

    public void a(h h2) {
        if (this.g == null) {
            this.g = new ArrayList();
        }
        h.b(this.g, h2.c());
        this.g.add(h2);
    }

    private void a(DataInputStream dataInputStream) throws IOException {
        this.b = dataInputStream.readUnsignedShort();
        this.c = dataInputStream.readUnsignedShort();
        this.f = dataInputStream.readUnsignedShort();
        int n2 = dataInputStream.readUnsignedShort();
        this.g = new ArrayList();
        for (int i2 = 0; i2 < n2; ++i2) {
            this.g.add(h.a(this.a, dataInputStream));
        }
    }

    void a(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeShort(this.b);
        dataOutputStream.writeShort(this.c);
        dataOutputStream.writeShort(this.f);
        if (this.g == null) {
            dataOutputStream.writeShort(0);
        } else {
            dataOutputStream.writeShort(this.g.size());
            h.a(this.g, dataOutputStream);
        }
    }
}

