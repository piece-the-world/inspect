/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.c;

import com.growingio.a.a.b.aH;
import com.growingio.a.a.b.aJ;
import com.growingio.a.a.b.aL;
import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.bp;
import com.growingio.a.a.c.A;
import com.growingio.a.a.c.aw;
import com.growingio.a.a.c.f;
import com.growingio.a.a.c.m;
import com.growingio.a.a.c.n;
import com.growingio.a.a.c.o;
import com.growingio.a.a.c.q;
import com.growingio.a.a.c.s;
import com.growingio.a.a.c.u;
import com.growingio.a.a.c.v;
import com.growingio.a.a.c.w;
import com.growingio.a.a.c.x;
import com.growingio.a.a.c.y;
import com.growingio.a.a.c.z;
import com.growingio.a.a.d.ea;
import com.growingio.a.a.d.ei;
import com.growingio.a.a.d.ek;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public final class l {
    private static final bp n = bp.a(',').b();
    private static final bp o = bp.a('=').b();
    private static final ei<String, y> p = ei.j().b("initialCapacity", new q()).b("maximumSize", (q)((Object)new u())).b("maximumWeight", (u)((Object)new v())).b("concurrencyLevel", (v)((Object)new o())).b("weakKeys", (o)((Object)new s(aw.c))).b("softValues", (s)((Object)new z(aw.b))).b("weakValues", new z(aw.c)).b("recordStats", (z)((Object)new w())).b("expireAfterAccess", (w)((Object)new n())).b("expireAfterWrite", (n)((Object)new A())).b("refreshAfterWrite", (A)((Object)new x())).b("refreshInterval", new x()).b();
    Integer a;
    Long b;
    Long c;
    Integer d;
    aw e;
    aw f;
    Boolean g;
    long h;
    TimeUnit i;
    long j;
    TimeUnit k;
    long l;
    TimeUnit m;
    private final String q;

    private l(String string) {
        this.q = string;
    }

    public static l a(String string) {
        l l2 = new l(string);
        if (!string.isEmpty()) {
            for (String string2 : n.a(string)) {
                ea<String> ea2 = ea.a(o.a(string2));
                aU.a(!ea2.isEmpty(), (Object)"blank key-value pair");
                aU.a(ea2.size() <= 2, "key-value pair %s with more than one equals sign", (Object)string2);
                String string3 = ea2.get(0);
                y y2 = p.get(string3);
                aU.a(y2 != null, "unknown key %s", (Object)string3);
                String string4 = ea2.size() == 1 ? null : ea2.get(1);
                y2.a(l2, string3, string4);
            }
        }
        return l2;
    }

    public static l a() {
        return l.a("maximumSize=0");
    }

    f<Object, Object> b() {
        f<Object, Object> f2 = f.a();
        if (this.a != null) {
            f2.a(this.a);
        }
        if (this.b != null) {
            f2.a(this.b);
        }
        if (this.c != null) {
            f2.b(this.c);
        }
        if (this.d != null) {
            f2.b(this.d);
        }
        if (this.e != null) {
            switch (m.a[this.e.ordinal()]) {
                case 1: {
                    f2.i();
                    break;
                }
                default: {
                    throw new AssertionError();
                }
            }
        }
        if (this.f != null) {
            switch (m.a[this.f.ordinal()]) {
                case 2: {
                    f2.l();
                    break;
                }
                case 1: {
                    f2.k();
                    break;
                }
                default: {
                    throw new AssertionError();
                }
            }
        }
        if (this.g != null && this.g.booleanValue()) {
            f2.r();
        }
        if (this.i != null) {
            f2.a(this.h, this.i);
        }
        if (this.k != null) {
            f2.b(this.j, this.k);
        }
        if (this.m != null) {
            f2.c(this.l, this.m);
        }
        return f2;
    }

    public String c() {
        return this.q;
    }

    public String toString() {
        return aH.a(this).a(this.c()).toString();
    }

    public int hashCode() {
        return aL.a(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.g, l.a(this.h, this.i), l.a(this.j, this.k), l.a(this.l, this.m)});
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof l)) {
            return false;
        }
        l l2 = (l)object;
        return aL.a((Object)this.a, (Object)l2.a) && aL.a((Object)this.b, (Object)l2.b) && aL.a((Object)this.c, (Object)l2.c) && aL.a((Object)this.d, (Object)l2.d) && aL.a((Object)this.e, (Object)l2.e) && aL.a((Object)this.f, (Object)l2.f) && aL.a((Object)this.g, (Object)l2.g) && aL.a((Object)l.a(this.h, this.i), (Object)l.a(l2.h, l2.i)) && aL.a((Object)l.a(this.j, this.k), (Object)l.a(l2.j, l2.k)) && aL.a((Object)l.a(this.l, this.m), (Object)l.a(l2.l, l2.m));
    }

    private static Long a(long l2, TimeUnit timeUnit) {
        return timeUnit == null ? null : Long.valueOf(timeUnit.toNanos(l2));
    }

    private static /* varargs */ String b(String string, Object ... arrobject) {
        return String.format(Locale.ROOT, string, arrobject);
    }

    static /* synthetic */ String a(String string, Object[] arrobject) {
        return l.b(string, arrobject);
    }
}

