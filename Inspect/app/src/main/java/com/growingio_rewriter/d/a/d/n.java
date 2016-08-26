/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.d;

import com.growingio.d.a.d.a;
import com.growingio.d.a.d.o;
import com.growingio.d.a.p;
import com.growingio.d.a.r;
import java.util.Map;

public class n
extends a {
    public o w;

    public n(int n2, o o2) {
        super(n2);
        this.w = o2;
    }

    public void a(int n2) {
        this.q = n2;
    }

    @Override
    public int b() {
        return 7;
    }

    @Override
    public void a(r r2) {
        r2.a(this.q, this.w.e());
        this.b(r2);
    }

    @Override
    public a a(Map<o, o> map) {
        return new n(this.q, n.a(this.w, map)).a(this);
    }
}

