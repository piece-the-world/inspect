/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.cx;
import com.growingio.a.a.d.oI;
import com.growingio.a.a.d.oJ;
import com.growingio.a.a.d.oK;
import com.growingio.a.a.d.oM;
import com.growingio.a.a.d.oO;
import com.growingio.a.a.d.oP;

public abstract class oH<T> {
    public abstract Iterable<T> c(T var1);

    public final cx<T> g(T t2) {
        aU.a(t2);
        return new oI(this, t2);
    }

    oP<T> d(T t2) {
        return new oO(this, t2);
    }

    public final cx<T> h(T t2) {
        aU.a(t2);
        return new oJ(this, t2);
    }

    oP<T> e(T t2) {
        return new oM(this, t2);
    }

    public final cx<T> i(T t2) {
        aU.a(t2);
        return new oK(this, t2);
    }
}

