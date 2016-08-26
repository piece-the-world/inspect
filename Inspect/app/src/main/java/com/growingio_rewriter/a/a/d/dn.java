/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aL;
import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.aD;
import com.growingio.a.a.d.kO;
import com.growingio.a.a.d.kW;
import java.io.Serializable;
import java.util.Comparator;

final class dn<T>
implements Serializable {
    private final Comparator<? super T> a;
    private final boolean b;
    private final T c;
    private final aD d;
    private final boolean e;
    private final T f;
    private final aD g;
    private transient dn<T> h;

    static <T extends Comparable> dn<T> a(kW<T> kW2) {
        T t2 = kW2.d() ? (T)kW2.e() : null;
        aD aD2 = kW2.d() ? kW2.f() : aD.a;
        T t3 = kW2.g() ? (T)kW2.h() : null;
        aD aD3 = kW2.g() ? kW2.i() : aD.a;
        return new dn<Object>(kO.d(), kW2.d(), t2, aD2, kW2.g(), t3, aD3);
    }

    static <T> dn<T> a(Comparator<? super T> comparator) {
        return new dn<Object>(comparator, false, null, aD.a, false, null, aD.a);
    }

    static <T> dn<T> a(Comparator<? super T> comparator, T t2, aD aD2) {
        return new dn<Object>((Comparator<Object>)comparator, true, t2, aD2, false, null, aD.a);
    }

    static <T> dn<T> b(Comparator<? super T> comparator, T t2, aD aD2) {
        return new dn<Object>((Comparator<Object>)comparator, false, null, aD.a, true, t2, aD2);
    }

    static <T> dn<T> a(Comparator<? super T> comparator, T t2, aD aD2, T t3, aD aD3) {
        return new dn<T>(comparator, true, (T)t2, aD2, true, (T)t3, aD3);
    }

    private dn(Comparator<? super T> comparator, boolean bl2, T t2, aD aD2, boolean bl3, T t3, aD aD3) {
        this.a = aU.a(comparator);
        this.b = bl2;
        this.e = bl3;
        this.c = t2;
        this.d = aU.a(aD2);
        this.f = t3;
        this.g = aU.a(aD3);
        if (bl2) {
            comparator.compare(t2, t2);
        }
        if (bl3) {
            comparator.compare(t3, t3);
        }
        if (bl2 && bl3) {
            int n2 = comparator.compare(t2, t3);
            aU.a(n2 <= 0, "lowerEndpoint (%s) > upperEndpoint (%s)", t2, t3);
            if (n2 == 0) {
                aU.a(aD2 != aD.a | aD3 != aD.a);
            }
        }
    }

    Comparator<? super T> a() {
        return this.a;
    }

    boolean b() {
        return this.b;
    }

    boolean c() {
        return this.e;
    }

    boolean d() {
        return this.c() && this.a(this.h()) || this.b() && this.b(this.f());
    }

    boolean a(T t2) {
        if (!this.b()) {
            return false;
        }
        T t3 = this.f();
        int n2 = this.a.compare(t2, t3);
        return n2 < 0 | n2 == 0 & this.g() == aD.a;
    }

    boolean b(T t2) {
        if (!this.c()) {
            return false;
        }
        T t3 = this.h();
        int n2 = this.a.compare(t2, t3);
        return n2 > 0 | n2 == 0 & this.i() == aD.a;
    }

    boolean c(T t2) {
        return !this.a(t2) && !this.b(t2);
    }

    dn<T> a(dn<T> dn2) {
        int n2;
        boolean bl2;
        aU.a(dn2);
        aU.a(this.a.equals(dn2.a));
        boolean bl3 = this.b;
        T t2 = this.f();
        aD aD2 = this.g();
        if (!this.b()) {
            bl3 = dn2.b;
            t2 = dn2.f();
            aD2 = dn2.g();
        } else if (dn2.b() && ((bl2 = this.a.compare(this.f(), dn2.f())) < false || !bl2 && dn2.g() == aD.a)) {
            t2 = dn2.f();
            aD2 = dn2.g();
        }
        bl2 = this.e;
        T t3 = this.h();
        aD aD3 = this.i();
        if (!this.c()) {
            bl2 = dn2.e;
            t3 = dn2.h();
            aD3 = dn2.i();
        } else if (dn2.c() && ((n2 = this.a.compare(this.h(), dn2.h())) > 0 || n2 == 0 && dn2.i() == aD.a)) {
            t3 = dn2.h();
            aD3 = dn2.i();
        }
        if (bl3 && bl2 && ((n2 = this.a.compare(t2, t3)) > 0 || n2 == 0 && aD2 == aD.a && aD3 == aD.a)) {
            t2 = t3;
            aD2 = aD.a;
            aD3 = aD.b;
        }
        return new dn<T>(this.a, bl3, (T)t2, aD2, bl2, (T)t3, aD3);
    }

    public boolean equals(Object object) {
        if (object instanceof dn) {
            dn dn2 = (dn)object;
            return this.a.equals(dn2.a) && this.b == dn2.b && this.e == dn2.e && this.g().equals((Object)dn2.g()) && this.i().equals((Object)dn2.i()) && aL.a(this.f(), dn2.f()) && aL.a(this.h(), dn2.h());
        }
        return false;
    }

    public int hashCode() {
        return aL.a(new Object[]{this.a, this.f(), this.g(), this.h(), this.i()});
    }

    dn<T> e() {
        dn dn2 = this.h;
        if (dn2 == null) {
            dn2 = new dn(kO.a(this.a).a(), this.e, this.h(), this.i(), this.b, this.f(), this.g());
            dn2.h = this;
            this.h = dn2;
            return this.h;
        }
        return dn2;
    }

    public String toString() {
        return this.a + ":" + (this.d == aD.b ? '[' : '(') + (this.b ? this.c : "-\u221e") + ',' + (this.e ? this.f : "\u221e") + (this.g == aD.b ? ']' : ')');
    }

    T f() {
        return this.c;
    }

    aD g() {
        return this.d;
    }

    T h() {
        return this.f;
    }

    aD i() {
        return this.g;
    }
}

