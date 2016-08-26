/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

public final class av {
    private av() {
    }

    public static <V> AtomicReference<V> a() {
        return new AtomicReference();
    }

    public static <V> AtomicReference<V> a(V v2) {
        return new AtomicReference<V>(v2);
    }

    public static <E> AtomicReferenceArray<E> a(int n2) {
        return new AtomicReferenceArray(n2);
    }

    public static <E> AtomicReferenceArray<E> a(E[] arrE) {
        return new AtomicReferenceArray<E>(arrE);
    }
}

