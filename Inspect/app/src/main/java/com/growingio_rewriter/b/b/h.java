/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.b;

import com.growingio.b.a.o;
import com.growingio.b.b.a.a;
import com.growingio.b.b.a.b;
import com.growingio.b.b.a.f;
import com.growingio.b.b.a.p;
import com.growingio.b.b.a.v;
import com.growingio.b.b.a.x;
import com.growingio.b.b.e;
import com.growingio.b.b.k;
import com.growingio.b.b.l;

class h
implements com.growingio.b.b.v {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ com.growingio.b.b.f c;

    h(com.growingio.b.b.f f2, String string, String string2) {
        this.c = f2;
        this.a = string;
        this.b = string2;
    }

    @Override
    public void a(k k2, o o2, a a2) throws e {
        com.growingio.b.b.a.k k3 = com.growingio.b.b.a.k.b(35, new v(this.a), new p(this.b));
        k3 = f.b(k3, a2);
        k2.a((b)k3);
        k2.g();
    }

    @Override
    public void a(l l2, a a2) throws e {
        com.growingio.b.b.a.k k2 = com.growingio.b.b.a.k.b(35, new v(this.a), new p(this.b));
        k2 = f.b(k2, a2);
        k2.a(l2);
        l2.a();
    }
}

