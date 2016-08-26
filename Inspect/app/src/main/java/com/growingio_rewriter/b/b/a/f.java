/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.b.a;

import com.growingio.b.b.a.a;
import com.growingio.b.b.a.b;
import com.growingio.b.b.a.k;
import com.growingio.b.b.a.x;
import com.growingio.b.b.e;
import com.growingio.b.b.s;

public class f
extends k {
    private s b = null;

    private f(b b2, a a2) {
        super(67, b2, a2);
    }

    public void a(s s2) {
        this.b = s2;
    }

    public s g() {
        return this.b;
    }

    public static f b(b b2, b b3) {
        return new f(b2, new a(b3));
    }

    @Override
    public void a(x x2) throws e {
        x2.a(this);
    }
}

