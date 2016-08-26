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

class ae
extends O {
    static final int a = 4;
    float b;

    public ae(float f2, int n2) {
        super(n2);
        this.b = f2;
    }

    public ae(DataInputStream dataInputStream, int n2) throws IOException {
        super(n2);
        this.b = dataInputStream.readFloat();
    }

    public int hashCode() {
        return Float.floatToIntBits(this.b);
    }

    public boolean equals(Object object) {
        return object instanceof ae && ((ae)object).b == this.b;
    }

    @Override
    public int a() {
        return 4;
    }

    @Override
    public int a(Q q2, Q q3, Map map) {
        return q3.a(this.b);
    }

    @Override
    public void a(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeByte(4);
        dataOutputStream.writeFloat(this.b);
    }

    @Override
    public void a(PrintWriter printWriter) {
        printWriter.print("Float ");
        printWriter.println(this.b);
    }
}

