/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.k;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.k.w;
import com.growingio.a.a.k.y;
import com.growingio.a.a.k.z;
import com.growingio.a.a.m.q;
import java.util.Collection;

public final class x {
    private final int a;

    private x(int n2) {
        aU.a(n2 > 0, (Object)"Quantile scale must be positive");
        this.a = n2;
    }

    public y a(int n2) {
        return new y(this.a, n2, null);
    }

    public /* varargs */ z a(int ... arrn) {
        return new z(this.a, (int[])arrn.clone(), null);
    }

    public z a(Collection<Integer> collection) {
        return new z(this.a, q.a(collection), null);
    }

    /* synthetic */ x(int n2, w w2) {
        this(n2);
    }
}

