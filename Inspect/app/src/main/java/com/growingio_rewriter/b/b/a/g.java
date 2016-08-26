/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.b.a;

import com.growingio.b.b.a.a;
import com.growingio.b.b.a.b;
import com.growingio.b.b.a.x;
import com.growingio.b.b.e;
import com.growingio.b.b.z;

public class g
extends a
implements z {
    protected int a;
    protected int b;

    public g(a a2, int n2, b b2) {
        super(a2, new a(b2));
        this.a = 307;
        this.b = n2;
    }

    public g(int n2, int n3, b b2) {
        super(null, new a(b2));
        this.a = n2;
        this.b = n3;
    }

    public int g() {
        return this.a;
    }

    public int h() {
        return this.b;
    }

    public a i() {
        return (a)this.a();
    }

    public b j() {
        return this.b().a();
    }

    public void d(b b2) {
        this.b().a(b2);
    }

    @Override
    public String f() {
        return "cast:" + this.a + ":" + this.b;
    }

    @Override
    public void a(x x2) throws e {
        x2.a(this);
    }
}

