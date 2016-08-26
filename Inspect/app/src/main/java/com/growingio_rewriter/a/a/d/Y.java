/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.kW;
import com.growingio.a.a.d.lc;
import java.util.Set;

abstract class Y<C extends Comparable>
implements lc<C> {
    Y() {
    }

    @Override
    public boolean a(C c2) {
        return this.b(c2) != null;
    }

    @Override
    public abstract kW<C> b(C var1);

    @Override
    public boolean a() {
        return this.n().isEmpty();
    }

    @Override
    public void a(kW<C> kW2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void b(kW<C> kW2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void b() {
        this.b(kW.<C>c());
    }

    @Override
    public boolean a(lc<C> lc2) {
        for (kW<C> kW2 : lc2.n()) {
            if (this.d(kW2)) continue;
            return false;
        }
        return true;
    }

    @Override
    public void b(lc<C> lc2) {
        for (kW<C> kW2 : lc2.n()) {
            this.a(kW2);
        }
    }

    @Override
    public void c(lc<C> lc2) {
        for (kW<C> kW2 : lc2.n()) {
            this.b(kW2);
        }
    }

    @Override
    public boolean c(kW<C> kW2) {
        return !this.g(kW2).a();
    }

    @Override
    public abstract boolean d(kW<C> var1);

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof lc) {
            lc lc2 = (lc)object;
            return this.n().equals(lc2.n());
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.n().hashCode();
    }

    @Override
    public final String toString() {
        return this.n().toString();
    }
}

