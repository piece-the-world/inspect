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

class ah
extends O {
    static final int a = 3;
    int b;

    public ah(int n2, int n3) {
        super(n3);
        this.b = n2;
    }

    public ah(DataInputStream dataInputStream, int n2) throws IOException {
        super(n2);
        this.b = dataInputStream.readInt();
    }

    public int hashCode() {
        return this.b;
    }

    public boolean equals(Object object) {
        return object instanceof ah && ((ah)object).b == this.b;
    }

    @Override
    public int a() {
        return 3;
    }

    @Override
    public int a(Q q2, Q q3, Map map) {
        return q3.L(this.b);
    }

    @Override
    public void a(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeByte(3);
        dataOutputStream.writeInt(this.b);
    }

    @Override
    public void a(PrintWriter printWriter) {
        printWriter.print("Integer ");
        printWriter.println(this.b);
    }
}

