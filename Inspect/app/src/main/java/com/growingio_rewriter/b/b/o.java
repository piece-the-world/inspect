/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.b;

import com.growingio.b.K;
import com.growingio.b.a.Q;
import com.growingio.b.a.T;
import com.growingio.b.a.ac;
import com.growingio.b.a.as;
import com.growingio.b.ad;
import com.growingio.b.ae;
import com.growingio.b.b.A;
import com.growingio.b.b.a.a;
import com.growingio.b.b.a.b;
import com.growingio.b.b.a.c;
import com.growingio.b.b.a.f;
import com.growingio.b.b.a.i;
import com.growingio.b.b.a.k;
import com.growingio.b.b.a.v;
import com.growingio.b.b.a.x;
import com.growingio.b.b.e;
import com.growingio.b.b.p;
import com.growingio.b.b.q;
import com.growingio.b.b.r;
import com.growingio.b.b.s;
import com.growingio.b.b.t;
import com.growingio.b.g;
import java.util.ArrayList;

public class o
extends com.growingio.b.b.b {
    protected r dE;
    protected com.growingio.b.o dF;
    protected as dG;
    protected boolean dH;

    public o(com.growingio.b.a.o o2, com.growingio.b.o o3, g g2) {
        super(o2);
        this.dE = new r(g2);
        this.dF = o3;
        this.dG = null;
    }

    public int h() {
        com.growingio.b.a.p p2 = this.dF.j();
        if (p2 == null) {
            return com.growingio.b.a.p.v;
        }
        return p2.r();
    }

    public void a(K k2) {
        this.dG = k2.c();
        if (this.di != null) {
            this.di.a(this.dG);
        }
    }

    public com.growingio.b.o i() {
        return this.dF;
    }

    @Override
    protected String d() {
        return r.c(this.dF.s());
    }

    @Override
    protected String e() throws e {
        return r.c(r.a(this.dF).s());
    }

    @Override
    protected void f() throws e {
        this.e.n(0);
        this.e.c(r.a(this.dF), "<init>", "()V");
    }

    @Override
    protected void c(com.growingio.b.b.a.t t2) throws e {
        com.growingio.b.b.a.s s2;
        boolean bl2;
        com.growingio.b.a.o o2 = this.e;
        com.growingio.b.b.a.t t3 = (com.growingio.b.b.a.t)t2.a();
        if (t3 == null) {
            return;
        }
        a a2 = (a)t2.b().a();
        com.growingio.b.b.a.t t4 = (com.growingio.b.b.a.t)t2.b().b().a();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        p p2 = null;
        if (t4 != null) {
            p2 = new p(this);
        }
        int n2 = o2.j();
        t3.a(this);
        int n3 = o2.j();
        if (n2 == n3) {
            throw new e("empty try block");
        }
        boolean bl3 = bl2 = !this.dj;
        if (bl2) {
            o2.j(167);
            arrayList.add(new Integer(o2.j()));
            o2.m(0);
        }
        int n4 = this.b();
        this.b(1);
        while (a2 != null) {
            s2 = (com.growingio.b.b.a.s)a2.c();
            a2 = a2.d();
            i i2 = (i)s2.a();
            com.growingio.b.b.a.t t5 = (com.growingio.b.b.a.t)s2.b();
            i2.c(n4);
            com.growingio.b.o o3 = this.dE.a(i2.i());
            i2.a(r.c(o3.s()));
            o2.a(n2, n3, o2.j(), o3);
            o2.k(1);
            o2.o(n4);
            this.dj = false;
            if (t5 != null) {
                t5.a(this);
            }
            if (this.dj) continue;
            o2.j(167);
            arrayList.add(new Integer(o2.j()));
            o2.m(0);
            bl2 = true;
        }
        if (t4 != null) {
            p2.a(this);
            int n5 = o2.j();
            o2.b(n2, n5, n5, 0);
            o2.k(1);
            o2.o(n4);
            this.dj = false;
            t4.a(this);
            if (!this.dj) {
                o2.n(n4);
                o2.j(191);
            }
            this.a(p2.a, t4);
        }
        s2 = (com.growingio.b.b.a.s)o2.j();
        this.a(arrayList, (int)s2);
        boolean bl4 = this.dj = !bl2;
        if (t4 != null && bl2) {
            t4.a(this);
        }
    }

    private void a(ArrayList arrayList, com.growingio.b.b.a.t t2) throws e {
        com.growingio.b.a.o o2 = this.e;
        int n2 = arrayList.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            int[] arrn = (int[])arrayList.get(i2);
            int n3 = arrn[0];
            o2.c(n3, o2.j() - n3 + 1);
            q q2 = new q(this, arrn);
            t2.a(this);
            q2.a(this);
            if (this.dj) continue;
            o2.j(167);
            o2.m(n3 + 3 - o2.j());
        }
    }

    @Override
    public void a(com.growingio.b.b.a.r r2) throws e {
        if (r2.g()) {
            this.b(r2);
        } else {
            com.growingio.b.o o2 = this.dE.a(r2.i());
            String string = o2.s();
            a a2 = r2.j();
            this.e.d(string);
            this.e.j(89);
            this.a(o2, "<init>", a2, false, true, -1, null);
            this.do = 307;
            this.dp = 0;
            this.dq = r.c(string);
        }
    }

    public void b(com.growingio.b.b.a.r r2) throws e {
        int n2 = r2.h();
        a a2 = r2.k();
        a a3 = r2.i();
        c c2 = r2.l();
        if (a2.e() > 1) {
            if (c2 != null) {
                throw new e("sorry, multi-dimensional array initializer for new is not supported");
            }
            this.a(n2, a3, a2);
            return;
        }
        b b2 = a2.c();
        this.a(n2, b2, i.a(a3, '/'), c2);
    }

    private void a(int n2, b b2, String string, c c2) throws e {
        int n3;
        String string2;
        if (c2 == null) {
            if (b2 == null) {
                throw new e("no array size");
            }
            b2.a(this);
        } else if (b2 == null) {
            int n4 = c2.e();
            this.e.p(n4);
        } else {
            throw new e("unnecessary array size specified for new");
        }
        if (n2 == 307) {
            string2 = this.a(string);
            this.e.e(r.d(string2));
        } else {
            string2 = null;
            n3 = 0;
            switch (n2) {
                case 301: {
                    n3 = 4;
                    break;
                }
                case 306: {
                    n3 = 5;
                    break;
                }
                case 317: {
                    n3 = 6;
                    break;
                }
                case 312: {
                    n3 = 7;
                    break;
                }
                case 303: {
                    n3 = 8;
                    break;
                }
                case 334: {
                    n3 = 9;
                    break;
                }
                case 324: {
                    n3 = 10;
                    break;
                }
                case 326: {
                    n3 = 11;
                    break;
                }
                default: {
                    o.g();
                }
            }
            this.e.j(188);
            this.e.b(n3);
        }
        if (c2 != null) {
            n3 = c2.e();
            a a2 = c2;
            for (int i2 = 0; i2 < n3; ++i2) {
                this.e.j(89);
                this.e.p(i2);
                a2.c().a(this);
                if (!o.d(n2)) {
                    this.d(this.do, n2);
                }
                this.e.j(o.f(n2, 0));
                a2 = a2.d();
            }
        }
        this.do = n2;
        this.dp = 1;
        this.dq = string2;
    }

    private static void g() throws e {
        throw new e("bad new expression");
    }

    @Override
    protected void a(c c2, int n2, int n3, String string) throws e {
        this.a(n2, null, string, c2);
    }

    @Override
    public void a(c c2) throws e {
        throw new e("array initializer is not supported");
    }

    protected void a(int n2, a a2, a a3) throws e {
        Object object;
        int n3 = a3.e();
        int n4 = 0;
        while (a3 != null && (object = a3.c()) != null) {
            ++n4;
            object.a(this);
            if (this.do != 324) {
                throw new e("bad type for array size");
            }
            a3 = a3.d();
        }
        this.do = n2;
        this.dp = n3;
        if (n2 == 307) {
            this.dq = this.a(a2);
            object = o.a(this.dq, n3);
        } else {
            object = o.b(n2, n3);
        }
        this.e.a((String)object, n4);
    }

    @Override
    public void a(f f2) throws e {
        String string = null;
        com.growingio.b.o o2 = null;
        b b2 = f2.i();
        a a2 = (a)f2.j();
        boolean bl2 = false;
        boolean bl3 = false;
        int n2 = -1;
        s s2 = f2.g();
        if (b2 instanceof com.growingio.b.b.a.p) {
            string = ((com.growingio.b.b.a.p)b2).d();
            o2 = this.dF;
            if (this.dk || s2 != null && s2.a()) {
                bl2 = true;
            } else {
                n2 = this.e.j();
                this.e.n(0);
            }
        } else if (b2 instanceof com.growingio.b.b.a.o) {
            bl3 = true;
            string = "<init>";
            o2 = this.dF;
            if (this.dk) {
                throw new e("a constructor cannot be static");
            }
            this.e.n(0);
            if (((com.growingio.b.b.a.o)b2).c() == 336) {
                o2 = r.a(o2);
            }
        } else if (b2 instanceof k) {
            k k2 = (k)b2;
            string = ((v)k2.j()).d();
            int n3 = k2.h();
            if (n3 == 35) {
                o2 = this.dE.a(((v)k2.i()).d(), false);
                bl2 = true;
            } else if (n3 == 46) {
                b b3 = k2.i();
                String string2 = A.b(b3);
                if (string2 != null) {
                    bl3 = true;
                    o2 = r.a(this.dF, string2);
                    if (this.dk || s2 != null && s2.a()) {
                        bl2 = true;
                    } else {
                        n2 = this.e.j();
                        this.e.n(0);
                    }
                } else {
                    if (b3 instanceof com.growingio.b.b.a.o && ((com.growingio.b.b.a.o)b3).c() == 336) {
                        bl3 = true;
                    }
                    try {
                        b3.a(this);
                    }
                    catch (t var14_14) {
                        if (var14_14.c() != b3) {
                            throw var14_14;
                        }
                        this.do = 307;
                        this.dp = 0;
                        this.dq = var14_14.b();
                        bl2 = true;
                    }
                    if (this.dp > 0) {
                        o2 = this.dE.a("java.lang.Object", true);
                    } else if (this.do == 307) {
                        o2 = this.dE.a(this.dq);
                    } else {
                        o.j();
                    }
                }
            } else {
                o.j();
            }
        } else {
            o.a();
        }
        this.a(o2, string, a2, bl2, bl3, n2, s2);
    }

    private static void j() throws e {
        throw new e("bad method");
    }

    public void a(com.growingio.b.o o2, String string, a a2, boolean bl2, boolean bl3, int n2, s s2) throws e {
        int n3 = this.e(a2);
        int[] arrn = new int[n3];
        int[] arrn2 = new int[n3];
        String[] arrstring = new String[n3];
        if (!bl2 && s2 != null && s2.a()) {
            this.e.j(87);
            bl2 = true;
        }
        int n4 = this.e.k();
        this.a(a2, arrn, arrn2, arrstring);
        if (s2 == null) {
            s2 = this.dE.a(o2, this.dF, this.dG, string, arrn, arrn2, arrstring);
        }
        if (s2 == null) {
            String string2 = string.equals("<init>") ? "constructor not found" : "Method " + string + " not found in " + o2.s();
            throw new e(string2);
        }
        this.a(o2, string, bl2, bl3, n2, s2);
    }

    private void a(com.growingio.b.o o2, String string, boolean bl2, boolean bl3, int n2, s s2) throws e {
        com.growingio.b.o o3 = s2.a;
        as as2 = s2.b;
        String string2 = as2.g();
        int n3 = as2.f();
        if (string.equals("<init>")) {
            bl3 = true;
            if (o3 != o2) {
                throw new e("no such constructor: " + o2.s());
            }
            if (o3 != this.dF && com.growingio.b.a.a.g(n3)) {
                string2 = this.a(string2, o3, as2);
                this.e.j(1);
            }
        } else if (com.growingio.b.a.a.g(n3)) {
            if (o3 == this.dF) {
                bl3 = true;
            } else {
                bl3 = false;
                bl2 = true;
                String string3 = string2;
                if ((n3 & 8) == 0) {
                    string2 = T.b(o3.s(), string3);
                }
                n3 = com.growingio.b.a.a.d(n3) | 8;
                string = this.a(string, string3, string2, as2, o3);
            }
        }
        boolean bl4 = false;
        if ((n3 & 8) != 0) {
            if (!bl2) {
                bl2 = true;
                if (n2 >= 0) {
                    this.e.a(n2, 0);
                } else {
                    bl4 = true;
                }
            }
            this.e.d(o3, string, string2);
        } else if (bl3) {
            this.e.c(o2, string, string2);
        } else {
            if (!ad.a(o3.c()) || o3.x() != o2.x()) {
                o3 = o2;
            }
            if (o3.x()) {
                int n4 = T.i(string2) + 1;
                this.e.a(o3, string, string2, n4);
            } else {
                if (bl2) {
                    throw new e(string + " is not static");
                }
                this.e.e(o3, string, string2);
            }
        }
        this.a(string2, bl2, bl4);
    }

    protected String a(String string, String string2, String string3, as as2, com.growingio.b.o o2) throws e {
        com.growingio.b.b.a a2;
        if (this.a(o2, this.dF) && (a2 = o2.k()) != null) {
            return a2.a(string, string2, string3, as2);
        }
        throw new e("Method " + string + " is private");
    }

    protected String a(String string, com.growingio.b.o o2, as as2) throws e {
        com.growingio.b.b.a a2;
        if (this.a(o2, this.dF) && (a2 = o2.k()) != null) {
            return a2.a(o2, string, as2);
        }
        throw new e("the called constructor is private in " + o2.s());
    }

    private boolean a(com.growingio.b.o o2, com.growingio.b.o o3) {
        try {
            while (o3 != null) {
                if ((o3 = o3.E()) != o2) continue;
                return true;
            }
        }
        catch (ae var3_3) {
            // empty catch block
        }
        return false;
    }

    public int e(a a2) {
        return a.b(a2);
    }

    public void a(a a2, int[] arrn, int[] arrn2, String[] arrstring) throws e {
        int n2 = 0;
        while (a2 != null) {
            b b2 = a2.c();
            b2.a(this);
            arrn[n2] = this.do;
            arrn2[n2] = this.dp;
            arrstring[n2] = this.dq;
            ++n2;
            a2 = a2.d();
        }
    }

    void a(String string, boolean bl2, boolean bl3) throws e {
        int n2;
        int n3 = string.indexOf(41);
        if (n3 < 0) {
            o.j();
        }
        char c2 = string.charAt(++n3);
        int n4 = 0;
        while (c2 == '[') {
            ++n4;
            c2 = string.charAt(++n3);
        }
        this.dp = n4;
        if (c2 == 'L') {
            n2 = string.indexOf(59, n3 + 1);
            if (n2 < 0) {
                o.j();
            }
            this.do = 307;
            this.dq = string.substring(n3 + 1, n2);
        } else {
            this.do = r.a(c2);
            this.dq = null;
        }
        n2 = this.do;
        if (bl2 && bl3) {
            if (o.a(n2, n4)) {
                this.e.j(93);
                this.e.j(88);
                this.e.j(87);
            } else if (n2 == 344) {
                this.e.j(87);
            } else {
                this.e.j(95);
                this.e.j(87);
            }
        }
    }

    @Override
    protected void a(k k2, int n2, b b2, b b3, boolean bl2) throws e {
        int n3;
        com.growingio.b.t t2 = this.a(b2, false);
        boolean bl3 = this.dH;
        if (n2 != 61 && !bl3) {
            this.e.j(89);
        }
        if (n2 == 61) {
            ac ac2 = t2.g();
            this.a(ac2);
            com.growingio.b.b.a a2 = this.a(t2, ac2);
            n3 = a2 == null ? this.b(t2, ac2) : 0;
        } else {
            n3 = this.a(t2, bl3);
        }
        int n4 = this.do;
        int n5 = this.dp;
        String string = this.dq;
        this.a(k2, n2, b3, n4, n5, string);
        boolean bl4 = o.a(n4, n5);
        if (bl2) {
            int n6 = bl3 ? (bl4 ? 92 : 89) : (bl4 ? 93 : 90);
            this.e.j(n6);
        }
        this.a(t2, bl3, n3, bl4);
        this.do = n4;
        this.dp = n5;
        this.dq = string;
    }

    private void a(com.growingio.b.t t2, boolean bl2, int n2, boolean bl3) throws e {
        if (n2 != 0) {
            if (bl2) {
                this.e.b(179);
                this.e.k(bl3 ? -2 : -1);
            } else {
                this.e.b(181);
                this.e.k(bl3 ? -3 : -2);
            }
            this.e.m(n2);
        } else {
            com.growingio.b.o o2 = t2.r_();
            com.growingio.b.b.a a2 = o2.k();
            ac ac2 = t2.g();
            as as2 = a2.b(ac2, bl2);
            this.e.d(o2, as2.a(), as2.g());
        }
    }

    @Override
    public void a(com.growingio.b.b.a.p p2) throws e {
        this.e(p2);
    }

    @Override
    protected void e(b b2) throws e {
        com.growingio.b.t t2 = this.a(b2, true);
        if (t2 == null) {
            this.f(b2);
            return;
        }
        boolean bl2 = this.dH;
        b b3 = A.a(t2);
        if (b3 == null) {
            this.a(t2, bl2);
        } else {
            b3.a(this);
            this.a(t2.g());
        }
    }

    private void f(b b2) throws e {
        if (this.dp == 0) {
            throw new e(".length applied to a non array");
        }
        this.e.j(190);
        this.do = 324;
        this.dp = 0;
    }

    private int a(com.growingio.b.t t2, boolean bl2) throws e {
        ac ac2 = t2.g();
        boolean bl3 = this.a(ac2);
        com.growingio.b.b.a a2 = this.a(t2, ac2);
        if (a2 != null) {
            as as2 = a2.a(ac2, bl2);
            this.e.d(t2.r_(), as2.a(), as2.g());
            return 0;
        }
        int n2 = this.b(t2, ac2);
        if (bl2) {
            this.e.b(178);
            this.e.k(bl3 ? 2 : 1);
        } else {
            this.e.b(180);
            this.e.k(bl3 ? 1 : 0);
        }
        this.e.m(n2);
        return n2;
    }

    private com.growingio.b.b.a a(com.growingio.b.t t2, ac ac2) throws e {
        if (com.growingio.b.a.a.g(ac2.c()) && t2.r_() != this.dF) {
            com.growingio.b.o o2 = t2.r_();
            if (this.a(o2, this.dF)) {
                com.growingio.b.b.a a2 = o2.k();
                if (a2 != null) {
                    return a2;
                }
                throw new e("fatal error.  bug?");
            }
            throw new e("Field " + t2.q() + " in " + o2.s() + " is private.");
        }
        return null;
    }

    private boolean a(ac ac2) throws e {
        String string = ac2.d();
        int n2 = 0;
        int n3 = 0;
        char c2 = string.charAt(n2);
        while (c2 == '[') {
            ++n3;
            c2 = string.charAt(++n2);
        }
        this.dp = n3;
        this.do = r.a(c2);
        this.dq = c2 == 'L' ? string.substring(n2 + 1, string.indexOf(59, n2 + 1)) : null;
        boolean bl2 = n3 == 0 && (c2 == 'J' || c2 == 'D');
        return bl2;
    }

    private int b(com.growingio.b.t t2, ac ac2) {
        Q q2 = this.e.c();
        String string = t2.r_().s();
        int n2 = q2.a(string);
        String string2 = ac2.b();
        String string3 = ac2.d();
        return q2.a(n2, string2, string3);
    }

    @Override
    protected void b(String string) throws e {
        if (this.h() < 49) {
            super.b(string);
        } else {
            this.e.y(this.e.c().a(string));
        }
    }

    @Override
    protected void a(int n2, boolean bl2, b b2, k k2, boolean bl3) throws e {
        com.growingio.b.t t2 = this.a(b2, false);
        boolean bl4 = this.dH;
        if (!bl4) {
            this.e.j(89);
        }
        int n3 = this.a(t2, bl4);
        int n4 = this.do;
        boolean bl5 = o.a(n4, this.dp);
        int n5 = bl4 ? (bl5 ? 92 : 89) : (bl5 ? 93 : 90);
        this.a(n5, bl3, n2, bl2, k2);
        this.a(t2, bl4, n3, bl5);
    }

    protected com.growingio.b.t a(b b2, boolean bl2) throws e {
        if (b2 instanceof com.growingio.b.b.a.p) {
            String string = ((com.growingio.b.b.a.p)b2).d();
            com.growingio.b.t t2 = null;
            try {
                t2 = this.dF.d(string);
            }
            catch (ae var5_7) {
                throw new t(string, b2);
            }
            boolean bl3 = ad.e(t2.d());
            if (!bl3) {
                if (this.dk) {
                    throw new e("not available in a static method: " + string);
                }
                this.e.n(0);
            }
            this.dH = bl3;
            return t2;
        }
        if (b2 instanceof k) {
            k k2 = (k)b2;
            int n2 = k2.h();
            if (n2 == 35) {
                com.growingio.b.t t3 = this.dE.b(((v)k2.i()).d(), (v)k2.j());
                this.dH = true;
                return t3;
            }
            if (n2 == 46) {
                com.growingio.b.t t4 = null;
                try {
                    k2.i().a(this);
                    if (this.do == 307 && this.dp == 0) {
                        t4 = this.dE.a(this.dq, (v)k2.j());
                    } else {
                        if (bl2 && this.dp > 0 && ((v)k2.j()).d().equals("length")) {
                            return null;
                        }
                        o.k();
                    }
                    boolean bl4 = ad.e(t4.d());
                    if (bl4) {
                        this.e.j(87);
                    }
                    this.dH = bl4;
                    return t4;
                }
                catch (t var6_12) {
                    if (var6_12.c() != k2.i()) {
                        throw var6_12;
                    }
                    v v2 = (v)k2.j();
                    String string = var6_12.b();
                    t4 = this.dE.a(string, v2, b2);
                    this.dH = true;
                    return t4;
                }
            }
            o.k();
        } else {
            o.k();
        }
        this.dH = false;
        return null;
    }

    private static void k() throws e {
        throw new e("bad l-value");
    }

    public com.growingio.b.o[] b(com.growingio.b.b.a.q q2) throws e {
        com.growingio.b.o[] arro;
        a a2 = q2.j();
        if (a2 == null) {
            arro = new com.growingio.b.o[]{};
        } else {
            int n2 = 0;
            arro = new com.growingio.b.o[a2.e()];
            while (a2 != null) {
                arro[n2++] = this.dE.a((i)a2.c());
                a2 = a2.d();
            }
        }
        return arro;
    }

    public com.growingio.b.o[] c(com.growingio.b.b.a.q q2) throws e {
        a a2 = q2.k();
        if (a2 == null) {
            return null;
        }
        int n2 = 0;
        com.growingio.b.o[] arro = new com.growingio.b.o[a2.e()];
        while (a2 != null) {
            arro[n2++] = this.dE.a((a)a2.c());
            a2 = a2.d();
        }
        return arro;
    }

    @Override
    protected String a(a a2) throws e {
        return this.dE.b(a2);
    }

    @Override
    protected String a(String string) throws e {
        return this.dE.b(string);
    }
}

