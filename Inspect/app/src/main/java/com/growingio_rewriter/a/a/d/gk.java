/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.oP;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

final class gk
extends oP<List<T>> {
    final /* synthetic */ Iterator a;
    final /* synthetic */ int b;
    final /* synthetic */ boolean c;

    gk(Iterator iterator, int n2, boolean bl2) {
        this.a = iterator;
        this.b = n2;
        this.c = bl2;
    }

    @Override
    public boolean hasNext() {
        return this.a.hasNext();
    }

    public List<T> a() {
        int n2;
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        Object[] arrobject = new Object[this.b];
        for (n2 = 0; n2 < this.b && this.a.hasNext(); ++n2) {
            arrobject[n2] = this.a.next();
        }
        for (int i2 = n2; i2 < this.b; ++i2) {
            arrobject[i2] = null;
        }
        List<Object> list = Collections.unmodifiableList(Arrays.asList(arrobject));
        return this.c || n2 == this.b ? list : list.subList(0, n2);
    }

    @Override
    public /* synthetic */ Object next() {
        return this.a();
    }
}

