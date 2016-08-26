/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.fi;
import com.growingio.a.a.d.lx;
import com.growingio.a.a.d.ly;
import com.growingio.a.a.d.nC;

final class lz
extends fi<nC<R, C, V>> {
    final /* synthetic */ lx a;

    private lz(lx lx2) {
        this.a = lx2;
    }

    @Override
    public int size() {
        return this.a.n();
    }

    nC<R, C, V> b(int n2) {
        return this.a.a(n2);
    }

    @Override
    public boolean contains(Object object) {
        if (object instanceof nC) {
            nC nC2 = (nC)object;
            Object object2 = this.a.b(nC2.a(), nC2.b());
            return object2 != null && object2.equals(nC2.c());
        }
        return false;
    }

    @Override
    boolean i_() {
        return false;
    }

    @Override
    /* synthetic */ Object a(int n2) {
        return this.b(n2);
    }

    /* synthetic */ lz(lx lx2, ly ly2) {
        this(lx2);
    }
}

