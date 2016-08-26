/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.fi;
import com.growingio.a.a.d.lq;
import com.growingio.a.a.d.lr;

final class ls
extends fi<E> {
    final /* synthetic */ lq a;

    private ls(lq lq2) {
        this.a = lq2;
    }

    @Override
    E a(int n2) {
        return lq.a(this.a)[n2].a();
    }

    @Override
    public boolean contains(Object object) {
        return this.a.contains(object);
    }

    @Override
    boolean i_() {
        return true;
    }

    @Override
    public int size() {
        return lq.a(this.a).length;
    }

    /* synthetic */ ls(lq lq2, lr lr2) {
        this(lq2);
    }
}

