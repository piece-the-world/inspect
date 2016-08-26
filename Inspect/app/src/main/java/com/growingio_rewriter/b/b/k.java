/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.b;

import com.growingio.b.V;
import com.growingio.b.a.T;
import com.growingio.b.ae;
import com.growingio.b.b.A;
import com.growingio.b.b.a.a;
import com.growingio.b.b.a.b;
import com.growingio.b.b.a.f;
import com.growingio.b.b.a.g;
import com.growingio.b.b.a.i;
import com.growingio.b.b.a.p;
import com.growingio.b.b.a.t;
import com.growingio.b.b.a.x;
import com.growingio.b.b.e;
import com.growingio.b.b.l;
import com.growingio.b.b.r;
import com.growingio.b.b.v;
import com.growingio.b.b.w;
import com.growingio.b.o;

public class k
extends com.growingio.b.b.o {
    String ds = null;
    String dt = null;
    o[] du = null;
    private int dI = 0;
    private boolean dJ = false;
    private String dK = null;
    public static final String dv = "$sig";
    public static final String dw = "$type";
    public static final String dx = "$class";
    private o dL = null;
    o dy = null;
    String dz = null;
    private String dM = null;
    public static final String dA = "$w";
    String dB = null;
    public static final String dC = "$cflow";
    v dD = null;

    public k(com.growingio.b.a.o o2, o o3, com.growingio.b.g g2) {
        super(o2, o3, g2);
        this.a(new l(o3, g2, this));
    }

    private int j() {
        return this.dI + (this.dJ ? 1 : 0);
    }

    public void a(v v2, String string) {
        this.dB = string;
        this.dD = v2;
    }

    public void g() {
        if (this.do == 344) {
            this.e.j(1);
            this.do = 307;
            this.dp = 0;
            this.dq = "java/lang/Object";
        }
    }

    @Override
    public void a(p p2) throws e {
        String string = p2.d();
        if (string.equals(this.ds)) {
            k.a(this.e, this.du, this.j());
            this.do = 307;
            this.dp = 1;
            this.dq = "java/lang/Object";
        } else if (string.equals("$sig")) {
            this.e.c(T.a(this.dy, this.du));
            this.e.d("com/growingio/javassist/runtime/Desc", "getParams", "(Ljava/lang/String;)[Ljava/lang/Class;");
            this.do = 307;
            this.dp = 1;
            this.dq = "java/lang/Class";
        } else if (string.equals("$type")) {
            if (this.dL == null) {
                throw new e("$type is not available");
            }
            this.e.c(T.b(this.dL));
            this.c("getType");
        } else if (string.equals("$class")) {
            if (this.dK == null) {
                throw new e("$class is not available");
            }
            this.e.c(this.dK);
            this.c("getClazz");
        } else {
            super.a(p2);
        }
    }

    private void c(String string) {
        this.e.d("com/growingio/javassist/runtime/Desc", string, "(Ljava/lang/String;)Ljava/lang/Class;");
        this.do = 307;
        this.dp = 0;
        this.dq = "java/lang/Class";
    }

    @Override
    protected void a(com.growingio.b.b.a.k k2, int n2, b b2, b b3, boolean bl2) throws e {
        if (b2 instanceof p && ((p)b2).d().equals(this.ds)) {
            if (n2 != 61) {
                throw new e("bad operator for " + this.ds);
            }
            b3.a(this);
            if (this.dp != 1 || this.do != 307) {
                throw new e("invalid type for " + this.ds);
            }
            this.a(this.du, this.e);
            if (!bl2) {
                this.e.j(87);
            }
        } else {
            super.a(k2, n2, b2, b3, bl2);
        }
    }

    protected void a(o[] arro, com.growingio.b.a.o o2) throws e {
        if (arro == null) {
            return;
        }
        int n2 = this.j();
        int n3 = arro.length;
        for (int i2 = 0; i2 < n3; ++i2) {
            o2.j(89);
            o2.p(i2);
            o2.j(50);
            this.a(arro[i2], o2);
            o2.b(n2, arro[i2]);
            n2 += k.a(this.do, this.dp) ? 2 : 1;
        }
    }

    @Override
    public void a(g g2) throws e {
        b b2;
        a a2 = g2.i();
        if (a2 != null && g2.h() == 0 && (b2 = a2.c()) instanceof com.growingio.b.b.a.v && a2.d() == null) {
            String string = ((com.growingio.b.b.a.v)b2).d();
            if (string.equals(this.dz)) {
                this.b(g2);
                return;
            }
            if (string.equals("$w")) {
                this.c(g2);
                return;
            }
        }
        super.a(g2);
    }

    protected void b(g g2) throws e {
        g2.j().a(this);
        if (this.do == 344 || k.d(this.do) || this.dp > 0) {
            this.a(this.dy, this.e);
        } else if (this.dy instanceof V) {
            V v2 = (V)this.dy;
            int n2 = r.a(v2.X());
            this.d(this.do, n2);
            this.do = n2;
            this.dp = 0;
            this.dq = null;
        } else {
            throw new e("invalid cast");
        }
    }

    protected void c(g g2) throws e {
        g2.j().a(this);
        if (k.d(this.do) || this.dp > 0) {
            return;
        }
        o o2 = this.dE.a(this.do, this.dp, this.dq);
        if (o2 instanceof V) {
            V v2 = (V)o2;
            String string = v2.Y();
            this.e.d(string);
            this.e.j(89);
            if (v2.ad() > 1) {
                this.e.j(94);
            } else {
                this.e.j(93);
            }
            this.e.j(88);
            this.e.c(string, "<init>", "(" + v2.X() + ")V");
            this.do = 307;
            this.dp = 0;
            this.dq = "java/lang/Object";
        }
    }

    @Override
    public void a(f f2) throws e {
        b b2 = f2.i();
        if (b2 instanceof p) {
            String string = ((p)b2).d();
            if (this.dD != null && string.equals(this.dB)) {
                this.dD.a(this, this.e, (a)f2.j());
                return;
            }
            if (string.equals("$cflow")) {
                this.c((a)f2.j());
                return;
            }
        }
        super.a(f2);
    }

    protected void c(a a2) throws e {
        StringBuffer stringBuffer = new StringBuffer();
        if (a2 == null || a2.d() != null) {
            throw new e("bad $cflow");
        }
        k.a(stringBuffer, a2.c());
        String string = stringBuffer.toString();
        Object[] arrobject = this.dE.a().e(string);
        if (arrobject == null) {
            throw new e("no such $cflow: " + string);
        }
        this.e.b((String)arrobject[0], (String)arrobject[1], "Ljavassist/runtime/Cflow;");
        this.e.e("Cflow", "value", "()I");
        this.do = 324;
        this.dp = 0;
        this.dq = null;
    }

    private static void a(StringBuffer stringBuffer, b b2) throws e {
        com.growingio.b.b.a.k k2;
        if (b2 instanceof com.growingio.b.b.a.v) {
            stringBuffer.append(((com.growingio.b.b.a.v)b2).d());
            return;
        }
        if (b2 instanceof com.growingio.b.b.a.k && (k2 = (com.growingio.b.b.a.k)b2).h() == 46) {
            k.a(stringBuffer, k2.i());
            stringBuffer.append('.');
            k.a(stringBuffer, k2.j());
            return;
        }
        throw new e("bad $cflow");
    }

    public boolean d(a a2) {
        if (this.du != null && a2 != null && a2.d() == null) {
            b b2 = a2.c();
            return b2 instanceof p && ((p)b2).d().equals(this.dt);
        }
        return false;
    }

    @Override
    public int e(a a2) {
        String string = this.dt;
        int n2 = 0;
        while (a2 != null) {
            b b2 = a2.c();
            if (b2 instanceof p && ((p)b2).d().equals(string)) {
                if (this.du != null) {
                    n2 += this.du.length;
                }
            } else {
                ++n2;
            }
            a2 = a2.d();
        }
        return n2;
    }

    @Override
    public void a(a a2, int[] arrn, int[] arrn2, String[] arrstring) throws e {
        o[] arro = this.du;
        String string = this.dt;
        int n2 = 0;
        while (a2 != null) {
            b b2 = a2.c();
            if (b2 instanceof p && ((p)b2).d().equals(string)) {
                if (arro != null) {
                    int n3 = arro.length;
                    int n4 = this.j();
                    for (int i2 = 0; i2 < n3; ++i2) {
                        o o2 = arro[i2];
                        n4 += this.e.a(n4, o2);
                        this.b(o2);
                        arrn[n2] = this.do;
                        arrn2[n2] = this.dp;
                        arrstring[n2] = this.dq;
                        ++n2;
                    }
                }
            } else {
                b2.a(this);
                arrn[n2] = this.do;
                arrn2[n2] = this.dp;
                arrstring[n2] = this.dq;
                ++n2;
            }
            a2 = a2.d();
        }
    }

    void a(b b2, int n2, String string, a a2) throws e {
        b2.a(this);
        int n3 = this.e(a2);
        this.a(a2, new int[n3], new int[n3], new String[n3]);
        this.e.a(n2, string);
        this.a(string, false, false);
        this.g();
    }

    @Override
    protected void b(t t2) throws e {
        b b2 = t2.a();
        if (b2 != null && this.dy == o.n) {
            this.a(b2);
            if (k.a(this.do, this.dp)) {
                this.e.j(88);
            } else if (this.do != 344) {
                this.e.j(87);
            }
            b2 = null;
        }
        this.c(b2);
    }

    public int a(o o2, String string, String string2, w w2) throws e {
        this.dy = o2;
        this.dz = string;
        this.dM = string2;
        if (string2 == null) {
            return -1;
        }
        int n2 = this.b();
        int n3 = n2 + this.a(o2, string2, n2, w2);
        this.a(n3);
        return n2;
    }

    public void a(o o2) {
        this.dL = o2;
    }

    public int a(o[] arro, boolean bl2, String string, String string2, String string3, w w2) throws e {
        return this.a(arro, bl2, string, string2, string3, !bl2, 0, this.d(), w2);
    }

    public int a(o[] arro, boolean bl2, String string, String string2, String string3, boolean bl3, int n2, String string4, w w2) throws e {
        this.du = arro;
        this.ds = string2;
        this.dt = string3;
        this.dI = n2;
        this.dJ = bl3;
        if (string4 != null) {
            this.dK = r.d(string4);
        }
        this.dk = bl2;
        int n3 = n2;
        if (bl3) {
            String string5 = string + "0";
            i i2 = new i(307, r.c(string4), 0, n3++, new com.growingio.b.b.a.v(string5));
            w2.a(string5, i2);
        }
        for (int i3 = 0; i3 < arro.length; ++i3) {
            n3 += this.a(arro[i3], string + (i3 + 1), n3, w2);
        }
        if (this.b() < n3) {
            this.a(n3);
        }
        return n3;
    }

    public int a(o o2, String string, w w2) throws e {
        if (string == null) {
            return -1;
        }
        int n2 = this.b();
        int n3 = n2 + this.a(o2, string, n2, w2);
        this.a(n3);
        return n2;
    }

    private int a(o o2, String string, int n2, w w2) throws e {
        if (o2 == o.n) {
            this.do = 307;
            this.dp = 0;
            this.dq = "java/lang/Object";
        } else {
            this.b(o2);
        }
        i i2 = new i(this.do, this.dq, this.dp, n2, new com.growingio.b.b.a.v(string));
        w2.a(string, i2);
        return k.a(this.do, this.dp) ? 2 : 1;
    }

    public void a(String string, String string2, int n2, w w2) throws e {
        char c2;
        int n3 = 0;
        while ((c2 = string.charAt(n3)) == '[') {
            ++n3;
        }
        int n4 = r.a(c2);
        String string3 = null;
        if (n4 == 307) {
            string3 = n3 == 0 ? string.substring(1, string.length() - 1) : string.substring(n3 + 1, string.length() - 1);
        }
        i i2 = new i(n4, string3, n3, n2, new com.growingio.b.b.a.v(string2));
        w2.a(string2, i2);
    }

    public static int a(com.growingio.b.a.o o2, o[] arro, int n2) {
        if (arro == null) {
            o2.p(0);
            o2.e("java.lang.Object");
            return 1;
        }
        o[] arro2 = new o[1];
        int n3 = arro.length;
        o2.p(n3);
        o2.e("java.lang.Object");
        for (int i2 = 0; i2 < n3; ++i2) {
            o2.j(89);
            o2.p(i2);
            if (arro[i2].r()) {
                V v2 = (V)arro[i2];
                String string = v2.Y();
                o2.d(string);
                o2.j(89);
                int n4 = o2.a(n2, v2);
                n2 += n4;
                arro2[0] = v2;
                o2.c(string, "<init>", T.a(o.n, arro2));
            } else {
                o2.n(n2);
                ++n2;
            }
            o2.j(83);
        }
        return 8;
    }

    protected void a(o o2, com.growingio.b.a.o o3) throws e {
        if (o2 == o.n) {
            this.g();
            return;
        }
        if (this.do == 344) {
            throw new e("invalid type for " + this.dz);
        }
        if (o2 instanceof V) {
            V v2 = (V)o2;
            String string = v2.Y();
            o3.a(string);
            o3.e(string, v2.Z(), v2.aa());
            this.b(o2);
        } else {
            o3.b(o2);
            this.b(o2);
        }
    }

    public void b(o o2) throws e {
        this.a(o2, 0);
    }

    private void a(o o2, int n2) throws e {
        if (o2.r()) {
            V v2 = (V)o2;
            this.do = r.a(v2.X());
            this.dp = n2;
            this.dq = null;
        } else if (o2.b()) {
            try {
                this.a(o2.e(), n2 + 1);
            }
            catch (ae var3_4) {
                throw new e("undefined type: " + o2.s());
            }
        } else {
            this.do = 307;
            this.dp = n2;
            this.dq = r.c(o2.s());
        }
    }

    public void c(o o2) throws e {
        if (this.dp == 0 && !k.d(this.do)) {
            if (o2 instanceof V) {
                V v2 = (V)o2;
                this.d(this.do, r.a(v2.X()));
            } else {
                throw new e("type mismatch");
            }
        }
    }
}

