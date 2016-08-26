/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.b.a;

import com.growingio.b.b.a.a;
import com.growingio.b.b.a.b;
import com.growingio.b.b.a.x;
import com.growingio.b.b.e;
import com.growingio.b.b.z;

public class t
extends a
implements z {
    protected int a;

    public t(int n2, b b2, a a2) {
        super(b2, a2);
        this.a = n2;
    }

    public t(int n2, b b2) {
        super(b2);
        this.a = n2;
    }

    public t(int n2) {
        this(n2, null);
    }

    public static t a(int n2, b b2, b b3) {
        return new t(n2, b2, new a(b3));
    }

    public static t a(int n2, b b2, b b3, b b4) {
        return new t(n2, b2, new a(b3, new a(b4)));
    }

    @Override
    public void a(x x2) throws e {
        x2.a(this);
    }

    public int g() {
        return this.a;
    }

    @Override
    protected String f() {
        if (this.a < 128) {
            return "stmnt:" + (char)this.a;
        }
        return "stmnt:" + this.a;
    }
}

