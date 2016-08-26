/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b;

import com.growingio.b.I;
import com.growingio.b.a.Q;
import com.growingio.b.a.T;
import com.growingio.b.a.a;
import com.growingio.b.a.aA;
import com.growingio.b.a.ac;
import com.growingio.b.a.c;
import com.growingio.b.a.h;
import com.growingio.b.a.p;
import com.growingio.b.ae;
import com.growingio.b.b;
import com.growingio.b.b.e;
import com.growingio.b.b.f;
import com.growingio.b.g;
import com.growingio.b.o;
import com.growingio.b.r;
import com.growingio.b.z;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

public class t
extends I {
    static final String a = "java.lang.String";
    protected ac b;

    public t(o o2, String string, o o3) throws b {
        this(T.b(o2), string, o3);
    }

    public t(t t2, o o2) throws b {
        this(t2.b.d(), t2.b.b(), o2);
        ListIterator listIterator = t2.b.f().listIterator();
        ac ac2 = this.b;
        ac2.a(t2.b.c());
        Q q2 = ac2.a();
        while (listIterator.hasNext()) {
            h h2 = (h)listIterator.next();
            ac2.a(h2.a(q2, null));
        }
    }

    private t(String string, String string2, o o2) throws b {
        super(o2);
        p p2 = o2.j();
        if (p2 == null) {
            throw new b("bad declaring class: " + o2.s());
        }
        this.b = new ac(p2.c(), string2, string);
    }

    t(ac ac2, o o2) {
        super(o2);
        this.b = ac2;
    }

    @Override
    public String toString() {
        return this.r_().s() + "." + this.q() + ":" + this.b.d();
    }

    @Override
    protected void a(StringBuffer stringBuffer) {
        stringBuffer.append(' ');
        stringBuffer.append(this.q());
        stringBuffer.append(' ');
        stringBuffer.append(this.b.d());
    }

    protected com.growingio.b.b.a.b a() {
        return null;
    }

    z b() {
        com.growingio.b.b.a.b b2 = this.a();
        if (b2 == null) {
            return null;
        }
        return z.a(b2);
    }

    public static t a(String string, o o2) throws b {
        f f2 = new f(o2);
        try {
            I i2 = f2.a(string);
            if (i2 instanceof t) {
                return (t)i2;
            }
        }
        catch (e var3_4) {
            throw new b(var3_4);
        }
        throw new b("not a field");
    }

    public ac c() {
        this.d.p();
        return this.b;
    }

    public ac g() {
        return this.b;
    }

    @Override
    public o r_() {
        return super.r_();
    }

    @Override
    public String q() {
        return this.b.b();
    }

    public void c(String string) {
        this.d.p();
        this.b.a(string);
    }

    @Override
    public int d() {
        return a.j(this.b.c());
    }

    @Override
    public void a(int n2) {
        this.d.p();
        this.b.a(a.i(n2));
    }

    @Override
    public boolean a(String string) {
        ac ac2 = this.g();
        c c2 = (c)ac2.c("RuntimeInvisibleAnnotations");
        c c3 = (c)ac2.c("RuntimeVisibleAnnotations");
        return r.a(string, this.r_().a(), c2, c3);
    }

    @Override
    public Object a(Class class_) throws ClassNotFoundException {
        ac ac2 = this.g();
        c c2 = (c)ac2.c("RuntimeInvisibleAnnotations");
        c c3 = (c)ac2.c("RuntimeVisibleAnnotations");
        return r.b(class_, this.r_().a(), c2, c3);
    }

    @Override
    public Object[] e() throws ClassNotFoundException {
        return this.a(false);
    }

    @Override
    public Object[] f() {
        try {
            return this.a(true);
        }
        catch (ClassNotFoundException var1_1) {
            throw new RuntimeException("Unexpected exception", var1_1);
        }
    }

    private Object[] a(boolean bl2) throws ClassNotFoundException {
        ac ac2 = this.g();
        c c2 = (c)ac2.c("RuntimeInvisibleAnnotations");
        c c3 = (c)ac2.c("RuntimeVisibleAnnotations");
        return r.a(bl2, this.r_().a(), c2, c3);
    }

    @Override
    public String k() {
        return this.b.d();
    }

    @Override
    public String l() {
        aA aA2 = (aA)this.b.c("Signature");
        return aA2 == null ? null : aA2.a();
    }

    @Override
    public void b(String string) {
        this.d.p();
        this.b.a(new aA(this.b.a(), string));
    }

    public o i() throws ae {
        return T.c(this.b.d(), this.d.a());
    }

    public void a(o o2) {
        this.d.p();
        this.b.b(T.b(o2));
    }

    public Object j() {
        int n2 = this.b.e();
        if (n2 == 0) {
            return null;
        }
        Q q2 = this.b.a();
        switch (q2.c(n2)) {
            case 5: {
                return new Long(q2.B(n2));
            }
            case 4: {
                return new Float(q2.A(n2));
            }
            case 6: {
                return new Double(q2.C(n2));
            }
            case 3: {
                int n3 = q2.z(n2);
                if ("Z".equals(this.b.d())) {
                    return new Boolean(n3 != 0);
                }
                return new Integer(n3);
            }
            case 8: {
                return q2.D(n2);
            }
        }
        throw new RuntimeException("bad tag: " + q2.c(n2) + " at " + n2);
    }

    @Override
    public byte[] d(String string) {
        h h2 = this.b.c(string);
        if (h2 == null) {
            return null;
        }
        return h2.f();
    }

    @Override
    public void a(String string, byte[] arrby) {
        this.d.p();
        this.b.a(new h(this.b.a(), string, arrby));
    }
}

