/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.jD;
import com.growingio.a.a.d.jL;
import com.growingio.a.a.d.jM;
import com.growingio.a.a.d.jN;
import com.growingio.a.a.d.jr;
import com.growingio.a.a.d.lH;
import com.growingio.a.a.d.mz;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;

class jI
extends jL<K0, V0> {
    final /* synthetic */ Comparator a;
    final /* synthetic */ jD b;

    jI(jD jD2, Comparator comparator) {
        this.b = jD2;
        this.a = comparator;
    }

    @Override
    public <K extends K0, V extends V0> mz<K, V> f() {
        return jN.d(this.b.a(), new jM(this.a));
    }

    @Override
    public /* synthetic */ lH e() {
        return this.f();
    }

    @Override
    public /* synthetic */ jr d() {
        return this.f();
    }
}

