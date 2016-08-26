/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.aJ;
import com.growingio.a.a.d.cN;
import com.growingio.a.a.d.dO;
import com.growingio.a.a.d.dP;
import com.growingio.a.a.d.ei;
import java.io.Serializable;
import java.util.Map;

public final class dN<B>
extends cN<Class<? extends B>, B>
implements aJ<B>,
Serializable {
    private static final dN<Object> a = new dN(ei.i());
    private final ei<Class<? extends B>, B> b;

    public static <B> dN<B> b() {
        return a;
    }

    public static <B, T extends B> dN<B> b(Class<T> class_, T t2) {
        ei<Class<T>, T> ei2 = ei.c(class_, t2);
        return new dN<T>(ei2);
    }

    public static <B> dP<B> c() {
        return new dP();
    }

    public static <B, S extends B> dN<B> a(Map<? extends Class<? extends S>, ? extends S> map) {
        if (map instanceof dN) {
            dN dN2 = (dN)map;
            return dN2;
        }
        return new dP().a(map).a();
    }

    private dN(ei<Class<? extends B>, B> ei2) {
        this.b = ei2;
    }

    @Override
    protected Map<Class<? extends B>, B> a() {
        return this.b;
    }

    @Override
    public <T extends B> T a(Class<T> class_) {
        return (T)this.b.get(aU.a(class_));
    }

    @Override
    public <T extends B> T a(Class<T> class_, T t2) {
        throw new UnsupportedOperationException();
    }

    Object d() {
        return this.isEmpty() ? dN.b() : this;
    }

    @Override
    protected /* synthetic */ Object g() {
        return this.a();
    }

    /* synthetic */ dN(ei ei2, dO dO2) {
        this(ei2);
    }
}

