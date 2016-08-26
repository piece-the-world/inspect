/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.d;

import com.growingio.d.a.a;
import com.growingio.d.a.c;
import com.growingio.d.a.d.B;
import com.growingio.d.a.d.b;
import com.growingio.d.a.f;
import com.growingio.d.a.j;
import com.growingio.d.a.v;
import java.util.ArrayList;
import java.util.List;

public class e
extends j {
    public int c;
    public String d;
    public String e;
    public String f;
    public Object g;
    public List<b> h;
    public List<b> i;
    public List<B> j;
    public List<B> k;
    public List<c> l;

    public e(int n2, String string, String string2, String string3, Object object) {
        this(327680, n2, string, string2, string3, object);
        if (this.getClass() != e.class) {
            throw new IllegalStateException();
        }
    }

    public e(int n2, int n3, String string, String string2, String string3, Object object) {
        super(n2);
        this.c = n3;
        this.d = string;
        this.e = string2;
        this.f = string3;
        this.g = object;
    }

    @Override
    public a a(String string, boolean bl2) {
        b b2 = new b(string);
        if (bl2) {
            if (this.h == null) {
                this.h = new ArrayList<b>(1);
            }
            this.h.add(b2);
        } else {
            if (this.i == null) {
                this.i = new ArrayList<b>(1);
            }
            this.i.add(b2);
        }
        return b2;
    }

    @Override
    public a a(int n2, v v2, String string, boolean bl2) {
        B b2 = new B(n2, v2, string);
        if (bl2) {
            if (this.j == null) {
                this.j = new ArrayList<B>(1);
            }
            this.j.add(b2);
        } else {
            if (this.k == null) {
                this.k = new ArrayList<B>(1);
            }
            this.k.add(b2);
        }
        return b2;
    }

    @Override
    public void a(c c2) {
        if (this.l == null) {
            this.l = new ArrayList<c>(1);
        }
        this.l.add(c2);
    }

    @Override
    public void a() {
    }

    public void a(int n2) {
        if (n2 == 262144) {
            if (this.j != null && this.j.size() > 0) {
                throw new RuntimeException();
            }
            if (this.k != null && this.k.size() > 0) {
                throw new RuntimeException();
            }
        }
    }

    public void a(f f2) {
        int n2;
        b b2;
        j j2 = f2.a(this.c, this.d, this.e, this.f, this.g);
        if (j2 == null) {
            return;
        }
        int n3 = this.h == null ? 0 : this.h.size();
        for (n2 = 0; n2 < n3; ++n2) {
            b2 = this.h.get(n2);
            b2.a(j2.a(b2.a, true));
        }
        n3 = this.i == null ? 0 : this.i.size();
        for (n2 = 0; n2 < n3; ++n2) {
            b2 = this.i.get(n2);
            b2.a(j2.a(b2.a, false));
        }
        n3 = this.j == null ? 0 : this.j.size();
        for (n2 = 0; n2 < n3; ++n2) {
            b2 = this.j.get(n2);
            b2.a(j2.a(b2.h, b2.i, b2.a, true));
        }
        n3 = this.k == null ? 0 : this.k.size();
        for (n2 = 0; n2 < n3; ++n2) {
            b2 = this.k.get(n2);
            b2.a(j2.a(b2.h, b2.i, b2.a, false));
        }
        n3 = this.l == null ? 0 : this.l.size();
        for (n2 = 0; n2 < n3; ++n2) {
            j2.a(this.l.get(n2));
        }
        j2.a();
    }
}

