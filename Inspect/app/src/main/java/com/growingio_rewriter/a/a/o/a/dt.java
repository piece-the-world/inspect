/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

final class dt<L>
extends WeakReference<L> {
    final int a;

    dt(L l2, int n2, ReferenceQueue<L> referenceQueue) {
        super(l2, referenceQueue);
        this.a = n2;
    }
}

