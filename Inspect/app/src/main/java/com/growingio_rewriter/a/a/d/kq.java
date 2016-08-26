/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.S;
import com.growingio.a.a.d.kl;
import com.growingio.a.a.d.km;
import com.growingio.a.a.d.kr;
import com.growingio.a.a.d.lI;
import java.util.Iterator;
import java.util.Set;

final class kq
extends S<E> {
    final /* synthetic */ kl a;
    final /* synthetic */ kl b;

    kq(kl kl2, kl kl3) {
        this.a = kl2;
        this.b = kl3;
    }

    @Override
    public int a(Object object) {
        int n2 = this.a.a(object);
        return n2 == 0 ? 0 : Math.min(n2, this.b.a(object));
    }

    @Override
    Set<E> e() {
        return lI.b(this.a.d(), this.b.d());
    }

    @Override
    Iterator<km<E>> b() {
        Iterator iterator = this.a.a().iterator();
        return new kr(this, iterator);
    }

    @Override
    int c() {
        return this.d().size();
    }
}

