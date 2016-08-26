/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.d;

import com.growingio.b.K;
import com.growingio.b.a.B;
import com.growingio.b.a.as;
import com.growingio.b.ae;
import com.growingio.b.d.n;
import com.growingio.b.o;
import com.growingio.b.s;

public class c
extends n {
    protected c(int n2, B b2, o o2, as as2) {
        super(n2, b2, o2, as2);
    }

    @Override
    public String d() {
        return this.h() ? "super" : "this";
    }

    @Override
    public K f() throws ae {
        throw new ae("this is a constructor call.  Call getConstructor().");
    }

    public s g() throws ae {
        return this.p().f(this.r());
    }

    @Override
    public boolean h() {
        return super.h();
    }
}

