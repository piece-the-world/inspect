/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aL;
import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.aq;
import com.growingio.a.a.d.kO;
import java.io.Serializable;

final class aG<F, T>
extends kO<F>
implements Serializable {
    final aq<F, ? extends T> a;
    final kO<T> b;
    private static final long e = 0;

    aG(aq<F, ? extends T> aq2, kO<T> kO2) {
        this.a = aU.a(aq2);
        this.b = aU.a(kO2);
    }

    @Override
    public int compare(F f2, F f3) {
        return this.b.compare(this.a.f(f2), this.a.f(f3));
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof aG) {
            aG aG2 = (aG)object;
            return this.a.equals(aG2.a) && this.b.equals(aG2.b);
        }
        return false;
    }

    public int hashCode() {
        return aL.a(new Object[]{this.a, this.b});
    }

    public String toString() {
        return this.b + ".onResultOf(" + this.a + ")";
    }
}

