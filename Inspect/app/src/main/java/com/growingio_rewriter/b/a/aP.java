/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a;

import com.growingio.b.a.Q;
import com.growingio.b.a.aQ;
import com.growingio.b.a.aR;
import com.growingio.b.a.aS;
import com.growingio.b.a.aT;
import com.growingio.b.a.aU;
import com.growingio.b.a.aW;
import com.growingio.b.a.h;
import com.growingio.b.a.i;
import com.growingio.b.a.l;
import com.growingio.b.b;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

public class aP
extends h {
    public static final String a = "StackMap";
    public static final int b = 0;
    public static final int f = 1;
    public static final int g = 2;
    public static final int h = 3;
    public static final int i = 4;
    public static final int j = 5;
    public static final int k = 6;
    public static final int l = 7;
    public static final int m = 8;

    aP(Q q2, byte[] arrby) {
        super(q2, "StackMap", arrby);
    }

    aP(Q q2, int n2, DataInputStream dataInputStream) throws IOException {
        super(q2, n2, dataInputStream);
    }

    public int a() {
        return l.a(this.e, 0);
    }

    @Override
    public h a(Q q2, Map map) {
        aQ aQ2 = new aQ(this, q2, map);
        aQ2.a();
        return aQ2.b();
    }

    public void a(int n2, int n3, int n4) throws i {
        byte[] arrby = new aR(this, n2, n3, n4).b();
        this.a(arrby);
    }

    void a(int n2, int n3, boolean bl2) throws i {
        new aU(this, n2, n3, bl2).a();
    }

    void a(int n2, int n3) throws i {
        new aW(this, n2, n3).a();
    }

    public void a(int n2) throws b {
        byte[] arrby = new aS(this, n2).b();
        this.a(arrby);
    }

    public void a(PrintWriter printWriter) {
        new aT(this, printWriter).b();
    }
}

