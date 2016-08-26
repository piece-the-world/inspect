/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.aL;
import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.ab;
import com.growingio.a.a.b.aq;
import java.io.Serializable;

final class ar<F, T>
extends ab<F>
implements Serializable {
    private static final long a = 0;
    private final aq<F, ? extends T> b;
    private final ab<T> c;

    ar(aq<F, ? extends T> aq2, ab<T> ab2) {
        this.b = aU.a(aq2);
        this.c = aU.a(ab2);
    }

    @Override
    protected boolean b(F f2, F f3) {
        return this.c.a(this.b.f(f2), this.b.f(f3));
    }

    @Override
    protected int b(F f2) {
        return this.c.a(this.b.f(f2));
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof ar) {
            ar ar2 = (ar)object;
            return this.b.equals(ar2.b) && this.c.equals(ar2.c);
        }
        return false;
    }

    public int hashCode() {
        return aL.a(new Object[]{this.b, this.c});
    }

    public String toString() {
        return this.c + ".onResultOf(" + this.b + ")";
    }
}

