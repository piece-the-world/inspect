/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.S;
import com.growingio.a.a.d.kl;
import com.growingio.a.a.d.km;
import com.growingio.a.a.d.kp;
import com.growingio.a.a.d.lI;
import java.util.Iterator;
import java.util.Set;

final class ko
extends S<E> {
    final /* synthetic */ kl a;
    final /* synthetic */ kl b;

    ko(kl kl2, kl kl3) {
        this.a = kl2;
        this.b = kl3;
    }

    @Override
    public boolean contains(Object object) {
        return this.a.contains(object) || this.b.contains(object);
    }

    @Override
    public boolean isEmpty() {
        return this.a.isEmpty() && this.b.isEmpty();
    }

    @Override
    public int a(Object object) {
        return Math.max(this.a.a(object), this.b.a(object));
    }

    @Override
    Set<E> e() {
        return lI.a(this.a.d(), this.b.d());
    }

    @Override
    Iterator<km<E>> b() {
        Iterator iterator = this.a.a().iterator();
        Iterator iterator2 = this.b.a().iterator();
        return new kp(this, iterator, iterator2);
    }

    @Override
    int c() {
        return this.d().size();
    }
}

