/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.b.aH;
import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.bG;
import com.growingio.a.a.d.hE;
import com.growingio.a.a.o.a.dr;
import java.util.concurrent.ConcurrentMap;

class do<L>
extends dr<L> {
    final ConcurrentMap<Integer, L> a;
    final bG<L> b;
    final int c;

    do(int n2, bG<L> bG2) {
        super(n2);
        this.c = this.d == -1 ? Integer.MAX_VALUE : this.d + 1;
        this.b = bG2;
        this.a = new hE().f().h();
    }

    @Override
    public L a(int n2) {
        L l2;
        if (this.c != Integer.MAX_VALUE) {
            aU.a(n2, this.a());
        }
        if ((l2 = this.a.get(n2)) != null) {
            return l2;
        }
        L l3 = this.b.a();
        l2 = this.a.putIfAbsent(n2, l3);
        return aH.a(l2, l3);
    }

    @Override
    public int a() {
        return this.c;
    }
}

