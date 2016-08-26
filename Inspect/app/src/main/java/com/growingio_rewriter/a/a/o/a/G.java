/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.o.a.E;
import com.growingio.a.a.o.a.cd;
import java.util.concurrent.ThreadFactory;

class G
implements ThreadFactory {
    final /* synthetic */ E a;

    G(E e2) {
        this.a = e2;
    }

    @Override
    public Thread newThread(Runnable runnable) {
        return cd.a(this.a.m(), runnable);
    }
}

