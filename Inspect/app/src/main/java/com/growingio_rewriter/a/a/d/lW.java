/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.ei;
import com.growingio.a.a.d.i;
import com.growingio.a.a.d.lV;
import com.growingio.a.a.d.lY;
import java.util.Set;

class lW
extends i<Set<E>> {
    final /* synthetic */ lV a;

    lW(lV lV2, int n2) {
        this.a = lV2;
        super(n2);
    }

    protected Set<E> b(int n2) {
        return new lY(this.a.a, n2);
    }

    @Override
    protected /* synthetic */ Object a(int n2) {
        return this.b(n2);
    }
}

