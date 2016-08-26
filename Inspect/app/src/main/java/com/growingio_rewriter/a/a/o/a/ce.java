/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.o.a.bU;
import java.util.concurrent.BlockingQueue;

final class ce
implements Runnable {
    final /* synthetic */ BlockingQueue a;
    final /* synthetic */ bU b;

    ce(BlockingQueue blockingQueue, bU bU2) {
        this.a = blockingQueue;
        this.b = bU2;
    }

    @Override
    public void run() {
        this.a.add(this.b);
    }
}

