/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.b.bG;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

final class dj
implements bG<Lock> {
    dj() {
    }

    public Lock b() {
        return new ReentrantLock(false);
    }

    @Override
    public /* synthetic */ Object a() {
        return this.b();
    }
}

