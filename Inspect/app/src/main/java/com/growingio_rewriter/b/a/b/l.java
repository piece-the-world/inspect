/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a.b;

import com.growingio.b.a.Q;
import com.growingio.b.a.T;
import com.growingio.b.a.b.e;
import com.growingio.b.a.b.p;
import com.growingio.b.a.b.q;
import com.growingio.b.g;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class l
extends p {
    int a;
    int b;

    public l(int n2, int n3, Q q2) {
        super('e', q2);
        this.a = n2;
        this.b = n3;
    }

    public l(Q q2) {
        super('e', q2);
        this.b = 0;
        this.a = 0;
    }

    @Override
    Object a(ClassLoader classLoader, g g2, Method method) throws ClassNotFoundException {
        try {
            return this.a(classLoader).getField(this.b()).get(null);
        }
        catch (NoSuchFieldException var4_4) {
            throw new ClassNotFoundException(this.a() + "." + this.b());
        }
        catch (IllegalAccessException var4_5) {
            throw new ClassNotFoundException(this.a() + "." + this.b());
        }
    }

    @Override
    Class a(ClassLoader classLoader) throws ClassNotFoundException {
        return l.a(classLoader, this.a());
    }

    public String a() {
        return T.c(this.c.E(this.a));
    }

    public void a(String string) {
        this.a = this.c.c(T.d(string));
    }

    public String b() {
        return this.c.E(this.b);
    }

    public void b(String string) {
        this.b = this.c.c(string);
    }

    public String toString() {
        return this.a() + "." + this.b();
    }

    @Override
    public void a(e e2) throws IOException {
        e2.a(this.c.E(this.a), this.b());
    }

    @Override
    public void a(q q2) {
        q2.a(this);
    }
}

