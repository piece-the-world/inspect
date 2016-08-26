/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.ea;
import com.growingio.a.a.d.fg;
import com.growingio.a.a.d.lY;
import com.growingio.a.a.d.oP;
import java.util.NoSuchElementException;

class lZ
extends oP<E> {
    final ea<E> a;
    int b;
    final /* synthetic */ lY c;

    lZ(lY lY2) {
        this.c = lY2;
        this.a = lY.a(this.c).m().h();
        this.b = lY.b(this.c);
    }

    @Override
    public boolean hasNext() {
        return this.b != 0;
    }

    @Override
    public E next() {
        int n2 = Integer.numberOfTrailingZeros(this.b);
        if (n2 == 32) {
            throw new NoSuchElementException();
        }
        this.b &= ~ (1 << n2);
        return this.a.get(n2);
    }
}

