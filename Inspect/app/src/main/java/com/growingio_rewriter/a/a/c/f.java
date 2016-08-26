/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.c;

import com.growingio.a.a.b.aH;
import com.growingio.a.a.b.aJ;
import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.ab;
import com.growingio.a.a.b.bG;
import com.growingio.a.a.b.bH;
import com.growingio.a.a.b.bR;
import com.growingio.a.a.c.B;
import com.growingio.a.a.c.I;
import com.growingio.a.a.c.N;
import com.growingio.a.a.c.an;
import com.growingio.a.a.c.ao;
import com.growingio.a.a.c.aw;
import com.growingio.a.a.c.bg;
import com.growingio.a.a.c.bo;
import com.growingio.a.a.c.c;
import com.growingio.a.a.c.e;
import com.growingio.a.a.c.g;
import com.growingio.a.a.c.h;
import com.growingio.a.a.c.i;
import com.growingio.a.a.c.j;
import com.growingio.a.a.c.k;
import com.growingio.a.a.c.l;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class f<K, V> {
    private static final int v = 16;
    private static final int w = 4;
    private static final int x = 0;
    private static final int y = 0;
    static final bG<? extends c> a = bH.a(new g());
    static final I b = new I(0, 0, 0, 0, 0, 0);
    static final bG<c> c = new h();
    static final bR d = new i();
    private static final Logger z = Logger.getLogger(f.class.getName());
    static final int e = -1;
    boolean f = true;
    int g = -1;
    int h = -1;
    long i = -1;
    long j = -1;
    bo<? super K, ? super V> k;
    aw l;
    aw m;
    long n = -1;
    long o = -1;
    long p = -1;
    ab<Object> q;
    ab<Object> r;
    bg<? super K, ? super V> s;
    bR t;
    bG<? extends c> u = a;

    f() {
    }

    public static f<Object, Object> a() {
        return new f<Object, Object>();
    }

    public static f<Object, Object> a(l l2) {
        return l2.b().b();
    }

    public static f<Object, Object> a(String string) {
        return f.a(l.a(string));
    }

    f<K, V> b() {
        this.f = false;
        return this;
    }

    f<K, V> a(ab<Object> ab2) {
        aU.b(this.q == null, "key equivalence was already set to %s", this.q);
        this.q = aU.a(ab2);
        return this;
    }

    ab<Object> c() {
        return aH.a(this.q, this.j().b());
    }

    f<K, V> b(ab<Object> ab2) {
        aU.b(this.r == null, "value equivalence was already set to %s", this.r);
        this.r = aU.a(ab2);
        return this;
    }

    ab<Object> d() {
        return aH.a(this.r, this.m().b());
    }

    public f<K, V> a(int n2) {
        aU.b(this.g == -1, "initial capacity was already set to %s", this.g);
        aU.a(n2 >= 0);
        this.g = n2;
        return this;
    }

    int e() {
        return this.g == -1 ? 16 : this.g;
    }

    public f<K, V> b(int n2) {
        aU.b(this.h == -1, "concurrency level was already set to %s", this.h);
        aU.a(n2 > 0);
        this.h = n2;
        return this;
    }

    int f() {
        return this.h == -1 ? 4 : this.h;
    }

    public f<K, V> a(long l2) {
        aU.b(this.i == -1, "maximum size was already set to %s", this.i);
        aU.b(this.j == -1, "maximum weight was already set to %s", this.j);
        aU.b(this.k == null, "maximum size can not be combined with weigher");
        aU.a(l2 >= 0, (Object)"maximum size must not be negative");
        this.i = l2;
        return this;
    }

    public f<K, V> b(long l2) {
        aU.b(this.j == -1, "maximum weight was already set to %s", this.j);
        aU.b(this.i == -1, "maximum size was already set to %s", this.i);
        this.j = l2;
        aU.a(l2 >= 0, (Object)"maximum weight must not be negative");
        return this;
    }

    public <K1 extends K, V1 extends V> f<K1, V1> a(bo<? super K1, ? super V1> bo2) {
        aU.b(this.k == null);
        if (this.f) {
            aU.b(this.i == -1, "weigher can not be combined with maximum size", this.i);
        }
        f f2 = this;
        f2.k = aU.a(bo2);
        return f2;
    }

    long g() {
        if (this.n == 0 || this.o == 0) {
            return 0;
        }
        return this.k == null ? this.i : this.j;
    }

    <K1 extends K, V1 extends V> bo<K1, V1> h() {
        return aH.a(this.k, k.a);
    }

    public f<K, V> i() {
        return this.a(aw.c);
    }

    f<K, V> a(aw aw2) {
        aU.b(this.l == null, "Key strength was already set to %s", (Object)this.l);
        this.l = aU.a(aw2);
        return this;
    }

    aw j() {
        return aH.a(this.l, aw.a);
    }

    public f<K, V> k() {
        return this.b(aw.c);
    }

    public f<K, V> l() {
        return this.b(aw.b);
    }

    f<K, V> b(aw aw2) {
        aU.b(this.m == null, "Value strength was already set to %s", (Object)this.m);
        this.m = aU.a(aw2);
        return this;
    }

    aw m() {
        return aH.a(this.m, aw.a);
    }

    public f<K, V> a(long l2, TimeUnit timeUnit) {
        aU.b(this.n == -1, "expireAfterWrite was already set to %s ns", this.n);
        aU.a(l2 >= 0, "duration cannot be negative: %s %s", l2, (Object)timeUnit);
        this.n = timeUnit.toNanos(l2);
        return this;
    }

    long n() {
        return this.n == -1 ? 0 : this.n;
    }

    public f<K, V> b(long l2, TimeUnit timeUnit) {
        aU.b(this.o == -1, "expireAfterAccess was already set to %s ns", this.o);
        aU.a(l2 >= 0, "duration cannot be negative: %s %s", l2, (Object)timeUnit);
        this.o = timeUnit.toNanos(l2);
        return this;
    }

    long o() {
        return this.o == -1 ? 0 : this.o;
    }

    public f<K, V> c(long l2, TimeUnit timeUnit) {
        aU.a(timeUnit);
        aU.b(this.p == -1, "refresh was already set to %s ns", this.p);
        aU.a(l2 > 0, "duration must be positive: %s %s", l2, (Object)timeUnit);
        this.p = timeUnit.toNanos(l2);
        return this;
    }

    long p() {
        return this.p == -1 ? 0 : this.p;
    }

    public f<K, V> a(bR bR2) {
        aU.b(this.t == null);
        this.t = aU.a(bR2);
        return this;
    }

    bR a(boolean bl2) {
        if (this.t != null) {
            return this.t;
        }
        return bl2 ? bR.b() : d;
    }

    public <K1 extends K, V1 extends V> f<K1, V1> a(bg<? super K1, ? super V1> bg2) {
        aU.b(this.s == null);
        f f2 = this;
        f2.s = aU.a(bg2);
        return f2;
    }

    <K1 extends K, V1 extends V> bg<K1, V1> q() {
        return aH.a(this.s, j.a);
    }

    public f<K, V> r() {
        this.u = c;
        return this;
    }

    boolean s() {
        return this.u == c;
    }

    bG<? extends c> t() {
        return this.u;
    }

    public <K1 extends K, V1 extends V> N<K1, V1> a(B<? super K1, V1> b2) {
        this.w();
        return new an<K1, V1>(this, b2);
    }

    public <K1 extends K, V1 extends V> e<K1, V1> u() {
        this.w();
        this.v();
        return new ao(this);
    }

    private void v() {
        aU.b(this.p == -1, "refreshAfterWrite requires a LoadingCache");
    }

    private void w() {
        if (this.k == null) {
            aU.b(this.j == -1, "maximumWeight requires weigher");
        } else if (this.f) {
            aU.b(this.j != -1, "weigher requires maximumWeight");
        } else if (this.j == -1) {
            z.log(Level.WARNING, "ignoring weigher specified without maximumWeight");
        }
    }

    public String toString() {
        aJ aJ2 = aH.a(this);
        if (this.g != -1) {
            aJ2.a("initialCapacity", this.g);
        }
        if (this.h != -1) {
            aJ2.a("concurrencyLevel", this.h);
        }
        if (this.i != -1) {
            aJ2.a("maximumSize", this.i);
        }
        if (this.j != -1) {
            aJ2.a("maximumWeight", this.j);
        }
        if (this.n != -1) {
            aJ2.a("expireAfterWrite", "" + this.n + "ns");
        }
        if (this.o != -1) {
            aJ2.a("expireAfterAccess", "" + this.o + "ns");
        }
        if (this.l != null) {
            aJ2.a("keyStrength", com.growingio.a.a.b.e.a(this.l.toString()));
        }
        if (this.m != null) {
            aJ2.a("valueStrength", com.growingio.a.a.b.e.a(this.m.toString()));
        }
        if (this.q != null) {
            aJ2.a("keyEquivalence");
        }
        if (this.r != null) {
            aJ2.a("valueEquivalence");
        }
        if (this.s != null) {
            aJ2.a("removalListener");
        }
        return aJ2.toString();
    }
}

