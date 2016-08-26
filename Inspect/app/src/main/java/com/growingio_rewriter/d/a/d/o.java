/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.d;

import com.growingio.d.a.d.a;
import com.growingio.d.a.p;
import com.growingio.d.a.r;
import java.util.Map;

public class o
extends a {
    private p w;

    public o() {
        super(-1);
    }

    public o(p p2) {
        super(-1);
        this.w = p2;
    }

    @Override
    public int b() {
        return 8;
    }

    public p e() {
        if (this.w == null) {
            this.w = new p();
        }
        return this.w;
    }

    @Override
    public void a(r r2) {
        r2.a(this.e());
    }

    @Override
    public a a(Map<o, o> map) {
        return map.get(this);
    }

    public void f() {
        this.w = null;
    }
}

