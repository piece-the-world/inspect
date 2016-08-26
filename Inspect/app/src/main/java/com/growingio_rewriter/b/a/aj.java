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

class aj
extends O {
    static final int a = 18;
    int b;
    int d;

    public aj(int n2, int n3, int n4) {
        super(n4);
        this.b = n2;
        this.d = n3;
    }

    public aj(DataInputStream dataInputStream, int n2) throws IOException {
        super(n2);
        this.b = dataInputStream.readUnsignedShort();
        this.d = dataInputStream.readUnsignedShort();
    }

    public int hashCode() {
        return this.b << 16 ^ this.d;
    }

    public boolean equals(Object object) {
        if (object instanceof aj) {
            aj aj2 = (aj)object;
            return aj2.b == this.b && aj2.d == this.d;
        }
        return false;
    }

    @Override
    public int a() {
        return 18;
    }

    @Override
    public int a(Q q2, Q q3, Map map) {
        return q3.f(this.b, q2.b(this.d).a(q2, q3, map));
    }

    @Override
    public void a(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeByte(18);
        dataOutputStream.writeShort(this.b);
        dataOutputStream.writeShort(this.d);
    }

    @Override
    public void a(PrintWriter printWriter) {
        printWriter.print("InvokeDynamic #");
        printWriter.print(this.b);
        printWriter.print(", name&type #");
        printWriter.println(this.d);
    }
}

