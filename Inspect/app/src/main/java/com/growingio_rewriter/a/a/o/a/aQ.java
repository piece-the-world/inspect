/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.o.a.aL;
import com.growingio.a.a.o.a.aM;
import com.growingio.a.a.o.a.aN;
import com.growingio.a.a.o.a.aP;
import com.growingio.a.a.o.a.aR;
import com.growingio.a.a.o.a.aT;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

final class aQ
extends ReentrantReadWriteLock
implements aN {
    private final aP b;
    private final aR c;
    private final aT d;
    final /* synthetic */ aL a;

    private aQ(aL aL2, aT aT2, boolean bl2) {
        this.a = aL2;
        super(bl2);
        this.b = new aP(aL2, this);
        this.c = new aR(aL2, this);
        this.d = aU.a(aT2);
    }

    @Override
    public ReentrantReadWriteLock.ReadLock readLock() {
        return this.b;
    }

    @Override
    public ReentrantReadWriteLock.WriteLock writeLock() {
        return this.c;
    }

    @Override
    public aT a() {
        return this.d;
    }

    @Override
    public boolean b() {
        return this.isWriteLockedByCurrentThread() || this.getReadHoldCount() > 0;
    }

    /* synthetic */ aQ(aL aL2, aT aT2, boolean bl2, aM aM2) {
        this(aL2, aT2, bl2);
    }
}

