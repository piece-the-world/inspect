/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.n;

import com.growingio.a.a.b.aC;
import com.growingio.a.a.n.F;
import com.growingio.a.a.n.m;
import java.lang.reflect.Constructor;
import java.lang.reflect.Type;

class H
extends m<T> {
    final /* synthetic */ F b;

    H(F f2, Constructor constructor) {
        this.b = f2;
        super(constructor);
    }

    @Override
    Type u() {
        return this.b.b(super.u()).c();
    }

    @Override
    Type[] r() {
        return F.a(this.b, super.r());
    }

    @Override
    Type[] s() {
        return F.a(this.b, super.s());
    }

    @Override
    public F<T> a() {
        return this.b;
    }

    @Override
    public String toString() {
        return this.a() + "(" + aC.a(", ").a(this.r()) + ")";
    }
}

