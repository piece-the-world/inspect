/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.g;

import com.growingio.a.a.b.aq;
import com.growingio.a.a.g.L;

final class B
implements aq<Object, String> {
    final /* synthetic */ L a;

    B(L l2) {
        this.a = l2;
    }

    public String a(Object object) {
        return String.format("<%s -> %s>", this.a.i(object), this.a.j(object));
    }

    @Override
    public /* synthetic */ Object f(Object object) {
        return this.a(object);
    }
}

