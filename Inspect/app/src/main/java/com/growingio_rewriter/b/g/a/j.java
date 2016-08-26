/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.g.a;

import com.growingio.b.K;
import com.growingio.b.L;
import com.growingio.b.R;
import com.growingio.b.a.as;
import com.growingio.b.a.i;
import com.growingio.b.a.p;
import com.growingio.b.ad;
import com.growingio.b.ae;
import com.growingio.b.aj;
import com.growingio.b.b;
import com.growingio.b.g;
import com.growingio.b.g.a.c;
import com.growingio.b.o;
import com.growingio.b.t;
import com.growingio.b.z;
import java.util.List;

public class j
implements aj {
    static final String a = "_classobject";
    static final String b = "_getClass";
    static final String c = "_metaobject";
    static final String d = "_getMetaobject";
    static final String e = "_setMetaobject";
    static final String f = "_r_";
    static final String g = "_w_";
    static final String h = "Metaobject";
    static final String i = "ClassMetaobject";
    protected K j;
    protected K k;
    protected K l;
    protected K m;
    protected o[] n;
    protected g o = null;
    protected com.growingio.b.j p = new com.growingio.b.j();

    private boolean a(String string) {
        return string.startsWith("_m_") || string.equals("_getClass") || string.equals("_setMetaobject") || string.equals("_getMetaobject") || string.startsWith("_r_") || string.startsWith("_w_");
    }

    @Override
    public void a(g g2) throws ae {
        this.o = g2;
        String string = "Sample is not found or broken.";
        try {
            o o2 = this.o.f("Sample");
            this.a(o2.i());
            this.j = o2.h("trap");
            this.k = o2.h("trapStatic");
            this.l = o2.h("trapRead");
            this.m = o2.h("trapWrite");
            this.n = new o[]{this.o.f("java.lang.Object")};
        }
        catch (ae var3_4) {
            throw new RuntimeException("Sample is not found or broken.");
        }
        catch (i var3_5) {
            throw new RuntimeException("Sample is not found or broken.");
        }
    }

    @Override
    public void a(g g2, String string) throws b, ae {
        o o2 = g2.f(string);
        o2.a(this.p);
    }

    public boolean a(String string, String string2, String string3) throws b, ae {
        return this.a(this.o.f(string), this.o.f(string2), this.o.f(string3));
    }

    public boolean a(Class class_, Class class_2, Class class_3) throws b, ae {
        return this.a(class_.getName(), class_2.getName(), class_3.getName());
    }

    public boolean a(o o2, o o3, o o4) throws b, c, ae {
        if (o2.x()) {
            throw new c("Cannot reflect an interface: " + o2.s());
        }
        if (o2.b(this.o.f("ClassMetaobject"))) {
            throw new c("Cannot reflect a subclass of ClassMetaobject: " + o2.s());
        }
        if (o2.b(this.o.f("Metaobject"))) {
            throw new c("Cannot reflect a subclass of Metaobject: " + o2.s());
        }
        this.a(o2);
        return this.b(o2, o3, o4);
    }

    private void a(o o2) {
        t[] arrt = o2.I();
        for (int i2 = 0; i2 < arrt.length; ++i2) {
            t t2 = arrt[i2];
            int n2 = t2.d();
            if ((n2 & 1) == 0 || (n2 & 16) != 0) continue;
            String string = t2.q();
            this.p.b(t2, o2, "_r_" + string);
            this.p.c(t2, o2, "_w_" + string);
        }
    }

    private boolean b(o o2, o o3, o o4) throws b, ae {
        boolean bl2;
        t t2;
        if (o2.i("Reflective") != null) {
            return false;
        }
        o2.a("Reflective", new byte[0]);
        o o5 = this.o.f("Metalevel");
        boolean bl3 = bl2 = !o2.a(o5);
        if (bl2) {
            o2.d(o5);
        }
        this.a(o2, bl2);
        this.b(o2);
        if (bl2) {
            t2 = new t(this.o.f("Metaobject"), "_metaobject", o2);
            t2.a(4);
            o2.a(t2, z.b(o3));
            o2.a(R.a("_getMetaobject", t2));
            o2.a(R.b("_setMetaobject", t2));
        }
        t2 = new t(this.o.f("ClassMetaobject"), "_classobject", o2);
        t2.a(10);
        o2.a(t2, z.a(o4, new String[]{o2.s()}));
        o2.a(R.a("_getClass", t2));
        return true;
    }

    private void a(o o2, boolean bl2) throws b, ae {
        K[] arrk = o2.g();
        for (int i2 = 0; i2 < arrk.length; ++i2) {
            K k2 = arrk[i2];
            int n2 = k2.d();
            if (!ad.a(n2) || ad.n(n2)) continue;
            this.a(n2, o2, k2, i2, bl2);
        }
    }

    private void a(int n2, o o2, K k2, int n3, boolean bl2) throws b, ae {
        K k3;
        String string = k2.q();
        if (this.a(string)) {
            return;
        }
        if (k2.r_() == o2) {
            if (ad.j(n2)) {
                return;
            }
            k3 = k2;
            if (ad.f(n2)) {
                k3.a(n2 &= -17);
            }
        } else {
            if (ad.f(n2)) {
                return;
            }
            k3 = R.a(this.a(k2, bl2), o2);
            k3.a(n2 &= -257);
            o2.a(k3);
        }
        k3.h("_m_" + n3 + "_" + string);
        K k4 = ad.e(n2) ? this.k : this.j;
        K k5 = R.a(k2.p(), string, k2.i(), k2.m(), k4, L.a(n3), o2);
        k5.a(n2);
        o2.a(k5);
    }

    private K a(K k2, boolean bl2) throws ae {
        if (bl2) {
            return k2;
        }
        String string = k2.q();
        K[] arrk = k2.r_().M();
        for (int i2 = 0; i2 < arrk.length; ++i2) {
            String string2 = arrk[i2].q();
            if (!string2.endsWith(string) || !string2.startsWith("_m_") || !arrk[i2].k().equals(k2.k())) continue;
            return arrk[i2];
        }
        return k2;
    }

    private void b(o o2) throws b, ae {
        t[] arrt = o2.I();
        for (int i2 = 0; i2 < arrt.length; ++i2) {
            t t2 = arrt[i2];
            int n2 = t2.d();
            if ((n2 & 1) == 0 || (n2 & 16) != 0) continue;
            String string = t2.q();
            o o3 = t2.i();
            K k2 = R.a(o3, "_r_" + string, this.n, null, this.l, L.a(string), o2);
            k2.a(n2 |= 8);
            o2.a(k2);
            o[] arro = new o[]{this.o.f("java.lang.Object"), o3};
            k2 = R.a(o.n, "_w_" + string, arro, null, this.m, L.a(string), o2);
            k2.a(n2);
            o2.a(k2);
        }
    }

    public void a(p p2) throws i {
        if (p.v < 50) {
            return;
        }
        for (as as2 : p2.n()) {
            as2.a(this.o);
        }
    }
}

