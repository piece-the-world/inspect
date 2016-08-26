/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.d;

import com.growingio.d.a.a;
import com.growingio.d.a.d.B;
import com.growingio.d.a.d.o;
import com.growingio.d.a.p;
import com.growingio.d.a.r;
import com.growingio.d.a.v;
import java.util.List;

public class A {
    public o a;
    public o b;
    public o c;
    public String d;
    public List<B> e;
    public List<B> f;

    public A(o o2, o o3, o o4, String string) {
        this.a = o2;
        this.b = o3;
        this.c = o4;
        this.d = string;
    }

    public void a(int n2) {
        int n3 = 1107296256 | n2 << 8;
        if (this.e != null) {
            for (B b2 : this.e) {
                b2.h = n3;
            }
        }
        if (this.f != null) {
            for (B b2 : this.f) {
                b2.h = n3;
            }
        }
    }

    public void a(r r2) {
        B b2;
        int n2;
        r2.a(this.a.e(), this.b.e(), this.c == null ? null : this.c.e(), this.d);
        int n3 = this.e == null ? 0 : this.e.size();
        for (n2 = 0; n2 < n3; ++n2) {
            b2 = this.e.get(n2);
            b2.a(r2.c(b2.h, b2.i, b2.a, true));
        }
        n3 = this.f == null ? 0 : this.f.size();
        for (n2 = 0; n2 < n3; ++n2) {
            b2 = this.f.get(n2);
            b2.a(r2.c(b2.h, b2.i, b2.a, false));
        }
    }
}

