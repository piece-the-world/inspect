/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aq;
import java.util.Iterator;

final class fQ
implements aq<Iterable<? extends T>, Iterator<? extends T>> {
    fQ() {
    }

    public Iterator<? extends T> a(Iterable<? extends T> iterable) {
        return iterable.iterator();
    }

    @Override
    public /* synthetic */ Object f(Object object) {
        return this.a((Iterable)object);
    }
}

