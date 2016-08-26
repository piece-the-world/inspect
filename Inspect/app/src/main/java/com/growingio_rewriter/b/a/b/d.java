/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a.b;

import com.growingio.b.a.Q;
import com.growingio.b.a.b.a;
import com.growingio.b.a.b.c;
import com.growingio.b.a.b.e;
import com.growingio.b.a.b.p;
import com.growingio.b.a.b.q;
import com.growingio.b.g;
import java.io.IOException;
import java.lang.reflect.Method;

public class d
extends p {
    a a;

    public d(Q q2) {
        this(null, q2);
    }

    public d(a a2, Q q2) {
        super('@', q2);
        this.a = a2;
    }

    @Override
    Object a(ClassLoader classLoader, g g2, Method method) throws ClassNotFoundException {
        return c.a(classLoader, this.a(classLoader), g2, this.a);
    }

    @Override
    Class a(ClassLoader classLoader) throws ClassNotFoundException {
        if (this.a == null) {
            throw new ClassNotFoundException("no type specified");
        }
        return d.a(classLoader, this.a.a());
    }

    public a a() {
        return this.a;
    }

    public void a(a a2) {
        this.a = a2;
    }

    public String toString() {
        return this.a.toString();
    }

    @Override
    public void a(e e2) throws IOException {
        e2.c();
        this.a.a(e2);
    }

    @Override
    public void a(q q2) {
        q2.a(this);
    }
}

