/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a;

import com.growingio.b.a.Q;
import com.growingio.b.a.aq;
import java.io.DataInputStream;
import java.io.IOException;

class ai
extends aq {
    static final int a = 11;

    public ai(int n2, int n3, int n4) {
        super(n2, n3, n4);
    }

    public ai(DataInputStream dataInputStream, int n2) throws IOException {
        super(dataInputStream, n2);
    }

    @Override
    public int a() {
        return 11;
    }

    @Override
    public String b() {
        return "Interface";
    }

    @Override
    protected int a(Q q2, int n2, int n3) {
        return q2.d(n2, n3);
    }
}

