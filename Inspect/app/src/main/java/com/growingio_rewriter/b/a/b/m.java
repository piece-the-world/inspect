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

public class m
extends p {
    int a;

    public m(int n2, Q q2) {
        super('F', q2);
        this.a = n2;
    }

    public m(float f2, Q q2) {
        super('F', q2);
        this.a(f2);
    }

    public m(Q q2) {
        super('F', q2);
        this.a(0.0f);
    }

    @Override
    Object a(ClassLoader classLoader, g g2, Method method) {
        return new Float(this.a());
    }

    @Override
    Class a(ClassLoader classLoader) {
        return Float.TYPE;
    }

    public float a() {
        return this.c.A(this.a);
    }

    public void a(float f2) {
        this.a = this.c.a(f2);
    }

    public String toString() {
        return Float.toString(this.a());
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

