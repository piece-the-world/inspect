/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a;

import com.growingio.b.a.Q;
import com.growingio.b.a.aq;
import java.io.DataInputStream;
import java.io.IOException;

class av
extends aq {
    static final int a = 10;

    public av(int n2, int n3, int n4) {
        super(n2, n3, n4);
    }

    public av(DataInputStream dataInputStream, int n2) throws IOException {
        super(dataInputStream, n2);
    }

    @Override
    public int a() {
        return 10;
    }

    @Override
    public String b() {
        return "Method";
    }

    @Override
    protected int a(Q q2, int n2, int n3) {
        return q2.c(n2, n3);
    }
}

