/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a.b;

import com.growingio.b.K;
import com.growingio.b.a.Q;
import com.growingio.b.a.T;
import com.growingio.b.a.b.b;
import com.growingio.b.a.b.c;
import com.growingio.b.a.b.d;
import com.growingio.b.a.b.e;
import com.growingio.b.a.b.f;
import com.growingio.b.a.b.g;
import com.growingio.b.a.b.h;
import com.growingio.b.a.b.i;
import com.growingio.b.a.b.j;
import com.growingio.b.a.b.k;
import com.growingio.b.a.b.l;
import com.growingio.b.a.b.m;
import com.growingio.b.a.b.n;
import com.growingio.b.a.b.p;
import com.growingio.b.a.b.r;
import com.growingio.b.a.b.s;
import com.growingio.b.a.b.t;
import com.growingio.b.ae;
import com.growingio.b.o;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class a {
    Q a;
    int b;
    LinkedHashMap c;

    public a(int n2, Q q2) {
        this.a = q2;
        this.b = n2;
        this.c = null;
    }

    public a(String string, Q q2) {
        this(q2.c(T.d(string)), q2);
    }

    public a(Q q2, o o2) throws ae {
        this(q2.c(T.d(o2.s())), q2);
        if (!o2.x()) {
            throw new RuntimeException("Only interfaces are allowed for Annotation creation.");
        }
        K[] arrk = o2.M();
        if (arrk.length > 0) {
            this.c = new LinkedHashMap();
        }
        for (int i2 = 0; i2 < arrk.length; ++i2) {
            o o3 = arrk[i2].p();
            this.a(arrk[i2].q(), a.a(q2, o3));
        }
    }

    public static p a(Q q2, o o2) throws ae {
        if (o2 == o.f) {
            return new g(q2);
        }
        if (o2 == o.h) {
            return new h(q2);
        }
        if (o2 == o.g) {
            return new i(q2);
        }
        if (o2 == o.i) {
            return new s(q2);
        }
        if (o2 == o.j) {
            return new n(q2);
        }
        if (o2 == o.k) {
            return new com.growingio.b.a.b.o(q2);
        }
        if (o2 == o.l) {
            return new m(q2);
        }
        if (o2 == o.m) {
            return new k(q2);
        }
        if (o2.s().equals("java.lang.Class")) {
            return new j(q2);
        }
        if (o2.s().equals("java.lang.String")) {
            return new t(q2);
        }
        if (o2.b()) {
            o o3 = o2.e();
            p p2 = a.a(q2, o3);
            return new f(p2, q2);
        }
        if (o2.x()) {
            a a2 = new a(q2, o2);
            return new d(a2, q2);
        }
        l l2 = new l(q2);
        l2.a(o2.s());
        return l2;
    }

    public void a(int n2, p p2) {
        b b2 = new b();
        b2.a = n2;
        b2.b = p2;
        this.a(b2);
    }

    public void a(String string, p p2) {
        b b2 = new b();
        b2.a = this.a.c(string);
        b2.b = p2;
        if (this.c == null) {
            this.c = new LinkedHashMap();
        }
        this.c.put(string, b2);
    }

    private void a(b b2) {
        String string = this.a.E(b2.a);
        if (this.c == null) {
            this.c = new LinkedHashMap();
        }
        this.c.put(string, b2);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("@");
        stringBuffer.append(this.a());
        if (this.c != null) {
            stringBuffer.append("(");
            Iterator iterator = this.c.keySet().iterator();
            while (iterator.hasNext()) {
                String string = (String)iterator.next();
                stringBuffer.append(string).append("=").append(this.a(string));
                if (!iterator.hasNext()) continue;
                stringBuffer.append(", ");
            }
            stringBuffer.append(")");
        }
        return stringBuffer.toString();
    }

    public String a() {
        return T.c(this.a.E(this.b));
    }

    public Set b() {
        if (this.c == null) {
            return null;
        }
        return this.c.keySet();
    }

    public p a(String string) {
        if (this.c == null) {
            return null;
        }
        b b2 = (b)this.c.get(string);
        if (b2 == null) {
            return null;
        }
        return b2.b;
    }

    public Object a(ClassLoader classLoader, com.growingio.b.g g2) throws ClassNotFoundException, r {
        return c.a(classLoader, p.a(classLoader, this.a()), g2, this);
    }

    public void a(e e2) throws IOException {
        String string = this.a.E(this.b);
        if (this.c == null) {
            e2.a(string, 0);
            return;
        }
        e2.a(string, this.c.size());
        for (b b2 : this.c.values()) {
            e2.c(b2.a);
            b2.b.a(e2);
        }
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null || !(object instanceof a)) {
            return false;
        }
        a a2 = (a)object;
        if (!this.a().equals(a2.a())) {
            return false;
        }
        LinkedHashMap linkedHashMap = a2.c;
        if (this.c == linkedHashMap) {
            return true;
        }
        if (this.c == null) {
            return linkedHashMap == null;
        }
        if (linkedHashMap == null) {
            return false;
        }
        return this.c.equals(linkedHashMap);
    }
}

