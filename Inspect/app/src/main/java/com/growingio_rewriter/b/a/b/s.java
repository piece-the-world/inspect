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

public class s
extends p {
    int a;

    public s(int n2, Q q2) {
        super('S', q2);
        this.a = n2;
    }

    public s(short s2, Q q2) {
        super('S', q2);
        this.a(s2);
    }

    public s(Q q2) {
        super('S', q2);
        this.a(0);
    }

    @Override
    Object a(ClassLoader classLoader, g g2, Method method) {
        return new Short(this.a());
    }

    @Override
    Class a(ClassLoader classLoader) {
        return Short.TYPE;
    }

    public short a() {
        return (short)this.c.z(this.a);
    }

    public void a(short s2) {
        this.a = this.c.L(s2);
    }

    public String toString() {
        return Short.toString(this.a());
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

