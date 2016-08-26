/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.R;
import com.growingio.a.a.b.aU;
import java.io.Serializable;

final class W<T>
extends R<T, T>
implements Serializable {
    static final W a = new W<T>();
    private static final long b = 0;

    private W() {
    }

    @Override
    protected T b(T t2) {
        return t2;
    }

    @Override
    protected T a(T t2) {
        return t2;
    }

    public W<T> c() {
        return this;
    }

    @Override
    <S> R<T, S> b(R<T, S> r2) {
        return aU.a(r2, (Object)"otherConverter");
    }

    public String toString() {
        return "Converter.identity()";
    }

    private Object d() {
        return a;
    }

    @Override
    public /* synthetic */ R a() {
        return this.c();
    }
}

