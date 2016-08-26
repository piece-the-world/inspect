/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.b;

import com.growingio.b.a.o;
import com.growingio.b.b.a.a;
import com.growingio.b.b.a.b;
import com.growingio.b.b.e;
import com.growingio.b.b.f;
import com.growingio.b.b.k;
import com.growingio.b.b.l;
import com.growingio.b.b.v;

class i
implements v {
    final /* synthetic */ b a;
    final /* synthetic */ int b;
    final /* synthetic */ String c;
    final /* synthetic */ String d;
    final /* synthetic */ String e;
    final /* synthetic */ f f;

    i(f f2, b b2, int n2, String string, String string2, String string3) {
        this.f = f2;
        this.a = b2;
        this.b = n2;
        this.c = string;
        this.d = string2;
        this.e = string3;
    }

    @Override
    public void a(k k2, o o2, a a2) throws e {
        k2.a(this.a, this.b, this.c, a2);
    }

    @Override
    public void a(l l2, a a2) throws e {
        l2.a(this.a, this.d, this.e, this.c, a2);
    }
}

