/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.d.dQ;
import com.growingio.a.a.o.a.aH;
import com.growingio.a.a.o.a.aI;
import com.growingio.a.a.o.a.aJ;
import com.growingio.a.a.o.a.aK;
import com.growingio.a.a.o.a.ah;
import com.growingio.a.a.o.a.ai;
import com.growingio.a.a.o.a.ap;
import com.growingio.a.a.o.a.bU;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

final class aG<V>
extends ah<Object, V> {
    aG(dQ<? extends bU<?>> dQ2, boolean bl2, Executor executor, ap<V> ap2) {
        this.a((ai)((Object)new aK(this, dQ2, bl2, (aJ)((Object)new aH(this, ap2, executor)))));
    }

    aG(dQ<? extends bU<?>> dQ2, boolean bl2, Executor executor, Callable<V> callable) {
        this.a((ai)((Object)new aK(this, dQ2, bl2, (aJ)((Object)new aI(this, callable, executor)))));
    }
}

