/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.o.a.bU;
import com.growingio.a.a.o.a.cZ;
import java.util.concurrent.ConcurrentLinkedQueue;

final class bs
implements Runnable {
    final /* synthetic */ ConcurrentLinkedQueue a;
    final /* synthetic */ bU b;

    bs(ConcurrentLinkedQueue concurrentLinkedQueue, bU bU2) {
        this.a = concurrentLinkedQueue;
        this.b = bU2;
    }

    @Override
    public void run() {
        ((cZ)this.a.remove()).b(this.b);
    }
}

