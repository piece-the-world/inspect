/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a;

import com.growingio.b.a.B;
import com.growingio.b.a.Q;
import com.growingio.b.a.T;
import com.growingio.b.a.aP;
import com.growingio.b.a.aZ;
import com.growingio.b.a.ab;
import com.growingio.b.a.ak;
import com.growingio.b.a.b;
import com.growingio.b.a.c.f;
import com.growingio.b.a.h;
import com.growingio.b.a.i;
import com.growingio.b.a.l;
import com.growingio.b.a.p;
import com.growingio.b.a.y;
import com.growingio.b.g;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class as {
    Q a;
    int b;
    int c;
    String d;
    int e;
    ArrayList f;
    public static boolean g = false;
    public static final String h = "<init>";
    public static final String i = "<clinit>";

    private as(Q q2) {
        this.a = q2;
        this.f = null;
    }

    public as(Q q2, String string, String string2) {
        this(q2);
        this.b = 0;
        this.c = q2.c(string);
        this.d = string;
        this.e = this.a.c(string2);
    }

    as(Q q2, DataInputStream dataInputStream) throws IOException {
        this(q2);
        this.a(dataInputStream);
    }

    public as(Q q2, String string, as as2, Map map) throws i {
        this(q2);
        this.a(as2, string, map);
    }

    public String toString() {
        return this.a() + " " + this.g();
    }

    void a(Q q2) {
        this.c = q2.c(this.a());
        this.e = q2.c(this.g());
        this.f = h.a(this.f, q2);
        this.a = q2;
    }

    void b(Q q2) {
        h h2;
        b b2;
        h h3;
        h h4;
        ab ab2;
        h h5;
        ArrayList<h> arrayList = new ArrayList<h>();
        h h6 = this.c("RuntimeInvisibleAnnotations");
        if (h6 != null) {
            h6 = h6.a(q2, null);
            arrayList.add(h6);
        }
        if ((h4 = this.c("RuntimeVisibleAnnotations")) != null) {
            h4 = h4.a(q2, null);
            arrayList.add(h4);
        }
        if ((h3 = this.c("RuntimeInvisibleParameterAnnotations")) != null) {
            h3 = h3.a(q2, null);
            arrayList.add(h3);
        }
        if ((h5 = this.c("RuntimeVisibleParameterAnnotations")) != null) {
            h5 = h5.a(q2, null);
            arrayList.add(h5);
        }
        if ((b2 = (b)this.c("AnnotationDefault")) != null) {
            arrayList.add(b2);
        }
        if ((ab2 = this.i()) != null) {
            arrayList.add(ab2);
        }
        if ((h2 = this.c("Signature")) != null) {
            h2 = h2.a(q2, null);
            arrayList.add(h2);
        }
        this.f = arrayList;
        this.c = q2.c(this.a());
        this.e = q2.c(this.g());
        this.a = q2;
    }

    public String a() {
        if (this.d == null) {
            this.d = this.a.E(this.c);
        }
        return this.d;
    }

    public void a(String string) {
        this.c = this.a.c(string);
        this.d = string;
    }

    public boolean b() {
        String string = this.a();
        return !string.equals("<init>") && !string.equals("<clinit>");
    }

    public Q c() {
        return this.a;
    }

    public boolean d() {
        return this.a().equals("<init>");
    }

    public boolean e() {
        return this.a().equals("<clinit>");
    }

    public int f() {
        return this.b;
    }

    public void a(int n2) {
        this.b = n2;
    }

    public String g() {
        return this.a.E(this.e);
    }

    public void b(String string) {
        if (!string.equals(this.g())) {
            this.e = this.a.c(string);
        }
    }

    public List h() {
        if (this.f == null) {
            this.f = new ArrayList();
        }
        return this.f;
    }

    public h c(String string) {
        return h.a(this.f, string);
    }

    public void a(h h2) {
        if (this.f == null) {
            this.f = new ArrayList();
        }
        h.b(this.f, h2.c());
        this.f.add(h2);
    }

    public ab i() {
        h h2 = h.a(this.f, "Exceptions");
        return (ab)h2;
    }

    public y j() {
        h h2 = h.a(this.f, "Code");
        return (y)h2;
    }

    public void k() {
        h.b(this.f, "Exceptions");
    }

    public void a(ab ab2) {
        this.k();
        if (this.f == null) {
            this.f = new ArrayList();
        }
        this.f.add(ab2);
    }

    public void l() {
        h.b(this.f, "Code");
    }

    public void a(y y2) {
        this.l();
        if (this.f == null) {
            this.f = new ArrayList();
        }
        this.f.add(y2);
    }

    public void a(g g2, p p2) throws i {
        if (p2.r() >= 50) {
            this.a(g2);
        }
        if (g) {
            this.b(g2);
        }
    }

    public void a(g g2) throws i {
        y y2 = this.j();
        if (y2 != null) {
            aZ aZ2 = f.a(g2, this);
            y2.a(aZ2);
        }
    }

    public void b(g g2) throws i {
        y y2 = this.j();
        if (y2 != null) {
            aP aP2 = f.b(g2, this);
            y2.a(aP2);
        }
    }

    public int b(int n2) {
        y y2 = this.j();
        if (y2 == null) {
            return -1;
        }
        ak ak2 = (ak)y2.a("LineNumberTable");
        if (ak2 == null) {
            return -1;
        }
        return ak2.c(n2);
    }

    public void d(String string) throws i {
        if (!this.d()) {
            return;
        }
        y y2 = this.j();
        byte[] arrby = y2.j();
        B b2 = y2.k();
        int n2 = b2.i();
        if (n2 >= 0) {
            Q q2 = this.a;
            int n3 = l.a(arrby, n2 + 1);
            int n4 = q2.q(n3);
            int n5 = q2.a(string);
            int n6 = q2.c(n5, n4);
            l.a(n6, arrby, n2 + 1);
        }
    }

    private void a(as as2, String string, Map map) throws i {
        y y2;
        Q q2 = this.a;
        this.b = as2.b;
        this.c = q2.c(string);
        this.d = string;
        Q q3 = as2.a;
        String string2 = q3.E(as2.e);
        String string3 = T.a(string2, map);
        this.e = q2.c(string3);
        this.f = new ArrayList();
        ab ab2 = as2.i();
        if (ab2 != null) {
            this.f.add(ab2.a(q2, map));
        }
        if ((y2 = as2.j()) != null) {
            this.f.add(y2.a(q2, map));
        }
    }

    private void a(DataInputStream dataInputStream) throws IOException {
        this.b = dataInputStream.readUnsignedShort();
        this.c = dataInputStream.readUnsignedShort();
        this.e = dataInputStream.readUnsignedShort();
        int n2 = dataInputStream.readUnsignedShort();
        this.f = new ArrayList();
        for (int i2 = 0; i2 < n2; ++i2) {
            this.f.add(h.a(this.a, dataInputStream));
        }
    }

    void a(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeShort(this.b);
        dataOutputStream.writeShort(this.c);
        dataOutputStream.writeShort(this.e);
        if (this.f == null) {
            dataOutputStream.writeShort(0);
        } else {
            dataOutputStream.writeShort(this.f.size());
            h.a(this.f, dataOutputStream);
        }
    }
}

