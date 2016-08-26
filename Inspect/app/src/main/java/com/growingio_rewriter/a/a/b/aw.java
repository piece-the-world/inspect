/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.aq;
import java.io.Serializable;

class aw<A, B, C>
implements aq<A, C>,
Serializable {
    private final aq<B, C> a;
    private final aq<A, ? extends B> b;
    private static final long c = 0;

    public aw(aq<B, C> aq2, aq<A, ? extends B> aq3) {
        this.a = aU.a(aq2);
        this.b = aU.a(aq3);
    }

    @Override
    public C f(A a2) {
        return this.a.f(this.b.f(a2));
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof aw) {
            aw aw2 = (aw)object;
            return this.b.equals(aw2.b) && this.a.equals(aw2.a);
        }
        return false;
    }

    public int hashCode() {
        return this.b.hashCode() ^ this.a.hashCode();
    }

    public String toString() {
        return this.a + "(" + this.b + ")";
    }
}

