/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a.b;

import com.growingio.b.a.Q;
import com.growingio.b.a.b.e;
import com.growingio.b.a.b.p;
import com.growingio.b.a.b.q;
import java.io.IOException;
import java.lang.reflect.Method;

public class g
extends p {
    int a;

    public g(int n2, Q q2) {
        super('Z', q2);
        this.a = n2;
    }

    public g(boolean bl2, Q q2) {
        super('Z', q2);
        this.a(bl2);
    }

    public g(Q q2) {
        super('Z', q2);
        this.a(false);
    }

    @Override
    Object a(ClassLoader classLoader, com.growingio.b.g g2, Method method) {
        return new Boolean(this.a());
    }

    @Override
    Class a(ClassLoader classLoader) {
        return Boolean.TYPE;
    }

    public boolean a() {
        return this.c.z(this.a) != 0;
    }

    public void a(boolean bl2) {
        this.a = this.c.L(bl2 ? 1 : 0);
    }

    public String toString() {
        return this.a() ? "true" : "false";
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

