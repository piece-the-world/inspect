/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.hG;
import com.growingio.a.a.d.hH;
import java.util.AbstractSet;

abstract class hU<E>
extends AbstractSet<E> {
    private hU() {
    }

    @Override
    public Object[] toArray() {
        return hG.a(this).toArray();
    }

    @Override
    public <E> E[] toArray(E[] arrE) {
        return hG.a(this).toArray(arrE);
    }

    /* synthetic */ hU(hH hH2) {
        this();
    }
}

