/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.b.b;

import com.growingio.e.b.b.a;
import java.util.HashMap;
import java.util.Map;

class b
extends InheritableThreadLocal<Map<String, String>> {
    final /* synthetic */ a a;

    b(a a2) {
        this.a = a2;
    }

    protected Map<String, String> a(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        return new HashMap<String, String>(map);
    }

    @Override
    protected /* synthetic */ Object childValue(Object object) {
        return this.a((Map)object);
    }
}

