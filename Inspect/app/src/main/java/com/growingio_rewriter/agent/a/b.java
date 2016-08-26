/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.agent.a;

import com.growingio.agent.a.a;
import java.util.ArrayList;

final class b
extends com.growingio.d.a.a {
    private final String b;
    private final ArrayList<Object> e;
    final /* synthetic */ a a;

    public b(a a2, String string) {
        this.a = a2;
        super(327680);
        this.e = new ArrayList();
        this.b = string;
    }

    @Override
    public void a(String string, Object object) {
        this.e.add(object);
    }

    @Override
    public com.growingio.d.a.a a(String string, String string2) {
        return null;
    }

    @Override
    public com.growingio.d.a.a a(String string) {
        return null;
    }

    @Override
    public void b_() {
        this.a.a(this.b, this.e.toArray(new String[0]));
    }

    @Override
    public void a(String string, String string2, String string3) {
    }
}

