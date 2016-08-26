/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b;

import com.growingio.b.A;
import com.growingio.b.B;
import com.growingio.b.C;
import com.growingio.b.D;
import com.growingio.b.E;
import com.growingio.b.F;
import com.growingio.b.G;
import com.growingio.b.H;
import com.growingio.b.a.Q;
import com.growingio.b.a.o;
import com.growingio.b.ae;
import com.growingio.b.b.a.b;
import com.growingio.b.b.f;
import com.growingio.b.u;
import com.growingio.b.v;
import com.growingio.b.x;
import com.growingio.b.y;

public abstract class z {
    public static z a(int n2) {
        return new A(n2);
    }

    public static z a(boolean bl2) {
        return new A(bl2 ? 1 : 0);
    }

    public static z a(long l2) {
        return new B(l2);
    }

    public static z a(float f2) {
        return new y(f2);
    }

    public static z a(double d2) {
        return new x(d2);
    }

    public static z b(String string) {
        return new H(string);
    }

    public static z b(int n2) {
        F f2 = new F();
        f2.a = n2;
        return f2;
    }

    public static z a(com.growingio.b.o o2) {
        E e2 = new E();
        e2.b = o2;
        e2.c = null;
        e2.d = false;
        return e2;
    }

    public static z a(com.growingio.b.o o2, String[] arrstring) {
        E e2 = new E();
        e2.b = o2;
        e2.c = arrstring;
        e2.d = false;
        return e2;
    }

    public static z b(com.growingio.b.o o2) {
        E e2 = new E();
        e2.b = o2;
        e2.c = null;
        e2.d = true;
        return e2;
    }

    public static z b(com.growingio.b.o o2, String[] arrstring) {
        E e2 = new E();
        e2.b = o2;
        e2.c = arrstring;
        e2.d = true;
        return e2;
    }

    public static z a(com.growingio.b.o o2, String string) {
        C c2 = new C();
        c2.b = o2;
        c2.a = string;
        c2.c = null;
        c2.d = false;
        return c2;
    }

    public static z a(com.growingio.b.o o2, String string, String[] arrstring) {
        C c2 = new C();
        c2.b = o2;
        c2.a = string;
        c2.c = arrstring;
        c2.d = false;
        return c2;
    }

    public static z b(com.growingio.b.o o2, String string) {
        C c2 = new C();
        c2.b = o2;
        c2.a = string;
        c2.c = null;
        c2.d = true;
        return c2;
    }

    public static z b(com.growingio.b.o o2, String string, String[] arrstring) {
        C c2 = new C();
        c2.b = o2;
        c2.a = string;
        c2.c = arrstring;
        c2.d = true;
        return c2;
    }

    public static z a(com.growingio.b.o o2, int n2) throws ae {
        return new u(o2.e(), n2);
    }

    public static z a(com.growingio.b.o o2, int[] arrn) {
        return new D(o2, arrn);
    }

    public static z c(String string) {
        return new v(string);
    }

    static z a(b b2) {
        return new G(b2);
    }

    void a(String string) throws com.growingio.b.b {
    }

    abstract int a(com.growingio.b.o var1, String var2, o var3, com.growingio.b.o[] var4, f var5) throws com.growingio.b.b;

    abstract int a(com.growingio.b.o var1, String var2, o var3, f var4) throws com.growingio.b.b;

    int a(Q q2, com.growingio.b.o o2) {
        return 0;
    }
}

