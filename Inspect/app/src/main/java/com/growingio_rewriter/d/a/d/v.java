/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.d;

import com.growingio.d.a.c;
import com.growingio.d.a.d.A;
import com.growingio.d.a.d.B;
import com.growingio.d.a.d.C;
import com.growingio.d.a.d.D;
import com.growingio.d.a.d.a;
import com.growingio.d.a.d.b;
import com.growingio.d.a.d.d;
import com.growingio.d.a.d.f;
import com.growingio.d.a.d.g;
import com.growingio.d.a.d.i;
import com.growingio.d.a.d.k;
import com.growingio.d.a.d.l;
import com.growingio.d.a.d.n;
import com.growingio.d.a.d.o;
import com.growingio.d.a.d.q;
import com.growingio.d.a.d.s;
import com.growingio.d.a.d.t;
import com.growingio.d.a.d.w;
import com.growingio.d.a.d.x;
import com.growingio.d.a.d.y;
import com.growingio.d.a.d.z;
import com.growingio.d.a.m;
import com.growingio.d.a.p;
import com.growingio.d.a.r;
import com.growingio.d.a.u;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class v
extends r {
    public int b;
    public String c;
    public String f;
    public String g;
    public List<String> h;
    public List<y> i;
    public List<b> j;
    public List<b> k;
    public List<B> l;
    public List<B> m;
    public List<c> bi_;
    public Object bj_;
    public List<b>[] bk_;
    public List<b>[] bl_;
    public i bm_;
    public List<A> bn_;
    public int bo_;
    public int bp_;
    public List<s> bq_;
    public List<com.growingio.d.a.d.r> br_;
    public List<com.growingio.d.a.d.r> bs_;
    private boolean a;

    public v() {
        this(327680);
        if (this.getClass() != v.class) {
            throw new IllegalStateException();
        }
    }

    public v(int n2) {
        super(n2);
        this.bm_ = new i();
    }

    public v(int n2, String string, String string2, String string3, String[] arrstring) {
        this(327680, n2, string, string2, string3, arrstring);
        if (this.getClass() != v.class) {
            throw new IllegalStateException();
        }
    }

    public v(int n2, int n3, String string, String string2, String string3, String[] arrstring) {
        boolean bl2;
        super(n2);
        this.b = n3;
        this.c = string;
        this.f = string2;
        this.g = string3;
        this.h = new ArrayList<String>(arrstring == null ? 0 : arrstring.length);
        boolean bl3 = bl2 = (n3 & 1024) != 0;
        if (!bl2) {
            this.bq_ = new ArrayList<s>(5);
        }
        this.bn_ = new ArrayList<A>();
        if (arrstring != null) {
            this.h.addAll(Arrays.asList(arrstring));
        }
        this.bm_ = new i();
    }

    @Override
    public void a(String string, int n2) {
        if (this.i == null) {
            this.i = new ArrayList<y>(5);
        }
        this.i.add(new y(string, n2));
    }

    @Override
    public com.growingio.d.a.a c() {
        return new b(new w(this, 0));
    }

    @Override
    public com.growingio.d.a.a a(String string, boolean bl2) {
        b b2 = new b(string);
        if (bl2) {
            if (this.j == null) {
                this.j = new ArrayList<b>(1);
            }
            this.j.add(b2);
        } else {
            if (this.k == null) {
                this.k = new ArrayList<b>(1);
            }
            this.k.add(b2);
        }
        return b2;
    }

    @Override
    public com.growingio.d.a.a a(int n2, com.growingio.d.a.v v2, String string, boolean bl2) {
        B b2 = new B(n2, v2, string);
        if (bl2) {
            if (this.l == null) {
                this.l = new ArrayList<B>(1);
            }
            this.l.add(b2);
        } else {
            if (this.m == null) {
                this.m = new ArrayList<B>(1);
            }
            this.m.add(b2);
        }
        return b2;
    }

    @Override
    public com.growingio.d.a.a a(int n2, String string, boolean bl2) {
        b b2 = new b(string);
        if (bl2) {
            if (this.bk_ == null) {
                int n3 = u.d(this.f).length;
                this.bk_ = new List[n3];
            }
            if (this.bk_[n2] == null) {
                this.bk_[n2] = new ArrayList<b>(1);
            }
            this.bk_[n2].add(b2);
        } else {
            if (this.bl_ == null) {
                int n4 = u.d(this.f).length;
                this.bl_ = new List[n4];
            }
            if (this.bl_[n2] == null) {
                this.bl_[n2] = new ArrayList<b>(1);
            }
            this.bl_[n2].add(b2);
        }
        return b2;
    }

    @Override
    public void a(c c2) {
        if (this.bi_ == null) {
            this.bi_ = new ArrayList<c>(1);
        }
        this.bi_.add(c2);
    }

    @Override
    public void a_() {
    }

    @Override
    public void a(int n2, int n3, Object[] arrobject, int n4, Object[] arrobject2) {
        this.bm_.c(new f(n2, n3, arrobject == null ? null : this.a(arrobject), n4, arrobject2 == null ? null : this.a(arrobject2)));
    }

    @Override
    public void a_(int n2) {
        this.bm_.c(new k(n2));
    }

    @Override
    public void a(int n2, int n3) {
        this.bm_.c(new l(n2, n3));
    }

    @Override
    public void b(int n2, int n3) {
        this.bm_.c(new D(n2, n3));
    }

    @Override
    public void a(int n2, String string) {
        this.bm_.c(new C(n2, string));
    }

    @Override
    public void b(int n2, String string, String string2, String string3) {
        this.bm_.c(new d(n2, string, string2, string3));
    }

    @Override
    public void a(int n2, String string, String string2, String string3) {
        if (this.m_ >= 327680) {
            super.a(n2, string, string2, string3);
            return;
        }
        this.bm_.c(new com.growingio.d.a.d.u(n2, string, string2, string3));
    }

    @Override
    public void a(int n2, String string, String string2, String string3, boolean bl2) {
        if (this.m_ < 327680) {
            super.a(n2, string, string2, string3, bl2);
            return;
        }
        this.bm_.c(new com.growingio.d.a.d.u(n2, string, string2, string3, bl2));
    }

    @Override
    public /* varargs */ void a(String string, String string2, m m2, Object ... arrobject) {
        this.bm_.c(new com.growingio.d.a.d.m(string, string2, m2, arrobject));
    }

    @Override
    public void a(int n2, p p2) {
        this.bm_.c(new n(n2, this.b(p2)));
    }

    @Override
    public void a(p p2) {
        this.bm_.c(this.b(p2));
    }

    @Override
    public void a(Object object) {
        this.bm_.c(new com.growingio.d.a.d.p(object));
    }

    @Override
    public void c(int n2, int n3) {
        this.bm_.c(new g(n2, n3));
    }

    @Override
    public /* varargs */ void a(int n2, int n3, p p2, p ... arrp) {
        this.bm_.c(new z(n2, n3, this.b(p2), this.a(arrp)));
    }

    @Override
    public void a(p p2, int[] arrn, p[] arrp) {
        this.bm_.c(new t(this.b(p2), arrn, this.a(arrp)));
    }

    @Override
    public void b(String string, int n2) {
        this.bm_.c(new x(string, n2));
    }

    @Override
    public com.growingio.d.a.a b(int n2, com.growingio.d.a.v v2, String string, boolean bl2) {
        a a2 = this.bm_.c();
        while (a2.a() == -1) {
            a2 = a2.c();
        }
        B b2 = new B(n2, v2, string);
        if (bl2) {
            if (a2.r == null) {
                a2.r = new ArrayList<B>(1);
            }
            a2.r.add(b2);
        } else {
            if (a2.s == null) {
                a2.s = new ArrayList<B>(1);
            }
            a2.s.add(b2);
        }
        return b2;
    }

    @Override
    public void a(p p2, p p3, p p4, String string) {
        this.bn_.add(new A(this.b(p2), this.b(p3), this.b(p4), string));
    }

    @Override
    public com.growingio.d.a.a c(int n2, com.growingio.d.a.v v2, String string, boolean bl2) {
        A a2 = this.bn_.get((n2 & 16776960) >> 8);
        B b2 = new B(n2, v2, string);
        if (bl2) {
            if (a2.e == null) {
                a2.e = new ArrayList<B>(1);
            }
            a2.e.add(b2);
        } else {
            if (a2.f == null) {
                a2.f = new ArrayList<B>(1);
            }
            a2.f.add(b2);
        }
        return b2;
    }

    @Override
    public void a(String string, String string2, String string3, p p2, p p3, int n2) {
        this.bq_.add(new s(string, string2, string3, this.b(p2), this.b(p3), n2));
    }

    @Override
    public com.growingio.d.a.a a(int n2, com.growingio.d.a.v v2, p[] arrp, p[] arrp2, int[] arrn, String string, boolean bl2) {
        com.growingio.d.a.d.r r2 = new com.growingio.d.a.d.r(n2, v2, this.a(arrp), this.a(arrp2), arrn, string);
        if (bl2) {
            if (this.br_ == null) {
                this.br_ = new ArrayList<com.growingio.d.a.d.r>(1);
            }
            this.br_.add(r2);
        } else {
            if (this.bs_ == null) {
                this.bs_ = new ArrayList<com.growingio.d.a.d.r>(1);
            }
            this.bs_.add(r2);
        }
        return r2;
    }

    @Override
    public void b(int n2, p p2) {
        this.bm_.c(new q(n2, this.b(p2)));
    }

    @Override
    public void d(int n2, int n3) {
        this.bo_ = n2;
        this.bp_ = n3;
    }

    @Override
    public void b() {
    }

    protected o b(p p2) {
        if (!(p2.m instanceof o)) {
            p2.m = new o();
        }
        return (o)p2.m;
    }

    private o[] a(p[] arrp) {
        o[] arro = new o[arrp.length];
        for (int i2 = 0; i2 < arrp.length; ++i2) {
            arro[i2] = this.b(arrp[i2]);
        }
        return arro;
    }

    private Object[] a(Object[] arrobject) {
        Object[] arrobject2 = new Object[arrobject.length];
        for (int i2 = 0; i2 < arrobject.length; ++i2) {
            Object object = arrobject[i2];
            if (object instanceof p) {
                object = this.b((p)object);
            }
            arrobject2[i2] = object;
        }
        return arrobject2;
    }

    public void b(int n2) {
        if (n2 == 262144) {
            Object object;
            int n3;
            if (this.l != null && this.l.size() > 0) {
                throw new RuntimeException();
            }
            if (this.m != null && this.m.size() > 0) {
                throw new RuntimeException();
            }
            int n4 = this.bn_ == null ? 0 : this.bn_.size();
            for (n3 = 0; n3 < n4; ++n3) {
                object = this.bn_.get(n3);
                if (object.e != null && object.e.size() > 0) {
                    throw new RuntimeException();
                }
                if (object.f == null || object.f.size() <= 0) continue;
                throw new RuntimeException();
            }
            for (n3 = 0; n3 < this.bm_.a(); ++n3) {
                boolean bl2;
                object = this.bm_.a(n3);
                if (object.r != null && object.r.size() > 0) {
                    throw new RuntimeException();
                }
                if (object.s != null && object.s.size() > 0) {
                    throw new RuntimeException();
                }
                if (!(object instanceof com.growingio.d.a.d.u) || (bl2 = ((com.growingio.d.a.d.u)object).z) == (object.q == 185)) continue;
                throw new RuntimeException();
            }
            if (this.br_ != null && this.br_.size() > 0) {
                throw new RuntimeException();
            }
            if (this.bs_ != null && this.bs_.size() > 0) {
                throw new RuntimeException();
            }
        }
    }

    public void a(com.growingio.d.a.f f2) {
        String[] arrstring = new String[this.h.size()];
        this.h.toArray(arrstring);
        r r2 = f2.a(this.b, this.c, this.f, this.g, arrstring);
        if (r2 != null) {
            this.a(r2);
        }
    }

    public void a(r r2) {
        List<b> list;
        int n2;
        b b2;
        int n3;
        int n4 = this.i == null ? 0 : this.i.size();
        for (n3 = 0; n3 < n4; ++n3) {
            list = this.i.get(n3);
            r2.a(list.a, list.b);
        }
        if (this.bj_ != null) {
            list = r2.c();
            b.a((com.growingio.d.a.a)((Object)list), null, this.bj_);
            if (list != null) {
                list.b_();
            }
        }
        n4 = this.j == null ? 0 : this.j.size();
        for (n3 = 0; n3 < n4; ++n3) {
            list = this.j.get(n3);
            list.a(r2.a(list.a, true));
        }
        n4 = this.k == null ? 0 : this.k.size();
        for (n3 = 0; n3 < n4; ++n3) {
            list = this.k.get(n3);
            list.a(r2.a(list.a, false));
        }
        n4 = this.l == null ? 0 : this.l.size();
        for (n3 = 0; n3 < n4; ++n3) {
            list = this.l.get(n3);
            list.a(r2.a(list.h, list.i, list.a, true));
        }
        n4 = this.m == null ? 0 : this.m.size();
        for (n3 = 0; n3 < n4; ++n3) {
            list = this.m.get(n3);
            list.a(r2.a(list.h, list.i, list.a, false));
        }
        n4 = this.bk_ == null ? 0 : this.bk_.length;
        for (n3 = 0; n3 < n4; ++n3) {
            list = this.bk_[n3];
            if (list == null) continue;
            for (n2 = 0; n2 < list.size(); ++n2) {
                b2 = list.get(n2);
                b2.a(r2.a(n3, b2.a, true));
            }
        }
        n4 = this.bl_ == null ? 0 : this.bl_.length;
        for (n3 = 0; n3 < n4; ++n3) {
            list = this.bl_[n3];
            if (list == null) continue;
            for (n2 = 0; n2 < list.size(); ++n2) {
                b2 = list.get(n2);
                b2.a(r2.a(n3, b2.a, false));
            }
        }
        if (this.a) {
            this.bm_.g();
        }
        n4 = this.bi_ == null ? 0 : this.bi_.size();
        for (n3 = 0; n3 < n4; ++n3) {
            r2.a(this.bi_.get(n3));
        }
        if (this.bm_.a() > 0) {
            r2.a_();
            n4 = this.bn_ == null ? 0 : this.bn_.size();
            for (n3 = 0; n3 < n4; ++n3) {
                this.bn_.get(n3).a(n3);
                this.bn_.get(n3).a(r2);
            }
            this.bm_.a(r2);
            n4 = this.bq_ == null ? 0 : this.bq_.size();
            for (n3 = 0; n3 < n4; ++n3) {
                this.bq_.get(n3).a(r2);
            }
            n4 = this.br_ == null ? 0 : this.br_.size();
            for (n3 = 0; n3 < n4; ++n3) {
                this.br_.get(n3).a(r2, true);
            }
            n4 = this.bs_ == null ? 0 : this.bs_.size();
            for (n3 = 0; n3 < n4; ++n3) {
                this.bs_.get(n3).a(r2, false);
            }
            r2.d(this.bo_, this.bp_);
            this.a = true;
        }
        r2.b();
    }
}

