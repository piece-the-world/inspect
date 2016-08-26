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

class w
extends O {
    static final int a = 7;
    int b;

    public w(int n2, int n3) {
        super(n3);
        this.b = n2;
    }

    public w(DataInputStream dataInputStream, int n2) throws IOException {
        super(n2);
        this.b = dataInputStream.readUnsignedShort();
    }

    public int hashCode() {
        return this.b;
    }

    public boolean equals(Object object) {
        return object instanceof w && ((w)object).b == this.b;
    }

    @Override
    public int a() {
        return 7;
    }

    @Override
    public String a(Q q2) {
        return q2.E(this.b);
    }

    @Override
    public void a(Q q2, String string, String string2, HashMap hashMap) {
        String string3;
        String string4 = q2.E(this.b);
        String string5 = null;
        if (string4.equals(string)) {
            string5 = string2;
        } else if (string4.charAt(0) == '[' && string4 != (string3 = T.a(string4, string, string2))) {
            string5 = string3;
        }
        if (string5 != null) {
            if (hashMap == null) {
                this.b = q2.c(string5);
            } else {
                hashMap.remove(this);
                this.b = q2.c(string5);
                hashMap.put(this, this);
            }
        }
    }

    @Override
    public void a(Q q2, Map map, HashMap hashMap) {
        String string = q2.E(this.b);
        String string2 = null;
        if (string.charAt(0) == '[') {
            String string3 = T.a(string, map);
            if (string != string3) {
                string2 = string3;
            }
        } else {
            String string4 = (String)map.get(string);
            if (string4 != null && !string4.equals(string)) {
                string2 = string4;
            }
        }
        if (string2 != null) {
            if (hashMap == null) {
                this.b = q2.c(string2);
            } else {
                hashMap.remove(this);
                this.b = q2.c(string2);
                hashMap.put(this, this);
            }
        }
    }

    @Override
    public int a(Q q2, Q q3, Map map) {
        String string;
        String string2 = q2.E(this.b);
        if (map != null && (string = (String)map.get(string2)) != null) {
            string2 = string;
        }
        return q3.a(string2);
    }

    @Override
    public void a(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeByte(7);
        dataOutputStream.writeShort(this.b);
    }

    @Override
    public void a(PrintWriter printWriter) {
        printWriter.print("Class #");
        printWriter.println(this.b);
    }
}

