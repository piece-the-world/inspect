/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.b;

import com.growingio.b.a.ay;
import com.growingio.b.b.A;
import com.growingio.b.b.a.a;
import com.growingio.b.b.a.c;
import com.growingio.b.b.a.d;
import com.growingio.b.b.a.e;
import com.growingio.b.b.a.f;
import com.growingio.b.b.a.g;
import com.growingio.b.b.a.h;
import com.growingio.b.b.a.i;
import com.growingio.b.b.a.j;
import com.growingio.b.b.a.k;
import com.growingio.b.b.a.l;
import com.growingio.b.b.a.m;
import com.growingio.b.b.a.n;
import com.growingio.b.b.a.o;
import com.growingio.b.b.a.p;
import com.growingio.b.b.a.q;
import com.growingio.b.b.a.s;
import com.growingio.b.b.a.t;
import com.growingio.b.b.a.u;
import com.growingio.b.b.a.v;
import com.growingio.b.b.a.w;
import com.growingio.b.b.a.x;
import com.growingio.b.b.r;
import com.growingio.b.b.z;
import java.util.ArrayList;
import java.util.Arrays;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class b
extends x
implements ay,
z {
    static final String a = "java.lang.Object";
    static final String b = "java/lang/Object";
    static final String c = "java.lang.String";
    static final String d = "java/lang/String";
    protected com.growingio.b.a.o e;
    private int ds;
    A di;
    protected boolean dj;
    public boolean dk;
    protected ArrayList dl;
    protected ArrayList dm;
    protected com.growingio.b.b.d dn;
    protected int do;
    protected int dp;
    protected String dq;
    static final int[] dr = new int[]{43, 99, 98, 97, 96, 45, 103, 102, 101, 100, 42, 107, 106, 105, 104, 47, 111, 110, 109, 108, 37, 115, 114, 113, 112, 124, 0, 0, 129, 128, 94, 0, 0, 131, 130, 38, 0, 0, 127, 126, 364, 0, 0, 121, 120, 366, 0, 0, 123, 122, 370, 0, 0, 125, 124};
    private static final int[] dt = new int[]{358, 159, 160, 350, 160, 159, 357, 164, 163, 359, 162, 161, 60, 161, 162, 62, 163, 164};
    private static final int[] du = new int[]{358, 153, 154, 350, 154, 153, 357, 158, 157, 359, 156, 155, 60, 155, 156, 62, 157, 158};
    private static final int dv = 0;
    private static final int dw = 1;
    private static final int dx = 2;
    private static final int dy = 3;
    private static final int dz = -1;
    private static final int[] dA = new int[]{0, 144, 143, 142, 141, 0, 140, 139, 138, 137, 0, 136, 135, 134, 133, 0};

    public b(com.growingio.b.a.o o2) {
        this.e = o2;
        this.ds = -1;
        this.di = null;
        this.dj = false;
        this.dk = false;
        this.dl = null;
        this.dm = null;
        this.dn = null;
    }

    public void a(A a2) {
        this.di = a2;
    }

    protected static void a() throws com.growingio.b.b.e {
        throw new com.growingio.b.b.e("fatal");
    }

    public static boolean a(int n2, int n3) {
        return n3 == 0 && (n2 == 312 || n2 == 326);
    }

    public int b() {
        return this.e.i();
    }

    public void a(int n2) {
        this.e.e(n2);
    }

    protected void b(int n2) {
        this.e.f(n2);
    }

    protected int c() {
        if (this.ds < 0) {
            this.ds = this.b();
            this.b(2);
        }
        return this.ds;
    }

    protected int a(i i2) {
        int n2 = i2.l();
        if (n2 < 0) {
            n2 = this.b();
            i2.c(n2);
            this.b(1);
        }
        return n2;
    }

    protected abstract String d();

    protected abstract String e() throws com.growingio.b.b.e;

    protected abstract String a(a var1) throws com.growingio.b.b.e;

    protected abstract String a(String var1) throws com.growingio.b.b.e;

    protected static String a(String string, int n2) {
        if (string == null) {
            return null;
        }
        if (n2 == 0) {
            return string;
        }
        StringBuffer stringBuffer = new StringBuffer();
        int n3 = n2;
        while (n3-- > 0) {
            stringBuffer.append('[');
        }
        stringBuffer.append('L');
        stringBuffer.append(string);
        stringBuffer.append(';');
        return stringBuffer.toString();
    }

    protected static String b(int n2, int n3) {
        char c2 = 'I';
        switch (n2) {
            case 301: {
                c2 = 'Z';
                break;
            }
            case 303: {
                c2 = 'B';
                break;
            }
            case 306: {
                c2 = 'C';
                break;
            }
            case 334: {
                c2 = 'S';
                break;
            }
            case 324: {
                c2 = 'I';
                break;
            }
            case 326: {
                c2 = 'J';
                break;
            }
            case 317: {
                c2 = 'F';
                break;
            }
            case 312: {
                c2 = 'D';
                break;
            }
            case 344: {
                c2 = 'V';
            }
        }
        StringBuffer stringBuffer = new StringBuffer();
        while (n3-- > 0) {
            stringBuffer.append('[');
        }
        stringBuffer.append(c2);
        return stringBuffer.toString();
    }

    public void a(com.growingio.b.b.a.b b2) throws com.growingio.b.b.e {
        this.b(b2);
        b2.a(this);
    }

    public boolean a(boolean bl2, com.growingio.b.b.a.b b2) throws com.growingio.b.b.e {
        this.b(b2);
        return this.b(bl2, b2);
    }

    public void b(com.growingio.b.b.a.b b2) throws com.growingio.b.b.e {
        if (this.di != null) {
            b2.a(this.di);
        }
    }

    @Override
    public void b(a a2) throws com.growingio.b.b.e {
        b.a();
    }

    @Override
    public void a(s s2) throws com.growingio.b.b.e {
        b.a();
    }

    @Override
    public void a(v v2) throws com.growingio.b.b.e {
        b.a();
    }

    @Override
    public void a(l l2) throws com.growingio.b.b.e {
        l2.i().a(this);
    }

    @Override
    public void a(q q2) throws com.growingio.b.b.e {
        a a2;
        this.a(1);
        for (a a3 = q2.h(); a3 != null; a3 = a3.d()) {
            a2 = (o)a3.c();
            if (a2.c() != 335) continue;
            this.a(0);
            this.dk = true;
        }
        for (a2 = q2.j(); a2 != null; a2 = a2.d()) {
            this.b((i)a2.c());
        }
        t t2 = q2.l();
        this.a(t2, q2.g(), q2.i().g() == 344);
    }

    public void a(t t2, boolean bl2, boolean bl3) throws com.growingio.b.b.e {
        if (t2 == null) {
            return;
        }
        if (bl2 && this.d(t2)) {
            this.f();
        }
        this.dj = false;
        t2.a(this);
        if (!this.dj) {
            if (bl3) {
                this.e.j(177);
                this.dj = true;
            } else {
                throw new com.growingio.b.b.e("no return statement");
            }
        }
    }

    private boolean d(t t2) throws com.growingio.b.b.e {
        com.growingio.b.b.a.b b2;
        com.growingio.b.b.a.b b3;
        if (t2.g() == 66) {
            t2 = (t)t2.c();
        }
        if (t2 != null && t2.g() == 69 && (b3 = t2.c()) != null && b3 instanceof k && ((k)b3).h() == 67 && (b2 = ((k)b3).c()) instanceof o) {
            int n2 = ((o)b2).c();
            return n2 != 339 && n2 != 336;
        }
        return true;
    }

    protected abstract void f() throws com.growingio.b.b.e;

    @Override
    public void a(t t2) throws com.growingio.b.b.e {
        if (t2 == null) {
            return;
        }
        int n2 = t2.g();
        if (n2 == 69) {
            com.growingio.b.b.a.b b2 = t2.a();
            this.b(b2);
            if (b2 instanceof d) {
                this.a((d)b2, false);
            } else if (b.g(b2)) {
                k k2 = (k)b2;
                this.a(k2.h(), k2.i(), k2, false);
            } else {
                b2.a(this);
                if (b.a(this.do, this.dp)) {
                    this.e.j(88);
                } else if (this.do != 344) {
                    this.e.j(87);
                }
            }
        } else if (n2 == 68 || n2 == 66) {
            for (a a2 = t2; a2 != null; a2 = a2.d()) {
                com.growingio.b.b.a.b b3 = a2.c();
                if (b3 == null) continue;
                b3.a(this);
            }
        } else if (n2 == 320) {
            this.e(t2);
        } else if (n2 == 346 || n2 == 311) {
            this.a(t2, n2 == 346);
        } else if (n2 == 318) {
            this.f(t2);
        } else if (n2 == 302 || n2 == 309) {
            this.b(t2, n2 == 302);
        } else if (n2 == 333) {
            this.b(t2);
        } else if (n2 == 340) {
            this.h(t2);
        } else if (n2 == 343) {
            this.c(t2);
        } else if (n2 == 337) {
            this.g(t2);
        } else if (n2 == 338) {
            this.i(t2);
        } else {
            this.dj = false;
            throw new com.growingio.b.b.e("sorry, not supported statement: TokenId " + n2);
        }
    }

    private void e(t t2) throws com.growingio.b.b.e {
        com.growingio.b.b.a.b b2 = t2.c();
        t t3 = (t)t2.d().c();
        t t4 = (t)t2.d().d().c();
        if (this.a(false, b2)) {
            this.dj = false;
            if (t4 != null) {
                t4.a(this);
            }
            return;
        }
        int n2 = this.e.j();
        int n3 = 0;
        this.e.m(0);
        this.dj = false;
        if (t3 != null) {
            t3.a(this);
        }
        boolean bl2 = this.dj;
        this.dj = false;
        if (t4 != null && !bl2) {
            this.e.j(167);
            n3 = this.e.j();
            this.e.m(0);
        }
        this.e.c(n2, this.e.j() - n2 + 1);
        if (t4 != null) {
            t4.a(this);
            if (!bl2) {
                this.e.c(n3, this.e.j() - n3 + 1);
            }
            this.dj = bl2 && this.dj;
        }
    }

    private void a(t t2, boolean bl2) throws com.growingio.b.b.e {
        boolean bl3;
        ArrayList arrayList = this.dl;
        ArrayList arrayList2 = this.dm;
        this.dl = new ArrayList<E>();
        this.dm = new ArrayList<E>();
        com.growingio.b.b.a.b b2 = t2.c();
        t t3 = (t)t2.d();
        int n2 = 0;
        if (bl2) {
            this.e.j(167);
            n2 = this.e.j();
            this.e.m(0);
        }
        int n3 = this.e.j();
        if (t3 != null) {
            t3.a(this);
        }
        int n4 = this.e.j();
        if (bl2) {
            this.e.c(n2, n4 - n2 + 1);
        }
        if (bl3 = this.a(true, b2)) {
            this.e.j(167);
            bl3 = this.dl.size() == 0;
        }
        this.e.m(n3 - this.e.j() + 1);
        this.a(this.dl, this.e.j());
        this.a(this.dm, n4);
        this.dm = arrayList2;
        this.dl = arrayList;
        this.dj = bl3;
    }

    protected void a(ArrayList arrayList, int n2) {
        int n3 = arrayList.size();
        for (int i2 = 0; i2 < n3; ++i2) {
            int n4 = (Integer)arrayList.get(i2);
            this.e.c(n4, n2 - n4 + 1);
        }
    }

    private void f(t t2) throws com.growingio.b.b.e {
        ArrayList arrayList = this.dl;
        ArrayList arrayList2 = this.dm;
        this.dl = new ArrayList<E>();
        this.dm = new ArrayList<E>();
        t t3 = (t)t2.c();
        a a2 = t2.d();
        com.growingio.b.b.a.b b2 = a2.c();
        a2 = a2.d();
        t t4 = (t)a2.c();
        t t5 = (t)a2.d();
        if (t3 != null) {
            t3.a(this);
        }
        int n2 = this.e.j();
        int n3 = 0;
        if (b2 != null) {
            if (this.a(false, b2)) {
                this.dm = arrayList2;
                this.dl = arrayList;
                this.dj = false;
                return;
            }
            n3 = this.e.j();
            this.e.m(0);
        }
        if (t5 != null) {
            t5.a(this);
        }
        int n4 = this.e.j();
        if (t4 != null) {
            t4.a(this);
        }
        this.e.j(167);
        this.e.m(n2 - this.e.j() + 1);
        int n5 = this.e.j();
        if (b2 != null) {
            this.e.c(n3, n5 - n3 + 1);
        }
        this.a(this.dl, n5);
        this.a(this.dm, n4);
        this.dm = arrayList2;
        this.dl = arrayList;
        this.dj = false;
    }

    private void g(t t2) throws com.growingio.b.b.e {
        int n2;
        this.a(t2.c());
        ArrayList arrayList = this.dl;
        this.dl = new ArrayList<E>();
        int n3 = this.e.j();
        this.e.j(171);
        int n4 = 3 - (n3 & 3);
        while (n4-- > 0) {
            this.e.b(0);
        }
        t t3 = (t)t2.d();
        int n5 = 0;
        for (a a2 = t3; a2 != null; a2 = a2.d()) {
            if (((t)a2.c()).g() != 304) continue;
            ++n5;
        }
        int n6 = this.e.j();
        this.e.c(4);
        this.e.i(n5);
        this.e.c(n5 * 8);
        long[] arrl = new long[n5];
        int n7 = 0;
        int n8 = -1;
        for (a a3 = t3; a3 != null; a3 = a3.d()) {
            t t4 = (t)a3.c();
            int n9 = t4.g();
            if (n9 == 310) {
                n8 = this.e.j();
            } else if (n9 != 304) {
                b.a();
            } else {
                arrl[n7++] = ((long)this.f(t4.c()) << 32) + ((long)(this.e.j() - n3) & -1);
            }
            this.dj = false;
            ((t)t4.d()).a(this);
        }
        Arrays.sort(arrl);
        int n10 = n6 + 8;
        for (n2 = 0; n2 < n5; ++n2) {
            this.e.d(n10, (int)(arrl[n2] >>> 32));
            this.e.d(n10 + 4, (int)arrl[n2]);
            n10 += 8;
        }
        if (n8 < 0 || this.dl.size() > 0) {
            this.dj = false;
        }
        n2 = this.e.j();
        if (n8 < 0) {
            n8 = n2;
        }
        this.e.d(n6, n8 - n3);
        this.a(this.dl, n2);
        this.dl = arrayList;
    }

    private int f(com.growingio.b.b.a.b b2) throws com.growingio.b.b.e {
        this.b(b2);
        b2 = A.a(b2);
        if (b2 instanceof n) {
            return (int)((n)b2).c();
        }
        throw new com.growingio.b.b.e("bad case label");
    }

    private void b(t t2, boolean bl2) throws com.growingio.b.b.e {
        if (t2.c() != null) {
            throw new com.growingio.b.b.e("sorry, not support labeled break or continue");
        }
        this.e.j(167);
        Integer n2 = new Integer(this.e.j());
        this.e.m(0);
        if (bl2) {
            this.dl.add(n2);
        } else {
            this.dm.add(n2);
        }
    }

    protected void b(t t2) throws com.growingio.b.b.e {
        this.c(t2.a());
    }

    protected final void c(com.growingio.b.b.a.b b2) throws com.growingio.b.b.e {
        int n2;
        if (b2 == null) {
            n2 = 177;
        } else {
            int n3;
            this.a(b2);
            n2 = this.dp > 0 ? 176 : ((n3 = this.do) == 312 ? 175 : (n3 == 317 ? 174 : (n3 == 326 ? 173 : (b.d(n3) ? 176 : 172))));
        }
        com.growingio.b.b.d d2 = this.dn;
        while (d2 != null) {
            if (d2.a(this.e, n2)) {
                this.dj = true;
                return;
            }
            d2 = d2.c;
        }
        this.e.j(n2);
        this.dj = true;
    }

    private void h(t t2) throws com.growingio.b.b.e {
        com.growingio.b.b.a.b b2 = t2.a();
        this.a(b2);
        if (this.do != 307 || this.dp > 0) {
            throw new com.growingio.b.b.e("bad throw statement");
        }
        this.e.j(191);
        this.dj = true;
    }

    protected void c(t t2) throws com.growingio.b.b.e {
        this.dj = false;
    }

    private void i(t t2) throws com.growingio.b.b.e {
        int n2 = b.a(this.dl);
        int n3 = b.a(this.dm);
        this.a(t2.c());
        if (this.do != 307 && this.dp == 0) {
            throw new com.growingio.b.b.e("bad type expr for synchronized block");
        }
        com.growingio.b.a.o o2 = this.e;
        int n4 = o2.i();
        o2.f(1);
        o2.j(89);
        o2.o(n4);
        o2.j(194);
        com.growingio.b.b.c c2 = new com.growingio.b.b.c(this, this, n4);
        int n5 = o2.j();
        t t3 = (t)t2.d();
        if (t3 != null) {
            t3.a(this);
        }
        int n6 = o2.j();
        int n7 = 0;
        if (!this.dj) {
            c2.a(o2, 0);
            o2.j(167);
            n7 = o2.j();
            o2.m(0);
        }
        if (n5 < n6) {
            int n8 = o2.j();
            c2.a(o2, 0);
            o2.j(191);
            o2.b(n5, n6, n8, 0);
        }
        if (!this.dj) {
            o2.c(n7, o2.j() - n7 + 1);
        }
        c2.a(this);
        if (b.a(this.dl) != n2 || b.a(this.dm) != n3) {
            throw new com.growingio.b.b.e("sorry, cannot break/continue in synchronized block");
        }
    }

    private static int a(ArrayList arrayList) {
        return arrayList == null ? 0 : arrayList.size();
    }

    private static boolean g(com.growingio.b.b.a.b b2) {
        if (b2 instanceof k) {
            int n2 = ((k)b2).h();
            return n2 == 362 || n2 == 363;
        }
        return false;
    }

    @Override
    public void b(i i2) throws com.growingio.b.b.e {
        i2.c(this.b());
        i2.a(this.a(i2.i()));
        int n2 = b.a(i2.g(), i2.h()) ? 2 : 1;
        this.b(n2);
        com.growingio.b.b.a.b b2 = i2.k();
        if (b2 != null) {
            this.b(b2);
            this.a(null, 61, null, i2, b2, false);
        }
    }

    @Override
    public abstract void a(com.growingio.b.b.a.r var1) throws com.growingio.b.b.e;

    @Override
    public abstract void a(c var1) throws com.growingio.b.b.e;

    @Override
    public void a(d d2) throws com.growingio.b.b.e {
        this.a(d2, true);
    }

    protected void a(d d2, boolean bl2) throws com.growingio.b.b.e {
        int n2 = d2.h();
        com.growingio.b.b.a.b b2 = d2.i();
        com.growingio.b.b.a.b b3 = d2.j();
        if (b2 instanceof w) {
            this.a((k)d2, n2, (w)b2, ((w)b2).c(), b3, bl2);
        } else {
            k k2;
            if (b2 instanceof k && (k2 = (k)b2).h() == 65) {
                this.a((k)d2, n2, (k)b2, b3, bl2);
                return;
            }
            this.a((k)d2, n2, b2, b3, bl2);
        }
    }

    protected static void a(k k2) throws com.growingio.b.b.e {
        String string = k2 == null ? "incompatible type for assignment" : "incompatible type for " + k2.k();
        throw new com.growingio.b.b.e(string);
    }

    private void a(k k2, int n2, w w2, i i2, com.growingio.b.b.a.b b2, boolean bl2) throws com.growingio.b.b.e {
        int n3 = i2.g();
        int n4 = i2.h();
        String string = i2.i();
        int n5 = this.a(i2);
        if (n2 != 61) {
            this.a(w2);
        }
        if (k2 == null && b2 instanceof c) {
            this.a((c)b2, n3, n4, string);
        } else {
            this.a(k2, n2, b2, n3, n4, string);
        }
        if (bl2) {
            if (b.a(n3, n4)) {
                this.e.j(92);
            } else {
                this.e.j(89);
            }
        }
        if (n4 > 0) {
            this.e.o(n5);
        } else if (n3 == 312) {
            this.e.v(n5);
        } else if (n3 == 317) {
            this.e.x(n5);
        } else if (n3 == 326) {
            this.e.t(n5);
        } else if (b.d(n3)) {
            this.e.o(n5);
        } else {
            this.e.r(n5);
        }
        this.do = n3;
        this.dp = n4;
        this.dq = string;
    }

    protected abstract void a(c var1, int var2, int var3, String var4) throws com.growingio.b.b.e;

    private void a(k k2, int n2, k k3, com.growingio.b.b.a.b b2, boolean bl2) throws com.growingio.b.b.e {
        this.b(k3.i(), k3.j());
        if (n2 != 61) {
            this.e.j(92);
            this.e.j(b.e(this.do, this.dp));
        }
        int n3 = this.do;
        int n4 = this.dp;
        String string = this.dq;
        this.a(k2, n2, b2, n3, n4, string);
        if (bl2) {
            if (b.a(n3, n4)) {
                this.e.j(94);
            } else {
                this.e.j(91);
            }
        }
        this.e.j(b.f(n3, n4));
        this.do = n3;
        this.dp = n4;
        this.dq = string;
    }

    protected abstract void a(k var1, int var2, com.growingio.b.b.a.b var3, com.growingio.b.b.a.b var4, boolean var5) throws com.growingio.b.b.e;

    protected void a(k k2, int n2, com.growingio.b.b.a.b b2, int n3, int n4, String string) throws com.growingio.b.b.e {
        if (n2 == 354 && n4 == 0 && n3 == 307) {
            this.a(k2, n3, n4, string, b2);
        } else {
            b2.a(this);
            if (this.a(this.do, this.dp, this.dq, n3, n4, string, false) || n2 != 61 && n4 > 0) {
                b.a(k2);
            }
            if (n2 != 61) {
                int n5 = aY_[n2 - 351];
                int n6 = b.c(n5);
                if (n6 < 0) {
                    b.a();
                }
                this.a(k2, n5, n6, n3);
            }
        }
        if (n2 != 61 || n4 == 0 && !b.d(n3)) {
            this.d(this.do, n3);
        }
    }

    private void a(k k2, int n2, int n3, String string, com.growingio.b.b.a.b b2) throws com.growingio.b.b.e {
        if (!"java/lang/String".equals(string)) {
            b.a(k2);
        }
        this.g(n2, n3);
        b2.a(this);
        this.g(this.do, this.dp);
        this.e.e("java.lang.String", "concat", "(Ljava/lang/String;)Ljava/lang/String;");
        this.do = 307;
        this.dp = 0;
        this.dq = "java/lang/String";
    }

    private boolean a(int n2, int n3, String string, int n4, int n5, String string2, boolean bl2) {
        if (n3 != n5) {
            if (n2 == 412) {
                return false;
            }
            if (n5 == 0 && n4 == 307 && "java/lang/Object".equals(string2)) {
                return false;
            }
            if (bl2 && n3 == 0 && n2 == 307 && "java/lang/Object".equals(string)) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public void a(h h2) throws com.growingio.b.b.e {
        if (this.b(false, h2.g())) {
            h2.i().a(this);
        } else {
            int n2 = this.e.j();
            this.e.m(0);
            h2.h().a(this);
            int n3 = this.dp;
            this.e.j(167);
            int n4 = this.e.j();
            this.e.m(0);
            this.e.c(n2, this.e.j() - n2 + 1);
            h2.i().a(this);
            if (n3 != this.dp) {
                throw new com.growingio.b.b.e("type mismatch in ?:");
            }
            this.e.c(n4, this.e.j() - n4 + 1);
        }
    }

    static int c(int n2) {
        int[] arrn = dr;
        int n3 = arrn.length;
        for (int i2 = 0; i2 < n3; i2 += 5) {
            if (arrn[i2] != n2) continue;
            return i2;
        }
        return -1;
    }

    @Override
    public void a(e e2) throws com.growingio.b.b.e {
        int n2 = e2.h();
        int n3 = b.c(n2);
        if (n3 >= 0) {
            e2.i().a(this);
            com.growingio.b.b.a.b b2 = e2.j();
            if (b2 == null) {
                return;
            }
            int n4 = this.do;
            int n5 = this.dp;
            String string = this.dq;
            b2.a(this);
            if (n5 != this.dp) {
                throw new com.growingio.b.b.e("incompatible array types");
            }
            if (n2 == 43 && n5 == 0 && (n4 == 307 || this.do == 307)) {
                this.a((k)e2, n4, n5, string);
            } else {
                this.a((k)e2, n2, n3, n4);
            }
        } else {
            if (!this.b(true, (com.growingio.b.b.a.b)e2)) {
                this.e.m(7);
                this.e.p(0);
                this.e.j(167);
                this.e.m(4);
            }
            this.e.p(1);
        }
    }

    private void a(k k2, int n2, int n3, int n4) throws com.growingio.b.b.e {
        int n5;
        if (this.dp != 0) {
            b.b(k2);
        }
        int n6 = this.do;
        if (n2 == 364 || n2 == 366 || n2 == 370) {
            if (n6 == 324 || n6 == 334 || n6 == 306 || n6 == 303) {
                this.do = n4;
            } else {
                b.b(k2);
            }
        } else {
            this.a(n4, n6, k2);
        }
        int n7 = b.f(this.do);
        if (n7 >= 0 && (n5 = dr[n3 + n7 + 1]) != 0) {
            if (n7 == 3 && this.do != 301) {
                this.do = 324;
            }
            this.e.j(n5);
            return;
        }
        b.b(k2);
    }

    private void a(k k2, int n2, int n3, String string) throws com.growingio.b.b.e {
        boolean bl2;
        int n4 = this.do;
        int n5 = this.dp;
        boolean bl3 = b.a(n4, n5);
        boolean bl4 = bl2 = n4 == 307 && "java/lang/String".equals(this.dq);
        if (bl3) {
            this.g(n4, n5);
        }
        if (b.a(n2, n3)) {
            this.e.j(91);
            this.e.j(87);
        } else {
            this.e.j(95);
        }
        this.g(n2, n3);
        this.e.j(95);
        if (!bl3 && !bl2) {
            this.g(n4, n5);
        }
        this.e.e("java.lang.String", "concat", "(Ljava/lang/String;)Ljava/lang/String;");
        this.do = 307;
        this.dp = 0;
        this.dq = "java/lang/String";
    }

    private void g(int n2, int n3) throws com.growingio.b.b.e {
        String string = "valueOf";
        if (b.d(n2) || n3 > 0) {
            this.e.d("java.lang.String", "valueOf", "(Ljava/lang/Object;)Ljava/lang/String;");
        } else if (n2 == 312) {
            this.e.d("java.lang.String", "valueOf", "(D)Ljava/lang/String;");
        } else if (n2 == 317) {
            this.e.d("java.lang.String", "valueOf", "(F)Ljava/lang/String;");
        } else if (n2 == 326) {
            this.e.d("java.lang.String", "valueOf", "(J)Ljava/lang/String;");
        } else if (n2 == 301) {
            this.e.d("java.lang.String", "valueOf", "(Z)Ljava/lang/String;");
        } else if (n2 == 306) {
            this.e.d("java.lang.String", "valueOf", "(C)Ljava/lang/String;");
        } else {
            if (n2 == 344) {
                throw new com.growingio.b.b.e("void type expression");
            }
            this.e.d("java.lang.String", "valueOf", "(I)Ljava/lang/String;");
        }
    }

    private boolean b(boolean bl2, com.growingio.b.b.a.b b2) throws com.growingio.b.b.e {
        int n2 = b.d(b2);
        if (n2 == 358) {
            e e2 = (e)b2;
            int n3 = this.b(e2);
            this.a(bl2, e2.h(), n3, e2);
        } else {
            if (n2 == 33) {
                return this.b(!bl2, ((k)b2).i());
            }
            boolean bl3 = n2 == 369;
            if (bl3 || n2 == 368) {
                e e3;
                if (this.b(!bl3, (e3 = (e)b2).i())) {
                    this.do = 301;
                    this.dp = 0;
                    return true;
                }
                int n4 = this.e.j();
                this.e.m(0);
                if (this.b(bl3, e3.j())) {
                    this.e.j(167);
                }
                this.e.c(n4, this.e.j() - n4 + 3);
                if (bl2 != bl3) {
                    this.e.m(6);
                    this.e.j(167);
                }
            } else {
                if (b.a(b2, bl2)) {
                    this.do = 301;
                    this.dp = 0;
                    return true;
                }
                b2.a(this);
                if (this.do != 301 || this.dp != 0) {
                    throw new com.growingio.b.b.e("boolean expr is required");
                }
                this.e.j(bl2 ? 154 : 153);
            }
        }
        this.do = 301;
        this.dp = 0;
        return false;
    }

    private static boolean a(com.growingio.b.b.a.b b2, boolean bl2) {
        if (b2 instanceof o) {
            int n2 = ((o)b2).c();
            return bl2 ? n2 == 410 : n2 == 411;
        }
        return false;
    }

    static int d(com.growingio.b.b.a.b b2) throws com.growingio.b.b.e {
        if (b2 instanceof k) {
            k k2 = (k)b2;
            int n2 = k2.h();
            if (n2 == 33) {
                return 33;
            }
            if (k2 instanceof e && n2 != 368 && n2 != 369 && n2 != 38 && n2 != 124) {
                return 358;
            }
            return n2;
        }
        return 32;
    }

    private int b(e e2) throws com.growingio.b.b.e {
        e2.i().a(this);
        int n2 = this.do;
        int n3 = this.dp;
        e2.j().a(this);
        if (n3 != this.dp) {
            if (n2 != 412 && this.do != 412) {
                throw new com.growingio.b.b.e("incompatible array types");
            }
            if (this.do == 412) {
                this.dp = n3;
            }
        }
        if (n2 == 412) {
            return this.do;
        }
        return n2;
    }

    private void a(boolean bl2, int n2, int n3, e e2) throws com.growingio.b.b.e {
        int n4;
        if (this.dp == 0) {
            this.a(n3, this.do, e2);
        }
        if ((n4 = b.f(this.do)) == -1 || this.dp > 0) {
            if (n2 == 358) {
                this.e.j(bl2 ? 165 : 166);
            } else if (n2 == 350) {
                this.e.j(bl2 ? 166 : 165);
            } else {
                b.b(e2);
            }
        } else if (n4 == 3) {
            int[] arrn = dt;
            for (int i2 = 0; i2 < arrn.length; i2 += 3) {
                if (arrn[i2] != n2) continue;
                this.e.j(arrn[i2 + (bl2 ? 1 : 2)]);
                return;
            }
            b.b(e2);
        } else {
            if (n4 == 0) {
                if (n2 == 60 || n2 == 357) {
                    this.e.j(152);
                } else {
                    this.e.j(151);
                }
            } else if (n4 == 1) {
                if (n2 == 60 || n2 == 357) {
                    this.e.j(150);
                } else {
                    this.e.j(149);
                }
            } else if (n4 == 2) {
                this.e.j(148);
            } else {
                b.a();
            }
            int[] arrn = du;
            for (int i3 = 0; i3 < arrn.length; i3 += 3) {
                if (arrn[i3] != n2) continue;
                this.e.j(arrn[i3 + (bl2 ? 1 : 2)]);
                return;
            }
            b.b(e2);
        }
    }

    protected static void b(k k2) throws com.growingio.b.b.e {
        throw new com.growingio.b.b.e("invalid types for " + k2.k());
    }

    protected static boolean d(int n2) {
        return n2 == 307 || n2 == 412;
    }

    private static int f(int n2) {
        if (n2 == 312) {
            return 0;
        }
        if (n2 == 317) {
            return 1;
        }
        if (n2 == 326) {
            return 2;
        }
        if (b.d(n2)) {
            return -1;
        }
        if (n2 == 344) {
            return -1;
        }
        return 3;
    }

    static boolean e(int n2) {
        return b.f(n2) == 3;
    }

    static boolean c(int n2, int n3) {
        int n4 = b.f(n2);
        int n5 = b.f(n3);
        return n4 >= 0 && n5 >= 0 && n4 > n5;
    }

    private void a(int n2, int n3, k k2) throws com.growingio.b.b.e {
        int n4;
        boolean bl2;
        int n5;
        int n6 = b.f(n2);
        int n7 = b.f(n3);
        if (n7 < 0 && n6 < 0) {
            return;
        }
        if (n7 < 0 || n6 < 0) {
            b.b(k2);
        }
        if (n6 <= n7) {
            bl2 = false;
            this.do = n2;
            n5 = dA[n7 * 4 + n6];
            n4 = n6;
        } else {
            bl2 = true;
            n5 = dA[n6 * 4 + n7];
            n4 = n7;
        }
        if (bl2) {
            if (n4 == 0 || n4 == 2) {
                if (n6 == 0 || n6 == 2) {
                    this.e.j(94);
                } else {
                    this.e.j(93);
                }
                this.e.j(88);
                this.e.j(n5);
                this.e.j(94);
                this.e.j(88);
            } else if (n4 == 1) {
                if (n6 == 2) {
                    this.e.j(91);
                    this.e.j(87);
                } else {
                    this.e.j(95);
                }
                this.e.j(n5);
                this.e.j(95);
            } else {
                b.a();
            }
        } else if (n5 != 0) {
            this.e.j(n5);
        }
    }

    @Override
    public void a(g g2) throws com.growingio.b.b.e {
        String string = this.a(g2.i());
        String string2 = this.a(g2, string);
        int n2 = this.do;
        this.do = g2.g();
        this.dp = g2.h();
        this.dq = string;
        if (string2 == null) {
            this.d(n2, this.do);
        } else {
            this.e.a(string2);
        }
    }

    @Override
    public void a(m m2) throws com.growingio.b.b.e {
        String string = this.a(m2.i());
        String string2 = this.a(m2, string);
        this.e.b(string2);
        this.do = 301;
        this.dp = 0;
    }

    private String a(g g2, String string) throws com.growingio.b.b.e {
        String string2 = "invalid cast";
        com.growingio.b.b.a.b b2 = g2.j();
        int n2 = g2.h();
        int n3 = g2.g();
        b2.a(this);
        int n4 = this.do;
        int n5 = this.dp;
        if (this.a(n4, this.dp, this.dq, n3, n2, string, true) || n4 == 344 || n3 == 344) {
            throw new com.growingio.b.b.e("invalid cast");
        }
        if (n3 == 307) {
            if (!b.d(n4) && n5 == 0) {
                throw new com.growingio.b.b.e("invalid cast");
            }
            return b.a(string, n2);
        }
        if (n2 > 0) {
            return b.b(n3, n2);
        }
        return null;
    }

    void d(int n2, int n3) throws com.growingio.b.b.e {
        if (n2 == n3) {
            return;
        }
        int n4 = b.f(n2);
        int n5 = b.f(n3);
        int n6 = 0 <= n4 && n4 < 3 ? dA[n4 * 4 + n5] : 0;
        int n7 = n3 == 312 ? 135 : (n3 == 317 ? 134 : (n3 == 326 ? 133 : (n3 == 334 ? 147 : (n3 == 306 ? 146 : (n3 == 303 ? 145 : 0)))));
        if (n6 != 0) {
            this.e.j(n6);
        }
        if ((n6 == 0 || n6 == 136 || n6 == 139 || n6 == 142) && n7 != 0) {
            this.e.j(n7);
        }
    }

    @Override
    public void c(k k2) throws com.growingio.b.b.e {
        int n2 = k2.h();
        com.growingio.b.b.a.b b2 = k2.i();
        if (n2 == 46) {
            String string = ((v)k2.j()).d();
            if (string.equals("class")) {
                this.e(k2);
            } else {
                this.e((com.growingio.b.b.a.b)k2);
            }
        } else if (n2 == 35) {
            this.e((com.growingio.b.b.a.b)k2);
        } else if (n2 == 65) {
            this.a(b2, k2.j());
        } else if (n2 == 362 || n2 == 363) {
            this.a(n2, b2, k2, true);
        } else if (n2 == 33) {
            if (!this.b(false, (com.growingio.b.b.a.b)k2)) {
                this.e.m(7);
                this.e.p(1);
                this.e.j(167);
                this.e.m(4);
            }
            this.e.p(0);
        } else if (n2 == 67) {
            b.a();
        } else {
            k2.i().a(this);
            int n3 = b.f(this.do);
            if (this.dp > 0) {
                b.d(k2);
            }
            if (n2 == 45) {
                if (n3 == 0) {
                    this.e.j(119);
                } else if (n3 == 1) {
                    this.e.j(118);
                } else if (n3 == 2) {
                    this.e.j(117);
                } else if (n3 == 3) {
                    this.e.j(116);
                    this.do = 324;
                } else {
                    b.d(k2);
                }
            } else if (n2 == 126) {
                if (n3 == 3) {
                    this.e.p(-1);
                    this.e.j(130);
                    this.do = 324;
                } else if (n3 == 2) {
                    this.e.a(-1);
                    this.e.j(131);
                } else {
                    b.d(k2);
                }
            } else if (n2 == 43) {
                if (n3 == -1) {
                    b.d(k2);
                }
            } else {
                b.a();
            }
        }
    }

    protected static void d(k k2) throws com.growingio.b.b.e {
        throw new com.growingio.b.b.e("invalid type for " + k2.k());
    }

    @Override
    public abstract void a(f var1) throws com.growingio.b.b.e;

    protected abstract void e(com.growingio.b.b.a.b var1) throws com.growingio.b.b.e;

    public void e(k k2) throws com.growingio.b.b.e {
        com.growingio.b.b.a.b b2 = k2.i();
        if (!(b2 instanceof v)) {
            throw new com.growingio.b.b.e("fatal error: badly parsed .class expr");
        }
        String string = ((v)b2).d();
        if (string.startsWith("[")) {
            String string2;
            String string3;
            int n2 = string.indexOf("[L");
            if (n2 >= 0 && !(string3 = string.substring(n2 + 2, string.length() - 1)).equals(string2 = this.a(string3))) {
                string2 = r.d(string2);
                StringBuffer stringBuffer = new StringBuffer();
                while (n2-- >= 0) {
                    stringBuffer.append('[');
                }
                stringBuffer.append('L').append(string2).append(';');
                string = stringBuffer.toString();
            }
        } else {
            string = this.a(r.c(string));
            string = r.d(string);
        }
        this.b(string);
        this.do = 307;
        this.dp = 0;
        this.dq = "java/lang/Class";
    }

    protected void b(String string) throws com.growingio.b.b.e {
        int n2 = this.e.j();
        this.e.c(string);
        this.e.d("java.lang.Class", "forName", "(Ljava/lang/String;)Ljava/lang/Class;");
        int n3 = this.e.j();
        this.e.j(167);
        int n4 = this.e.j();
        this.e.m(0);
        this.e.a(n2, n3, this.e.j(), "java.lang.ClassNotFoundException");
        this.e.k(1);
        this.e.d("DotClass", "fail", "(Ljava/lang/ClassNotFoundException;)Ljava/lang/NoClassDefFoundError;");
        this.e.j(191);
        this.e.c(n4, this.e.j() - n4 + 1);
    }

    public void a(com.growingio.b.b.a.b b2, com.growingio.b.b.a.b b3) throws com.growingio.b.b.e {
        this.b(b2, b3);
        this.e.j(b.e(this.do, this.dp));
    }

    protected void b(com.growingio.b.b.a.b b2, com.growingio.b.b.a.b b3) throws com.growingio.b.b.e {
        b2.a(this);
        int n2 = this.do;
        int n3 = this.dp;
        if (n3 == 0) {
            throw new com.growingio.b.b.e("bad array access");
        }
        String string = this.dq;
        b3.a(this);
        if (b.f(this.do) != 3 || this.dp > 0) {
            throw new com.growingio.b.b.e("bad array index");
        }
        this.do = n2;
        this.dp = n3 - 1;
        this.dq = string;
    }

    protected static int e(int n2, int n3) {
        if (n3 > 0) {
            return 50;
        }
        switch (n2) {
            case 312: {
                return 49;
            }
            case 317: {
                return 48;
            }
            case 326: {
                return 47;
            }
            case 324: {
                return 46;
            }
            case 334: {
                return 53;
            }
            case 306: {
                return 52;
            }
            case 301: 
            case 303: {
                return 51;
            }
        }
        return 50;
    }

    protected static int f(int n2, int n3) {
        if (n3 > 0) {
            return 83;
        }
        switch (n2) {
            case 312: {
                return 82;
            }
            case 317: {
                return 81;
            }
            case 326: {
                return 80;
            }
            case 324: {
                return 79;
            }
            case 334: {
                return 86;
            }
            case 306: {
                return 85;
            }
            case 301: 
            case 303: {
                return 84;
            }
        }
        return 83;
    }

    private void a(int n2, com.growingio.b.b.a.b b2, k k2, boolean bl2) throws com.growingio.b.b.e {
        boolean bl3;
        boolean bl4 = bl3 = b2 == null;
        if (bl3) {
            b2 = k2.j();
        }
        if (b2 instanceof w) {
            i i2 = ((w)b2).c();
            int n3 = this.do = i2.g();
            this.dp = i2.h();
            int n4 = this.a(i2);
            if (this.dp > 0) {
                b.d(k2);
            }
            if (n3 == 312) {
                this.e.u(n4);
                if (bl2 && bl3) {
                    this.e.j(92);
                }
                this.e.a(1.0);
                this.e.j(n2 == 362 ? 99 : 103);
                if (bl2 && !bl3) {
                    this.e.j(92);
                }
                this.e.v(n4);
            } else if (n3 == 326) {
                this.e.s(n4);
                if (bl2 && bl3) {
                    this.e.j(92);
                }
                this.e.a(1);
                this.e.j(n2 == 362 ? 97 : 101);
                if (bl2 && !bl3) {
                    this.e.j(92);
                }
                this.e.t(n4);
            } else if (n3 == 317) {
                this.e.w(n4);
                if (bl2 && bl3) {
                    this.e.j(89);
                }
                this.e.a(1.0f);
                this.e.j(n2 == 362 ? 98 : 102);
                if (bl2 && !bl3) {
                    this.e.j(89);
                }
                this.e.x(n4);
            } else if (n3 == 303 || n3 == 306 || n3 == 334 || n3 == 324) {
                int n5;
                if (bl2 && bl3) {
                    this.e.q(n4);
                }
                int n6 = n5 = n2 == 362 ? 1 : -1;
                if (n4 > 255) {
                    this.e.j(196);
                    this.e.j(132);
                    this.e.m(n4);
                    this.e.m(n5);
                } else {
                    this.e.j(132);
                    this.e.b(n4);
                    this.e.b(n5);
                }
                if (bl2 && !bl3) {
                    this.e.q(n4);
                }
            } else {
                b.d(k2);
            }
        } else {
            k k3;
            if (b2 instanceof k && (k3 = (k)b2).h() == 65) {
                this.a(n2, bl3, k3, bl2);
                return;
            }
            this.a(n2, bl3, b2, k2, bl2);
        }
    }

    public void a(int n2, boolean bl2, k k2, boolean bl3) throws com.growingio.b.b.e {
        this.b(k2.i(), k2.j());
        int n3 = this.do;
        int n4 = this.dp;
        if (n4 > 0) {
            b.d(k2);
        }
        this.e.j(92);
        this.e.j(b.e(n3, this.dp));
        int n5 = b.a(n3, n4) ? 94 : 91;
        this.a(n5, bl3, n2, bl2, k2);
        this.e.j(b.f(n3, n4));
    }

    protected void a(int n2, boolean bl2, int n3, boolean bl3, k k2) throws com.growingio.b.b.e {
        int n4 = this.do;
        if (bl2 && bl3) {
            this.e.j(n2);
        }
        if (n4 == 324 || n4 == 303 || n4 == 306 || n4 == 334) {
            this.e.p(1);
            this.e.j(n3 == 362 ? 96 : 100);
            this.do = 324;
        } else if (n4 == 326) {
            this.e.a(1);
            this.e.j(n3 == 362 ? 97 : 101);
        } else if (n4 == 317) {
            this.e.a(1.0f);
            this.e.j(n3 == 362 ? 98 : 102);
        } else if (n4 == 312) {
            this.e.a(1.0);
            this.e.j(n3 == 362 ? 99 : 103);
        } else {
            b.d(k2);
        }
        if (bl2 && !bl3) {
            this.e.j(n2);
        }
    }

    protected abstract void a(int var1, boolean var2, com.growingio.b.b.a.b var3, k var4, boolean var5) throws com.growingio.b.b.e;

    @Override
    public abstract void a(p var1) throws com.growingio.b.b.e;

    @Override
    public void a(w w2) throws com.growingio.b.b.e {
        i i2 = w2.c();
        this.do = i2.g();
        this.dp = i2.h();
        this.dq = i2.i();
        int n2 = this.a(i2);
        if (this.dp > 0) {
            this.e.n(n2);
        } else {
            switch (this.do) {
                case 307: {
                    this.e.n(n2);
                    break;
                }
                case 326: {
                    this.e.s(n2);
                    break;
                }
                case 317: {
                    this.e.w(n2);
                    break;
                }
                case 312: {
                    this.e.u(n2);
                    break;
                }
                default: {
                    this.e.q(n2);
                }
            }
        }
    }

    @Override
    public void a(o o2) throws com.growingio.b.b.e {
        this.dp = 0;
        int n2 = o2.c();
        switch (n2) {
            case 410: {
                this.e.p(1);
                this.do = 301;
                break;
            }
            case 411: {
                this.e.p(0);
                this.do = 301;
                break;
            }
            case 412: {
                this.e.j(1);
                this.do = 412;
                break;
            }
            case 336: 
            case 339: {
                if (this.dk) {
                    throw new com.growingio.b.b.e("not-available: " + (n2 == 339 ? "this" : "super"));
                }
                this.e.n(0);
                this.do = 307;
                if (n2 == 339) {
                    this.dq = this.d();
                    break;
                }
                this.dq = this.e();
                break;
            }
            default: {
                b.a();
            }
        }
    }

    @Override
    public void a(u u2) throws com.growingio.b.b.e {
        this.do = 307;
        this.dp = 0;
        this.dq = "java/lang/String";
        this.e.c(u2.c());
    }

    @Override
    public void a(n n2) throws com.growingio.b.b.e {
        this.dp = 0;
        long l2 = n2.c();
        int n3 = n2.d();
        if (n3 == 402 || n3 == 401) {
            this.do = n3 == 402 ? 324 : 306;
            this.e.p((int)l2);
        } else {
            this.do = 326;
            this.e.a(l2);
        }
    }

    @Override
    public void a(j j2) throws com.growingio.b.b.e {
        this.dp = 0;
        if (j2.d() == 405) {
            this.do = 312;
            this.e.a(j2.c());
        } else {
            this.do = 317;
            this.e.a((float)j2.c());
        }
    }
}

