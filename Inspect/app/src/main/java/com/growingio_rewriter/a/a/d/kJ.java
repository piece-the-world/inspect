/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.kH;
import java.io.Serializable;
import java.util.Map;

final class kJ<B>
implements Serializable {
    private final Map<Class<? extends B>, B> a;
    private static final long b = 0;

    kJ(Map<Class<? extends B>, B> map) {
        this.a = map;
    }

    Object a() {
        return kH.a(this.a);
    }
}

