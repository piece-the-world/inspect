/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.eM;
import com.growingio.a.a.d.eN;
import com.growingio.a.a.d.eQ;
import com.growingio.a.a.d.fi;
import com.growingio.a.a.d.km;
import java.util.Set;

final class eP
extends fi<km<E>> {
    private static final long c = 0;
    final /* synthetic */ eM a;

    private eP(eM eM2) {
        this.a = eM2;
    }

    @Override
    boolean i_() {
        return this.a.i_();
    }

    km<E> b(int n2) {
        return this.a.a(n2);
    }

    @Override
    public int size() {
        return this.a.d().size();
    }

    @Override
    public boolean contains(Object object) {
        if (object instanceof km) {
            km km2 = (km)object;
            if (km2.b() <= 0) {
                return false;
            }
            int n2 = this.a.a(km2.a());
            return n2 == km2.b();
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override
    Object j_() {
        return new eQ(this.a);
    }

    @Override
    /* synthetic */ Object a(int n2) {
        return this.b(n2);
    }

    /* synthetic */ eP(eM eM2, eN eN2) {
        this(eM2);
    }
}

