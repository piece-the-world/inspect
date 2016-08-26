/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.g.a;

import com.growingio.b.g.a.d;
import com.growingio.b.g.a.h;
import com.growingio.b.g.a.i;

public class k {
    private i a;
    private static d b;

    public Object a(Object[] arrobject, int n2) throws Throwable {
        i i2 = this.a;
        if (i2 == null) {
            return d.a(this, n2, arrobject);
        }
        return i2.a(n2, arrobject);
    }

    public static Object b(Object[] arrobject, int n2) throws Throwable {
        return b.a(n2, arrobject);
    }

    public static Object a(Object[] arrobject, String string) {
        if (arrobject[0] == null) {
            return b.a(string);
        }
        return ((h)arrobject[0]).b().a(string);
    }

    public static Object b(Object[] arrobject, String string) {
        h h2 = (h)arrobject[0];
        if (h2 == null) {
            b.a(string, arrobject[1]);
        } else {
            h2.b().a(string, arrobject[1]);
        }
        return null;
    }
}

