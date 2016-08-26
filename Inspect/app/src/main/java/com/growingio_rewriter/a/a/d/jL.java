/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.jK;
import com.growingio.a.a.d.jr;
import com.growingio.a.a.d.lH;
import com.growingio.a.a.d.mz;

public abstract class jL<K0, V0>
extends jK<K0, V0> {
    jL() {
    }

    public abstract <K extends K0, V extends V0> mz<K, V> f();

    public <K extends K0, V extends V0> mz<K, V> c(jr<? extends K, ? extends V> jr2) {
        return (mz)super.b(jr2);
    }

    @Override
    public /* synthetic */ lH b(jr jr2) {
        return this.c(jr2);
    }

    @Override
    public /* synthetic */ lH e() {
        return this.f();
    }

    @Override
    public /* synthetic */ jr a(jr jr2) {
        return this.c(jr2);
    }

    @Override
    public /* synthetic */ jr d() {
        return this.f();
    }
}

