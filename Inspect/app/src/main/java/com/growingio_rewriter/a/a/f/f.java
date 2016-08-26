/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.f;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.f.d;
import com.growingio.a.a.f.p;
import java.util.Iterator;

final class f
extends d {
    private static final f a = new f();

    private f() {
    }

    @Override
    void a(Object object, Iterator<p> iterator) {
        aU.a(object);
        while (iterator.hasNext()) {
            iterator.next().a(object);
        }
    }

    static /* synthetic */ f d() {
        return a;
    }
}

