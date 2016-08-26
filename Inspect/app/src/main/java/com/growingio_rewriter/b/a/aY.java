/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a;

import com.growingio.b.a.Q;
import com.growingio.b.a.aP;
import java.io.ByteArrayOutputStream;

public class aY {
    private ByteArrayOutputStream a = new ByteArrayOutputStream();

    public byte[] a() {
        return this.a.toByteArray();
    }

    public aP a(Q q2) {
        return new aP(q2, this.a.toByteArray());
    }

    public void a(int n2, int n3) {
        this.a.write(n2);
        if (n2 == 7 || n2 == 8) {
            this.a(n3);
        }
    }

    public void a(int n2) {
        this.a.write(n2 >>> 8 & 255);
        this.a.write(n2 & 255);
    }
}

