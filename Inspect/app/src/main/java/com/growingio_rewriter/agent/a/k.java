/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.agent.a;

import com.growingio.agent.a.i;
import com.growingio.agent.a.l;
import com.growingio.d.a.a.f;
import com.growingio.d.a.r;
import java.util.ArrayList;
import java.util.Collection;

class k
extends f {
    private final String b;
    private final Collection<i> c = new ArrayList<i>();
    String a;

    public k(String string) {
        this.b = string;
    }

    public Collection<i> b() {
        return this.c;
    }

    @Override
    public void a(int n2, int n3, String string, String string2, String string3, String[] arrstring) {
        this.a = string;
    }

    @Override
    public r a(int n2, String string, String string2, String string3, String[] arrstring) {
        return new l(this, string, string2);
    }

    static /* synthetic */ String a(k k2) {
        return k2.b;
    }

    static /* synthetic */ Collection b(k k2) {
        return k2.c;
    }
}

