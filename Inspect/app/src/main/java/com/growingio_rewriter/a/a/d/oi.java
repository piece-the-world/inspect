/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.kW;
import com.growingio.a.a.d.lb;
import java.util.Collections;
import java.util.Map;
import java.util.NoSuchElementException;

final class oi
implements lb {
    oi() {
    }

    public Object a(Comparable comparable) {
        return null;
    }

    public Map.Entry<kW, Object> b(Comparable comparable) {
        return null;
    }

    public kW c() {
        throw new NoSuchElementException();
    }

    public void b(kW kW2, Object object) {
        aU.a(kW2);
        throw new IllegalArgumentException("Cannot insert range " + kW2 + " into an empty subRangeMap");
    }

    public void b(lb lb2) {
        if (!lb2.i().isEmpty()) {
            throw new IllegalArgumentException("Cannot putAll(nonEmptyRangeMap) into an empty subRangeMap");
        }
    }

    @Override
    public void d() {
    }

    public void a(kW kW2) {
        aU.a(kW2);
    }

    public Map<kW, Object> i() {
        return Collections.emptyMap();
    }

    public Map<kW, Object> h() {
        return Collections.emptyMap();
    }

    public lb c(kW kW2) {
        aU.a(kW2);
        return this;
    }
}

