/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.k;
import com.growingio.a.a.d.l;
import com.growingio.a.a.d.oP;
import java.util.NoSuchElementException;

public abstract class j<T>
extends oP<T> {
    private l a = l.b;
    private T b;

    protected j() {
    }

    protected abstract T a();

    protected final T b() {
        this.a = l.c;
        return null;
    }

    @Override
    public final boolean hasNext() {
        aU.b(this.a != l.d);
        switch (k.a[this.a.ordinal()]) {
            case 1: {
                return false;
            }
            case 2: {
                return true;
            }
        }
        return this.d();
    }

    private boolean d() {
        this.a = l.d;
        this.b = this.a();
        if (this.a != l.c) {
            this.a = l.a;
            return true;
        }
        return false;
    }

    @Override
    public final T next() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        this.a = l.b;
        T t2 = this.b;
        this.b = null;
        return t2;
    }

    public final T c() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        return this.b;
    }
}

