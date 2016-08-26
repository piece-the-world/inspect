/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import java.util.Enumeration;
import java.util.Iterator;

final class gg
implements Enumeration<T> {
    final /* synthetic */ Iterator a;

    gg(Iterator iterator) {
        this.a = iterator;
    }

    @Override
    public boolean hasMoreElements() {
        return this.a.hasNext();
    }

    @Override
    public T nextElement() {
        return (T)this.a.next();
    }
}

