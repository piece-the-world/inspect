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

class ar
extends O {
    static final int a = 15;
    int b;
    int d;

    public ar(int n2, int n3, int n4) {
        super(n4);
        this.b = n2;
        this.d = n3;
    }

    public ar(DataInputStream dataInputStream, int n2) throws IOException {
        super(n2);
        this.b = dataInputStream.readUnsignedByte();
        this.d = dataInputStream.readUnsignedShort();
    }

    public int hashCode() {
        return this.b << 16 ^ this.d;
    }

    public boolean equals(Object object) {
        if (object instanceof ar) {
            ar ar2 = (ar)object;
            return ar2.b == this.b && ar2.d == this.d;
        }
        return false;
    }

    @Override
    public int a() {
        return 15;
    }

    @Override
    public int a(Q q2, Q q3, Map map) {
        return q3.e(this.b, q2.b(this.d).a(q2, q3, map));
    }

    @Override
    public void a(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeByte(15);
        dataOutputStream.writeByte(this.b);
        dataOutputStream.writeShort(this.d);
    }

    @Override
    public void a(PrintWriter printWriter) {
        printWriter.print("MethodHandle #");
        printWriter.print(this.b);
        printWriter.print(", index #");
        printWriter.println(this.d);
    }
}

