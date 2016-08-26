/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a.b;

import com.growingio.b.a.Q;
import com.growingio.b.a.T;
import com.growingio.b.a.b.e;
import com.growingio.b.a.b.q;
import com.growingio.b.a.b.r;
import com.growingio.b.g;
import java.io.IOException;
import java.lang.reflect.Method;

public abstract class p {
    Q c;
    char d;

    p(char c2, Q q2) {
        this.c = q2;
        this.d = c2;
    }

    abstract Object a(ClassLoader var1, g var2, Method var3) throws ClassNotFoundException;

    abstract Class a(ClassLoader var1) throws ClassNotFoundException;

    static Class a(ClassLoader classLoader, String string) throws ClassNotFoundException, r {
        try {
            return Class.forName(p.a(string), true, classLoader);
        }
        catch (LinkageError var2_2) {
            throw new r(string, var2_2);
        }
    }

    private static String a(String string) {
        int n2 = string.indexOf("[]");
        if (n2 != -1) {
            String string2 = string.substring(0, n2);
            StringBuffer stringBuffer = new StringBuffer(T.d(string2));
            while (n2 != -1) {
                stringBuffer.insert(0, "[");
                n2 = string.indexOf("[]", n2 + 1);
            }
            return stringBuffer.toString().replace('/', '.');
        }
        return string;
    }

    public abstract void a(q var1);

    public abstract void a(e var1) throws IOException;
}

