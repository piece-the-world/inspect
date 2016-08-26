/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.d;

import com.growingio.d.a.a;
import com.growingio.d.a.d.B;
import com.growingio.d.a.d.b;
import com.growingio.d.a.d.e;
import com.growingio.d.a.d.h;
import com.growingio.d.a.d.v;
import com.growingio.d.a.f;
import com.growingio.d.a.j;
import com.growingio.d.a.r;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class c
extends f {
    public int a;
    public int b;
    public String c;
    public String d;
    public String e;
    public List<String> h = new ArrayList<String>();
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public List<b> n;
    public List<b> o;
    public List<B> p;
    public List<B> q;
    public List<com.growingio.d.a.c> r;
    public List<h> s = new ArrayList<h>();
    public List<e> t = new ArrayList<e>();
    public List<v> u = new ArrayList<v>();

    public c() {
        this(327680);
        if (this.getClass() != c.class) {
            throw new IllegalStateException();
        }
    }

    public c(int n2) {
        super(n2);
    }

    @Override
    public void a(int n2, int n3, String string, String string2, String string3, String[] arrstring) {
        this.a = n2;
        this.b = n3;
        this.c = string;
        this.d = string2;
        this.e = string3;
        if (arrstring != null) {
            this.h.addAll(Arrays.asList(arrstring));
        }
    }

    @Override
    public void a_(String string, String string2) {
        this.i = string;
        this.j = string2;
    }

    @Override
    public void a(String string, String string2, String string3) {
        this.k = string;
        this.l = string2;
        this.m = string3;
    }

    @Override
    public a a(String string, boolean bl2) {
        b b2 = new b(string);
        if (bl2) {
            if (this.n == null) {
                this.n = new ArrayList<b>(1);
            }
            this.n.add(b2);
        } else {
            if (this.o == null) {
                this.o = new ArrayList<b>(1);
            }
            this.o.add(b2);
        }
        return b2;
    }

    @Override
    public a a(int n2, com.growingio.d.a.v v2, String string, boolean bl2) {
        B b2 = new B(n2, v2, string);
        if (bl2) {
            if (this.p == null) {
                this.p = new ArrayList<B>(1);
            }
            this.p.add(b2);
        } else {
            if (this.q == null) {
                this.q = new ArrayList<B>(1);
            }
            this.q.add(b2);
        }
        return b2;
    }

    @Override
    public void a(com.growingio.d.a.c c2) {
        if (this.r == null) {
            this.r = new ArrayList<com.growingio.d.a.c>(1);
        }
        this.r.add(c2);
    }

    @Override
    public void a(String string, String string2, String string3, int n2) {
        h h2 = new h(string, string2, string3, n2);
        this.s.add(h2);
    }

    @Override
    public j a(int n2, String string, String string2, String string3, Object object) {
        e e2 = new e(n2, string, string2, string3, object);
        this.t.add(e2);
        return e2;
    }

    @Override
    public r a(int n2, String string, String string2, String string3, String[] arrstring) {
        v v2 = new v(n2, string, string2, string3, arrstring);
        this.u.add(v2);
        return v2;
    }

    @Override
    public void a() {
    }

    public void a(int n2) {
        if (n2 == 262144) {
            if (this.p != null && this.p.size() > 0) {
                throw new RuntimeException();
            }
            if (this.q != null && this.q.size() > 0) {
                throw new RuntimeException();
            }
            for (e object2 : this.t) {
                object2.a(n2);
            }
            for (v v2 : this.u) {
                v2.b(n2);
            }
        }
    }

    public void a(f f2) {
        int n2;
        b b2;
        String[] arrstring = new String[this.h.size()];
        this.h.toArray(arrstring);
        f2.a(this.a, this.b, this.c, this.d, this.e, arrstring);
        if (this.i != null || this.j != null) {
            f2.a_(this.i, this.j);
        }
        if (this.k != null) {
            f2.a(this.k, this.l, this.m);
        }
        int n3 = this.n == null ? 0 : this.n.size();
        for (n2 = 0; n2 < n3; ++n2) {
            b2 = this.n.get(n2);
            b2.a(f2.a(b2.a, true));
        }
        n3 = this.o == null ? 0 : this.o.size();
        for (n2 = 0; n2 < n3; ++n2) {
            b2 = this.o.get(n2);
            b2.a(f2.a(b2.a, false));
        }
        n3 = this.p == null ? 0 : this.p.size();
        for (n2 = 0; n2 < n3; ++n2) {
            b2 = this.p.get(n2);
            b2.a(f2.a(b2.h, b2.i, b2.a, true));
        }
        n3 = this.q == null ? 0 : this.q.size();
        for (n2 = 0; n2 < n3; ++n2) {
            b2 = this.q.get(n2);
            b2.a(f2.a(b2.h, b2.i, b2.a, false));
        }
        n3 = this.r == null ? 0 : this.r.size();
        for (n2 = 0; n2 < n3; ++n2) {
            f2.a(this.r.get(n2));
        }
        for (n2 = 0; n2 < this.s.size(); ++n2) {
            this.s.get(n2).a(f2);
        }
        for (n2 = 0; n2 < this.t.size(); ++n2) {
            this.t.get(n2).a(f2);
        }
        for (n2 = 0; n2 < this.u.size(); ++n2) {
            this.u.get(n2).a(f2);
        }
        f2.a();
    }
}

