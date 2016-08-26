/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a;

import com.growingio.b.a.Q;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

abstract class O {
    int c;

    public O(int n2) {
        this.c = n2;
    }

    public abstract int a();

    public String a(Q q2) {
        return null;
    }

    public void a(Q q2, String string, String string2, HashMap hashMap) {
    }

    public void a(Q q2, Map map, HashMap hashMap) {
    }

    public abstract int a(Q var1, Q var2, Map var3);

    public abstract void a(DataOutputStream var1) throws IOException;

    public abstract void a(PrintWriter var1);

    public String toString() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintWriter printWriter = new PrintWriter(byteArrayOutputStream);
        this.a(printWriter);
        return byteArrayOutputStream.toString();
    }
}

