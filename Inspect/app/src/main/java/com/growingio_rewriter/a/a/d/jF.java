/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.gN;
import com.growingio.a.a.d.jB;
import com.growingio.a.a.d.jC;
import com.growingio.a.a.d.jD;
import com.growingio.a.a.d.jN;
import com.growingio.a.a.d.jr;
import java.util.Collection;
import java.util.Map;

class jF
extends jC<K0, Object> {
    final /* synthetic */ jD a;

    jF(jD jD2) {
        this.a = jD2;
    }

    @Override
    public <K extends K0, V> gN<K, V> e() {
        return jN.b(this.a.a(), jB.c());
    }

    @Override
    public /* synthetic */ jr d() {
        return this.e();
    }
}

