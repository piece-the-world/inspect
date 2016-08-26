/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.aV;
import com.growingio.a.a.b.aq;
import com.growingio.a.a.d.aD;
import com.growingio.a.a.d.bO;
import com.growingio.a.a.d.bu;
import com.growingio.a.a.d.bw;
import com.growingio.a.a.d.fL;
import com.growingio.a.a.d.kO;
import com.growingio.a.a.d.kX;
import com.growingio.a.a.d.kY;
import com.growingio.a.a.d.kZ;
import com.growingio.a.a.d.la;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;

public final class kW<C extends Comparable>
implements aV<C>,
Serializable {
    private static final aq<kW, bw> d = new kX();
    private static final aq<kW, bw> e = new kY();
    static final kO<kW<?>> a = new la(null);
    private static final kW<Comparable> f = new kW(bw.d(), bw.e());
    final bw<C> b;
    final bw<C> c;
    private static final long g = 0;

    static <C extends Comparable<?>> aq<kW<C>, bw<C>> a() {
        return d;
    }

    static <C extends Comparable<?>> aq<kW<C>, bw<C>> b() {
        return e;
    }

    static <C extends Comparable<?>> kW<C> a(bw<C> bw2, bw<C> bw3) {
        return new kW<C>(bw2, bw3);
    }

    public static <C extends Comparable<?>> kW<C> a(C c2, C c3) {
        return kW.a(bw.c(c2), bw.b(c3));
    }

    public static <C extends Comparable<?>> kW<C> b(C c2, C c3) {
        return kW.a(bw.b(c2), bw.c(c3));
    }

    public static <C extends Comparable<?>> kW<C> c(C c2, C c3) {
        return kW.a(bw.b(c2), bw.b(c3));
    }

    public static <C extends Comparable<?>> kW<C> d(C c2, C c3) {
        return kW.a(bw.c(c2), bw.c(c3));
    }

    public static <C extends Comparable<?>> kW<C> a(C c2, aD aD2, C c3, aD aD3) {
        aU.a(aD2);
        aU.a(aD3);
        bw<C> bw2 = aD2 == aD.a ? bw.c(c2) : bw.b(c2);
        bw<C> bw3 = aD3 == aD.a ? bw.b(c3) : bw.c(c3);
        return kW.a(bw2, bw3);
    }

    public static <C extends Comparable<?>> kW<C> a(C c2) {
        return kW.a(bw.d(), bw.b(c2));
    }

    public static <C extends Comparable<?>> kW<C> b(C c2) {
        return kW.a(bw.d(), bw.c(c2));
    }

    public static <C extends Comparable<?>> kW<C> a(C c2, aD aD2) {
        switch (kZ.a[aD2.ordinal()]) {
            case 1: {
                return kW.a(c2);
            }
            case 2: {
                return kW.b(c2);
            }
        }
        throw new AssertionError();
    }

    public static <C extends Comparable<?>> kW<C> c(C c2) {
        return kW.a(bw.c(c2), bw.e());
    }

    public static <C extends Comparable<?>> kW<C> d(C c2) {
        return kW.a(bw.b(c2), bw.e());
    }

    public static <C extends Comparable<?>> kW<C> b(C c2, aD aD2) {
        switch (kZ.a[aD2.ordinal()]) {
            case 1: {
                return kW.c(c2);
            }
            case 2: {
                return kW.d(c2);
            }
        }
        throw new AssertionError();
    }

    public static <C extends Comparable<?>> kW<C> c() {
        return f;
    }

    public static <C extends Comparable<?>> kW<C> e(C c2) {
        return kW.b(c2, c2);
    }

    public static <C extends Comparable<?>> kW<C> a(Iterable<C> iterable) {
        Comparable comparable;
        aU.a(iterable);
        if (iterable instanceof bu) {
            return ((bu)iterable).f_();
        }
        Iterator<C> iterator = iterable.iterator();
        Comparable comparable2 = comparable = (Comparable)aU.a(iterator.next());
        while (iterator.hasNext()) {
            Comparable comparable3 = (Comparable)aU.a(iterator.next());
            comparable = kO.d().a((Comparable)comparable, (Comparable)comparable3);
            comparable2 = kO.d().b((Comparable)comparable2, (Comparable)comparable3);
        }
        return kW.b(comparable, comparable2);
    }

    private kW(bw<C> bw2, bw<C> bw3) {
        this.b = aU.a(bw2);
        this.c = aU.a(bw3);
        if (bw2.a(bw3) > 0 || bw2 == bw.e() || bw3 == bw.d()) {
            throw new IllegalArgumentException("Invalid range: " + kW.b(bw2, bw3));
        }
    }

    public boolean d() {
        return this.b != bw.d();
    }

    public C e() {
        return this.b.c();
    }

    public aD f() {
        return this.b.a();
    }

    public boolean g() {
        return this.c != bw.e();
    }

    public C h() {
        return this.c.c();
    }

    public aD i() {
        return this.c.b();
    }

    public boolean j() {
        return this.b.equals(this.c);
    }

    public boolean f(C c2) {
        aU.a(c2);
        return this.b.a(c2) && !this.c.a(c2);
    }

    public boolean g(C c2) {
        return this.f(c2);
    }

    public boolean b(Iterable<? extends C> iterable) {
        if (fL.j(iterable)) {
            return true;
        }
        if (iterable instanceof SortedSet) {
            SortedSet<? extends C> sortedSet = kW.c(iterable);
            Object object = sortedSet.comparator();
            if (kO.d().equals(object) || object == null) {
                return this.f((Comparable)sortedSet.first()) && this.f((Comparable)sortedSet.last());
            }
        }
        for (Object object : iterable) {
            if (this.f(object)) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean a(kW<C> kW2) {
        return this.b.a(kW2.b) <= 0 && this.c.a(kW2.c) >= 0;
    }

    public boolean b(kW<C> kW2) {
        return this.b.a(kW2.c) <= 0 && kW2.b.a(this.c) <= 0;
    }

    public kW<C> c(kW<C> kW2) {
        int n2 = this.b.a(kW2.b);
        int n3 = this.c.a(kW2.c);
        if (n2 >= 0 && n3 <= 0) {
            return this;
        }
        if (n2 <= 0 && n3 >= 0) {
            return kW2;
        }
        bw<C> bw2 = n2 >= 0 ? this.b : kW2.b;
        bw<C> bw3 = n3 <= 0 ? this.c : kW2.c;
        return kW.a(bw2, bw3);
    }

    public kW<C> d(kW<C> kW2) {
        int n2 = this.b.a(kW2.b);
        int n3 = this.c.a(kW2.c);
        if (n2 <= 0 && n3 >= 0) {
            return this;
        }
        if (n2 >= 0 && n3 <= 0) {
            return kW2;
        }
        bw<C> bw2 = n2 <= 0 ? this.b : kW2.b;
        bw<C> bw3 = n3 >= 0 ? this.c : kW2.c;
        return kW.a(bw2, bw3);
    }

    public kW<C> a(bO<C> bO2) {
        aU.a(bO2);
        bw<bO<C>> bw2 = this.b.c(bO2);
        bw<bO<C>> bw3 = this.c.c(bO2);
        return bw2 == this.b && bw3 == this.c ? this : kW.a(bw2, bw3);
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof kW) {
            kW kW2 = (kW)object;
            return this.b.equals(kW2.b) && this.c.equals(kW2.c);
        }
        return false;
    }

    public int hashCode() {
        return this.b.hashCode() * 31 + this.c.hashCode();
    }

    public String toString() {
        return kW.b(this.b, this.c);
    }

    private static String b(bw<?> bw2, bw<?> bw3) {
        StringBuilder stringBuilder = new StringBuilder(16);
        bw2.a(stringBuilder);
        stringBuilder.append("..");
        bw3.b(stringBuilder);
        return stringBuilder.toString();
    }

    private static <T> SortedSet<T> c(Iterable<T> iterable) {
        return (SortedSet)iterable;
    }

    Object k() {
        if (this.equals(f)) {
            return kW.c();
        }
        return this;
    }

    static int e(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2);
    }

    @Override
    public /* synthetic */ boolean a(Object object) {
        return this.g((Comparable)object);
    }
}

