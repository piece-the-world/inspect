/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.I;
import com.growingio.a.a.d.aK;
import com.growingio.a.a.d.bv;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class L
implements Iterator<E> {
    final Iterator<Map.Entry<E, bv>> a;
    Map.Entry<E, bv> b;
    int c;
    boolean d;
    final /* synthetic */ I e;

    L(I i2) {
        this.e = i2;
        this.a = I.a(i2).entrySet().iterator();
    }

    @Override
    public boolean hasNext() {
        return this.c > 0 || this.a.hasNext();
    }

    @Override
    public E next() {
        if (this.c == 0) {
            this.b = this.a.next();
            this.c = this.b.getValue().a();
        }
        --this.c;
        this.d = true;
        return this.b.getKey();
    }

    @Override
    public void remove() {
        aK.a(this.d);
        int n2 = this.b.getValue().a();
        if (n2 <= 0) {
            throw new ConcurrentModificationException();
        }
        if (this.b.getValue().b(-1) == 0) {
            this.a.remove();
        }
        I.c(this.e);
        this.d = false;
    }
}

