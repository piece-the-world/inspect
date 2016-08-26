/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.f;

import com.growingio.a.a.f.e;
import com.growingio.a.a.f.p;
import java.util.Iterator;

final class l {
    private final Object a;
    private final Iterator<p> b;

    private l(Object object, Iterator<p> iterator) {
        this.a = object;
        this.b = iterator;
    }

    /* synthetic */ l(Object object, Iterator iterator, e e2) {
        this(object, iterator);
    }

    static /* synthetic */ Iterator a(l l2) {
        return l2.b;
    }

    static /* synthetic */ Object b(l l2) {
        return l2.a;
    }
}

