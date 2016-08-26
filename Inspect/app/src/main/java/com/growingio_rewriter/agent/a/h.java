/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.agent.a;

import com.growingio.agent.a.f;
import com.growingio.agent.a.g;
import com.growingio.d.a.a;
import com.growingio.d.a.e;
import java.util.ArrayList;
import java.util.Collection;

class h
extends com.growingio.d.a.a.h {
    private final String a;
    private final Collection<f> b = new ArrayList<f>();
    private String c;

    public h(String string) {
        this.a = string;
    }

    public Collection<f> b() {
        return this.b;
    }

    public static Collection<f> a(e e2, String string) {
        h h2 = new h(string);
        e2.a(h2, 0);
        return h2.b();
    }

    @Override
    public void a(int n2, int n3, String string, String string2, String string3, String[] arrstring) {
        this.c = string;
    }

    @Override
    public a a(String string, boolean bl2) {
        if (!this.a.equals(string)) {
            return null;
        }
        g g2 = new g(this.c, string);
        this.b.add(g2);
        return g2;
    }
}

