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

abstract class aq
extends O {
    int b;
    int d;

    public aq(int n2, int n3, int n4) {
        super(n4);
        this.b = n2;
        this.d = n3;
    }

    public aq(DataInputStream dataInputStream, int n2) throws IOException {
        super(n2);
        this.b = dataInputStream.readUnsignedShort();
        this.d = dataInputStream.readUnsignedShort();
    }

    public int hashCode() {
        return this.b << 16 ^ this.d;
    }

    public boolean equals(Object object) {
        if (object instanceof aq) {
            aq aq2 = (aq)object;
            return aq2.b == this.b && aq2.d == this.d && aq2.getClass() == this.getClass();
        }
        return false;
    }

    @Override
    public int a(Q q2, Q q3, Map map) {
        int n2 = q2.b(this.b).a(q2, q3, map);
        int n3 = q2.b(this.d).a(q2, q3, map);
        return this.a(q3, n2, n3);
    }

    protected abstract int a(Q var1, int var2, int var3);

    @Override
    public void a(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeByte(this.a());
        dataOutputStream.writeShort(this.b);
        dataOutputStream.writeShort(this.d);
    }

    @Override
    public void a(PrintWriter printWriter) {
        printWriter.print(this.b() + " #");
        printWriter.print(this.b);
        printWriter.print(", name&type #");
        printWriter.println(this.d);
    }

    public abstract String b();
}

