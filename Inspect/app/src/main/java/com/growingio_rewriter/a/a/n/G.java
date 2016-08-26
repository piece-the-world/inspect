/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.n;

import com.growingio.a.a.n.F;
import com.growingio.a.a.n.n;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

class G
extends n<T> {
    final /* synthetic */ F b;

    G(F f2, Method method) {
        this.b = f2;
        super(method);
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
        return this.a() + "." + super.toString();
    }
}

