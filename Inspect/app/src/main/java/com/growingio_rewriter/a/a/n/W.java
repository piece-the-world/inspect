/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.n;

import com.growingio.a.a.n.F;
import com.growingio.a.a.n.G;
import com.growingio.a.a.n.V;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;

final class W
extends V {
    W(String string2, int n3) {
        super(string, n2, null);
    }

    @Override
    public boolean a(F<?> f2) {
        return !(F.d(f2) instanceof TypeVariable) && !(F.d(f2) instanceof WildcardType);
    }
}

