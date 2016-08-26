/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.d;

import com.growingio.d.a.d.a;
import com.growingio.d.a.d.o;
import com.growingio.d.a.r;
import java.util.Map;

public class d
extends a {
    public String w;
    public String x;
    public String y;

    public d(int n2, String string, String string2, String string3) {
        super(n2);
        this.w = string;
        this.x = string2;
        this.y = string3;
    }

    public void a(int n2) {
        this.q = n2;
    }

    @Override
    public int b() {
        return 4;
    }

    @Override
    public void a(r r2) {
        r2.b(this.q, this.w, this.x, this.y);
        this.b(r2);
    }

    @Override
    public a a(Map<o, o> map) {
        return new d(this.q, this.w, this.x, this.y).a(this);
    }
}

