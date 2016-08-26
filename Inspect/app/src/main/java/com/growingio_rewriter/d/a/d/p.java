/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.d;

import com.growingio.d.a.d.a;
import com.growingio.d.a.d.o;
import com.growingio.d.a.r;
import java.util.Map;

public class p
extends a {
    public Object w;

    public p(Object object) {
        super(18);
        this.w = object;
    }

    @Override
    public int b() {
        return 9;
    }

    @Override
    public void a(r r2) {
        r2.a(this.w);
        this.b(r2);
    }

    @Override
    public a a(Map<o, o> map) {
        return new p(this.w).a(this);
    }
}

