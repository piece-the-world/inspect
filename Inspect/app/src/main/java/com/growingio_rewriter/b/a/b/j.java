/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a.b;

import com.growingio.b.a.Q;
import com.growingio.b.a.T;
import com.growingio.b.a.aA;
import com.growingio.b.a.b.e;
import com.growingio.b.a.b.p;
import com.growingio.b.a.b.q;
import com.growingio.b.a.i;
import com.growingio.b.g;
import java.io.IOException;
import java.lang.reflect.Method;

public class j
extends p {
    int a;

    public j(int n2, Q q2) {
        super('c', q2);
        this.a = n2;
    }

    public j(String string, Q q2) {
        super('c', q2);
        this.a(string);
    }

    public j(Q q2) {
        super('c', q2);
        this.a("java.lang.Class");
    }

    @Override
    Object a(ClassLoader classLoader, g g2, Method method) throws ClassNotFoundException {
        String string = this.a();
        if (string.equals("void")) {
            return Void.TYPE;
        }
        if (string.equals("int")) {
            return Integer.TYPE;
        }
        if (string.equals("byte")) {
            return Byte.TYPE;
        }
        if (string.equals("long")) {
            return Long.TYPE;
        }
        if (string.equals("double")) {
            return Double.TYPE;
        }
        if (string.equals("float")) {
            return Float.TYPE;
        }
        if (string.equals("char")) {
            return Character.TYPE;
        }
        if (string.equals("short")) {
            return Short.TYPE;
        }
        if (string.equals("boolean")) {
            return Boolean.TYPE;
        }
        return j.a(classLoader, string);
    }

    @Override
    Class a(ClassLoader classLoader) throws ClassNotFoundException {
        return j.a(classLoader, "java.lang.Class");
    }

    public String a() {
        String string = this.c.E(this.a);
        try {
            return aA.e(string).d();
        }
        catch (i var2_2) {
            throw new RuntimeException(var2_2);
        }
    }

    public void a(String string) {
        String string2 = T.d(string);
        this.a = this.c.c(string2);
    }

    public String toString() {
        return this.a().replace('$', '.') + ".class";
    }

    @Override
    public void a(e e2) throws IOException {
        e2.c(this.c.E(this.a));
    }

    @Override
    public void a(q q2) {
        q2.a(this);
    }
}

