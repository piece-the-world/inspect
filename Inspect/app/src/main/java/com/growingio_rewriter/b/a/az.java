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
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

public class az
extends h {
    public static final String a = "RuntimeVisibleParameterAnnotations";
    public static final String b = "RuntimeInvisibleParameterAnnotations";

    public az(Q q2, String string, byte[] arrby) {
        super(q2, string, arrby);
    }

    public az(Q q2, String string) {
        this(q2, string, new byte[]{0});
    }

    az(Q q2, int n2, DataInputStream dataInputStream) throws IOException {
        super(q2, n2, dataInputStream);
    }

    public int a() {
        return this.e[0] & 255;
    }

    @Override
    public h a(Q q2, Map map) {
        d d2 = new d(this.e, this.c, q2, map);
        try {
            d2.d();
            return new az(q2, this.c(), d2.a());
        }
        catch (Exception var4_4) {
            throw new RuntimeException(var4_4.toString());
        }
    }

    public a[][] b() {
        try {
            return new e(this.e, this.c).a();
        }
        catch (Exception var1_1) {
            throw new RuntimeException(var1_1.toString());
        }
    }

    public void a(a[][] arra) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        com.growingio.b.a.b.e e2 = new com.growingio.b.a.b.e(byteArrayOutputStream, this.c);
        try {
            int n2 = arra.length;
            e2.a(n2);
            for (int i2 = 0; i2 < n2; ++i2) {
                a[] arra2 = arra[i2];
                e2.b(arra2.length);
                for (int i3 = 0; i3 < arra2.length; ++i3) {
                    arra2[i3].a(e2);
                }
            }
            e2.b();
        }
        catch (IOException var4_5) {
            throw new RuntimeException(var4_5);
        }
        this.a(byteArrayOutputStream.toByteArray());
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
            f2.d();
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
        a[][] arra = this.b();
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        while (n2 < arra.length) {
            a[] arra2 = arra[n2++];
            int n3 = 0;
            while (n3 < arra2.length) {
                stringBuilder.append(arra2[n3++].toString());
                if (n3 == arra2.length) continue;
                stringBuilder.append(" ");
            }
            if (n2 == arra.length) continue;
            stringBuilder.append(", ");
        }
        return stringBuilder.toString();
    }
}

