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

class bt
extends O {
    static final int a = 1;
    String b;

    public bt(String string, int n2) {
        super(n2);
        this.b = string;
    }

    public bt(DataInputStream dataInputStream, int n2) throws IOException {
        super(n2);
        this.b = dataInputStream.readUTF();
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public boolean equals(Object object) {
        return object instanceof bt && ((bt)object).b.equals(this.b);
    }

    @Override
    public int a() {
        return 1;
    }

    @Override
    public int a(Q q2, Q q3, Map map) {
        return q3.c(this.b);
    }

    @Override
    public void a(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeByte(1);
        dataOutputStream.writeUTF(this.b);
    }

    @Override
    public void a(PrintWriter printWriter) {
        printWriter.print("UTF8 \"");
        printWriter.print(this.b);
        printWriter.println("\"");
    }
}

