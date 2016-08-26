/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aL;
import com.growingio.a.a.d.km;

abstract class kx<E>
implements km<E> {
    kx() {
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof km) {
            km km2 = (km)object;
            return this.b() == km2.b() && aL.a(this.a(), km2.a());
        }
        return false;
    }

    @Override
    public int hashCode() {
        Object e2 = this.a();
        return (e2 == null ? 0 : e2.hashCode()) ^ this.b();
    }

    @Override
    public String toString() {
        String string = String.valueOf(this.a());
        int n2 = this.b();
        return n2 == 1 ? string : string + " x " + n2;
    }
}

