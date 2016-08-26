/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import java.util.concurrent.Callable;

final class ax
implements Callable<T> {
    final /* synthetic */ Object a;

    ax(Object object) {
        this.a = object;
    }

    @Override
    public T call() {
        return (T)this.a;
    }
}

