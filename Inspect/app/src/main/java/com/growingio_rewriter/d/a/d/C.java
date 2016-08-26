/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.d;

import com.growingio.d.a.d.a;
import com.growingio.d.a.d.o;
import com.growingio.d.a.r;
import java.util.Map;

public class C
extends a {
    public String w;

    public C(int n2, String string) {
        super(n2);
        this.w = string;
    }

    public void a(int n2) {
        this.q = n2;
    }

    @Override
    public int b() {
        return 3;
    }

    @Override
    public void a(r r2) {
        r2.a(this.q, this.w);
        this.b(r2);
    }

    @Override
    public a a(Map<o, o> map) {
        return new C(this.q, this.w).a(this);
    }
}

