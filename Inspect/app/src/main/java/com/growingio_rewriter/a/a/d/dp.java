/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.bG;
import com.growingio.a.a.d.aK;
import com.growingio.a.a.d.dq;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.d.mE;
import com.growingio.a.a.d.nB;
import com.growingio.a.a.d.nC;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class dp<R, C, V>
extends mE<R, C, V> {
    private static final long c = 0;

    public static <R, C, V> dp<R, C, V> k() {
        return new dp(new HashMap(), new dq(0));
    }

    public static <R, C, V> dp<R, C, V> a(int n2, int n3) {
        aK.a(n3, "expectedCellsPerRow");
        HashMap hashMap = ii.a(n2);
        return new dp(hashMap, new dq(n3));
    }

    public static <R, C, V> dp<R, C, V> b(nB<? extends R, ? extends C, ? extends V> nB2) {
        dp<R, C, V> dp2 = dp.k();
        dp2.a(nB2);
        return dp2;
    }

    dp(Map<R, Map<C, V>> map, dq<C, V> dq2) {
        super(map, dq2);
    }

    @Override
    public boolean a(Object object, Object object2) {
        return super.a(object, object2);
    }

    @Override
    public boolean b(Object object) {
        return super.b(object);
    }

    @Override
    public boolean a(Object object) {
        return super.a(object);
    }

    @Override
    public boolean c(Object object) {
        return super.c(object);
    }

    @Override
    public V b(Object object, Object object2) {
        return super.b(object, object2);
    }

    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }

    @Override
    public V c(Object object, Object object2) {
        return super.c(object, object2);
    }
}

