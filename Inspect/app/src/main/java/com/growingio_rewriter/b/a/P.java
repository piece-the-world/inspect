/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a;

import com.growingio.b.a.O;
import com.growingio.b.a.Q;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

class P
extends O {
    public P(int n2) {
        super(n2);
    }

    @Override
    public int a() {
        return 0;
    }

    @Override
    public int a(Q q2, Q q3, Map map) {
        return q3.e();
    }

    @Override
    public void a(DataOutputStream dataOutputStream) throws IOException {
    }

    @Override
    public void a(PrintWriter printWriter) {
        printWriter.println("padding");
    }
}

