/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a;

import com.growingio.d.a.a;
import com.growingio.d.a.b;
import com.growingio.d.a.c;
import com.growingio.d.a.d;
import com.growingio.d.a.e;
import com.growingio.d.a.g;
import com.growingio.d.a.i;
import com.growingio.d.a.l;
import com.growingio.d.a.m;
import com.growingio.d.a.n;
import com.growingio.d.a.o;
import com.growingio.d.a.p;
import com.growingio.d.a.r;
import com.growingio.d.a.u;
import com.growingio.d.a.v;

class s
extends r {
    static final int a = 524288;
    static final int b = 0;
    static final int c = 64;
    static final int f = 128;
    static final int g = 247;
    static final int h = 248;
    static final int i = 251;
    static final int j = 252;
    static final int k = 255;
    private static final int r = 0;
    private static final int s = 1;
    private static final int t = 2;
    final g l;
    private int u;
    private final int v;
    private final int w;
    private final String x;
    String m;
    int n;
    int o;
    int p;
    int[] q;
    private d y;
    private b z;
    private b A;
    private b B;
    private b C;
    private b[] D;
    private b[] E;
    private int F;
    private c G;
    private d H = new d();
    private int I;
    private int J;
    private int K;
    private int L;
    private d M;
    private int N;
    private int[] O;
    private int[] P;
    private int Q;
    private n R;
    private n S;
    private int T;
    private d U;
    private int V;
    private d W;
    private int X;
    private d Y;
    private int Z;
    private d aa;
    private int ab;
    private b ac;
    private b ad;
    private c ae;
    private boolean af;
    private int ag;
    private final int ah;
    private p ai;
    private p aj;
    private p ak;
    private int al;
    private int am;

    s(g g2, int n2, String string, String string2, String string3, String[] arrstring, boolean bl2, boolean bl3) {
        int n3;
        super(327680);
        if (g2.ai == null) {
            g2.ai = this;
        } else {
            g2.aj.n_ = this;
        }
        g2.aj = this;
        this.l = g2;
        this.u = n2;
        if ("<init>".equals(string)) {
            this.u |= 524288;
        }
        this.v = g2.a(string);
        this.w = g2.a(string2);
        this.x = string2;
        this.m = string3;
        if (arrstring != null && arrstring.length > 0) {
            this.p = arrstring.length;
            this.q = new int[this.p];
            for (n3 = 0; n3 < this.p; ++n3) {
                this.q[n3] = g2.c(arrstring[n3]);
            }
        }
        int n4 = bl3 ? 0 : (this.ah = bl2 ? 1 : 2);
        if (bl2 || bl3) {
            n3 = u.f(this.x) >> 2;
            if ((n2 & 8) != 0) {
                --n3;
            }
            this.J = n3;
            this.K = n3;
            this.ai = new p();
            this.ai.n |= 8;
            this.a(this.ai);
        }
    }

    @Override
    public void a(String string, int n2) {
        if (this.U == null) {
            this.U = new d();
        }
        ++this.T;
        this.U.b(string == null ? 0 : this.l.a(string)).b(n2);
    }

    @Override
    public a c() {
        this.y = new d();
        return new b(this.l, false, this.y, null, 0);
    }

    @Override
    public a a(String string, boolean bl2) {
        d d2 = new d();
        d2.b(this.l.a(string)).b(0);
        b b2 = new b(this.l, true, d2, d2, 2);
        if (bl2) {
            b2.a = this.z;
            this.z = b2;
        } else {
            b2.a = this.A;
            this.A = b2;
        }
        return b2;
    }

    @Override
    public a a(int n2, v v2, String string, boolean bl2) {
        d d2 = new d();
        b.a(n2, v2, d2);
        d2.b(this.l.a(string)).b(0);
        b b2 = new b(this.l, true, d2, d2, d2.b - 2);
        if (bl2) {
            b2.a = this.B;
            this.B = b2;
        } else {
            b2.a = this.C;
            this.C = b2;
        }
        return b2;
    }

    @Override
    public a a(int n2, String string, boolean bl2) {
        d d2 = new d();
        if ("Ljava/lang/Synthetic;".equals(string)) {
            this.F = Math.max(this.F, n2 + 1);
            return new b(this.l, false, d2, null, 0);
        }
        d2.b(this.l.a(string)).b(0);
        b b2 = new b(this.l, true, d2, d2, 2);
        if (bl2) {
            if (this.D == null) {
                this.D = new b[u.d(this.x).length];
            }
            b2.a = this.D[n2];
            this.D[n2] = b2;
        } else {
            if (this.E == null) {
                this.E = new b[u.d(this.x).length];
            }
            b2.a = this.E[n2];
            this.E[n2] = b2;
        }
        return b2;
    }

    @Override
    public void a(c c2) {
        if (c2.b()) {
            c2.c = this.ae;
            this.ae = c2;
        } else {
            c2.c = this.G;
            this.G = c2;
        }
    }

    @Override
    public void a_() {
    }

    @Override
    public void a(int n2, int n3, Object[] arrobject, int n4, Object[] arrobject2) {
        if (this.ah == 0) {
            return;
        }
        if (n2 == -1) {
            int n5;
            if (this.O == null) {
                this.f();
            }
            this.K = n3;
            int n6 = this.a(this.H.b, n3, n4);
            for (n5 = 0; n5 < n3; ++n5) {
                this.P[n6++] = arrobject[n5] instanceof String ? 24117248 | this.l.f((String)arrobject[n5]) : (arrobject[n5] instanceof Integer ? (Integer)arrobject[n5] : 25165824 | this.l.a("", ((p)arrobject[n5]).p));
            }
            for (n5 = 0; n5 < n4; ++n5) {
                this.P[n6++] = arrobject2[n5] instanceof String ? 24117248 | this.l.f((String)arrobject2[n5]) : (arrobject2[n5] instanceof Integer ? (Integer)arrobject2[n5] : 25165824 | this.l.a("", ((p)arrobject2[n5]).p));
            }
            this.g();
        } else {
            int n7;
            if (this.M == null) {
                this.M = new d();
                n7 = this.H.b;
            } else {
                n7 = this.H.b - this.N - 1;
                if (n7 < 0) {
                    if (n2 == 3) {
                        return;
                    }
                    throw new IllegalStateException();
                }
            }
            switch (n2) {
                case 0: {
                    int n8;
                    this.K = n3;
                    this.M.a(255).b(n7).b(n3);
                    for (n8 = 0; n8 < n3; ++n8) {
                        this.b(arrobject[n8]);
                    }
                    this.M.b(n4);
                    for (n8 = 0; n8 < n4; ++n8) {
                        this.b(arrobject2[n8]);
                    }
                    break;
                }
                case 1: {
                    this.K += n3;
                    this.M.a(251 + n3).b(n7);
                    for (int i2 = 0; i2 < n3; ++i2) {
                        this.b(arrobject[i2]);
                    }
                    break;
                }
                case 2: {
                    this.K -= n3;
                    this.M.a(251 - n3).b(n7);
                    break;
                }
                case 3: {
                    if (n7 < 64) {
                        this.M.a(n7);
                        break;
                    }
                    this.M.a(251).b(n7);
                    break;
                }
                case 4: {
                    if (n7 < 64) {
                        this.M.a(64 + n7);
                    } else {
                        this.M.a(247).b(n7);
                    }
                    this.b(arrobject2[0]);
                }
            }
            this.N = this.H.b;
            ++this.L;
        }
        this.I = Math.max(this.I, n4);
        this.J = Math.max(this.J, this.K);
    }

    @Override
    public void a_(int n2) {
        this.ab = this.H.b;
        this.H.a(n2);
        if (this.ak != null) {
            if (this.ah == 0) {
                this.ak.s.a(n2, 0, null, null);
            } else {
                int n3 = this.al + l.w[n2];
                if (n3 > this.am) {
                    this.am = n3;
                }
                this.al = n3;
            }
            if (n2 >= 172 && n2 <= 177 || n2 == 191) {
                this.e();
            }
        }
    }

    @Override
    public void a(int n2, int n3) {
        this.ab = this.H.b;
        if (this.ak != null) {
            if (this.ah == 0) {
                this.ak.s.a(n2, n3, null, null);
            } else if (n2 != 188) {
                int n4 = this.al + 1;
                if (n4 > this.am) {
                    this.am = n4;
                }
                this.al = n4;
            }
        }
        if (n2 == 17) {
            this.H.b(n2, n3);
        } else {
            this.H.a(n2, n3);
        }
    }

    @Override
    public void b(int n2, int n3) {
        int n4;
        this.ab = this.H.b;
        if (this.ak != null) {
            if (this.ah == 0) {
                this.ak.s.a(n2, n3, null, null);
            } else if (n2 == 169) {
                this.ak.n |= 256;
                this.ak.q = this.al;
                this.e();
            } else {
                n4 = this.al + l.w[n2];
                if (n4 > this.am) {
                    this.am = n4;
                }
                this.al = n4;
            }
        }
        if (this.ah != 2) {
            n4 = n2 == 22 || n2 == 24 || n2 == 55 || n2 == 57 ? n3 + 2 : n3 + 1;
            if (n4 > this.J) {
                this.J = n4;
            }
        }
        if (n3 < 4 && n2 != 169) {
            n4 = n2 < 54 ? 26 + (n2 - 21 << 2) + n3 : 59 + (n2 - 54 << 2) + n3;
            this.H.a(n4);
        } else if (n3 >= 256) {
            this.H.a(196).b(n2, n3);
        } else {
            this.H.a(n2, n3);
        }
        if (n2 >= 54 && this.ah == 0 && this.Q > 0) {
            this.a(new p());
        }
    }

    @Override
    public void a(int n2, String string) {
        this.ab = this.H.b;
        o o2 = this.l.b(string);
        if (this.ak != null) {
            if (this.ah == 0) {
                this.ak.s.a(n2, this.H.b, this.l, o2);
            } else if (n2 == 187) {
                int n3 = this.al + 1;
                if (n3 > this.am) {
                    this.am = n3;
                }
                this.al = n3;
            }
        }
        this.H.b(n2, o2.a);
    }

    @Override
    public void b(int n2, String string, String string2, String string3) {
        this.ab = this.H.b;
        o o2 = this.l.b(string, string2, string3);
        if (this.ak != null) {
            if (this.ah == 0) {
                this.ak.s.a(n2, 0, this.l, o2);
            } else {
                int n3;
                char c2 = string3.charAt(0);
                switch (n2) {
                    case 178: {
                        n3 = this.al + (c2 == 'D' || c2 == 'J' ? 2 : 1);
                        break;
                    }
                    case 179: {
                        n3 = this.al + (c2 == 'D' || c2 == 'J' ? -2 : -1);
                        break;
                    }
                    case 180: {
                        n3 = this.al + (c2 == 'D' || c2 == 'J' ? 1 : 0);
                        break;
                    }
                    default: {
                        n3 = this.al + (c2 == 'D' || c2 == 'J' ? -3 : -2);
                    }
                }
                if (n3 > this.am) {
                    this.am = n3;
                }
                this.al = n3;
            }
        }
        this.H.b(n2, o2.a);
    }

    @Override
    public void a(int n2, String string, String string2, String string3, boolean bl2) {
        this.ab = this.H.b;
        o o2 = this.l.a(string, string2, string3, bl2);
        int n3 = o2.c;
        if (this.ak != null) {
            if (this.ah == 0) {
                this.ak.s.a(n2, 0, this.l, o2);
            } else {
                if (n3 == 0) {
                    o2.c = n3 = u.f(string3);
                }
                int n4 = n2 == 184 ? this.al - (n3 >> 2) + (n3 & 3) + 1 : this.al - (n3 >> 2) + (n3 & 3);
                if (n4 > this.am) {
                    this.am = n4;
                }
                this.al = n4;
            }
        }
        if (n2 == 185) {
            if (n3 == 0) {
                o2.c = n3 = u.f(string3);
            }
            this.H.b(185, o2.a).a(n3 >> 2, 0);
        } else {
            this.H.b(n2, o2.a);
        }
    }

    @Override
    public /* varargs */ void a(String string, String string2, m m2, Object ... arrobject) {
        this.ab = this.H.b;
        o o2 = this.l.a(string, string2, m2, arrobject);
        int n2 = o2.c;
        if (this.ak != null) {
            if (this.ah == 0) {
                this.ak.s.a(186, 0, this.l, o2);
            } else {
                int n3;
                if (n2 == 0) {
                    o2.c = n2 = u.f(string2);
                }
                if ((n3 = this.al - (n2 >> 2) + (n2 & 3) + 1) > this.am) {
                    this.am = n3;
                }
                this.al = n3;
            }
        }
        this.H.b(186, o2.a);
        this.H.b(0);
    }

    @Override
    public void a(int n2, p p2) {
        this.ab = this.H.b;
        p p3 = null;
        if (this.ak != null) {
            if (this.ah == 0) {
                this.ak.s.a(n2, 0, null, null);
                p2.b().n |= 16;
                this.c(0, p2);
                if (n2 != 167) {
                    p3 = new p();
                }
            } else if (n2 == 168) {
                if ((p2.n & 512) == 0) {
                    p2.n |= 512;
                    ++this.ag;
                }
                this.ak.n |= 128;
                this.c(this.al + 1, p2);
                p3 = new p();
            } else {
                this.al += l.w[n2];
                this.c(this.al, p2);
            }
        }
        if ((p2.n & 2) != 0 && p2.p - this.H.b < -32768) {
            if (n2 == 167) {
                this.H.a(200);
            } else if (n2 == 168) {
                this.H.a(201);
            } else {
                if (p3 != null) {
                    p3.n |= 16;
                }
                this.H.a(n2 <= 166 ? (n2 + 1 ^ 1) - 1 : n2 ^ 1);
                this.H.b(8);
                this.H.a(200);
            }
            p2.a(this, this.H, this.H.b - 1, true);
        } else {
            this.H.a(n2);
            p2.a(this, this.H, this.H.b - 1, false);
        }
        if (this.ak != null) {
            if (p3 != null) {
                this.a(p3);
            }
            if (n2 == 167) {
                this.e();
            }
        }
    }

    @Override
    public void a(p p2) {
        this.af |= p2.a(this, this.H.b, this.H.a);
        if ((p2.n & 1) != 0) {
            return;
        }
        if (this.ah == 0) {
            if (this.ak != null) {
                if (p2.p == this.ak.p) {
                    this.ak.n |= p2.n & 16;
                    p2.s = this.ak.s;
                    return;
                }
                this.c(0, p2);
            }
            this.ak = p2;
            if (p2.s == null) {
                p2.s = new l();
                p2.s.x = p2;
            }
            if (this.aj != null) {
                if (p2.p == this.aj.p) {
                    this.aj.n |= p2.n & 16;
                    p2.s = this.aj.s;
                    this.ak = this.aj;
                    return;
                }
                this.aj.t = p2;
            }
            this.aj = p2;
        } else if (this.ah == 1) {
            if (this.ak != null) {
                this.ak.r = this.am;
                this.c(this.al, p2);
            }
            this.ak = p2;
            this.al = 0;
            this.am = 0;
            if (this.aj != null) {
                this.aj.t = p2;
            }
            this.aj = p2;
        }
    }

    @Override
    public void a(Object object) {
        int n2;
        this.ab = this.H.b;
        o o2 = this.l.a(object);
        if (this.ak != null) {
            if (this.ah == 0) {
                this.ak.s.a(18, 0, this.l, o2);
            } else {
                n2 = o2.b == 5 || o2.b == 6 ? this.al + 2 : this.al + 1;
                if (n2 > this.am) {
                    this.am = n2;
                }
                this.al = n2;
            }
        }
        n2 = o2.a;
        if (o2.b == 5 || o2.b == 6) {
            this.H.b(20, n2);
        } else if (n2 >= 256) {
            this.H.b(19, n2);
        } else {
            this.H.a(18, n2);
        }
    }

    @Override
    public void c(int n2, int n3) {
        int n4;
        this.ab = this.H.b;
        if (this.ak != null && this.ah == 0) {
            this.ak.s.a(132, n2, null, null);
        }
        if (this.ah != 2 && (n4 = n2 + 1) > this.J) {
            this.J = n4;
        }
        if (n2 > 255 || n3 > 127 || n3 < -128) {
            this.H.a(196).b(132, n2).b(n3);
        } else {
            this.H.a(132).a(n2, n3);
        }
    }

    @Override
    public /* varargs */ void a(int n2, int n3, p p2, p ... arrp) {
        this.ab = this.H.b;
        int n4 = this.H.b;
        this.H.a(170);
        this.H.a((byte[])null, 0, (4 - this.H.b % 4) % 4);
        p2.a(this, this.H, n4, true);
        this.H.c(n2).c(n3);
        for (int i2 = 0; i2 < arrp.length; ++i2) {
            arrp[i2].a(this, this.H, n4, true);
        }
        this.a(p2, arrp);
    }

    @Override
    public void a(p p2, int[] arrn, p[] arrp) {
        this.ab = this.H.b;
        int n2 = this.H.b;
        this.H.a(171);
        this.H.a((byte[])null, 0, (4 - this.H.b % 4) % 4);
        p2.a(this, this.H, n2, true);
        this.H.c(arrp.length);
        for (int i2 = 0; i2 < arrp.length; ++i2) {
            this.H.c(arrn[i2]);
            arrp[i2].a(this, this.H, n2, true);
        }
        this.a(p2, arrp);
    }

    private void a(p p2, p[] arrp) {
        if (this.ak != null) {
            if (this.ah == 0) {
                this.ak.s.a(171, 0, null, null);
                this.c(0, p2);
                p2.b().n |= 16;
                for (int i2 = 0; i2 < arrp.length; ++i2) {
                    this.c(0, arrp[i2]);
                    arrp[i2].b().n |= 16;
                }
            } else {
                --this.al;
                this.c(this.al, p2);
                for (int i3 = 0; i3 < arrp.length; ++i3) {
                    this.c(this.al, arrp[i3]);
                }
            }
            this.e();
        }
    }

    @Override
    public void b(String string, int n2) {
        this.ab = this.H.b;
        o o2 = this.l.b(string);
        if (this.ak != null) {
            if (this.ah == 0) {
                this.ak.s.a(197, n2, this.l, o2);
            } else {
                this.al += 1 - n2;
            }
        }
        this.H.b(197, o2.a).a(n2);
    }

    @Override
    public a b(int n2, v v2, String string, boolean bl2) {
        d d2 = new d();
        n2 = n2 & -16776961 | this.ab << 8;
        b.a(n2, v2, d2);
        d2.b(this.l.a(string)).b(0);
        b b2 = new b(this.l, true, d2, d2, d2.b - 2);
        if (bl2) {
            b2.a = this.ac;
            this.ac = b2;
        } else {
            b2.a = this.ad;
            this.ad = b2;
        }
        return b2;
    }

    @Override
    public void a(p p2, p p3, p p4, String string) {
        ++this.Q;
        n n2 = new n();
        n2.a = p2;
        n2.b = p3;
        n2.c = p4;
        n2.d = string;
        int n3 = n2.e = string != null ? this.l.c(string) : 0;
        if (this.S == null) {
            this.R = n2;
        } else {
            this.S.f = n2;
        }
        this.S = n2;
    }

    @Override
    public a c(int n2, v v2, String string, boolean bl2) {
        d d2 = new d();
        b.a(n2, v2, d2);
        d2.b(this.l.a(string)).b(0);
        b b2 = new b(this.l, true, d2, d2, d2.b - 2);
        if (bl2) {
            b2.a = this.ac;
            this.ac = b2;
        } else {
            b2.a = this.ad;
            this.ad = b2;
        }
        return b2;
    }

    @Override
    public void a(String string, String string2, String string3, p p2, p p3, int n2) {
        char c2;
        int n3;
        if (string3 != null) {
            if (this.Y == null) {
                this.Y = new d();
            }
            ++this.X;
            this.Y.b(p2.p).b(p3.p - p2.p).b(this.l.a(string)).b(this.l.a(string3)).b(n2);
        }
        if (this.W == null) {
            this.W = new d();
        }
        ++this.V;
        this.W.b(p2.p).b(p3.p - p2.p).b(this.l.a(string)).b(this.l.a(string2)).b(n2);
        if (this.ah != 2 && (n3 = n2 + ((c2 = string2.charAt(0)) == 'J' || c2 == 'D' ? 2 : 1)) > this.J) {
            this.J = n3;
        }
    }

    @Override
    public a a(int n2, v v2, p[] arrp, p[] arrp2, int[] arrn, String string, boolean bl2) {
        int n3;
        d d2 = new d();
        d2.a(n2 >>> 24).b(arrp.length);
        for (n3 = 0; n3 < arrp.length; ++n3) {
            d2.b(arrp[n3].p).b(arrp2[n3].p - arrp[n3].p).b(arrn[n3]);
        }
        if (v2 == null) {
            d2.a(0);
        } else {
            n3 = v2.e[v2.f] * 2 + 1;
            d2.a(v2.e, v2.f, n3);
        }
        d2.b(this.l.a(string)).b(0);
        b b2 = new b(this.l, true, d2, d2, d2.b - 2);
        if (bl2) {
            b2.a = this.ac;
            this.ac = b2;
        } else {
            b2.a = this.ad;
            this.ad = b2;
        }
        return b2;
    }

    @Override
    public void b(int n2, p p2) {
        if (this.aa == null) {
            this.aa = new d();
        }
        ++this.Z;
        this.aa.b(p2.p);
        this.aa.b(n2);
    }

    @Override
    public void d(int n2, int n3) {
        if (this.af) {
            this.i();
        }
        if (this.ah == 0) {
            Object object;
            Object object3;
            int n4;
            i i2 /* !! */ ;
            Object object2;
            u[] arru;
            n n5 = this.R;
            while (n5 != null) {
                object3 = n5.a.b();
                arru = n5.c.b();
                p p2 = n5.b.b();
                object2 = n5.d == null ? "java/lang/Throwable" : n5.d;
                int n6 = 24117248 | this.l.f((String)object2);
                arru.n |= 16;
                while (object3 != p2) {
                    i2 /* !! */  = new i();
                    i2 /* !! */ .c = n6;
                    i2 /* !! */ .d = arru;
                    i2 /* !! */ .e = object3.u;
                    object3.u = i2 /* !! */ ;
                    object3 = object3.t;
                }
                n5 = n5.f;
            }
            object3 = this.ai.s;
            arru = u.d(this.x);
            object3.a(this.l, this.u, arru, this.J);
            this.a((l)object3);
            Object object4 = 0;
            object2 = this.ai;
            while (object2 != null) {
                Object object5 = object2;
                object2 = object2.v;
                object5.v = null;
                object3 = object5.s;
                if ((object5.n & 16) != 0) {
                    object5.n |= 32;
                }
                object5.n |= 64;
                i2 /* !! */  = (i)(object3.z.length + object5.r);
                if (i2 /* !! */  > object4) {
                    object4 = i2 /* !! */ ;
                }
                i i3 = object5.u;
                while (i3 != null) {
                    object = i3.d.b();
                    n4 = (int)object3.a(this.l, object.s, i3.c) ? 1 : 0;
                    if (n4 != 0 && object.v == null) {
                        object.v = object2;
                        object2 = object;
                    }
                    i3 = i3.e;
                }
            }
            p p3 = this.ai;
            while (p3 != null) {
                int n6;
                p p4;
                object3 = p3.s;
                if ((p3.n & 32) != 0) {
                    this.a((l)object3);
                }
                if ((p3.n & 64) == 0 && (object = ((p4 = p3.t) == null ? this.H.b : p4.p) - 1) >= (n6 = p3.p)) {
                    object4 = Math.max((int)object4, 1);
                    for (n4 = n6; n4 < object; ++n4) {
                        this.H.a[n4] = 0;
                    }
                    this.H.a[object] = -65;
                    n4 = this.a(n6, 0, 1);
                    this.P[n4] = 24117248 | this.l.f("java/lang/Throwable");
                    this.g();
                    this.R = n.a(this.R, p3, p4);
                }
                p3 = p3.t;
            }
            n5 = this.R;
            this.Q = 0;
            while (n5 != null) {
                ++this.Q;
                n5 = n5.f;
            }
            this.I = object4;
        } else if (this.ah == 1) {
            Object object;
            p p5;
            p p6;
            n n8 = this.R;
            while (n8 != null) {
                p p7 = n8.a;
                p6 = n8.c;
                p5 = n8.b;
                while (p7 != p5) {
                    object = new i();
                    object.c = Integer.MAX_VALUE;
                    object.d = p6;
                    if ((p7.n & 128) == 0) {
                        object.e = p7.u;
                        p7.u = object;
                    } else {
                        object.e = p7.u.e.e;
                        p7.u.e.e = object;
                    }
                    p7 = p7.t;
                }
                n8 = n8.f;
            }
            if (this.ag > 0) {
                int n9 = 0;
                this.ai.a(null, 1, this.ag);
                p6 = this.ai;
                while (p6 != null) {
                    if ((p6.n & 128) != 0) {
                        p5 = p6.u.e.d;
                        if ((p5.n & 1024) == 0) {
                            p5.a(null, (long)n9 / 32 << 32 | 1 << ++n9 % 32, this.ag);
                        }
                    }
                    p6 = p6.t;
                }
                p6 = this.ai;
                while (p6 != null) {
                    if ((p6.n & 128) != 0) {
                        p5 = this.ai;
                        while (p5 != null) {
                            p5.n &= -2049;
                            p5 = p5.t;
                        }
                        object = p6.u.e.d;
                        object.a(p6, 0, this.ag);
                    }
                    p6 = p6.t;
                }
            }
            int n10 = 0;
            p6 = this.ai;
            while (p6 != null) {
                void i4;
                p5 = p6;
                p6 = p6.v;
                int n11 = p5.q;
                int n12 = n11 + p5.r;
                if (n12 > n10) {
                    n10 = n12;
                }
                i i5 = p5.u;
                if ((p5.n & 128) != 0) {
                    i i6 = i5.e;
                }
                while (i4 != null) {
                    p5 = i4.d;
                    if ((p5.n & 8) == 0) {
                        p5.q = i4.c == Integer.MAX_VALUE ? 1 : n11 + i4.c;
                        p5.n |= 8;
                        p5.v = p6;
                        p6 = p5;
                    }
                    i i7 = i4.e;
                }
            }
            this.I = Math.max(n2, n10);
        } else {
            this.I = n2;
            this.J = n3;
        }
    }

    @Override
    public void b() {
    }

    private void c(int n2, p p2) {
        i i2 = new i();
        i2.c = n2;
        i2.d = p2;
        i2.e = this.ak.u;
        this.ak.u = i2;
    }

    private void e() {
        if (this.ah == 0) {
            p p2 = new p();
            p2.s = new l();
            p2.s.x = p2;
            p2.a(this, this.H.b, this.H.a);
            this.aj.t = p2;
            this.aj = p2;
        } else {
            this.ak.r = this.am;
        }
        this.ak = null;
    }

    private void a(l l2) {
        int n2;
        int n3;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        int[] arrn = l2.y;
        int[] arrn2 = l2.z;
        for (n3 = 0; n3 < arrn.length; ++n3) {
            n2 = arrn[n3];
            if (n2 == 16777216) {
                ++n4;
            } else {
                n5 += n4 + 1;
                n4 = 0;
            }
            if (n2 != 16777220 && n2 != 16777219) continue;
            ++n3;
        }
        for (n3 = 0; n3 < arrn2.length; ++n3) {
            n2 = arrn2[n3];
            ++n6;
            if (n2 != 16777220 && n2 != 16777219) continue;
            ++n3;
        }
        int n7 = this.a(l2.x.p, n5, n6);
        n3 = 0;
        while (n5 > 0) {
            n2 = arrn[n3];
            this.P[n7++] = n2;
            if (n2 == 16777220 || n2 == 16777219) {
                ++n3;
            }
            ++n3;
            --n5;
        }
        for (n3 = 0; n3 < arrn2.length; ++n3) {
            n2 = arrn2[n3];
            this.P[n7++] = n2;
            if (n2 != 16777220 && n2 != 16777219) continue;
            ++n3;
        }
        this.g();
    }

    private void f() {
        int n2 = this.a(0, this.x.length() + 1, 0);
        if ((this.u & 8) == 0) {
            this.P[n2++] = (this.u & 524288) == 0 ? 24117248 | this.l.f(this.l.ad) : 6;
        }
        int n3 = 1;
        block8 : do {
            int n4 = n3;
            switch (this.x.charAt(n3++)) {
                case 'B': 
                case 'C': 
                case 'I': 
                case 'S': 
                case 'Z': {
                    this.P[n2++] = 1;
                    continue block8;
                }
                case 'F': {
                    this.P[n2++] = 2;
                    continue block8;
                }
                case 'J': {
                    this.P[n2++] = 4;
                    continue block8;
                }
                case 'D': {
                    this.P[n2++] = 3;
                    continue block8;
                }
                case '[': {
                    while (this.x.charAt(n3) == '[') {
                        ++n3;
                    }
                    if (this.x.charAt(n3) == 'L') {
                        ++n3;
                        while (this.x.charAt(n3) != ';') {
                            ++n3;
                        }
                    }
                    this.P[n2++] = 24117248 | this.l.f(this.x.substring(n4, ++n3));
                    continue block8;
                }
                case 'L': {
                    while (this.x.charAt(n3) != ';') {
                        ++n3;
                    }
                    this.P[n2++] = 24117248 | this.l.f(this.x.substring(n4 + 1, n3++));
                    continue block8;
                }
            }
            break;
        } while (true);
        this.P[1] = n2 - 3;
        this.g();
    }

    private int a(int n2, int n3, int n4) {
        int n5 = 3 + n3 + n4;
        if (this.P == null || this.P.length < n5) {
            this.P = new int[n5];
        }
        this.P[0] = n2;
        this.P[1] = n3;
        this.P[2] = n4;
        return 3;
    }

    private void g() {
        if (this.O != null) {
            if (this.M == null) {
                this.M = new d();
            }
            this.h();
            ++this.L;
        }
        this.O = this.P;
        this.P = null;
    }

    private void h() {
        int n2 = this.P[1];
        int n3 = this.P[2];
        if ((this.l.T & 65535) < 50) {
            this.M.b(this.P[0]).b(n2);
            this.e(3, 3 + n2);
            this.M.b(n3);
            this.e(3 + n2, 3 + n2 + n3);
            return;
        }
        int n4 = this.O[1];
        int n5 = 255;
        int n6 = 0;
        int n7 = this.L == 0 ? this.P[0] : this.P[0] - this.O[0] - 1;
        if (n3 == 0) {
            n6 = n2 - n4;
            switch (n6) {
                case -3: 
                case -2: 
                case -1: {
                    n5 = 248;
                    n4 = n2;
                    break;
                }
                case 0: {
                    n5 = n7 < 64 ? 0 : 251;
                    break;
                }
                case 1: 
                case 2: 
                case 3: {
                    n5 = 252;
                }
            }
        } else if (n2 == n4 && n3 == 1) {
            int n8 = n5 = n7 < 63 ? 64 : 247;
        }
        if (n5 != 255) {
            int n9 = 3;
            for (int i2 = 0; i2 < n4; ++i2) {
                if (this.P[n9] != this.O[n9]) {
                    n5 = 255;
                    break;
                }
                ++n9;
            }
        }
        switch (n5) {
            case 0: {
                this.M.a(n7);
                break;
            }
            case 64: {
                this.M.a(64 + n7);
                this.e(3 + n2, 4 + n2);
                break;
            }
            case 247: {
                this.M.a(247).b(n7);
                this.e(3 + n2, 4 + n2);
                break;
            }
            case 251: {
                this.M.a(251).b(n7);
                break;
            }
            case 248: {
                this.M.a(251 + n6).b(n7);
                break;
            }
            case 252: {
                this.M.a(251 + n6).b(n7);
                this.e(3 + n4, 3 + n2);
                break;
            }
            default: {
                this.M.a(255).b(n7).b(n2);
                this.e(3, 3 + n2);
                this.M.b(n3);
                this.e(3 + n2, 3 + n2 + n3);
            }
        }
    }

    private void e(int n2, int n3) {
        block13 : for (int i2 = n2; i2 < n3; ++i2) {
            int n4 = this.P[i2];
            int n5 = n4 & -268435456;
            if (n5 == 0) {
                int n6 = n4 & 1048575;
                switch (n4 & 267386880) {
                    case 24117248: {
                        this.M.a(7).b(this.l.c(this.l.ac[n6].e));
                        continue block13;
                    }
                    case 25165824: {
                        this.M.a(8).b(this.l.ac[n6].c);
                        continue block13;
                    }
                }
                this.M.a(n6);
                continue;
            }
            StringBuilder stringBuilder = new StringBuilder();
            n5 >>= 28;
            while (n5-- > 0) {
                stringBuilder.append('[');
            }
            if ((n4 & 267386880) == 24117248) {
                stringBuilder.append('L');
                stringBuilder.append(this.l.ac[n4 & 1048575].e);
                stringBuilder.append(';');
            } else {
                switch (n4 & 15) {
                    case 1: {
                        stringBuilder.append('I');
                        break;
                    }
                    case 2: {
                        stringBuilder.append('F');
                        break;
                    }
                    case 3: {
                        stringBuilder.append('D');
                        break;
                    }
                    case 9: {
                        stringBuilder.append('Z');
                        break;
                    }
                    case 10: {
                        stringBuilder.append('B');
                        break;
                    }
                    case 11: {
                        stringBuilder.append('C');
                        break;
                    }
                    case 12: {
                        stringBuilder.append('S');
                        break;
                    }
                    default: {
                        stringBuilder.append('J');
                    }
                }
            }
            this.M.a(7).b(this.l.c(stringBuilder.toString()));
        }
    }

    private void b(Object object) {
        if (object instanceof String) {
            this.M.a(7).b(this.l.c((String)object));
        } else if (object instanceof Integer) {
            this.M.a((Integer)object);
        } else {
            this.M.a(8).b(((p)object).p);
        }
    }

    final int d() {
        int n2;
        if (this.n != 0) {
            return 6 + this.o;
        }
        int n3 = 8;
        if (this.H.b > 0) {
            if (this.H.b > 65535) {
                throw new RuntimeException("Method code too large!");
            }
            this.l.a("Code");
            n3 += 18 + this.H.b + 8 * this.Q;
            if (this.W != null) {
                this.l.a("LocalVariableTable");
                n3 += 8 + this.W.b;
            }
            if (this.Y != null) {
                this.l.a("LocalVariableTypeTable");
                n3 += 8 + this.Y.b;
            }
            if (this.aa != null) {
                this.l.a("LineNumberTable");
                n3 += 8 + this.aa.b;
            }
            if (this.M != null) {
                n2 = (this.l.T & 65535) >= 50 ? 1 : 0;
                this.l.a(n2 != 0 ? "StackMapTable" : "StackMap");
                n3 += 8 + this.M.b;
            }
            if (this.ac != null) {
                this.l.a("RuntimeVisibleTypeAnnotations");
                n3 += 8 + this.ac.b();
            }
            if (this.ad != null) {
                this.l.a("RuntimeInvisibleTypeAnnotations");
                n3 += 8 + this.ad.b();
            }
            if (this.ae != null) {
                n3 += this.ae.b(this.l, this.H.a, this.H.b, this.I, this.J);
            }
        }
        if (this.p > 0) {
            this.l.a("Exceptions");
            n3 += 8 + 2 * this.p;
        }
        if ((this.u & 4096) != 0 && ((this.l.T & 65535) < 49 || (this.u & 262144) != 0)) {
            this.l.a("Synthetic");
            n3 += 6;
        }
        if ((this.u & 131072) != 0) {
            this.l.a("Deprecated");
            n3 += 6;
        }
        if (this.m != null) {
            this.l.a("Signature");
            this.l.a(this.m);
            n3 += 8;
        }
        if (this.U != null) {
            this.l.a("MethodParameters");
            n3 += 7 + this.U.b;
        }
        if (this.y != null) {
            this.l.a("AnnotationDefault");
            n3 += 6 + this.y.b;
        }
        if (this.z != null) {
            this.l.a("RuntimeVisibleAnnotations");
            n3 += 8 + this.z.b();
        }
        if (this.A != null) {
            this.l.a("RuntimeInvisibleAnnotations");
            n3 += 8 + this.A.b();
        }
        if (this.B != null) {
            this.l.a("RuntimeVisibleTypeAnnotations");
            n3 += 8 + this.B.b();
        }
        if (this.C != null) {
            this.l.a("RuntimeInvisibleTypeAnnotations");
            n3 += 8 + this.C.b();
        }
        if (this.D != null) {
            this.l.a("RuntimeVisibleParameterAnnotations");
            n3 += 7 + 2 * (this.D.length - this.F);
            for (n2 = this.D.length - 1; n2 >= this.F; --n2) {
                n3 += this.D[n2] == null ? 0 : this.D[n2].b();
            }
        }
        if (this.E != null) {
            this.l.a("RuntimeInvisibleParameterAnnotations");
            n3 += 7 + 2 * (this.E.length - this.F);
            for (n2 = this.E.length - 1; n2 >= this.F; --n2) {
                n3 += this.E[n2] == null ? 0 : this.E[n2].b();
            }
        }
        if (this.G != null) {
            n3 += this.G.b(this.l, null, 0, -1, -1);
        }
        return n3;
    }

    final void a(d d2) {
        int n2;
        int n3 = 64;
        int n4 = 917504 | (this.u & 262144) / 64;
        d2.b(this.u & ~ n4).b(this.v).b(this.w);
        if (this.n != 0) {
            d2.a(this.l.S.j, this.n, this.o);
            return;
        }
        int n5 = 0;
        if (this.H.b > 0) {
            ++n5;
        }
        if (this.p > 0) {
            ++n5;
        }
        if ((this.u & 4096) != 0 && ((this.l.T & 65535) < 49 || (this.u & 262144) != 0)) {
            ++n5;
        }
        if ((this.u & 131072) != 0) {
            ++n5;
        }
        if (this.m != null) {
            ++n5;
        }
        if (this.U != null) {
            ++n5;
        }
        if (this.y != null) {
            ++n5;
        }
        if (this.z != null) {
            ++n5;
        }
        if (this.A != null) {
            ++n5;
        }
        if (this.B != null) {
            ++n5;
        }
        if (this.C != null) {
            ++n5;
        }
        if (this.D != null) {
            ++n5;
        }
        if (this.E != null) {
            ++n5;
        }
        if (this.G != null) {
            n5 += this.G.d();
        }
        d2.b(n5);
        if (this.H.b > 0) {
            n2 = 12 + this.H.b + 8 * this.Q;
            if (this.W != null) {
                n2 += 8 + this.W.b;
            }
            if (this.Y != null) {
                n2 += 8 + this.Y.b;
            }
            if (this.aa != null) {
                n2 += 8 + this.aa.b;
            }
            if (this.M != null) {
                n2 += 8 + this.M.b;
            }
            if (this.ac != null) {
                n2 += 8 + this.ac.b();
            }
            if (this.ad != null) {
                n2 += 8 + this.ad.b();
            }
            if (this.ae != null) {
                n2 += this.ae.b(this.l, this.H.a, this.H.b, this.I, this.J);
            }
            d2.b(this.l.a("Code")).c(n2);
            d2.b(this.I).b(this.J);
            d2.c(this.H.b).a(this.H.a, 0, this.H.b);
            d2.b(this.Q);
            if (this.Q > 0) {
                n n6 = this.R;
                while (n6 != null) {
                    d2.b(n6.a.p).b(n6.b.p).b(n6.c.p).b(n6.e);
                    n6 = n6.f;
                }
            }
            n5 = 0;
            if (this.W != null) {
                ++n5;
            }
            if (this.Y != null) {
                ++n5;
            }
            if (this.aa != null) {
                ++n5;
            }
            if (this.M != null) {
                ++n5;
            }
            if (this.ac != null) {
                ++n5;
            }
            if (this.ad != null) {
                ++n5;
            }
            if (this.ae != null) {
                n5 += this.ae.d();
            }
            d2.b(n5);
            if (this.W != null) {
                d2.b(this.l.a("LocalVariableTable"));
                d2.c(this.W.b + 2).b(this.V);
                d2.a(this.W.a, 0, this.W.b);
            }
            if (this.Y != null) {
                d2.b(this.l.a("LocalVariableTypeTable"));
                d2.c(this.Y.b + 2).b(this.X);
                d2.a(this.Y.a, 0, this.Y.b);
            }
            if (this.aa != null) {
                d2.b(this.l.a("LineNumberTable"));
                d2.c(this.aa.b + 2).b(this.Z);
                d2.a(this.aa.a, 0, this.aa.b);
            }
            if (this.M != null) {
                boolean bl2 = (this.l.T & 65535) >= 50;
                d2.b(this.l.a(bl2 ? "StackMapTable" : "StackMap"));
                d2.c(this.M.b + 2).b(this.L);
                d2.a(this.M.a, 0, this.M.b);
            }
            if (this.ac != null) {
                d2.b(this.l.a("RuntimeVisibleTypeAnnotations"));
                this.ac.a(d2);
            }
            if (this.ad != null) {
                d2.b(this.l.a("RuntimeInvisibleTypeAnnotations"));
                this.ad.a(d2);
            }
            if (this.ae != null) {
                this.ae.a(this.l, this.H.a, this.H.b, this.J, this.I, d2);
            }
        }
        if (this.p > 0) {
            d2.b(this.l.a("Exceptions")).c(2 * this.p + 2);
            d2.b(this.p);
            for (n2 = 0; n2 < this.p; ++n2) {
                d2.b(this.q[n2]);
            }
        }
        if ((this.u & 4096) != 0 && ((this.l.T & 65535) < 49 || (this.u & 262144) != 0)) {
            d2.b(this.l.a("Synthetic")).c(0);
        }
        if ((this.u & 131072) != 0) {
            d2.b(this.l.a("Deprecated")).c(0);
        }
        if (this.m != null) {
            d2.b(this.l.a("Signature")).c(2).b(this.l.a(this.m));
        }
        if (this.U != null) {
            d2.b(this.l.a("MethodParameters"));
            d2.c(this.U.b + 1).a(this.T);
            d2.a(this.U.a, 0, this.U.b);
        }
        if (this.y != null) {
            d2.b(this.l.a("AnnotationDefault"));
            d2.c(this.y.b);
            d2.a(this.y.a, 0, this.y.b);
        }
        if (this.z != null) {
            d2.b(this.l.a("RuntimeVisibleAnnotations"));
            this.z.a(d2);
        }
        if (this.A != null) {
            d2.b(this.l.a("RuntimeInvisibleAnnotations"));
            this.A.a(d2);
        }
        if (this.B != null) {
            d2.b(this.l.a("RuntimeVisibleTypeAnnotations"));
            this.B.a(d2);
        }
        if (this.C != null) {
            d2.b(this.l.a("RuntimeInvisibleTypeAnnotations"));
            this.C.a(d2);
        }
        if (this.D != null) {
            d2.b(this.l.a("RuntimeVisibleParameterAnnotations"));
            b.a(this.D, this.F, d2);
        }
        if (this.E != null) {
            d2.b(this.l.a("RuntimeInvisibleParameterAnnotations"));
            b.a(this.E, this.F, d2);
        }
        if (this.G != null) {
            this.G.a(this.l, null, 0, -1, -1, d2);
        }
    }

    private void i() {
        int[] arrn;
        int n2;
        Object object;
        int n3;
        int n4;
        int n5;
        int n6;
        byte[] arrby = this.H.a;
        Object object2 = new int[]{};
        int[] arrn2 = new int[]{};
        boolean[] arrbl = new boolean[this.H.b];
        int n7 = 3;
        do {
            if (n7 == 3) {
                n7 = 2;
            }
            n4 = 0;
            while (n4 < arrby.length) {
                int n8 = arrby[n4] & 255;
                n5 = 0;
                switch (g.y[n8]) {
                    case 0: 
                    case 4: {
                        ++n4;
                        break;
                    }
                    case 9: {
                        if (n8 > 201) {
                            n8 = n8 < 218 ? n8 - 49 : n8 - 20;
                            n2 = n4 + s.a(arrby, n4 + 1);
                        } else {
                            n2 = n4 + s.b(arrby, n4 + 1);
                        }
                        n3 = s.a((int[])object2, arrn2, n4, n2);
                        if (!(n3 >= -32768 && n3 <= 32767 || arrbl[n4])) {
                            n5 = n8 == 167 || n8 == 168 ? 2 : 5;
                            arrbl[n4] = true;
                        }
                        n4 += 3;
                        break;
                    }
                    case 10: {
                        n4 += 5;
                        break;
                    }
                    case 14: {
                        if (n7 == 1) {
                            n3 = s.a((int[])object2, arrn2, 0, n4);
                            n5 = - (n3 & 3);
                        } else if (!arrbl[n4]) {
                            n5 = n4 & 3;
                            arrbl[n4] = true;
                        }
                        n4 = n4 + 4 - (n4 & 3);
                        n4 += 4 * (s.c(arrby, n4 + 8) - s.c(arrby, n4 + 4) + 1) + 12;
                        break;
                    }
                    case 15: {
                        if (n7 == 1) {
                            n3 = s.a((int[])object2, arrn2, 0, n4);
                            n5 = - (n3 & 3);
                        } else if (!arrbl[n4]) {
                            n5 = n4 & 3;
                            arrbl[n4] = true;
                        }
                        n4 = n4 + 4 - (n4 & 3);
                        n4 += 8 * s.c(arrby, n4 + 4) + 8;
                        break;
                    }
                    case 17: {
                        n8 = arrby[n4 + 1] & 255;
                        if (n8 == 132) {
                            n4 += 6;
                            break;
                        }
                        n4 += 4;
                        break;
                    }
                    case 1: 
                    case 3: 
                    case 11: {
                        n4 += 2;
                        break;
                    }
                    case 2: 
                    case 5: 
                    case 6: 
                    case 12: 
                    case 13: {
                        n4 += 3;
                        break;
                    }
                    case 7: 
                    case 8: {
                        n4 += 5;
                        break;
                    }
                    default: {
                        n4 += 4;
                    }
                }
                if (n5 == 0) continue;
                object = new int[object2.length + 1];
                arrn = new int[arrn2.length + 1];
                System.arraycopy(object2, 0, object, 0, object2.length);
                System.arraycopy(arrn2, 0, arrn, 0, arrn2.length);
                object[object2.length] = n4;
                arrn[arrn2.length] = n5;
                object2 = object;
                arrn2 = arrn;
                if (n5 <= 0) continue;
                n7 = 3;
            }
            if (n7 >= 3) continue;
            --n7;
        } while (n7 != 0);
        d d2 = new d(this.H.b);
        n4 = 0;
        block24 : while (n4 < this.H.b) {
            n5 = arrby[n4] & 255;
            switch (g.y[n5]) {
                int n9;
                int n10;
                case 0: 
                case 4: {
                    d2.a(n5);
                    ++n4;
                    continue block24;
                }
                case 9: {
                    if (n5 > 201) {
                        n5 = n5 < 218 ? n5 - 49 : n5 - 20;
                        n2 = n4 + s.a(arrby, n4 + 1);
                    } else {
                        n2 = n4 + s.b(arrby, n4 + 1);
                    }
                    n3 = s.a((int[])object2, arrn2, n4, n2);
                    if (arrbl[n4]) {
                        if (n5 == 167) {
                            d2.a(200);
                        } else if (n5 == 168) {
                            d2.a(201);
                        } else {
                            d2.a(n5 <= 166 ? (n5 + 1 ^ 1) - 1 : n5 ^ 1);
                            d2.b(8);
                            d2.a(200);
                            n3 -= 3;
                        }
                        d2.c(n3);
                    } else {
                        d2.a(n5);
                        d2.b(n3);
                    }
                    n4 += 3;
                    continue block24;
                }
                case 10: {
                    n2 = n4 + s.c(arrby, n4 + 1);
                    n3 = s.a((int[])object2, arrn2, n4, n2);
                    d2.a(n5);
                    d2.c(n3);
                    n4 += 5;
                    continue block24;
                }
                case 14: {
                    n9 = n4;
                    n4 = n4 + 4 - (n9 & 3);
                    d2.a(170);
                    d2.a((byte[])null, 0, (4 - d2.b % 4) % 4);
                    n2 = n9 + s.c(arrby, n4);
                    n3 = s.a((int[])object2, arrn2, n9, n2);
                    d2.c(n3);
                    n10 = s.c(arrby, n4 += 4);
                    d2.c(n10);
                    d2.c(s.c(arrby, (n4 += 4) - 4));
                    for (n10 = s.c((byte[])arrby, (int)(n4 += 4)) - n10 + 1; n10 > 0; --n10) {
                        n2 = n9 + s.c(arrby, n4);
                        n4 += 4;
                        n3 = s.a((int[])object2, arrn2, n9, n2);
                        d2.c(n3);
                    }
                    continue block24;
                }
                case 15: {
                    n9 = n4;
                    n4 = n4 + 4 - (n9 & 3);
                    d2.a(171);
                    d2.a((byte[])null, 0, (4 - d2.b % 4) % 4);
                    n2 = n9 + s.c(arrby, n4);
                    n3 = s.a((int[])object2, arrn2, n9, n2);
                    d2.c(n3);
                    n4 += 4;
                    d2.c(n10);
                    for (n10 = s.c((byte[])arrby, (int)(n4 += 4)); n10 > 0; --n10) {
                        d2.c(s.c(arrby, n4));
                        n2 = n9 + s.c(arrby, n4 += 4);
                        n4 += 4;
                        n3 = s.a((int[])object2, arrn2, n9, n2);
                        d2.c(n3);
                    }
                    continue block24;
                }
                case 17: {
                    n5 = arrby[n4 + 1] & 255;
                    if (n5 == 132) {
                        d2.a(arrby, n4, 6);
                        n4 += 6;
                        continue block24;
                    }
                    d2.a(arrby, n4, 4);
                    n4 += 4;
                    continue block24;
                }
                case 1: 
                case 3: 
                case 11: {
                    d2.a(arrby, n4, 2);
                    n4 += 2;
                    continue block24;
                }
                case 2: 
                case 5: 
                case 6: 
                case 12: 
                case 13: {
                    d2.a(arrby, n4, 3);
                    n4 += 3;
                    continue block24;
                }
                case 7: 
                case 8: {
                    d2.a(arrby, n4, 5);
                    n4 += 5;
                    continue block24;
                }
            }
            d2.a(arrby, n4, 4);
            n4 += 4;
        }
        if (this.ah == 0) {
            p p2 = this.ai;
            while (p2 != null) {
                n4 = p2.p - 3;
                if (n4 >= 0 && arrbl[n4]) {
                    p2.n |= 16;
                }
                s.a((int[])object2, arrn2, p2);
                p2 = p2.t;
            }
            if (this.l.ac != null) {
                for (n6 = 0; n6 < this.l.ac.length; ++n6) {
                    object = this.l.ac[n6];
                    if (object == null || object.b != 31) continue;
                    object.c = s.a((int[])object2, arrn2, 0, object.c);
                }
            }
        } else if (this.L > 0) {
            this.l.ak = true;
        }
        n n11 = this.R;
        while (n11 != null) {
            s.a((int[])object2, arrn2, n11.a);
            s.a((int[])object2, arrn2, n11.b);
            s.a((int[])object2, arrn2, n11.c);
            n11 = n11.f;
        }
        for (n6 = 0; n6 < 2; ++n6) {
            Object object3 = object = n6 == 0 ? this.W : this.Y;
            if (object == null) continue;
            arrby = object.a;
            for (n4 = 0; n4 < object.b; n4 += 10) {
                n2 = s.a(arrby, n4);
                n3 = s.a((int[])object2, arrn2, 0, n2);
                s.a(arrby, n4, n3);
                n3 = s.a((int[])object2, arrn2, 0, n2 += s.a(arrby, n4 + 2)) - n3;
                s.a(arrby, n4 + 2, n3);
            }
        }
        if (this.aa != null) {
            arrby = this.aa.a;
            for (n4 = 0; n4 < this.aa.b; n4 += 4) {
                s.a(arrby, n4, s.a((int[])object2, arrn2, 0, s.a(arrby, n4)));
            }
        }
        object = this.ae;
        while (object != null) {
            arrn = object.c();
            if (arrn != null) {
                for (n6 = arrn.length - 1; n6 >= 0; --n6) {
                    s.a((int[])object2, arrn2, (p)arrn[n6]);
                }
            }
            object = object.c;
        }
        this.H = d2;
    }

    static int a(byte[] arrby, int n2) {
        return (arrby[n2] & 255) << 8 | arrby[n2 + 1] & 255;
    }

    static short b(byte[] arrby, int n2) {
        return (short)((arrby[n2] & 255) << 8 | arrby[n2 + 1] & 255);
    }

    static int c(byte[] arrby, int n2) {
        return (arrby[n2] & 255) << 24 | (arrby[n2 + 1] & 255) << 16 | (arrby[n2 + 2] & 255) << 8 | arrby[n2 + 3] & 255;
    }

    static void a(byte[] arrby, int n2, int n3) {
        arrby[n2] = (byte)(n3 >>> 8);
        arrby[n2 + 1] = (byte)n3;
    }

    static int a(int[] arrn, int[] arrn2, int n2, int n3) {
        int n4 = n3 - n2;
        for (int i2 = 0; i2 < arrn.length; ++i2) {
            if (n2 < arrn[i2] && arrn[i2] <= n3) {
                n4 += arrn2[i2];
                continue;
            }
            if (n3 >= arrn[i2] || arrn[i2] > n2) continue;
            n4 -= arrn2[i2];
        }
        return n4;
    }

    static void a(int[] arrn, int[] arrn2, p p2) {
        if ((p2.n & 4) == 0) {
            p2.p = s.a(arrn, arrn2, 0, p2.p);
            p2.n |= 4;
        }
    }
}

