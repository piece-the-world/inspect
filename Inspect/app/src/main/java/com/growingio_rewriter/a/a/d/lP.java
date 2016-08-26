/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.ea;
import com.growingio.a.a.d.fg;
import java.util.List;

final class lP
extends ea<List<E>> {
    final /* synthetic */ ea a;

    lP(ea ea2) {
        this.a = ea2;
    }

    @Override
    public int size() {
        return this.a.size();
    }

    public List<E> b(int n2) {
        return ((fg)this.a.get(n2)).h();
    }

    @Override
    boolean i_() {
        return true;
    }

    @Override
    public /* synthetic */ Object get(int n2) {
        return this.b(n2);
    }
}

