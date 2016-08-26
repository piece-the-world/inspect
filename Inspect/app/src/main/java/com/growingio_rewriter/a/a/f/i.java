/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.f;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.f.d;
import com.growingio.a.a.f.e;
import com.growingio.a.a.f.j;
import com.growingio.a.a.f.k;
import com.growingio.a.a.f.l;
import com.growingio.a.a.f.p;
import java.util.Iterator;
import java.util.Queue;

final class i
extends d {
    private final ThreadLocal<Queue<l>> a;
    private final ThreadLocal<Boolean> b;

    private i() {
        this.a = new j(this);
        this.b = new k(this);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    void a(Object object, Iterator<p> iterator) {
        aU.a(object);
        aU.a(iterator);
        Queue<l> queue = this.a.get();
        queue.offer(new l(object, iterator, null));
        if (!this.b.get().booleanValue()) {
            this.b.set(true);
            try {
                l l2;
                while ((l2 = queue.poll()) != null) {
                    while (l.a(l2).hasNext()) {
                        ((p)l.a(l2).next()).a(l.b(l2));
                    }
                }
            }
            finally {
                this.b.remove();
                this.a.remove();
            }
        }
    }

    /* synthetic */ i(e e2) {
        this();
    }
}

