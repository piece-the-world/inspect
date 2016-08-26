/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a;

import com.growingio.b.a.Q;
import com.growingio.b.a.ba;
import com.growingio.b.a.bb;
import com.growingio.b.a.bc;
import com.growingio.b.a.bd;
import com.growingio.b.a.be;
import com.growingio.b.a.bf;
import com.growingio.b.a.bg;
import com.growingio.b.a.bi;
import com.growingio.b.a.h;
import com.growingio.b.a.i;
import com.growingio.b.b;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Map;

public class aZ
extends h {
    public static final String a = "StackMapTable";
    public static final int b = 0;
    public static final int f = 1;
    public static final int g = 2;
    public static final int h = 3;
    public static final int i = 4;
    public static final int j = 5;
    public static final int k = 6;
    public static final int l = 7;
    public static final int m = 8;

    aZ(Q q2, byte[] arrby) {
        super(q2, "StackMapTable", arrby);
    }

    aZ(Q q2, int n2, DataInputStream dataInputStream) throws IOException {
        super(q2, n2, dataInputStream);
    }

    @Override
    public h a(Q q2, Map map) throws bf {
        try {
            return new aZ(q2, new ba(this.c, this.e, q2, map).a());
        }
        catch (i var3_3) {
            throw new bf("bad bytecode. fatal?");
        }
    }

    @Override
    void a(DataOutputStream dataOutputStream) throws IOException {
        super.a(dataOutputStream);
    }

    public void a(int n2, int n3, int n4) throws i {
        byte[] arrby = new bb(this.f(), n2, n3, n4).a();
        this.a(arrby);
    }

    public static int a(char c2) {
        switch (c2) {
            case 'D': {
                return 3;
            }
            case 'F': {
                return 2;
            }
            case 'J': {
                return 4;
            }
            case 'L': 
            case '[': {
                return 7;
            }
        }
        return 1;
    }

    public void a(PrintWriter printWriter) {
        be.a(this, printWriter);
    }

    public void a(PrintStream printStream) {
        be.a(this, new PrintWriter(printStream, true));
    }

    void a(int n2, int n3, boolean bl2) throws i {
        new bd(this, n2, n3).c();
        new bg(this, n2, n3, bl2).a();
    }

    void a(int n2, int n3) throws i {
        new bi(this, n2, n3).a();
    }

    public void a(int n2) throws b {
        try {
            byte[] arrby = new bc(this.f(), n2).a();
            this.a(arrby);
        }
        catch (i var2_3) {
            throw new b("bad stack map table", var2_3);
        }
    }
}

