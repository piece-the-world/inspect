/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.o.a.bU;
import com.growingio.a.a.o.a.j;

final class r
implements Runnable {
    final bU<? extends V> a;
    final /* synthetic */ j b;

    r(bU<? extends V> var1_1) {
        this.b = var1_1;
        this.a = bU2;
    }

    @Override
    public void run() {
        if (j.a(this.b) != this) {
            return;
        }
        j.a(this.b, this.a, this);
    }
}

