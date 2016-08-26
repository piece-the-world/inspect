/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.gN;
import com.growingio.a.a.d.jC;
import com.growingio.a.a.d.jD;
import com.growingio.a.a.d.jN;
import com.growingio.a.a.d.jr;
import com.growingio.a.a.d.jx;
import java.util.Collection;
import java.util.Map;

class jE
extends jC<K0, Object> {
    final /* synthetic */ int a;
    final /* synthetic */ jD b;

    jE(jD jD2, int n2) {
        this.b = jD2;
        this.a = n2;
    }

    @Override
    public <K extends K0, V> gN<K, V> e() {
        return jN.b(this.b.a(), new jx(this.a));
    }

    @Override
    public /* synthetic */ jr d() {
        return this.e();
    }
}

