/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a;

import com.growingio.b.a.O;
import com.growingio.b.a.Q;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

class ao
extends O {
    static final int a = 5;
    long b;

    public ao(long l2, int n2) {
        super(n2);
        this.b = l2;
    }

    public ao(DataInputStream dataInputStream, int n2) throws IOException {
        super(n2);
        this.b = dataInputStream.readLong();
    }

    public int hashCode() {
        return (int)(this.b ^ this.b >>> 32);
    }

    public boolean equals(Object object) {
        return object instanceof ao && ((ao)object).b == this.b;
    }

    @Override
    public int a() {
        return 5;
    }

    @Override
    public int a(Q q2, Q q3, Map map) {
        return q3.a(this.b);
    }

    @Override
    public void a(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeByte(5);
        dataOutputStream.writeLong(this.b);
    }

    @Override
    public void a(PrintWriter printWriter) {
        printWriter.print("Long ");
        printWriter.println(this.b);
    }
}

