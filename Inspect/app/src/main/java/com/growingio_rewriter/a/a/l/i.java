/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.l;

import com.growingio.a.a.b.aq;
import com.growingio.a.a.l.g;

class i
implements aq<String, String> {
    final /* synthetic */ g a;

    i(g g2) {
        this.a = g2;
    }

    public String a(String string) {
        return g.g().d(string) ? string : g.g(string);
    }

    @Override
    public /* synthetic */ Object f(Object object) {
        return this.a((String)object);
    }
}

