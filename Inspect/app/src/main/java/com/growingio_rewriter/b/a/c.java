/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a;

import com.growingio.b.a.Q;
import com.growingio.b.a.b.a;
import com.growingio.b.a.d;
import com.growingio.b.a.e;
import com.growingio.b.a.f;
import com.growingio.b.a.h;
import com.growingio.b.a.l;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

public class c
extends h {
    public static final String a = "RuntimeVisibleAnnotations";
    public static final String b = "RuntimeInvisibleAnnotations";

    public c(Q q2, String string, byte[] arrby) {
        super(q2, string, arrby);
    }

    public c(Q q2, String string) {
        this(q2, string, new byte[]{0, 0});
    }

    c(Q q2, int n2, DataInputStream dataInputStream) throws IOException {
        super(q2, n2, dataInputStream);
    }

    public int a() {
        return l.a(this.e, 0);
    }

    @Override
    public h a(Q q2, Map map) {
        d d2 = new d(this.e, this.c, q2, map);
        try {
            d2.e();
            return new c(q2, this.c(), d2.a());
        }
        catch (Exception var4_4) {
            throw new RuntimeException(var4_4);
        }
    }

    public a a(String string) {
        a[] arra = this.b();
        for (int i2 = 0; i2 < arra.length; ++i2) {
            if (!arra[i2].a().equals(string)) continue;
            return arra[i2];
        }
        return null;
    }

    public void a(a a2) {
        String string = a2.a();
        a[] arra = this.b();
        for (int i2 = 0; i2 < arra.length; ++i2) {
            if (!arra[i2].a().equals(string)) continue;
            arra[i2] = a2;
            this.a(arra);
            return;
        }
        a[] arra2 = new a[arra.length + 1];
        System.arraycopy(arra, 0, arra2, 0, arra.length);
        arra2[arra.length] = a2;
        this.a(arra2);
    }

    public a[] b() {
        try {
            return new e(this.e, this.c).b();
        }
        catch (Exception var1_1) {
            throw new RuntimeException(var1_1);
        }
    }

    public void a(a[] arra) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        com.growingio.b.a.b.e e2 = new com.growingio.b.a.b.e(byteArrayOutputStream, this.c);
        try {
            int n2 = arra.length;
            e2.b(n2);
            for (int i2 = 0; i2 < n2; ++i2) {
                arra[i2].a(e2);
            }
            e2.b();
        }
        catch (IOException var4_5) {
            throw new RuntimeException(var4_5);
        }
        this.a(byteArrayOutputStream.toByteArray());
    }

    public void b(a a2) {
        this.a(new a[]{a2});
    }

    @Override
    void a(String string, String string2) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put(string, string2);
        this.a(hashMap);
    }

    @Override
    void a(Map map) {
        f f2 = new f(this.e, this.d(), map);
        try {
            f2.e();
        }
        catch (Exception var3_3) {
            throw new RuntimeException(var3_3);
        }
    }

    @Override
    void b(Map map) {
        this.a(map);
    }

    public String toString() {
        a[] arra = this.b();
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        while (n2 < arra.length) {
            stringBuilder.append(arra[n2++].toString());
            if (n2 == arra.length) continue;
            stringBuilder.append(", ");
        }
        return stringBuilder.toString();
    }
}

