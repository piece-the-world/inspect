/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.oP;
import java.util.Enumeration;

final class gf
extends oP<T> {
    final /* synthetic */ Enumeration a;

    gf(Enumeration enumeration) {
        this.a = enumeration;
    }

    @Override
    public boolean hasNext() {
        return this.a.hasMoreElements();
    }

    @Override
    public T next() {
        return (T)this.a.nextElement();
    }
}

