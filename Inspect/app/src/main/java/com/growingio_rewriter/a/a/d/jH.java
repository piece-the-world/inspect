/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.jA;
import com.growingio.a.a.d.jD;
import com.growingio.a.a.d.jK;
import com.growingio.a.a.d.jN;
import com.growingio.a.a.d.jr;
import com.growingio.a.a.d.lH;
import java.util.Collection;
import java.util.Map;

class jH
extends jK<K0, Object> {
    final /* synthetic */ int a;
    final /* synthetic */ jD b;

    jH(jD jD2, int n2) {
        this.b = jD2;
        this.a = n2;
    }

    @Override
    public <K extends K0, V> lH<K, V> e() {
        return jN.c(this.b.a(), new jA(this.a));
    }

    @Override
    public /* synthetic */ jr d() {
        return this.e();
    }
}

