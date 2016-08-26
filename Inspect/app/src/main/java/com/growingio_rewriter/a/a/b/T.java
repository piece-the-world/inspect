/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.R;
import com.growingio.a.a.b.S;
import java.util.Iterator;

class T
implements Iterator<B> {
    private final Iterator<? extends A> b;
    final /* synthetic */ S a;

    T(S s2) {
        this.a = s2;
        this.b = this.a.a.iterator();
    }

    @Override
    public boolean hasNext() {
        return this.b.hasNext();
    }

    @Override
    public B next() {
        return this.a.b.c(this.b.next());
    }

    @Override
    public void remove() {
        this.b.remove();
    }
}

