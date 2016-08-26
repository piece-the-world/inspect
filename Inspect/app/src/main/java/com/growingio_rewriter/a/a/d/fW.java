/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.cx;
import java.util.Iterator;
import java.util.List;

final class fW
extends cx<T> {
    final /* synthetic */ List a;
    final /* synthetic */ int b;

    fW(List list, int n2) {
        this.a = list;
        this.b = n2;
    }

    @Override
    public Iterator<T> iterator() {
        int n2 = Math.min(this.a.size(), this.b);
        return this.a.subList(n2, this.a.size()).iterator();
    }
}

