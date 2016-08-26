/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.aR;
import java.util.Iterator;

final class aQ
implements Iterable<T> {
    final /* synthetic */ Iterable a;

    aQ(Iterable iterable) {
        this.a = iterable;
    }

    @Override
    public Iterator<T> iterator() {
        return new aR(this);
    }
}

