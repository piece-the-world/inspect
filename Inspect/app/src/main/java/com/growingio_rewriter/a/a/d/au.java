/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.al;
import com.growingio.a.a.d.am;
import com.growingio.a.a.d.ao;
import com.growingio.a.a.d.at;
import com.growingio.a.a.d.ei;
import java.util.Map;

class au
extends ao<R, Map<C, V>> {
    final /* synthetic */ al a;

    private au(al al2) {
        this.a = al2;
        super(al.c(al2), null);
    }

    @Override
    String a() {
        return "Row";
    }

    Map<C, V> c(int n2) {
        return new at(this.a, n2);
    }

    @Override
    Map<C, V> a(int n2, Map<C, V> map) {
        throw new UnsupportedOperationException();
    }

    public Map<C, V> a(R r2, Map<C, V> map) {
        throw new UnsupportedOperationException();
    }

    @Override
    public /* synthetic */ Object put(Object object, Object object2) {
        return this.a(object, (Map)object2);
    }

    @Override
    /* synthetic */ Object b(int n2) {
        return this.c(n2);
    }

    /* synthetic */ au(al al2, am am2) {
        this(al2);
    }
}

