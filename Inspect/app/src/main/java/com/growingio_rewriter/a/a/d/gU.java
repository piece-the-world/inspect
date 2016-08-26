/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.k.f;
import java.math.RoundingMode;
import java.util.AbstractList;
import java.util.List;

class gU<T>
extends AbstractList<List<T>> {
    final List<T> a;
    final int b;

    gU(List<T> list, int n2) {
        this.a = list;
        this.b = n2;
    }

    public List<T> a(int n2) {
        aU.a(n2, this.size());
        int n3 = n2 * this.b;
        int n4 = Math.min(n3 + this.b, this.a.size());
        return this.a.subList(n3, n4);
    }

    @Override
    public int size() {
        return f.a(this.a.size(), this.b, RoundingMode.CEILING);
    }

    @Override
    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override
    public /* synthetic */ Object get(int n2) {
        return this.a(n2);
    }
}

