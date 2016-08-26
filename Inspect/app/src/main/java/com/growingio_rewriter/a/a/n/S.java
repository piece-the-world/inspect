/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.n;

import com.growingio.a.a.d.ea;
import com.growingio.a.a.d.ec;
import com.growingio.a.a.d.fg;
import com.growingio.a.a.n.P;
import com.growingio.a.a.n.U;

class S
extends U<K> {
    final /* synthetic */ P c;

    S(P p2, P p3) {
        this.c = p2;
        super(p3);
    }

    @Override
    Iterable<? extends K> c(K k2) {
        return fg.k();
    }

    @Override
    ea<K> a(Iterable<? extends K> iterable) {
        ec<K> ec2 = ea.g();
        for (K k2 : iterable) {
            if (this.b(k2).isInterface()) continue;
            ec2.c(k2);
        }
        return super.a(ec2.b());
    }
}

