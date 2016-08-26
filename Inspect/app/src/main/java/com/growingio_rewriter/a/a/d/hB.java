/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.hg;

final class hB
extends Enum<hB>
implements hg<Object, Object> {
    public static final /* enum */ hB a = new hB();
    private static final /* synthetic */ hB[] b;

    public static hB[] a() {
        return (hB[])b.clone();
    }

    public static hB a(String string) {
        return (hB)Enum.valueOf(hB.class, string);
    }

    private hB() {
        super(string, n2);
    }

    @Override
    public void a(Object object, Object object2) {
        aU.a(object);
        aU.a(object2);
    }

    @Override
    public String toString() {
        return "Not null";
    }

    static {
        b = new hB[]{a};
    }
}

