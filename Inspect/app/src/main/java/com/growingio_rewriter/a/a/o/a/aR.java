/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.o.a.aL;
import com.growingio.a.a.o.a.aQ;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class aR
extends ReentrantReadWriteLock.WriteLock {
    final aQ a;
    final /* synthetic */ aL b;

    aR(aL aL2, aQ aQ2) {
        this.b = aL2;
        super(aQ2);
        this.a = aQ2;
    }

    @Override
    public void lock() {
        aL.a(this.b, this.a);
        try {
            super.lock();
        }
        finally {
            aL.a(this.a);
        }
    }

    @Override
    public void lockInterruptibly() throws InterruptedException {
        aL.a(this.b, this.a);
        try {
            super.lockInterruptibly();
        }
        finally {
            aL.a(this.a);
        }
    }

    @Override
    public boolean tryLock() {
        aL.a(this.b, this.a);
        try {
            boolean bl2 = super.tryLock();
            return bl2;
        }
        finally {
            aL.a(this.a);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean tryLock(long l2, TimeUnit timeUnit) throws InterruptedException {
        aL.a(this.b, this.a);
        try {
            boolean bl2 = super.tryLock(l2, timeUnit);
            return bl2;
        }
        finally {
            aL.a(this.a);
        }
    }

    @Override
    public void unlock() {
        try {
            super.unlock();
        }
        finally {
            aL.a(this.a);
        }
    }
}

