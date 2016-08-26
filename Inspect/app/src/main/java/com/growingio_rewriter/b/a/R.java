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

public class R
extends h {
    public static final String a = "ConstantValue";

    R(Q q2, int n2, DataInputStream dataInputStream) throws IOException {
        super(q2, n2, dataInputStream);
    }

    public R(Q q2, int n2) {
        super(q2, "ConstantValue");
        byte[] arrby = new byte[]{(byte)(n2 >>> 8), (byte)n2};
        this.a(arrby);
    }

    public int a() {
        return l.a(this.f(), 0);
    }

    @Override
    public h a(Q q2, Map map) {
        int n2 = this.d().a(this.a(), q2, map);
        return new R(q2, n2);
    }
}

