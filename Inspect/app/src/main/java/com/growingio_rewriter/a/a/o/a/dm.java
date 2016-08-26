/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.b.bG;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

final class dm
implements bG<ReadWriteLock> {
    dm() {
    }

    public ReadWriteLock b() {
        return new ReentrantReadWriteLock();
    }

    @Override
    public /* synthetic */ Object a() {
        return this.b();
    }
}

