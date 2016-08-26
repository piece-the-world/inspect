/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.kO;
import java.io.Serializable;

final class kL<T>
extends kO<T>
implements Serializable {
    final kO<? super T> a;
    private static final long b = 0;

    kL(kO<? super T> kO2) {
        this.a = kO2;
    }

    @Override
    public int compare(T t2, T t3) {
        if (t2 == t3) {
            return 0;
        }
        if (t2 == null) {
            return -1;
        }
        if (t3 == null) {
            return 1;
        }
        return this.a.compare(t2, t3);
    }

    @Override
    public <S extends T> kO<S> a() {
        return this.a.a().c();
    }

    @Override
    public <S extends T> kO<S> b() {
        return this;
    }

    @Override
    public <S extends T> kO<S> c() {
        return this.a.c();
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof kL) {
            kL kL2 = (kL)object;
            return this.a.equals(kL2.a);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 957692532;
    }

    public String toString() {
        return this.a + ".nullsFirst()";
    }
}

