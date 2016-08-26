/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aL;
import com.growingio.a.a.d.nC;

abstract class nF<R, C, V>
implements nC<R, C, V> {
    nF() {
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof nC) {
            nC nC2 = (nC)object;
            return aL.a(this.a(), nC2.a()) && aL.a(this.b(), nC2.b()) && aL.a(this.c(), nC2.c());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return aL.a(this.a(), this.b(), this.c());
    }

    public String toString() {
        return "(" + this.a() + "," + this.b() + ")=" + this.c();
    }
}

