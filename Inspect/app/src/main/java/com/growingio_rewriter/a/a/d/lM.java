/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.gb;
import com.growingio.a.a.d.lJ;
import com.growingio.a.a.d.lN;
import com.growingio.a.a.d.lX;
import java.util.Iterator;
import java.util.Set;

final class lM
extends lX<E> {
    final /* synthetic */ Set a;
    final /* synthetic */ Set b;

    lM(Set set, Set set2) {
        this.a = set;
        this.b = set2;
        super(null);
    }

    @Override
    public Iterator<E> iterator() {
        Iterator iterator = this.a.iterator();
        Iterator iterator2 = this.b.iterator();
        return new lN(this, iterator, iterator2);
    }

    @Override
    public int size() {
        return gb.b(this.iterator());
    }

    @Override
    public boolean isEmpty() {
        return this.a.equals(this.b);
    }

    @Override
    public boolean contains(Object object) {
        return this.a.contains(object) ^ this.b.contains(object);
    }
}

