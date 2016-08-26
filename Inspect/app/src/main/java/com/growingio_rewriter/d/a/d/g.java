/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.d;

import com.growingio.d.a.d.a;
import com.growingio.d.a.d.o;
import com.growingio.d.a.r;
import java.util.Map;

public class g
extends a {
    public int w;
    public int x;

    public g(int n2, int n3) {
        super(132);
        this.w = n2;
        this.x = n3;
    }

    @Override
    public int b() {
        return 10;
    }

    @Override
    public void a(r r2) {
        r2.c(this.w, this.x);
        this.b(r2);
    }

    @Override
    public a a(Map<o, o> map) {
        return new g(this.w, this.x).a(this);
    }
}

