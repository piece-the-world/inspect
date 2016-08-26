/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.f;

import com.growingio.a.a.d.kV;
import com.growingio.a.a.f.i;
import com.growingio.a.a.f.l;
import java.util.Queue;

class j
extends ThreadLocal<Queue<l>> {
    final /* synthetic */ i a;

    j(i i2) {
        this.a = i2;
    }

    protected Queue<l> a() {
        return kV.a();
    }

    @Override
    protected /* synthetic */ Object initialValue() {
        return this.a();
    }
}

