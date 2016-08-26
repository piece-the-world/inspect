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

public class o
extends p {
    int a;

    public o(int n2, Q q2) {
        super('J', q2);
        this.a = n2;
    }

    public o(long l2, Q q2) {
        super('J', q2);
        this.a(l2);
    }

    public o(Q q2) {
        super('J', q2);
        this.a(0);
    }

    @Override
    Object a(ClassLoader classLoader, g g2, Method method) {
        return new Long(this.a());
    }

    @Override
    Class a(ClassLoader classLoader) {
        return Long.TYPE;
    }

    public long a() {
        return this.c.B(this.a);
    }

    public void a(long l2) {
        this.a = this.c.a(l2);
    }

    public String toString() {
        return Long.toString(this.a());
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

