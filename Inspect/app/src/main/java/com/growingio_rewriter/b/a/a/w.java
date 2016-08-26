/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a.a;

import com.growingio.b.a.B;
import com.growingio.b.a.ay;

public class w
implements ay {
    public static int a(int n2, B b2) {
        int n3;
        return n2 += (n3 = b2.c(n2)) == 201 || n3 == 200 ? b2.g(n2 + 1) : b2.f(n2 + 1);
    }

    public static boolean a(int n2) {
        return n2 >= 153 && n2 <= 168 || n2 == 198 || n2 == 199 || n2 == 201 || n2 == 200;
    }

    public static boolean b(int n2) {
        return n2 == 167 || n2 == 200;
    }

    public static boolean c(int n2) {
        return n2 == 168 || n2 == 201;
    }

    public static boolean d(int n2) {
        return n2 >= 172 && n2 <= 177;
    }
}

