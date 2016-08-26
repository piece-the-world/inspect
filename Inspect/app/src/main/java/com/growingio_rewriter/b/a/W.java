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

class W
extends O {
    static final int a = 6;
    double b;

    public W(double d2, int n2) {
        super(n2);
        this.b = d2;
    }

    public W(DataInputStream dataInputStream, int n2) throws IOException {
        super(n2);
        this.b = dataInputStream.readDouble();
    }

    public int hashCode() {
        long l2 = Double.doubleToLongBits(this.b);
        return (int)(l2 ^ l2 >>> 32);
    }

    public boolean equals(Object object) {
        return object instanceof W && ((W)object).b == this.b;
    }

    @Override
    public int a() {
        return 6;
    }

    @Override
    public int a(Q q2, Q q3, Map map) {
        return q3.a(this.b);
    }

    @Override
    public void a(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeByte(6);
        dataOutputStream.writeDouble(this.b);
    }

    @Override
    public void a(PrintWriter printWriter) {
        printWriter.print("Double ");
        printWriter.println(this.b);
    }
}

