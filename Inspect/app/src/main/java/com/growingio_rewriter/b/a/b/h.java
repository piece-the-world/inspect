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

public class h
extends p {
    int a;

    public h(int n2, Q q2) {
        super('B', q2);
        this.a = n2;
    }

    public h(byte by2, Q q2) {
        super('B', q2);
        this.a(by2);
    }

    public h(Q q2) {
        super('B', q2);
        this.a(0);
    }

    @Override
    Object a(ClassLoader classLoader, g g2, Method method) {
        return new Byte(this.a());
    }

    @Override
    Class a(ClassLoader classLoader) {
        return Byte.TYPE;
    }

    public byte a() {
        return (byte)this.c.z(this.a);
    }

    public void a(byte by2) {
        this.a = this.c.L(by2);
    }

    public String toString() {
        return Byte.toString(this.a());
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

