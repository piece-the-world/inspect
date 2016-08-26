/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a.c;

import com.growingio.b.a.Q;
import com.growingio.b.a.c.h;
import com.growingio.b.a.c.l;
import com.growingio.b.a.i;
import com.growingio.b.g;

public class m
extends h {
    private String a;

    public m(String string) {
        this.a = string;
    }

    @Override
    public String g() {
        return this.a;
    }

    @Override
    public l c() {
        return null;
    }

    @Override
    public boolean d() {
        return false;
    }

    @Override
    public int a() {
        return 7;
    }

    @Override
    public int a(Q q2) {
        return q2.a(this.g());
    }

    @Override
    public boolean a(h h2) {
        return this.a.equals(h2.g());
    }

    @Override
    public void a(String string, g g2) throws i {
    }
}

