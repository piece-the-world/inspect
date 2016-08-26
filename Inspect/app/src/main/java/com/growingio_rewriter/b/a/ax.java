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

class ax
extends O {
    static final int a = 12;
    int b;
    int d;

    public ax(int n2, int n3, int n4) {
        super(n4);
        this.b = n2;
        this.d = n3;
    }

    public ax(DataInputStream dataInputStream, int n2) throws IOException {
        super(n2);
        this.b = dataInputStream.readUnsignedShort();
        this.d = dataInputStream.readUnsignedShort();
    }

    public int hashCode() {
        return this.b << 16 ^ this.d;
    }

    public boolean equals(Object object) {
        if (object instanceof ax) {
            ax ax2 = (ax)object;
            return ax2.b == this.b && ax2.d == this.d;
        }
        return false;
    }

    @Override
    public int a() {
        return 12;
    }

    @Override
    public void a(Q q2, String string, String string2, HashMap hashMap) {
        String string3;
        String string4 = q2.E(this.d);
        if (string4 != (string3 = T.a(string4, string, string2))) {
            if (hashMap == null) {
                this.d = q2.c(string3);
            } else {
                hashMap.remove(this);
                this.d = q2.c(string3);
                hashMap.put(this, this);
            }
        }
    }

    @Override
    public void a(Q q2, Map map, HashMap hashMap) {
        String string;
        String string2 = q2.E(this.d);
        if (string2 != (string = T.a(string2, map))) {
            if (hashMap == null) {
                this.d = q2.c(string);
            } else {
                hashMap.remove(this);
                this.d = q2.c(string);
                hashMap.put(this, this);
            }
        }
    }

    @Override
    public int a(Q q2, Q q3, Map map) {
        String string = q2.E(this.b);
        String string2 = q2.E(this.d);
        string2 = T.a(string2, map);
        return q3.a(q3.c(string), q3.c(string2));
    }

    @Override
    public void a(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeByte(12);
        dataOutputStream.writeShort(this.b);
        dataOutputStream.writeShort(this.d);
    }

    @Override
    public void a(PrintWriter printWriter) {
        printWriter.print("NameAndType #");
        printWriter.print(this.b);
        printWriter.print(", type #");
        printWriter.println(this.d);
    }
}

