/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.aD;
import com.growingio.a.a.d.bO;
import com.growingio.a.a.d.bw;
import com.growingio.a.a.d.bx;
import com.growingio.a.a.d.bz;
import com.growingio.a.a.d.kW;

final class bB<C extends Comparable>
extends bw<C> {
    private static final long b = 0;

    bB(C c2) {
        super((Comparable)aU.a(c2));
    }

    @Override
    boolean a(C c2) {
        return kW.e(this.a, c2) <= 0;
    }

    @Override
    aD a() {
        return aD.b;
    }

    @Override
    aD b() {
        return aD.a;
    }

    @Override
    bw<C> a(aD aD2, bO<C> bO2) {
        switch (bx.a[aD2.ordinal()]) {
            case 1: {
                return this;
            }
            case 2: {
                Comparable comparable = bO2.b(this.a);
                return comparable == null ? bw.d() : new bz<Comparable>(comparable);
            }
        }
        throw new AssertionError();
    }

    @Override
    bw<C> b(aD aD2, bO<C> bO2) {
        switch (bx.a[aD2.ordinal()]) {
            case 1: {
                Comparable comparable = bO2.b(this.a);
                return comparable == null ? bw.e() : new bz<Comparable>(comparable);
            }
            case 2: {
                return this;
            }
        }
        throw new AssertionError();
    }

    @Override
    void a(StringBuilder stringBuilder) {
        stringBuilder.append('[').append(this.a);
    }

    @Override
    void b(StringBuilder stringBuilder) {
        stringBuilder.append(this.a).append(')');
    }

    @Override
    C a(bO<C> bO2) {
        return (C)this.a;
    }

    @Override
    C b(bO<C> bO2) {
        return (C)bO2.b(this.a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "\\" + this.a + "/";
    }

    @Override
    public /* synthetic */ int compareTo(Object object) {
        return super.a((bw)object);
    }
}

