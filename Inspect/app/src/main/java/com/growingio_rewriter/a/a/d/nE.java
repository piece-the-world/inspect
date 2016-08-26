/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aq;
import java.util.Collections;
import java.util.Map;

final class nE
implements aq<Map<Object, Object>, Map<Object, Object>> {
    nE() {
    }

    public Map<Object, Object> a(Map<Object, Object> map) {
        return Collections.unmodifiableMap(map);
    }

    @Override
    public /* synthetic */ Object f(Object object) {
        return this.a((Map)object);
    }
}

