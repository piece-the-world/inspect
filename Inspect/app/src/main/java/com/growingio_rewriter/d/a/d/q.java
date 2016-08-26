/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.d;

import com.growingio.d.a.d.a;
import com.growingio.d.a.d.o;
import com.growingio.d.a.p;
import com.growingio.d.a.r;
import java.util.Map;

public class q
extends a {
    public int w;
    public o x;

    public q(int n2, o o2) {
        super(-1);
        this.w = n2;
        this.x = o2;
    }

    @Override
    public int b() {
        return 15;
    }

    @Override
    public void a(r r2) {
        r2.b(this.w, this.x.e());
    }

    @Override
    public a a(Map<o, o> map) {
        return new q(this.w, q.a(this.x, map));
    }
}

