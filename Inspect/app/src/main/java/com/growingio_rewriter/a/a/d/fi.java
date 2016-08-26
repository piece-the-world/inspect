/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.ea;
import com.growingio.a.a.d.fg;
import com.growingio.a.a.d.fj;
import com.growingio.a.a.d.oP;
import java.util.Iterator;

abstract class fi<E>
extends fg<E> {
    fi() {
    }

    abstract E a(int var1);

    @Override
    public oP<E> k_() {
        return this.h().k_();
    }

    @Override
    ea<E> m() {
        return new fj(this);
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.k_();
    }
}

