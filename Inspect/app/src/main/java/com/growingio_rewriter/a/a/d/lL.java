/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aV;
import com.growingio.a.a.d.gb;
import com.growingio.a.a.d.lJ;
import com.growingio.a.a.d.lX;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

final class lL
extends lX<E> {
    final /* synthetic */ Set a;
    final /* synthetic */ aV b;
    final /* synthetic */ Set c;

    lL(Set set, aV aV2, Set set2) {
        this.a = set;
        this.b = aV2;
        this.c = set2;
        super(null);
    }

    @Override
    public Iterator<E> iterator() {
        return gb.b(this.a.iterator(), this.b);
    }

    @Override
    public int size() {
        return gb.b(this.iterator());
    }

    @Override
    public boolean isEmpty() {
        return this.c.containsAll(this.a);
    }

    @Override
    public boolean contains(Object object) {
        return this.a.contains(object) && !this.c.contains(object);
    }
}

