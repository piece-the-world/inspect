/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.bG;
import java.util.LinkedList;
import java.util.List;

final class jB
extends Enum<jB>
implements bG<List<Object>> {
    public static final /* enum */ jB a = new jB();
    private static final /* synthetic */ jB[] b;

    public static jB[] b() {
        return (jB[])b.clone();
    }

    public static jB a(String string) {
        return (jB)Enum.valueOf(jB.class, string);
    }

    private jB() {
        super(string, n2);
    }

    public static <V> bG<List<V>> c() {
        jB jB2 = a;
        return jB2;
    }

    public List<Object> d() {
        return new LinkedList<Object>();
    }

    @Override
    public /* synthetic */ Object a() {
        return this.d();
    }

    static {
        b = new jB[]{a};
    }
}

