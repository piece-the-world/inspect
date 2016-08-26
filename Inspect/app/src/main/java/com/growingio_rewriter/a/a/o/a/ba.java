/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.o.a.aL;
import com.growingio.a.a.o.a.aM;
import com.growingio.a.a.o.a.aO;
import com.growingio.a.a.o.a.aQ;
import com.growingio.a.a.o.a.aT;
import com.growingio.a.a.o.a.aU;
import com.growingio.a.a.o.a.aY;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public final class ba<E extends Enum<E>>
extends aL {
    private final Map<E, aT> b;

    ba(aY aY2, Map<E, aT> map) {
        super(aY2, null);
        this.b = map;
    }

    public ReentrantLock a(E e2) {
        return this.a(e2, false);
    }

    public ReentrantLock a(E e2, boolean bl2) {
        return this.a == aU.c ? new ReentrantLock(bl2) : new aO(this, this.b.get(e2), bl2, null);
    }

    public ReentrantReadWriteLock b(E e2) {
        return this.b(e2, false);
    }

    public ReentrantReadWriteLock b(E e2, boolean bl2) {
        return this.a == aU.c ? new ReentrantReadWriteLock(bl2) : new aQ(this, this.b.get(e2), bl2, null);
    }
}

