/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a.b;

import com.growingio.b.a.Q;
import com.growingio.b.a.b.e;
import com.growingio.b.a.b.p;
import com.growingio.b.a.b.q;
import com.growingio.b.g;
import java.io.IOException;
import java.lang.reflect.Method;

public class n
extends p {
    int a;

    public n(int n2, Q q2) {
        super('I', q2);
        this.a = n2;
    }

    public n(Q q2, int n2) {
        super('I', q2);
        this.a(n2);
    }

    public n(Q q2) {
        super('I', q2);
        this.a(0);
    }

    @Override
    Object a(ClassLoader classLoader, g g2, Method method) {
        return new Integer(this.a());
    }

    @Override
    Class a(ClassLoader classLoader) {
        return Integer.TYPE;
    }

    public int a() {
        return this.c.z(this.a);
    }

    public void a(int n2) {
        this.a = this.c.L(n2);
    }

    public String toString() {
        return Integer.toString(this.a());
    }

    @Override
    public void a(e e2) throws IOException {
        e2.d(this.a());
    }

    @Override
    public void a(q q2) {
        q2.a(this);
    }
}

