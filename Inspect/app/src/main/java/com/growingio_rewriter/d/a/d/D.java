/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.d;

import com.growingio.d.a.d.a;
import com.growingio.d.a.d.o;
import com.growingio.d.a.r;
import java.util.Map;

public class D
extends a {
    public int w;

    public D(int n2, int n3) {
        super(n2);
        this.w = n3;
    }

    public void a(int n2) {
        this.q = n2;
    }

    @Override
    public int b() {
        return 2;
    }

    @Override
    public void a(r r2) {
        r2.b(this.q, this.w);
        this.b(r2);
    }

    @Override
    public a a(Map<o, o> map) {
        return new D(this.q, this.w).a(this);
    }
}

