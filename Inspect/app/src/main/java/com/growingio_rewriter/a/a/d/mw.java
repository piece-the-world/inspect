/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.km;
import java.util.NoSuchElementException;

final class mw {
    private mw() {
    }

    private static <E> E c(km<E> km2) {
        if (km2 == null) {
            throw new NoSuchElementException();
        }
        return km2.a();
    }

    private static <E> E d(km<E> km2) {
        return km2 == null ? null : (E)km2.a();
    }

    static /* synthetic */ Object a(km km2) {
        return mw.c(km2);
    }

    static /* synthetic */ Object b(km km2) {
        return mw.d(km2);
    }
}

