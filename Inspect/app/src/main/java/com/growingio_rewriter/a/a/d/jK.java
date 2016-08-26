/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.jr;
import com.growingio.a.a.d.js;
import com.growingio.a.a.d.jt;
import com.growingio.a.a.d.lH;

public abstract class jK<K0, V0>
extends js<K0, V0> {
    jK() {
        super(null);
    }

    public abstract <K extends K0, V extends V0> lH<K, V> e();

    public <K extends K0, V extends V0> lH<K, V> b(jr<? extends K, ? extends V> jr2) {
        return (lH)super.a(jr2);
    }

    @Override
    public /* synthetic */ jr a(jr jr2) {
        return this.b(jr2);
    }

    @Override
    public /* synthetic */ jr d() {
        return this.e();
    }
}

