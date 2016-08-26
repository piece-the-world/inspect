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

public class Y
extends h {
    public static final String a = "EnclosingMethod";

    Y(Q q2, int n2, DataInputStream dataInputStream) throws IOException {
        super(q2, n2, dataInputStream);
    }

    public Y(Q q2, String string, String string2, String string3) {
        super(q2, "EnclosingMethod");
        int n2 = q2.a(string);
        int n3 = q2.a(string2, string3);
        byte[] arrby = new byte[]{(byte)(n2 >>> 8), (byte)n2, (byte)(n3 >>> 8), (byte)n3};
        this.a(arrby);
    }

    public Y(Q q2, String string) {
        super(q2, "EnclosingMethod");
        int n2 = q2.a(string);
        int n3 = 0;
        byte[] arrby = new byte[]{(byte)(n2 >>> 8), (byte)n2, (byte)(n3 >>> 8), (byte)n3};
        this.a(arrby);
    }

    public int a() {
        return l.a(this.f(), 0);
    }

    public int b() {
        return l.a(this.f(), 2);
    }

    public String g() {
        return this.d().d(this.a());
    }

    public String h() {
        Q q2 = this.d();
        int n2 = this.b();
        if (n2 == 0) {
            return "<clinit>";
        }
        int n3 = q2.f(n2);
        return q2.E(n3);
    }

    public String i() {
        Q q2 = this.d();
        int n2 = this.b();
        int n3 = q2.g(n2);
        return q2.E(n3);
    }

    @Override
    public h a(Q q2, Map map) {
        if (this.b() == 0) {
            return new Y(q2, this.g());
        }
        return new Y(q2, this.g(), this.h(), this.i());
    }
}

