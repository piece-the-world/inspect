/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.kl;
import com.growingio.a.a.d.km;
import com.growingio.a.a.d.lU;

abstract class kA<E>
extends lU<km<E>> {
    kA() {
    }

    abstract kl<E> a();

    @Override
    public boolean contains(Object object) {
        if (object instanceof km) {
            km km2 = (km)object;
            if (km2.b() <= 0) {
                return false;
            }
            int n2 = this.a().a(km2.a());
            return n2 == km2.b();
        }
        return false;
    }

    @Override
    public boolean remove(Object object) {
        if (object instanceof km) {
            km km2 = (km)object;
            E e2 = km2.a();
            int n2 = km2.b();
            if (n2 != 0) {
                kl<E> kl2 = this.a();
                return kl2.a(e2, n2, 0);
            }
        }
        return false;
    }

    @Override
    public void clear() {
        this.a().clear();
    }
}

