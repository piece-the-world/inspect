/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.f;

import com.growingio.a.a.f.i;

class k
extends ThreadLocal<Boolean> {
    final /* synthetic */ i a;

    k(i i2) {
        this.a = i2;
    }

    protected Boolean a() {
        return false;
    }

    @Override
    protected /* synthetic */ Object initialValue() {
        return this.a();
    }
}

