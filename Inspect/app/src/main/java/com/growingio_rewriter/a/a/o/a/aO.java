/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.o.a.aL;
import com.growingio.a.a.o.a.aM;
import com.growingio.a.a.o.a.aN;
import com.growingio.a.a.o.a.aT;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

final class aO
extends ReentrantLock
implements aN {
    private final aT b;
    final /* synthetic */ aL a;

    private aO(aL aL2, aT aT2, boolean bl2) {
        this.a = aL2;
        super(bl2);
        this.b = aU.a(aT2);
    }

    @Override
    public aT a() {
        return this.b;
    }

    @Override
    public boolean b() {
        return this.isHeldByCurrentThread();
    }

    @Override
    public void lock() {
        aL.a(this.a, this);
        try {
            super.lock();
        }
        finally {
            aL.a(this);
        }
    }

    @Override
    public void lockInterruptibly() throws InterruptedException {
        aL.a(this.a, this);
        try {
            super.lockInterruptibly();
        }
        finally {
            aL.a(this);
        }
    }

    @Override
    public boolean tryLock() {
        aL.a(this.a, this);
        try {
            boolean bl2 = super.tryLock();
            return bl2;
        }
        finally {
            aL.a(this);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean tryLock(long l2, TimeUnit timeUnit) throws InterruptedException {
        aL.a(this.a, this);
        try {
            boolean bl2 = super.tryLock(l2, timeUnit);
            return bl2;
        }
        finally {
            aL.a(this);
        }
    }

    @Override
    public void unlock() {
        try {
            super.unlock();
        }
        finally {
            aL.a(this);
        }
    }

    /* synthetic */ aO(aL aL2, aT aT2, boolean bl2, aM aM2) {
        this(aL2, aT2, bl2);
    }
}

