/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.dJ;
import com.growingio.a.a.d.dQ;
import com.growingio.a.a.d.ea;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

abstract class dI<E>
extends ea<E> {
    dI() {
    }

    abstract dQ<E> c();

    @Override
    public boolean contains(Object object) {
        return this.c().contains(object);
    }

    @Override
    public int size() {
        return this.c().size();
    }

    @Override
    public boolean isEmpty() {
        return this.c().isEmpty();
    }

    @Override
    boolean i_() {
        return this.c().i_();
    }

    private void a(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override
    Object j_() {
        return new dJ(this.c());
    }
}

