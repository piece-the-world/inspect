/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.al;
import com.growingio.a.a.d.am;
import com.growingio.a.a.d.ao;
import com.growingio.a.a.d.ar;
import com.growingio.a.a.d.ei;
import java.util.Map;

class as
extends ao<C, Map<R, V>> {
    final /* synthetic */ al a;

    private as(al al2) {
        this.a = al2;
        super(al.d(al2), null);
    }

    @Override
    String a() {
        return "Column";
    }

    Map<R, V> c(int n2) {
        return new ar(this.a, n2);
    }

    @Override
    Map<R, V> a(int n2, Map<R, V> map) {
        throw new UnsupportedOperationException();
    }

    public Map<R, V> a(C c2, Map<R, V> map) {
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

    /* synthetic */ as(al al2, am am2) {
        this(al2);
    }
}

