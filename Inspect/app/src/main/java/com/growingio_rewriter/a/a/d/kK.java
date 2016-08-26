/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.kO;
import com.growingio.a.a.d.lB;
import java.io.Serializable;

final class kK
extends kO<Comparable>
implements Serializable {
    static final kK a = new kK();
    private transient kO<Comparable> b;
    private transient kO<Comparable> e;
    private static final long f = 0;

    @Override
    public int a(Comparable comparable, Comparable comparable2) {
        aU.a(comparable);
        aU.a(comparable2);
        return comparable.compareTo(comparable2);
    }

    @Override
    public <S extends Comparable> kO<S> b() {
        kO kO2 = this.b;
        if (kO2 == null) {
            kO2 = this.b = super.b();
        }
        return kO2;
    }

    @Override
    public <S extends Comparable> kO<S> c() {
        kO kO2 = this.e;
        if (kO2 == null) {
            kO2 = this.e = super.c();
        }
        return kO2;
    }

    @Override
    public <S extends Comparable> kO<S> a() {
        return lB.a;
    }

    private Object j() {
        return a;
    }

    public String toString() {
        return "Ordering.natural()";
    }

    private kK() {
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((Comparable)object, (Comparable)object2);
    }
}

