/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b;

import com.growingio.b.M;
import com.growingio.b.N;
import com.growingio.b.O;
import com.growingio.b.a.o;
import com.growingio.b.b;

public class L {
    public static L a(int n2) {
        return new M(n2);
    }

    public static L a(long l2) {
        return new N(l2);
    }

    public static L a(String string) {
        return new O(string);
    }

    L() {
    }

    int a(o o2) throws b {
        return 0;
    }

    String a() {
        return L.b();
    }

    static String b() {
        return "([Ljava/lang/Object;)Ljava/lang/Object;";
    }

    String c() {
        return L.d();
    }

    static String d() {
        return "([Ljava/lang/Object;)V";
    }
}

