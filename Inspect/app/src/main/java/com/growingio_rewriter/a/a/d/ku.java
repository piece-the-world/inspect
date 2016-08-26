/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.S;
import com.growingio.a.a.d.gb;
import com.growingio.a.a.d.kl;
import com.growingio.a.a.d.km;
import com.growingio.a.a.d.kv;
import java.util.Iterator;
import java.util.Set;

final class ku
extends S<E> {
    final /* synthetic */ kl a;
    final /* synthetic */ kl b;

    ku(kl kl2, kl kl3) {
        this.a = kl2;
        this.b = kl3;
    }

    @Override
    public int a(Object object) {
        int n2 = this.a.a(object);
        return n2 == 0 ? 0 : Math.max(0, n2 - this.b.a(object));
    }

    @Override
    Iterator<km<E>> b() {
        Iterator iterator = this.a.a().iterator();
        return new kv(this, iterator);
    }

    @Override
    int c() {
        return gb.b(this.b());
    }
}

