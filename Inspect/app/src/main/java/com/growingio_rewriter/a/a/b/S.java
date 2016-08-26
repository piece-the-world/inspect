/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.R;
import com.growingio.a.a.b.T;
import java.util.Iterator;

class S
implements Iterable<B> {
    final /* synthetic */ Iterable a;
    final /* synthetic */ R b;

    S(R r2, Iterable iterable) {
        this.b = r2;
        this.a = iterable;
    }

    @Override
    public Iterator<B> iterator() {
        return new T(this);
    }
}

