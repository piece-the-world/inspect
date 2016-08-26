/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a;

import com.growingio.d.a.a;
import com.growingio.d.a.b;
import com.growingio.d.a.c;
import com.growingio.d.a.d;
import com.growingio.d.a.e;
import com.growingio.d.a.f;
import com.growingio.d.a.j;
import com.growingio.d.a.k;
import com.growingio.d.a.m;
import com.growingio.d.a.o;
import com.growingio.d.a.r;
import com.growingio.d.a.s;
import com.growingio.d.a.u;
import com.growingio.d.a.v;

public class g
extends f {
    public static final int a = 1;
    public static final int b = 2;
    static final int c = 262144;
    static final int d = 64;
    static final int e = 0;
    static final int h = 1;
    static final int i = 2;
    static final int j = 3;
    static final int k = 4;
    static final int l = 5;
    static final int m = 6;
    static final int n = 7;
    static final int o = 8;
    static final int p = 9;
    static final int q = 10;
    static final int r = 11;
    static final int s = 12;
    static final int t = 13;
    static final int u = 14;
    static final int v = 15;
    static final int w = 16;
    static final int x = 17;
    static final byte[] y;
    static final int z = 7;
    static final int A = 9;
    static final int B = 10;
    static final int C = 11;
    static final int D = 8;
    static final int E = 3;
    static final int F = 4;
    static final int G = 5;
    static final int H = 6;
    static final int I = 12;
    static final int J = 1;
    static final int K = 16;
    static final int L = 15;
    static final int M = 18;
    static final int N = 20;
    static final int O = 30;
    static final int P = 31;
    static final int Q = 32;
    static final int R = 33;
    e S;
    int T;
    int U = 1;
    final d V = new d();
    o[] W = new o[256];
    int X = (int)(0.75 * (double)this.W.length);
    final o Y = new o();
    final o Z = new o();
    final o aa = new o();
    final o ab = new o();
    o[] ac;
    private short al;
    private int am;
    private int an;
    String ad;
    private int ao;
    private int ap;
    private int aq;
    private int[] ar;
    private int as;
    private d at;
    private int au;
    private int av;
    private b aw;
    private b ax;
    private b ay;
    private b az;
    private c aA;
    private int aB;
    private d aC;
    int ae;
    d af;
    k ag;
    k ah;
    s ai;
    s aj;
    private boolean aD;
    private boolean aE;
    boolean ak;

    public g(int n2) {
        super(327680);
        this.aD = (n2 & 1) != 0;
        this.aE = (n2 & 2) != 0;
    }

    public g(e e2, int n2) {
        this(n2);
        e2.a(this);
        this.S = e2;
    }

    @Override
    public final void a(int n2, int n3, String string, String string2, String string3, String[] arrstring) {
        this.T = n2;
        this.am = n3;
        this.an = this.c(string);
        this.ad = string;
        if (string2 != null) {
            this.ao = this.a(string2);
        }
        int n4 = this.ap = string3 == null ? 0 : this.c(string3);
        if (arrstring != null && arrstring.length > 0) {
            this.aq = arrstring.length;
            this.ar = new int[this.aq];
            for (int i2 = 0; i2 < this.aq; ++i2) {
                this.ar[i2] = this.c(arrstring[i2]);
            }
        }
    }

    @Override
    public final void a_(String string, String string2) {
        if (string != null) {
            this.as = this.a(string);
        }
        if (string2 != null) {
            this.at = new d().a(string2, 0, Integer.MAX_VALUE);
        }
    }

    @Override
    public final void a(String string, String string2, String string3) {
        this.au = this.c(string);
        if (string2 != null && string3 != null) {
            this.av = this.b(string2, string3);
        }
    }

    @Override
    public final a a(String string, boolean bl2) {
        d d2 = new d();
        d2.b(this.a(string)).b(0);
        b b2 = new b(this, true, d2, d2, 2);
        if (bl2) {
            b2.a = this.aw;
            this.aw = b2;
        } else {
            b2.a = this.ax;
            this.ax = b2;
        }
        return b2;
    }

    @Override
    public final a a(int n2, v v2, String string, boolean bl2) {
        d d2 = new d();
        b.a(n2, v2, d2);
        d2.b(this.a(string)).b(0);
        b b2 = new b(this, true, d2, d2, d2.b - 2);
        if (bl2) {
            b2.a = this.ay;
            this.ay = b2;
        } else {
            b2.a = this.az;
            this.az = b2;
        }
        return b2;
    }

    @Override
    public final void a(c c2) {
        c2.c = this.aA;
        this.aA = c2;
    }

    @Override
    public final void a(String string, String string2, String string3, int n2) {
        if (this.aC == null) {
            this.aC = new d();
        }
        o o2 = this.b(string);
        if (o2.c == 0) {
            ++this.aB;
            this.aC.b(o2.a);
            this.aC.b(string2 == null ? 0 : this.c(string2));
            this.aC.b(string3 == null ? 0 : this.a(string3));
            this.aC.b(n2);
            o2.c = this.aB;
        }
    }

    @Override
    public final j a(int n2, String string, String string2, String string3, Object object) {
        return new k(this, n2, string, string2, string3, object);
    }

    @Override
    public final r a(int n2, String string, String string2, String string3, String[] arrstring) {
        return new s(this, n2, string, string2, string3, arrstring, this.aD, this.aE);
    }

    @Override
    public final void a() {
    }

    public byte[] b() {
        int n2;
        if (this.U > 65535) {
            throw new RuntimeException("Class file too large!");
        }
        int n3 = 24 + 2 * this.aq;
        int n4 = 0;
        k k2 = this.ag;
        while (k2 != null) {
            ++n4;
            n3 += k2.b();
            k2 = (k)k2.b;
        }
        int n5 = 0;
        s s2 = this.ai;
        while (s2 != null) {
            ++n5;
            n3 += s2.d();
            s2 = (s)s2.n_;
        }
        int n6 = 0;
        if (this.af != null) {
            ++n6;
            n3 += 8 + this.af.b;
            this.a("BootstrapMethods");
        }
        if (this.ao != 0) {
            ++n6;
            n3 += 8;
            this.a("Signature");
        }
        if (this.as != 0) {
            ++n6;
            n3 += 8;
            this.a("SourceFile");
        }
        if (this.at != null) {
            ++n6;
            n3 += this.at.b + 6;
            this.a("SourceDebugExtension");
        }
        if (this.au != 0) {
            ++n6;
            n3 += 10;
            this.a("EnclosingMethod");
        }
        if ((this.am & 131072) != 0) {
            ++n6;
            n3 += 6;
            this.a("Deprecated");
        }
        if ((this.am & 4096) != 0 && ((this.T & 65535) < 49 || (this.am & 262144) != 0)) {
            ++n6;
            n3 += 6;
            this.a("Synthetic");
        }
        if (this.aC != null) {
            ++n6;
            n3 += 8 + this.aC.b;
            this.a("InnerClasses");
        }
        if (this.aw != null) {
            ++n6;
            n3 += 8 + this.aw.b();
            this.a("RuntimeVisibleAnnotations");
        }
        if (this.ax != null) {
            ++n6;
            n3 += 8 + this.ax.b();
            this.a("RuntimeInvisibleAnnotations");
        }
        if (this.ay != null) {
            ++n6;
            n3 += 8 + this.ay.b();
            this.a("RuntimeVisibleTypeAnnotations");
        }
        if (this.az != null) {
            ++n6;
            n3 += 8 + this.az.b();
            this.a("RuntimeInvisibleTypeAnnotations");
        }
        if (this.aA != null) {
            n6 += this.aA.d();
            n3 += this.aA.b(this, null, 0, -1, -1);
        }
        d d2 = new d(n3 += this.V.b);
        d2.c(-889275714).c(this.T);
        d2.b(this.U).a(this.V.a, 0, this.V.b);
        int n7 = 393216 | (this.am & 262144) / 64;
        d2.b(this.am & ~ n7).b(this.an).b(this.ap);
        d2.b(this.aq);
        for (n2 = 0; n2 < this.aq; ++n2) {
            d2.b(this.ar[n2]);
        }
        d2.b(n4);
        k2 = this.ag;
        while (k2 != null) {
            k2.a(d2);
            k2 = (k)k2.b;
        }
        d2.b(n5);
        s2 = this.ai;
        while (s2 != null) {
            s2.a(d2);
            s2 = (s)s2.n_;
        }
        d2.b(n6);
        if (this.af != null) {
            d2.b(this.a("BootstrapMethods"));
            d2.c(this.af.b + 2).b(this.ae);
            d2.a(this.af.a, 0, this.af.b);
        }
        if (this.ao != 0) {
            d2.b(this.a("Signature")).c(2).b(this.ao);
        }
        if (this.as != 0) {
            d2.b(this.a("SourceFile")).c(2).b(this.as);
        }
        if (this.at != null) {
            n2 = this.at.b;
            d2.b(this.a("SourceDebugExtension")).c(n2);
            d2.a(this.at.a, 0, n2);
        }
        if (this.au != 0) {
            d2.b(this.a("EnclosingMethod")).c(4);
            d2.b(this.au).b(this.av);
        }
        if ((this.am & 131072) != 0) {
            d2.b(this.a("Deprecated")).c(0);
        }
        if ((this.am & 4096) != 0 && ((this.T & 65535) < 49 || (this.am & 262144) != 0)) {
            d2.b(this.a("Synthetic")).c(0);
        }
        if (this.aC != null) {
            d2.b(this.a("InnerClasses"));
            d2.c(this.aC.b + 2).b(this.aB);
            d2.a(this.aC.a, 0, this.aC.b);
        }
        if (this.aw != null) {
            d2.b(this.a("RuntimeVisibleAnnotations"));
            this.aw.a(d2);
        }
        if (this.ax != null) {
            d2.b(this.a("RuntimeInvisibleAnnotations"));
            this.ax.a(d2);
        }
        if (this.ay != null) {
            d2.b(this.a("RuntimeVisibleTypeAnnotations"));
            this.ay.a(d2);
        }
        if (this.az != null) {
            d2.b(this.a("RuntimeInvisibleTypeAnnotations"));
            this.az.a(d2);
        }
        if (this.aA != null) {
            this.aA.a(this, null, 0, -1, -1, d2);
        }
        if (this.ak) {
            this.aw = null;
            this.ax = null;
            this.aA = null;
            this.aB = 0;
            this.aC = null;
            this.ae = 0;
            this.af = null;
            this.ag = null;
            this.ah = null;
            this.ai = null;
            this.aj = null;
            this.aD = false;
            this.aE = true;
            this.ak = false;
            new e(d2.a).a(this, 4);
            return this.b();
        }
        return d2.a;
    }

    o a(Object object) {
        if (object instanceof Integer) {
            int n2 = (Integer)object;
            return this.a(n2);
        }
        if (object instanceof Byte) {
            int n3 = ((Byte)object).intValue();
            return this.a(n3);
        }
        if (object instanceof Character) {
            char c2 = ((Character)object).charValue();
            return this.a(c2);
        }
        if (object instanceof Short) {
            int n4 = ((Short)object).intValue();
            return this.a(n4);
        }
        if (object instanceof Boolean) {
            int n5 = (Boolean)object != false ? 1 : 0;
            return this.a(n5);
        }
        if (object instanceof Float) {
            float f2 = ((Float)object).floatValue();
            return this.a(f2);
        }
        if (object instanceof Long) {
            long l2 = (Long)object;
            return this.a(l2);
        }
        if (object instanceof Double) {
            double d2 = (Double)object;
            return this.a(d2);
        }
        if (object instanceof String) {
            return this.g((String)object);
        }
        if (object instanceof u) {
            u u2 = (u)object;
            int n6 = u2.a();
            if (n6 == 10) {
                return this.b(u2.e());
            }
            if (n6 == 11) {
                return this.d(u2.i());
            }
            return this.b(u2.i());
        }
        if (object instanceof m) {
            m m2 = (m)object;
            return this.a(m2.a, m2.b, m2.c, m2.d, m2.e);
        }
        throw new IllegalArgumentException("value " + object);
    }

    public int b(Object object) {
        return this.a((Object)object).a;
    }

    public int a(String string) {
        this.Y.a(1, string, null, null);
        o o2 = this.b(this.Y);
        if (o2 == null) {
            this.V.a(1).a(string);
            o2 = new o(this.U++, this.Y);
            this.c(o2);
        }
        return o2.a;
    }

    o b(String string) {
        this.Z.a(7, string, null, null);
        o o2 = this.b(this.Z);
        if (o2 == null) {
            this.V.b(7, this.a(string));
            o2 = new o(this.U++, this.Z);
            this.c(o2);
        }
        return o2;
    }

    public int c(String string) {
        return this.b((String)string).a;
    }

    o d(String string) {
        this.Z.a(16, string, null, null);
        o o2 = this.b(this.Z);
        if (o2 == null) {
            this.V.b(16, this.a(string));
            o2 = new o(this.U++, this.Z);
            this.c(o2);
        }
        return o2;
    }

    public int e(String string) {
        return this.d((String)string).a;
    }

    o a(int n2, String string, String string2, String string3, boolean bl2) {
        this.ab.a(20 + n2, string, string2, string3);
        o o2 = this.b(this.ab);
        if (o2 == null) {
            if (n2 <= 4) {
                this.b(15, n2, this.c(string, string2, string3));
            } else {
                this.b(15, n2, this.b(string, string2, string3, bl2));
            }
            o2 = new o(this.U++, this.ab);
            this.c(o2);
        }
        return o2;
    }

    public int a(int n2, String string, String string2, String string3) {
        return this.b(n2, string, string2, string3, n2 == 9);
    }

    public int b(int n2, String string, String string2, String string3, boolean bl2) {
        return this.a((int)n2, (String)string, (String)string2, (String)string3, (boolean)bl2).a;
    }

    /* varargs */ o a(String string, String string2, m m2, Object ... arrobject) {
        int n2;
        d d2 = this.af;
        if (d2 == null) {
            d2 = this.af = new d();
        }
        int n3 = d2.b;
        int n4 = m2.hashCode();
        d2.b(this.b(m2.a, m2.b, m2.c, m2.d, m2.e()));
        int n5 = arrobject.length;
        d2.b(n5);
        for (int i2 = 0; i2 < n5; ++i2) {
            Object object = arrobject[i2];
            n4 ^= object.hashCode();
            d2.b(this.b(object));
        }
        byte[] arrby = d2.a;
        int n6 = 2 + n5 << 1;
        o o2 = this.W[(n4 &= Integer.MAX_VALUE) % this.W.length];
        block1 : while (o2 != null) {
            if (o2.b != 33 || o2.h != n4) {
                o2 = o2.i;
                continue;
            }
            n2 = o2.c;
            for (int i3 = 0; i3 < n6; ++i3) {
                if (arrby[n3 + i3] == arrby[n2 + i3]) continue;
                o2 = o2.i;
                continue block1;
            }
        }
        if (o2 != null) {
            n2 = o2.a;
            d2.b = n3;
        } else {
            n2 = this.ae++;
            o2 = new o(n2);
            o2.a(n3, n4);
            this.c(o2);
        }
        this.aa.a(string, string2, n2);
        o2 = this.b(this.aa);
        if (o2 == null) {
            this.a(18, n2, this.b(string, string2));
            o2 = new o(this.U++, this.aa);
            this.c(o2);
        }
        return o2;
    }

    public /* varargs */ int b(String string, String string2, m m2, Object ... arrobject) {
        return this.a((String)string, (String)string2, (m)m2, (Object[])arrobject).a;
    }

    o b(String string, String string2, String string3) {
        this.aa.a(9, string, string2, string3);
        o o2 = this.b(this.aa);
        if (o2 == null) {
            this.a(9, this.c(string), this.b(string2, string3));
            o2 = new o(this.U++, this.aa);
            this.c(o2);
        }
        return o2;
    }

    public int c(String string, String string2, String string3) {
        return this.b((String)string, (String)string2, (String)string3).a;
    }

    o a(String string, String string2, String string3, boolean bl2) {
        int n2 = bl2 ? 11 : 10;
        this.aa.a(n2, string, string2, string3);
        o o2 = this.b(this.aa);
        if (o2 == null) {
            this.a(n2, this.c(string), this.b(string2, string3));
            o2 = new o(this.U++, this.aa);
            this.c(o2);
        }
        return o2;
    }

    public int b(String string, String string2, String string3, boolean bl2) {
        return this.a((String)string, (String)string2, (String)string3, (boolean)bl2).a;
    }

    o a(int n2) {
        this.Y.a(n2);
        o o2 = this.b(this.Y);
        if (o2 == null) {
            this.V.a(3).c(n2);
            o2 = new o(this.U++, this.Y);
            this.c(o2);
        }
        return o2;
    }

    o a(float f2) {
        this.Y.a(f2);
        o o2 = this.b(this.Y);
        if (o2 == null) {
            this.V.a(4).c(this.Y.c);
            o2 = new o(this.U++, this.Y);
            this.c(o2);
        }
        return o2;
    }

    o a(long l2) {
        this.Y.a(l2);
        o o2 = this.b(this.Y);
        if (o2 == null) {
            this.V.a(5).a(l2);
            o2 = new o(this.U, this.Y);
            this.U += 2;
            this.c(o2);
        }
        return o2;
    }

    o a(double d2) {
        this.Y.a(d2);
        o o2 = this.b(this.Y);
        if (o2 == null) {
            this.V.a(6).a(this.Y.d);
            o2 = new o(this.U, this.Y);
            this.U += 2;
            this.c(o2);
        }
        return o2;
    }

    private o g(String string) {
        this.Z.a(8, string, null, null);
        o o2 = this.b(this.Z);
        if (o2 == null) {
            this.V.b(8, this.a(string));
            o2 = new o(this.U++, this.Z);
            this.c(o2);
        }
        return o2;
    }

    public int b(String string, String string2) {
        return this.c((String)string, (String)string2).a;
    }

    o c(String string, String string2) {
        this.Z.a(12, string, string2, null);
        o o2 = this.b(this.Z);
        if (o2 == null) {
            this.a(12, this.a(string), this.a(string2));
            o2 = new o(this.U++, this.Z);
            this.c(o2);
        }
        return o2;
    }

    int f(String string) {
        this.Y.a(30, string, null, null);
        o o2 = this.b(this.Y);
        if (o2 == null) {
            o2 = this.a(this.Y);
        }
        return o2.a;
    }

    int a(String string, int n2) {
        this.Y.b = 31;
        this.Y.c = n2;
        this.Y.e = string;
        this.Y.h = Integer.MAX_VALUE & 31 + string.hashCode() + n2;
        o o2 = this.b(this.Y);
        if (o2 == null) {
            o2 = this.a(this.Y);
        }
        return o2.a;
    }

    private o a(o o2) {
        this.al = (short)(this.al + 1);
        o o3 = new o(this.al, this.Y);
        this.c(o3);
        if (this.ac == null) {
            this.ac = new o[16];
        }
        if (this.al == this.ac.length) {
            o[] arro = new o[2 * this.ac.length];
            System.arraycopy(this.ac, 0, arro, 0, this.ac.length);
            this.ac = arro;
        }
        this.ac[this.al] = o3;
        return o3;
    }

    int a(int n2, int n3) {
        this.Z.b = 32;
        this.Z.d = (long)n2 | (long)n3 << 32;
        this.Z.h = Integer.MAX_VALUE & 32 + n2 + n3;
        o o2 = this.b(this.Z);
        if (o2 == null) {
            String string = this.ac[n2].e;
            String string2 = this.ac[n3].e;
            this.Z.c = this.f(this.a(string, string2));
            o2 = new o(0, this.Z);
            this.c(o2);
        }
        return o2.c;
    }

    protected String a(String string, String string2) {
        Class class_;
        Class class_2;
        ClassLoader classLoader = this.getClass().getClassLoader();
        try {
            class_ = Class.forName(string.replace('/', '.'), false, classLoader);
            class_2 = Class.forName(string2.replace('/', '.'), false, classLoader);
        }
        catch (Exception var6_6) {
            throw new RuntimeException(var6_6.toString());
        }
        if (class_.isAssignableFrom(class_2)) {
            return string;
        }
        if (class_2.isAssignableFrom(class_)) {
            return string2;
        }
        if (class_.isInterface() || class_2.isInterface()) {
            return "java/lang/Object";
        }
        while (!(class_ = class_.getSuperclass()).isAssignableFrom(class_2)) {
        }
        return class_.getName().replace('.', '/');
    }

    private o b(o o2) {
        o o3 = this.W[o2.h % this.W.length];
        while (!(o3 == null || o3.b == o2.b && o2.a(o3))) {
            o3 = o3.i;
        }
        return o3;
    }

    private void c(o o2) {
        int n2;
        if (this.U + this.al > this.X) {
            n2 = this.W.length;
            int n3 = n2 * 2 + 1;
            o[] arro = new o[n3];
            for (int i2 = n2 - 1; i2 >= 0; --i2) {
                o o3 = this.W[i2];
                while (o3 != null) {
                    int n4 = o3.h % arro.length;
                    o o4 = o3.i;
                    o3.i = arro[n4];
                    arro[n4] = o3;
                    o3 = o4;
                }
            }
            this.W = arro;
            this.X = (int)((double)n3 * 0.75);
        }
        n2 = o2.h % this.W.length;
        o2.i = this.W[n2];
        this.W[n2] = o2;
    }

    private void a(int n2, int n3, int n4) {
        this.V.b(n2, n3).b(n4);
    }

    private void b(int n2, int n3, int n4) {
        this.V.a(n2, n3).b(n4);
    }

    static {
        byte[] arrby = new byte[220];
        String string = "AAAAAAAAAAAAAAAABCLMMDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAANAAAAAAAAAAAAAAAAAAAAJJJJJJJJJJJJJJJJDOPAAAAAAGGGGGGGHIFBFAAFFAARQJJKKJJJJJJJJJJJJJJJJJJ";
        for (int i2 = 0; i2 < arrby.length; ++i2) {
            arrby[i2] = (byte)(string.charAt(i2) - 65);
        }
        y = arrby;
    }
}

