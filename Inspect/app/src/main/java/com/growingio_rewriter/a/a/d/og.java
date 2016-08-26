/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.nY;
import java.util.ConcurrentModificationException;

final class og<T> {
    private T a;

    private og() {
    }

    public T a() {
        return this.a;
    }

    public void a(T t2, T t3) {
        if (this.a != t2) {
            throw new ConcurrentModificationException();
        }
        this.a = t3;
    }

    /* synthetic */ og(nY nY2) {
        this();
    }
}

