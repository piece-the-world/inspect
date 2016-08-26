/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.b;

import com.growingio.b.a.ac;
import com.growingio.b.a.as;
import com.growingio.b.a.ay;
import com.growingio.b.ad;
import com.growingio.b.ae;
import com.growingio.b.b.a.a;
import com.growingio.b.b.a.b;
import com.growingio.b.b.a.c;
import com.growingio.b.b.a.d;
import com.growingio.b.b.a.e;
import com.growingio.b.b.a.f;
import com.growingio.b.b.a.g;
import com.growingio.b.b.a.h;
import com.growingio.b.b.a.i;
import com.growingio.b.b.a.j;
import com.growingio.b.b.a.k;
import com.growingio.b.b.a.m;
import com.growingio.b.b.a.n;
import com.growingio.b.b.a.p;
import com.growingio.b.b.a.u;
import com.growingio.b.b.a.v;
import com.growingio.b.b.a.w;
import com.growingio.b.b.a.x;
import com.growingio.b.b.r;
import com.growingio.b.b.s;
import com.growingio.b.b.t;
import com.growingio.b.b.z;
import com.growingio.b.o;

public class A
extends x
implements ay,
z {
    static final String a = "java.lang.Object";
    static final String b = "java/lang/Object";
    static final String c = "java/lang/String";
    static final String d = "java/lang/Class";
    protected int e;
    protected int di;
    protected String dj;
    protected r dk;
    protected o dl;
    protected as dm;

    public A(o o2, com.growingio.b.g g2) {
        this.dk = new r(g2);
        this.dl = o2;
        this.dm = null;
    }

    protected static String a(int[] arrn, int[] arrn2, String[] arrstring) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('(');
        int n2 = arrn.length;
        if (n2 > 0) {
            int n3 = 0;
            do {
                A.a(stringBuffer, arrn[n3], arrn2[n3], arrstring[n3]);
                if (++n3 >= n2) break;
                stringBuffer.append(',');
            } while (true);
        }
        stringBuffer.append(')');
        return stringBuffer.toString();
    }

    protected static StringBuffer a(StringBuffer stringBuffer, int n2, int n3, String string) {
        String string2;
        if (n2 == 307) {
            string2 = r.d(string);
        } else if (n2 == 412) {
            string2 = "Object";
        } else {
            try {
                string2 = r.a(n2);
            }
            catch (com.growingio.b.b.e var5_5) {
                string2 = "?";
            }
        }
        stringBuffer.append(string2);
        while (n3-- > 0) {
            stringBuffer.append("[]");
        }
        return stringBuffer;
    }

    public void a(as as2) {
        this.dm = as2;
    }

    protected static void b() throws com.growingio.b.b.e {
        throw new com.growingio.b.b.e("fatal");
    }

    protected String c() {
        return r.c(this.dl.s());
    }

    protected String d() throws com.growingio.b.b.e {
        return r.c(r.a(this.dl).s());
    }

    protected String e(a a2) throws com.growingio.b.b.e {
        return this.dk.b(a2);
    }

    protected String a(String string) throws com.growingio.b.b.e {
        return this.dk.b(string);
    }

    @Override
    public void a(com.growingio.b.b.a.r r2) throws com.growingio.b.b.e {
        if (r2.g()) {
            this.b(r2);
        } else {
            o o2 = this.dk.a(r2.i());
            String string = o2.s();
            a a2 = r2.j();
            this.a(o2, "<init>", a2);
            this.e = 307;
            this.di = 0;
            this.dj = r.c(string);
        }
    }

    public void b(com.growingio.b.b.a.r r2) throws com.growingio.b.b.e {
        int n2 = r2.h();
        a a2 = r2.k();
        a a3 = r2.i();
        c c2 = r2.l();
        if (c2 != null) {
            c2.a(this);
        }
        if (a2.e() > 1) {
            this.a(n2, a3, a2);
        } else {
            b b2 = a2.c();
            if (b2 != null) {
                b2.a(this);
            }
            this.e = n2;
            this.di = 1;
            this.dj = n2 == 307 ? this.e(a3) : null;
        }
    }

    @Override
    public void a(c c2) throws com.growingio.b.b.e {
        for (a a2 = c2; a2 != null; a2 = a2.d()) {
            b b2 = a2.c();
            if (b2 == null) continue;
            b2.a(this);
        }
    }

    protected void a(int n2, a a2, a a3) throws com.growingio.b.b.e {
        b b2;
        int n3 = a3.e();
        int n4 = 0;
        while (a3 != null && (b2 = a3.c()) != null) {
            ++n4;
            b2.a(this);
            a3 = a3.d();
        }
        this.e = n2;
        this.di = n3;
        this.dj = n2 == 307 ? this.e(a2) : null;
    }

    @Override
    public void a(d d2) throws com.growingio.b.b.e {
        int n2 = d2.h();
        b b2 = d2.i();
        b b3 = d2.j();
        if (b2 instanceof w) {
            this.a(d2, n2, (w)b2, ((w)b2).c(), b3);
        } else {
            k k2;
            if (b2 instanceof k && (k2 = (k)b2).h() == 65) {
                this.a((k)d2, n2, (k)b2, b3);
                return;
            }
            this.a((k)d2, n2, b2, b3);
        }
    }

    private void a(k k2, int n2, w w2, i i2, b b2) throws com.growingio.b.b.e {
        int n3 = i2.g();
        int n4 = i2.h();
        String string = i2.i();
        if (n2 != 61) {
            this.a(w2);
        }
        b2.a(this);
        this.e = n3;
        this.di = n4;
        this.dj = string;
    }

    private void a(k k2, int n2, k k3, b b2) throws com.growingio.b.b.e {
        this.a(k3.i(), k3.j());
        int n3 = this.e;
        int n4 = this.di;
        String string = this.dj;
        b2.a(this);
        this.e = n3;
        this.di = n4;
        this.dj = string;
    }

    protected void a(k k2, int n2, b b2, b b3) throws com.growingio.b.b.e {
        com.growingio.b.t t2 = this.c(b2);
        this.b(t2);
        int n3 = this.e;
        int n4 = this.di;
        String string = this.dj;
        b3.a(this);
        this.e = n3;
        this.di = n4;
        this.dj = string;
    }

    @Override
    public void a(h h2) throws com.growingio.b.b.e {
        this.f(h2.g());
        h2.h().a(this);
        int n2 = this.e;
        int n3 = this.di;
        String string = this.dj;
        h2.i().a(this);
        if (n3 == 0 && n3 == this.di) {
            if (com.growingio.b.b.b.c(n2, this.e)) {
                h2.e(new g(this.e, 0, h2.h()));
            } else if (com.growingio.b.b.b.c(this.e, n2)) {
                h2.f(new g(n2, 0, h2.i()));
                this.e = n2;
            }
        }
    }

    @Override
    public void a(e e2) throws com.growingio.b.b.e {
        int n2 = e2.h();
        int n3 = com.growingio.b.b.b.c(n2);
        if (n3 >= 0) {
            if (n2 == 43) {
                k k2 = this.b(e2);
                if (k2 != null) {
                    k2 = f.b(k.b(46, k2, new p("toString")), null);
                    e2.d(k2);
                    e2.e(null);
                    this.dj = "java/lang/String";
                }
            } else {
                b b2 = e2.i();
                b b3 = e2.j();
                b2.a(this);
                int n4 = this.e;
                b3.a(this);
                if (!this.a(e2, n2, b2, b3)) {
                    this.a(e2, n2, n4);
                }
            }
        } else {
            this.f(e2);
        }
    }

    private k b(e e2) throws com.growingio.b.b.e {
        b b2 = e2.i();
        b b3 = e2.j();
        if (b3 == null) {
            b2.a(this);
            return null;
        }
        if (A.e(b2)) {
            k k2 = this.b((e)b2);
            if (k2 != null) {
                b3.a(this);
                this.e = 307;
                this.di = 0;
                this.dj = "java/lang/StringBuffer";
                return A.b(k2, b3);
            }
        } else {
            b2.a(this);
        }
        int n2 = this.e;
        int n3 = this.di;
        String string = this.dj;
        b3.a(this);
        if (this.a(e2, 43, b2, b3)) {
            return null;
        }
        if (n2 == 307 && n3 == 0 && "java/lang/String".equals(string) || this.e == 307 && this.di == 0 && "java/lang/String".equals(this.dj)) {
            a a2 = a.a(new v("java"), new v("lang"), new v("StringBuffer"));
            com.growingio.b.b.a.r r2 = new com.growingio.b.b.a.r(a2, null);
            this.e = 307;
            this.di = 0;
            this.dj = "java/lang/StringBuffer";
            return A.b(A.b(r2, b2), b3);
        }
        this.a(e2, 43, n2);
        return null;
    }

    private boolean a(e e2, int n2, b b2, b b3) throws com.growingio.b.b.e {
        b2 = A.a(b2);
        b3 = A.a(b3);
        b b4 = null;
        if (b2 instanceof u && b3 instanceof u && n2 == 43) {
            b4 = new u(((u)b2).c() + ((u)b3).c());
        } else if (b2 instanceof n) {
            b4 = ((n)b2).a(n2, b3);
        } else if (b2 instanceof j) {
            b4 = ((j)b2).a(n2, b3);
        }
        if (b4 == null) {
            return false;
        }
        e2.b(43);
        e2.d(b4);
        e2.e(null);
        b4.a(this);
        return true;
    }

    static b a(b b2) {
        b b3;
        if (b2 instanceof e) {
            e e2 = (e)b2;
            if (e2.h() == 43 && e2.j() == null) {
                return e2.a();
            }
        } else if (b2 instanceof k) {
            k k2 = (k)b2;
            int n2 = k2.h();
            if (n2 == 35) {
                b b4 = A.b((p)k2.j());
                if (b4 != null) {
                    return b4;
                }
            } else if (n2 == 43 && k2.b() == null) {
                return k2.a();
            }
        } else if (b2 instanceof p && (b3 = A.b((p)b2)) != null) {
            return b3;
        }
        return b2;
    }

    private static b b(p p2) {
        return A.a(p2.c());
    }

    public static b a(com.growingio.b.t t2) {
        if (t2 == null) {
            return null;
        }
        Object object = t2.j();
        if (object == null) {
            return null;
        }
        if (object instanceof String) {
            return new u((String)object);
        }
        if (object instanceof Double || object instanceof Float) {
            int n2 = object instanceof Double ? 405 : 404;
            return new j(((Number)object).doubleValue(), n2);
        }
        if (object instanceof Number) {
            int n3 = object instanceof Long ? 403 : 402;
            return new n(((Number)object).longValue(), n3);
        }
        if (object instanceof Boolean) {
            return new com.growingio.b.b.a.o((Boolean)object != false ? 410 : 411);
        }
        return null;
    }

    private static boolean e(b b2) {
        if (b2 instanceof e) {
            e e2 = (e)b2;
            int n2 = e2.h();
            return n2 == 43;
        }
        return false;
    }

    private static k b(b b2, b b3) {
        return f.b(k.b(46, b2, new p("append")), new a(b3));
    }

    private void a(e e2, int n2, int n3) throws com.growingio.b.b.e {
        int n4 = this.e;
        if (n2 == 364 || n2 == 366 || n2 == 370) {
            this.e = n3;
        } else {
            this.b(e2, n3, n4);
        }
        if (com.growingio.b.b.b.e(this.e) && this.e != 301) {
            this.e = 324;
        }
    }

    private void f(b b2) throws com.growingio.b.b.e {
        int n2 = com.growingio.b.b.b.d(b2);
        if (n2 == 358) {
            e e2 = (e)b2;
            e2.i().a(this);
            int n3 = this.e;
            int n4 = this.di;
            e2.j().a(this);
            if (n4 == 0 && this.di == 0) {
                this.b(e2, n3, this.e);
            }
        } else if (n2 == 33) {
            ((k)b2).i().a(this);
        } else if (n2 == 369 || n2 == 368) {
            e e3 = (e)b2;
            e3.i().a(this);
            e3.j().a(this);
        } else {
            b2.a(this);
        }
        this.e = 301;
        this.di = 0;
    }

    private void b(e e2, int n2, int n3) throws com.growingio.b.b.e {
        if (com.growingio.b.b.b.c(n2, n3)) {
            e2.a((b)new g(n3, 0, e2.i()));
        } else {
            this.e = n2;
        }
    }

    @Override
    public void a(g g2) throws com.growingio.b.b.e {
        String string = this.e(g2.i());
        g2.j().a(this);
        this.e = g2.g();
        this.di = g2.h();
        this.dj = string;
    }

    @Override
    public void a(m m2) throws com.growingio.b.b.e {
        m2.j().a(this);
        this.e = 301;
        this.di = 0;
    }

    @Override
    public void c(k k2) throws com.growingio.b.b.e {
        int n2 = k2.h();
        b b2 = k2.i();
        if (n2 == 46) {
            String string = ((v)k2.j()).d();
            if (string.equals("length")) {
                try {
                    this.b(k2);
                }
                catch (t var5_6) {
                    this.g(k2);
                }
            } else if (string.equals("class")) {
                this.a(k2);
            } else {
                this.g(k2);
            }
        } else if (n2 == 35) {
            String string = ((v)k2.j()).d();
            if (string.equals("class")) {
                this.a(k2);
            } else {
                this.g(k2);
            }
        } else if (n2 == 65) {
            this.a(b2, k2.j());
        } else if (n2 == 362 || n2 == 363) {
            this.a(n2, b2, k2);
        } else if (n2 == 33) {
            this.f(k2);
        } else if (n2 == 67) {
            A.b();
        } else {
            b2.a(this);
            if (!this.a(k2, n2, b2) && (n2 == 45 || n2 == 126) && com.growingio.b.b.b.e(this.e)) {
                this.e = 324;
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean a(k k2, int n2, b b2) {
        if ((b2 = A.a(b2)) instanceof n) {
            n n3 = (n)b2;
            long l2 = n3.c();
            if (n2 == 45) {
                l2 = - l2;
            } else {
                if (n2 != 126) return false;
                l2 ^= -1;
            }
            n3.a(l2);
        } else {
            if (!(b2 instanceof j)) return false;
            j j2 = (j)b2;
            if (n2 != 45) return false;
            j2.a(- j2.c());
        }
        k2.b(43);
        return true;
    }

    @Override
    public void a(f f2) throws com.growingio.b.b.e {
        Object object;
        String string = null;
        o o2 = null;
        b b2 = f2.i();
        a a2 = (a)f2.j();
        if (b2 instanceof p) {
            string = ((p)b2).d();
            o2 = this.dl;
        } else if (b2 instanceof com.growingio.b.b.a.o) {
            string = "<init>";
            o2 = ((com.growingio.b.b.a.o)b2).c() == 336 ? r.a(this.dl) : this.dl;
        } else if (b2 instanceof k) {
            object = (k)b2;
            string = ((v)object.j()).d();
            int n2 = object.h();
            if (n2 == 35) {
                o2 = this.dk.a(((v)object.i()).d(), false);
            } else if (n2 == 46) {
                b b3 = object.i();
                String string2 = A.b(b3);
                if (string2 != null) {
                    o2 = r.a(this.dl, string2);
                } else {
                    try {
                        b3.a(this);
                    }
                    catch (t var10_10) {
                        if (var10_10.c() != b3) {
                            throw var10_10;
                        }
                        this.e = 307;
                        this.di = 0;
                        this.dj = var10_10.b();
                        object.b(35);
                        object.d(new v(r.d(this.dj)));
                    }
                    if (this.di > 0) {
                        o2 = this.dk.a("java.lang.Object", true);
                    } else if (this.e == 307) {
                        o2 = this.dk.a(this.dj);
                    } else {
                        A.a();
                    }
                }
            } else {
                A.a();
            }
        } else {
            A.b();
        }
        object = this.a(o2, string, a2);
        f2.a((s)object);
    }

    private static void a() throws com.growingio.b.b.e {
        throw new com.growingio.b.b.e("bad method");
    }

    static String b(b b2) {
        k k2;
        b b3;
        if (b2 instanceof k && (k2 = (k)b2).h() == 46 && (b3 = k2.j()) instanceof com.growingio.b.b.a.o && ((com.growingio.b.b.a.o)b3).c() == 336) {
            return ((v)k2.i()).d();
        }
        return null;
    }

    public s a(o o2, String string, a a2) throws com.growingio.b.b.e {
        int n2 = this.d(a2);
        int[] arrn = new int[n2];
        int[] arrn2 = new int[n2];
        String[] arrstring = new String[n2];
        this.a(a2, arrn, arrn2, arrstring);
        s s2 = this.dk.a(o2, this.dl, this.dm, string, arrn, arrn2, arrstring);
        if (s2 == null) {
            String string2 = o2.s();
            String string3 = A.a(arrn, arrn2, arrstring);
            String string4 = string.equals("<init>") ? "cannot find constructor " + string2 + string3 : string + string3 + " not found in " + string2;
            throw new com.growingio.b.b.e(string4);
        }
        String string5 = s2.b.g();
        this.b(string5);
        return s2;
    }

    public int d(a a2) {
        return a.b(a2);
    }

    public void a(a a2, int[] arrn, int[] arrn2, String[] arrstring) throws com.growingio.b.b.e {
        int n2 = 0;
        while (a2 != null) {
            b b2 = a2.c();
            b2.a(this);
            arrn[n2] = this.e;
            arrn2[n2] = this.di;
            arrstring[n2] = this.dj;
            ++n2;
            a2 = a2.d();
        }
    }

    void b(String string) throws com.growingio.b.b.e {
        int n2 = string.indexOf(41);
        if (n2 < 0) {
            A.a();
        }
        char c2 = string.charAt(++n2);
        int n3 = 0;
        while (c2 == '[') {
            ++n3;
            c2 = string.charAt(++n2);
        }
        this.di = n3;
        if (c2 == 'L') {
            int n4 = string.indexOf(59, n2 + 1);
            if (n4 < 0) {
                A.a();
            }
            this.e = 307;
            this.dj = string.substring(n2 + 1, n4);
        } else {
            this.e = r.a(c2);
            this.dj = null;
        }
    }

    private void g(b b2) throws com.growingio.b.b.e {
        this.b(this.c(b2));
    }

    private void b(com.growingio.b.t t2) throws com.growingio.b.b.e {
        ac ac2 = t2.g();
        String string = ac2.d();
        int n2 = 0;
        int n3 = 0;
        char c2 = string.charAt(n2);
        while (c2 == '[') {
            ++n3;
            c2 = string.charAt(++n2);
        }
        this.di = n3;
        this.e = r.a(c2);
        this.dj = c2 == 'L' ? string.substring(n2 + 1, string.indexOf(59, n2 + 1)) : null;
    }

    protected com.growingio.b.t c(b b2) throws com.growingio.b.b.e {
        if (b2 instanceof p) {
            p p2 = (p)b2;
            String string = p2.d();
            try {
                com.growingio.b.t t2 = this.dl.d(string);
                if (ad.e(t2.d())) {
                    p2.a(t2);
                }
                return t2;
            }
            catch (ae var4_7) {
                throw new t(string, b2);
            }
        }
        if (b2 instanceof k) {
            k k2 = (k)b2;
            int n2 = k2.h();
            if (n2 == 35) {
                p p3 = (p)k2.j();
                com.growingio.b.t t3 = this.dk.b(((v)k2.i()).d(), p3);
                p3.a(t3);
                return t3;
            }
            if (n2 == 46) {
                try {
                    k2.i().a(this);
                }
                catch (t var4_9) {
                    if (var4_9.c() != k2.i()) {
                        throw var4_9;
                    }
                    return this.a(k2, var4_9.b());
                }
                com.growingio.b.b.e e2 = null;
                try {
                    if (this.e == 307 && this.di == 0) {
                        return this.dk.a(this.dj, (v)k2.j());
                    }
                }
                catch (com.growingio.b.b.e var5_12) {
                    e2 = var5_12;
                }
                b b3 = k2.i();
                if (b3 instanceof v) {
                    return this.a(k2, ((v)b3).d());
                }
                if (e2 != null) {
                    throw e2;
                }
            }
        }
        throw new com.growingio.b.b.e("bad filed access");
    }

    private com.growingio.b.t a(k k2, String string) throws com.growingio.b.b.e {
        p p2 = (p)k2.j();
        com.growingio.b.t t2 = this.dk.a(string, p2, k2);
        k2.b(35);
        k2.d(new v(r.d(string)));
        p2.a(t2);
        return t2;
    }

    public void a(k k2) throws com.growingio.b.b.e {
        this.e = 307;
        this.di = 0;
        this.dj = "java/lang/Class";
    }

    public void b(k k2) throws com.growingio.b.b.e {
        k2.i().a(this);
        if (this.di == 0) {
            throw new t("length", k2);
        }
        this.e = 324;
        this.di = 0;
    }

    public void a(b b2, b b3) throws com.growingio.b.b.e {
        b2.a(this);
        int n2 = this.e;
        int n3 = this.di;
        String string = this.dj;
        b3.a(this);
        this.e = n2;
        this.di = n3 - 1;
        this.dj = string;
    }

    private void a(int n2, b b2, k k2) throws com.growingio.b.b.e {
        boolean bl2;
        boolean bl3 = bl2 = b2 == null;
        if (bl2) {
            b2 = k2.j();
        }
        if (b2 instanceof w) {
            i i2 = ((w)b2).c();
            this.e = i2.g();
            this.di = i2.h();
        } else {
            k k3;
            if (b2 instanceof k && (k3 = (k)b2).h() == 65) {
                this.a(k3.i(), k3.j());
                int n3 = this.e;
                if (n3 == 324 || n3 == 303 || n3 == 306 || n3 == 334) {
                    this.e = 324;
                }
                return;
            }
            this.d(b2);
        }
    }

    protected void d(b b2) throws com.growingio.b.b.e {
        com.growingio.b.t t2 = this.c(b2);
        this.b(t2);
        int n2 = this.e;
        if (n2 == 324 || n2 == 303 || n2 == 306 || n2 == 334) {
            this.e = 324;
        }
    }

    @Override
    public void a(p p2) throws com.growingio.b.b.e {
        this.g(p2);
    }

    @Override
    public void a(w w2) throws com.growingio.b.b.e {
        i i2 = w2.c();
        this.e = i2.g();
        this.di = i2.h();
        this.dj = i2.i();
    }

    @Override
    public void a(com.growingio.b.b.a.o o2) throws com.growingio.b.b.e {
        this.di = 0;
        int n2 = o2.c();
        switch (n2) {
            case 410: 
            case 411: {
                this.e = 301;
                break;
            }
            case 412: {
                this.e = 412;
                break;
            }
            case 336: 
            case 339: {
                this.e = 307;
                if (n2 == 339) {
                    this.dj = this.c();
                    break;
                }
                this.dj = this.d();
                break;
            }
            default: {
                A.b();
            }
        }
    }

    @Override
    public void a(u u2) throws com.growingio.b.b.e {
        this.e = 307;
        this.di = 0;
        this.dj = "java/lang/String";
    }

    @Override
    public void a(n n2) throws com.growingio.b.b.e {
        this.di = 0;
        int n3 = n2.d();
        this.e = n3 == 402 || n3 == 401 ? (n3 == 402 ? 324 : 306) : 326;
    }

    @Override
    public void a(j j2) throws com.growingio.b.b.e {
        this.di = 0;
        this.e = j2.d() == 405 ? 312 : 317;
    }
}

