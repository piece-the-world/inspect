/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.aV;
import com.growingio.a.a.b.aX;
import com.growingio.a.a.b.aq;
import java.io.Serializable;

class aZ<A, B>
implements aV<A>,
Serializable {
    final aV<B> a;
    final aq<A, ? extends B> b;
    private static final long c = 0;

    private aZ(aV<B> aV2, aq<A, ? extends B> aq2) {
        this.a = aU.a(aV2);
        this.b = aU.a(aq2);
    }

    @Override
    public boolean a(A a2) {
        return this.a.a(this.b.f(a2));
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof aZ) {
            aZ aZ2 = (aZ)object;
            return this.b.equals(aZ2.b) && this.a.equals(aZ2.a);
        }
        return false;
    }

    public int hashCode() {
        return this.b.hashCode() ^ this.a.hashCode();
    }

    public String toString() {
        return this.a + "(" + this.b + ")";
    }

    /* synthetic */ aZ(aV aV2, aq aq2, aX aX2) {
        this(aV2, aq2);
    }
}

