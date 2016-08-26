/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.agent.compile.a;

import com.growingio.agent.a.a;
import com.growingio.agent.compile.k;
import com.growingio.agent.compile.m;
import com.growingio.d.a.u;

public class n
extends a {
    final k a;
    final m b;

    public n(String string, k k2) {
        super(string);
        this.a = k2;
        this.b = k2.a();
    }

    @Override
    public void a(String string, String string2, String string3) {
        super.a(string, string2, string3);
        this.a.a(this.b(), string, u.a(string2).d(), string3);
    }

    @Override
    public void a(String string, Object object) {
        super.a(string, object);
        this.a.a(this.b(), string, object.getClass().getName(), object.toString());
    }
}

