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

public class i
extends p {
    int a;

    public i(int n2, Q q2) {
        super('C', q2);
        this.a = n2;
    }

    public i(char c2, Q q2) {
        super('C', q2);
        this.a(c2);
    }

    public i(Q q2) {
        super('C', q2);
        this.a('\u0000');
    }

    @Override
    Object a(ClassLoader classLoader, g g2, Method method) {
        return new Character(this.a());
    }

    @Override
    Class a(ClassLoader classLoader) {
        return Character.TYPE;
    }

    public char a() {
        return (char)this.c.z(this.a);
    }

    public void a(char c2) {
        this.a = this.c.L(c2);
    }

    public String toString() {
        return Character.toString(this.a());
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

