/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.db;
import java.util.Iterator;

public abstract class cJ<T>
extends db
implements Iterator<T> {
    protected cJ() {
    }

    protected abstract Iterator<T> a();

    @Override
    public boolean hasNext() {
        return this.a().hasNext();
    }

    @Override
    public T next() {
        return this.a().next();
    }

    @Override
    public void remove() {
        this.a().remove();
    }

    @Override
    protected /* synthetic */ Object g() {
        return this.a();
    }
}

