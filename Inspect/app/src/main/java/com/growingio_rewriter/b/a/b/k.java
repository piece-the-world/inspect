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

public class k
extends p {
    int a;

    public k(int n2, Q q2) {
        super('D', q2);
        this.a = n2;
    }

    public k(double d2, Q q2) {
        super('D', q2);
        this.a(d2);
    }

    public k(Q q2) {
        super('D', q2);
        this.a(0.0);
    }

    @Override
    Object a(ClassLoader classLoader, g g2, Method method) {
        return new Double(this.a());
    }

    @Override
    Class a(ClassLoader classLoader) {
        return Double.TYPE;
    }

    public double a() {
        return this.c.C(this.a);
    }

    public void a(double d2) {
        this.a = this.c.a(d2);
    }

    public String toString() {
        return Double.toString(this.a());
    }

    @Override
    public void a(e e2) throws IOException {
        e2.a(this.a());
    }

    @Override
    public void a(q q2) {
        q2.a(this);
    }
}

