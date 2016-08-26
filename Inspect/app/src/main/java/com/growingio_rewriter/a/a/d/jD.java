/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.aK;
import com.growingio.a.a.d.jC;
import com.growingio.a.a.d.jE;
import com.growingio.a.a.d.jF;
import com.growingio.a.a.d.jG;
import com.growingio.a.a.d.jH;
import com.growingio.a.a.d.jI;
import com.growingio.a.a.d.jJ;
import com.growingio.a.a.d.jK;
import com.growingio.a.a.d.jL;
import com.growingio.a.a.d.kO;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;

public abstract class jD<K0> {
    private static final int a = 2;

    jD() {
    }

    abstract <K extends K0, V> Map<K, Collection<V>> a();

    public jC<K0, Object> b() {
        return this.a(2);
    }

    public jC<K0, Object> a(int n2) {
        aK.a(n2, "expectedValuesPerKey");
        return new jE(this, n2);
    }

    public jC<K0, Object> c() {
        return new jF(this);
    }

    public jK<K0, Object> d() {
        return this.b(2);
    }

    public jK<K0, Object> b(int n2) {
        aK.a(n2, "expectedValuesPerKey");
        return new jG(this, n2);
    }

    public jK<K0, Object> e() {
        return this.c(2);
    }

    public jK<K0, Object> c(int n2) {
        aK.a(n2, "expectedValuesPerKey");
        return new jH(this, n2);
    }

    public jL<K0, Comparable> f() {
        return this.a(kO.<C>d());
    }

    public <V0> jL<K0, V0> a(Comparator<V0> comparator) {
        aU.a(comparator, (Object)"comparator");
        return new jI(this, comparator);
    }

    public <V0 extends Enum<V0>> jK<K0, V0> a(Class<V0> class_) {
        aU.a(class_, (Object)"valueClass");
        return new jJ(this, class_);
    }
}

