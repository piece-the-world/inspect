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

public class t
extends p {
    int a;

    public t(int n2, Q q2) {
        super('s', q2);
        this.a = n2;
    }

    public t(String string, Q q2) {
        super('s', q2);
        this.a(string);
    }

    public t(Q q2) {
        super('s', q2);
        this.a("");
    }

    @Override
    Object a(ClassLoader classLoader, g g2, Method method) {
        return this.a();
    }

    @Override
    Class a(ClassLoader classLoader) {
        return String.class;
    }

    public String a() {
        return this.c.E(this.a);
    }

    public void a(String string) {
        this.a = this.c.c(string);
    }

    public String toString() {
        return "\"" + this.a() + "\"";
    }

    @Override
    public void a(e e2) throws IOException {
        e2.b(this.a());
    }

    @Override
    public void a(q q2) {
        q2.a(this);
    }
}

