/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a;

import com.growingio.b.a.Q;
import com.growingio.b.a.b.p;
import com.growingio.b.a.d;
import com.growingio.b.a.e;
import com.growingio.b.a.h;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

public class b
extends h {
    public static final String a = "AnnotationDefault";

    public b(Q q2, byte[] arrby) {
        super(q2, "AnnotationDefault", arrby);
    }

    public b(Q q2) {
        this(q2, new byte[]{0, 0});
    }

    b(Q q2, int n2, DataInputStream dataInputStream) throws IOException {
        super(q2, n2, dataInputStream);
    }

    @Override
    public h a(Q q2, Map map) {
        d d2 = new d(this.e, this.c, q2, map);
        try {
            d2.g(0);
            return new b(q2, d2.a());
        }
        catch (Exception var4_4) {
            throw new RuntimeException(var4_4.toString());
        }
    }

    public p a() {
        try {
            return new e(this.e, this.c).c();
        }
        catch (Exception var1_1) {
            throw new RuntimeException(var1_1.toString());
        }
    }

    public void a(p p2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        com.growingio.b.a.b.e e2 = new com.growingio.b.a.b.e(byteArrayOutputStream, this.c);
        try {
            p2.a(e2);
            e2.b();
        }
        catch (IOException var4_4) {
            throw new RuntimeException(var4_4);
        }
        this.a(byteArrayOutputStream.toByteArray());
    }

    public String toString() {
        return this.a().toString();
    }
}

