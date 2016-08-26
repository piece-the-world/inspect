/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.fg;
import com.growingio.a.a.d.fh;
import com.growingio.a.a.d.gb;
import com.growingio.a.a.d.lX;
import com.growingio.a.a.k.f;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

final class lJ
extends lX<E> {
    final /* synthetic */ Set a;
    final /* synthetic */ Set b;
    final /* synthetic */ Set c;

    lJ(Set set, Set set2, Set set3) {
        this.a = set;
        this.b = set2;
        this.c = set3;
        super(null);
    }

    @Override
    public int size() {
        return f.i(this.a.size(), this.b.size());
    }

    @Override
    public boolean isEmpty() {
        return this.a.isEmpty() && this.c.isEmpty();
    }

    @Override
    public Iterator<E> iterator() {
        return gb.a(gb.b(this.a.iterator(), this.b.iterator()));
    }

    @Override
    public boolean contains(Object object) {
        return this.a.contains(object) || this.c.contains(object);
    }

    @Override
    public <S extends Set<E>> S a(S s2) {
        s2.addAll(this.a);
        s2.addAll(this.c);
        return s2;
    }

    @Override
    public fg<E> a() {
        return new fh().b(this.a).b(this.c).b();
    }
}

