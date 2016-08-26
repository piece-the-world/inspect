/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a;

import com.growingio.b.a.Q;
import com.growingio.b.a.bo;
import com.growingio.b.a.bp;
import com.growingio.b.a.h;
import com.growingio.b.a.l;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class bn
extends h {
    public static final String a = "RuntimeVisibleTypeAnnotations";
    public static final String b = "RuntimeInvisibleTypeAnnotations";

    public bn(Q q2, String string, byte[] arrby) {
        super(q2, string, arrby);
    }

    bn(Q q2, int n2, DataInputStream dataInputStream) throws IOException {
        super(q2, n2, dataInputStream);
    }

    public int a() {
        return l.a(this.e, 0);
    }

    @Override
    public h a(Q q2, Map map) {
        bo bo2 = new bo(this.e, this.c, q2, map);
        try {
            bo2.e();
            return new bn(q2, this.c(), bo2.a());
        }
        catch (Exception var4_4) {
            throw new RuntimeException(var4_4);
        }
    }

    @Override
    void a(String string, String string2) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put(string, string2);
        this.a(hashMap);
    }

    @Override
    void a(Map map) {
        bp bp2 = new bp(this.e, this.d(), map);
        try {
            bp2.e();
        }
        catch (Exception var3_3) {
            throw new RuntimeException(var3_3);
        }
    }

    @Override
    void b(Map map) {
        this.a(map);
    }
}

