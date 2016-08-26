/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.aD;
import com.growingio.a.a.d.bA;
import com.growingio.a.a.d.bB;
import com.growingio.a.a.d.bO;
import com.growingio.a.a.d.by;
import com.growingio.a.a.d.bz;
import com.growingio.a.a.d.kW;
import com.growingio.a.a.m.a;
import java.io.Serializable;

abstract class bw<C extends Comparable>
implements Serializable,
Comparable<bw<C>> {
    final C a;
    private static final long b = 0;

    bw(C c2) {
        this.a = c2;
    }

    abstract boolean a(C var1);

    abstract aD a();

    abstract aD b();

    abstract bw<C> a(aD var1, bO<C> var2);

    abstract bw<C> b(aD var1, bO<C> var2);

    abstract void a(StringBuilder var1);

    abstract void b(StringBuilder var1);

    abstract C a(bO<C> var1);

    abstract C b(bO<C> var1);

    bw<C> c(bO<C> bO2) {
        return this;
    }

    public int a(bw<C> bw2) {
        if (bw2 == bw.d()) {
            return 1;
        }
        if (bw2 == bw.e()) {
            return -1;
        }
        int n2 = kW.e(this.a, bw2.a);
        if (n2 != 0) {
            return n2;
        }
        return a.a(this instanceof bz, bw2 instanceof bz);
    }

    C c() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (object instanceof bw) {
            bw bw2 = (bw)object;
            try {
                int n2 = this.a(bw2);
                return n2 == 0;
            }
            catch (ClassCastException var3_4) {
                // empty catch block
            }
        }
        return false;
    }

    static <C extends Comparable> bw<C> d() {
        return bA.f();
    }

    static <C extends Comparable> bw<C> e() {
        return by.f();
    }

    static <C extends Comparable> bw<C> b(C c2) {
        return new bB<C>(c2);
    }

    static <C extends Comparable> bw<C> c(C c2) {
        return new bz<C>(c2);
    }

    @Override
    public /* synthetic */ int compareTo(Object object) {
        return this.a((bw)object);
    }
}

