/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.d;

import com.growingio.b.V;
import com.growingio.b.a.B;
import com.growingio.b.a.F;
import com.growingio.b.a.Q;
import com.growingio.b.a.Z;
import com.growingio.b.a.ab;
import com.growingio.b.a.as;
import com.growingio.b.a.ay;
import com.growingio.b.a.h;
import com.growingio.b.a.i;
import com.growingio.b.a.p;
import com.growingio.b.a.y;
import com.growingio.b.ae;
import com.growingio.b.b;
import com.growingio.b.d.e;
import com.growingio.b.d.f;
import com.growingio.b.g;
import com.growingio.b.n;
import com.growingio.b.o;
import com.growingio.b.s;
import java.util.Iterator;
import java.util.LinkedList;

public abstract class d
implements ay {
    int a;
    B b;
    o c;
    as d;
    boolean e;
    int di;
    int dj;
    static final String dk = "java.lang.Object";

    protected d(int n2, B b2, o o2, as as2) {
        this.a = n2;
        this.b = b2;
        this.c = o2;
        this.d = as2;
    }

    public o i() {
        return this.c;
    }

    protected final Q j() {
        return this.d.c();
    }

    protected final boolean k() {
        return this.e;
    }

    protected final int l() {
        return this.di;
    }

    protected final int m() {
        return this.dj;
    }

    protected final boolean n() {
        return (this.d.f() & 8) != 0;
    }

    public n a() {
        as as2 = this.d;
        n[] arrn = this.c.J();
        for (int i2 = arrn.length - 1; i2 >= 0; --i2) {
            if (arrn[i2].c() != as2) continue;
            return arrn[i2];
        }
        s s2 = this.c.L();
        if (s2 != null && s2.c() == as2) {
            return s2;
        }
        for (int i3 = arrn.length - 1; i3 >= 0; --i3) {
            if (!this.d.a().equals(arrn[i3].c().a()) || !this.d.g().equals(arrn[i3].c().g())) continue;
            return arrn[i3];
        }
        throw new RuntimeException("fatal: not found");
    }

    public o[] e() {
        int n2;
        h h22;
        int n3;
        String[] arrstring;
        g g2 = this.c.a();
        Q q2 = this.d.c();
        LinkedList linkedList = new LinkedList();
        try {
            h h22 = this.d.j();
            arrstring = h22.l();
            n2 = this.a;
            n3 = arrstring.a();
            for (int i2 = 0; i2 < n3; ++i2) {
                int n4;
                if (arrstring.a(i2) > n2 || n2 >= arrstring.b(i2) || (n4 = arrstring.d(i2)) <= 0) continue;
                try {
                    d.a(linkedList, g2.f(q2.d(n4)));
                    continue;
                }
                catch (ae var10_12) {
                    // empty catch block
                }
            }
        }
        catch (NullPointerException var4_5) {
            // empty catch block
        }
        if ((h22 = this.d.i()) != null && (arrstring = h22.b()) != null) {
            n2 = arrstring.length;
            for (n3 = 0; n3 < n2; ++n3) {
                try {
                    d.a(linkedList, g2.f(arrstring[n3]));
                    continue;
                }
                catch (ae var8_10) {
                    // empty catch block
                }
            }
        }
        return linkedList.toArray(new o[linkedList.size()]);
    }

    private static void a(LinkedList linkedList, o o2) {
        Iterator iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() != o2) continue;
            return;
        }
        linkedList.add(o2);
    }

    public int o() {
        return this.a;
    }

    public int b() {
        return this.d.b(this.a);
    }

    public String c() {
        p p2 = this.c.j();
        if (p2 == null) {
            return null;
        }
        return p2.q();
    }

    static final boolean a(o o2, String string) throws b {
        boolean bl2;
        boolean bl3 = bl2 = string.indexOf("$_") >= 0;
        if (!bl2 && o2 != o.n) {
            throw new b("the resulting value is not stored in $_");
        }
        return bl2;
    }

    static final void a(o[] arro, boolean bl2, int n2, com.growingio.b.a.o o2) {
        d.a(0, arro.length, arro, n2 + 1, o2);
        if (bl2) {
            o2.j(1);
        }
        o2.o(n2);
    }

    private static void a(int n2, int n3, o[] arro, int n4, com.growingio.b.a.o o2) {
        if (n2 >= n3) {
            return;
        }
        o o3 = arro[n2];
        int n5 = o3 instanceof V ? ((V)o3).ad() : 1;
        d.a(n2 + 1, n3, arro, n4 + n5, o2);
        o2.b(n4, o3);
    }

    public abstract void a(String var1) throws b;

    public void a(String string, e e2) throws b {
        this.a(string);
        if (e2 != null) {
            this.a(e2, this.b);
        }
    }

    protected void a(int n2, com.growingio.b.a.o o2, int n3) throws i {
        byte[] arrby = o2.g();
        this.e = true;
        int n4 = arrby.length - n3;
        for (int i2 = 0; i2 < n3; ++i2) {
            this.b.a(0, n2 + i2);
        }
        if (n4 > 0) {
            n2 = this.b.a((int)n2, (int)n4, (boolean)false).a;
        }
        this.b.a(arrby, n2);
        this.b.a(o2.d(), n2);
        this.di = o2.i();
        this.dj = o2.h();
    }

    protected void a(e e2, B b2) throws b {
        y y2 = b2.c();
        int n2 = y2.h();
        int n3 = y2.b();
        int n4 = this.l();
        y2.a(this.m());
        y2.b(n4);
        f f2 = new f(n4);
        int n5 = b2.d();
        int n6 = b2.g();
        b2.a(this.a);
        if (e2.a(this.c, this.d, f2, b2, n6)) {
            this.e = true;
        }
        b2.a(n6 + b2.d() - n5);
        y2.b(n2);
        y2.a(n3);
        this.di = f2.b;
        this.dj += f2.c;
    }
}

