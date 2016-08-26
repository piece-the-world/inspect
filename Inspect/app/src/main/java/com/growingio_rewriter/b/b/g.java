/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.b;

import com.growingio.b.a.o;
import com.growingio.b.b.a.a;
import com.growingio.b.b.a.b;
import com.growingio.b.b.a.f;
import com.growingio.b.b.a.p;
import com.growingio.b.b.a.x;
import com.growingio.b.b.e;
import com.growingio.b.b.k;
import com.growingio.b.b.l;
import com.growingio.b.b.v;

class g
implements v {
    final /* synthetic */ String a;
    final /* synthetic */ b b;
    final /* synthetic */ com.growingio.b.b.f c;

    g(com.growingio.b.b.f f2, String string, b b2) {
        this.c = f2;
        this.a = string;
        this.b = b2;
    }

    @Override
    public void a(k k2, o o2, a a2) throws e {
        b b2 = new p(this.a);
        if (this.b != null) {
            b2 = com.growingio.b.b.a.k.b(46, this.b, b2);
        }
        b2 = f.b(b2, a2);
        k2.a(b2);
        k2.g();
    }

    @Override
    public void a(l l2, a a2) throws e {
        b b2 = new p(this.a);
        if (this.b != null) {
            b2 = com.growingio.b.b.a.k.b(46, this.b, b2);
        }
        b2 = f.b(b2, a2);
        b2.a(l2);
        l2.a();
    }
}

