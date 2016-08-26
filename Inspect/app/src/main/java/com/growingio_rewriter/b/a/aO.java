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

public class aO
extends h {
    public static final String a = "SourceFile";

    aO(Q q2, int n2, DataInputStream dataInputStream) throws IOException {
        super(q2, n2, dataInputStream);
    }

    public aO(Q q2, String string) {
        super(q2, "SourceFile");
        int n2 = q2.c(string);
        byte[] arrby = new byte[]{(byte)(n2 >>> 8), (byte)n2};
        this.a(arrby);
    }

    public String a() {
        return this.d().E(l.a(this.f(), 0));
    }

    @Override
    public h a(Q q2, Map map) {
        return new aO(q2, this.a());
    }
}

