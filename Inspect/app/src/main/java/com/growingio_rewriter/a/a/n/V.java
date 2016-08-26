/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.n;

import com.growingio.a.a.b.aV;
import com.growingio.a.a.n.F;
import com.growingio.a.a.n.G;
import com.growingio.a.a.n.W;
import com.growingio.a.a.n.X;

abstract class V
extends Enum<V>
implements aV<F<?>> {
    public static final /* enum */ V a = new W("IGNORE_TYPE_VARIABLE_OR_WILDCARD", 0);
    public static final /* enum */ V b = new X("INTERFACE_ONLY", 1);
    private static final /* synthetic */ V[] c;

    public static V[] a() {
        return (V[])c.clone();
    }

    public static V a(String string) {
        return (V)Enum.valueOf(V.class, string);
    }

    private V() {
        super(string, n2);
    }

    /* synthetic */ V(String string, int n2, G g2) {
        this();
    }

    static {
        c = new V[]{a, b};
    }
}

