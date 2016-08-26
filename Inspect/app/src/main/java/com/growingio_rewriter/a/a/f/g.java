/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.f;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.kV;
import com.growingio.a.a.f.d;
import com.growingio.a.a.f.e;
import com.growingio.a.a.f.h;
import com.growingio.a.a.f.p;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

final class g
extends d {
    private final ConcurrentLinkedQueue<h> a = kV.b();

    private g() {
    }

    @Override
    void a(Object object, Iterator<p> iterator) {
        h h2;
        aU.a(object);
        while (iterator.hasNext()) {
            this.a.add(new h(object, iterator.next(), null));
        }
        while ((h2 = this.a.poll()) != null) {
            h.b(h2).a(h.a(h2));
        }
    }

    /* synthetic */ g(e e2) {
        this();
    }
}

