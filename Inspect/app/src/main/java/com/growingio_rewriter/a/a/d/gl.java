/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aV;
import com.growingio.a.a.d.j;
import java.util.Iterator;

final class gl
extends j<T> {
    final /* synthetic */ Iterator a;
    final /* synthetic */ aV b;

    gl(Iterator iterator, aV aV2) {
        this.a = iterator;
        this.b = aV2;
    }

    @Override
    protected T a() {
        while (this.a.hasNext()) {
            Object e2 = this.a.next();
            if (!this.b.a(e2)) continue;
            return (T)e2;
        }
        return this.b();
    }
}

