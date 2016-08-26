/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.dQ;
import com.growingio.a.a.o.a.aG;
import com.growingio.a.a.o.a.ah;
import com.growingio.a.a.o.a.ai;
import com.growingio.a.a.o.a.bU;

final class aK
extends ah<Object, V> {
    private aG<V> c;
    final /* synthetic */ aG b;

    aK(dQ<? extends bU<? extends Object>> var1_1, boolean dQ2, aG<V> bl2) {
        this.b = var1_1;
        super((ah)var1_1, dQ2, bl2, false);
        this.c = aG2;
    }

    void a(boolean bl2, int n2, Object object) {
    }

    @Override
    void b() {
        aG<V> aG2 = this.c;
        if (aG2 != null) {
            aG2.d();
        } else {
            aU.b(this.b.isDone());
        }
    }

    @Override
    void a() {
        super.a();
        this.c = null;
    }

    void c() {
        aG<V> aG2 = this.c;
        if (aG2 != null) {
            aG2.e();
        }
    }
}

