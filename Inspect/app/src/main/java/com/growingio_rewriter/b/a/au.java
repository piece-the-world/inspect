/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a;

import com.growingio.b.a.O;
import com.growingio.b.a.Q;
import com.growingio.b.a.T;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

class au
extends O {
    static final int a = 16;
    int b;

    public au(int n2, int n3) {
        super(n3);
        this.b = n2;
    }

    public au(DataInputStream dataInputStream, int n2) throws IOException {
        super(n2);
        this.b = dataInputStream.readUnsignedShort();
    }

    public int hashCode() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (object instanceof au) {
            return ((au)object).b == this.b;
        }
        return false;
    }

    @Override
    public int a() {
        return 16;
    }

    @Override
    public void a(Q q2, String string, String string2, HashMap hashMap) {
        String string3;
        String string4 = q2.E(this.b);
        if (string4 != (string3 = T.a(string4, string, string2))) {
            if (hashMap == null) {
                this.b = q2.c(string3);
            } else {
                hashMap.remove(this);
                this.b = q2.c(string3);
                hashMap.put(this, this);
            }
        }
    }

    @Override
    public void a(Q q2, Map map, HashMap hashMap) {
        String string;
        String string2 = q2.E(this.b);
        if (string2 != (string = T.a(string2, map))) {
            if (hashMap == null) {
                this.b = q2.c(string);
            } else {
                hashMap.remove(this);
                this.b = q2.c(string);
                hashMap.put(this, this);
            }
        }
    }

    @Override
    public int a(Q q2, Q q3, Map map) {
        String string = q2.E(this.b);
        string = T.a(string, map);
        return q3.M(q3.c(string));
    }

    @Override
    public void a(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeByte(16);
        dataOutputStream.writeShort(this.b);
    }

    @Override
    public void a(PrintWriter printWriter) {
        printWriter.print("MethodType #");
        printWriter.println(this.b);
    }
}

