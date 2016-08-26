/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.iA;
import com.growingio.a.a.d.ij;
import java.util.Map;

final class iB
extends iA {
    iB(String string2, int n3) {
        super(string, n2, null);
    }

    public Object a(Map.Entry<?, ?> entry) {
        return entry.getKey();
    }

    @Override
    public /* synthetic */ Object f(Object object) {
        return this.a((Map.Entry)object);
    }
}

