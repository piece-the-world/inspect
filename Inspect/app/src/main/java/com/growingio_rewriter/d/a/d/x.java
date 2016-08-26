/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.d;

import com.growingio.d.a.d.a;
import com.growingio.d.a.d.o;
import com.growingio.d.a.r;
import java.util.Map;

public class x
extends a {
    public String w;
    public int x;

    public x(String string, int n2) {
        super(197);
        this.w = string;
        this.x = n2;
    }

    @Override
    public int b() {
        return 13;
    }

    @Override
    public void a(r r2) {
        r2.b(this.w, this.x);
        this.b(r2);
    }

    @Override
    public a a(Map<o, o> map) {
        return new x(this.w, this.x).a(this);
    }
}

