/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.jD;
import com.growingio.a.a.d.jK;
import com.growingio.a.a.d.jN;
import com.growingio.a.a.d.jr;
import com.growingio.a.a.d.jy;
import com.growingio.a.a.d.lH;
import java.util.Collection;
import java.util.Map;

class jJ
extends jK<K0, V0> {
    final /* synthetic */ Class a;
    final /* synthetic */ jD b;

    jJ(jD jD2, Class class_) {
        this.b = jD2;
        this.a = class_;
    }

    @Override
    public <K extends K0, V extends V0> lH<K, V> e() {
        jy jy2 = new jy(this.a);
        return jN.c(this.b.a(), jy2);
    }

    @Override
    public /* synthetic */ jr d() {
        return this.e();
    }
}

