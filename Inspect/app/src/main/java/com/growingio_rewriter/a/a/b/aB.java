/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.aq;

final class aB
extends Enum<aB>
implements aq<Object, String> {
    public static final /* enum */ aB a = new aB();
    private static final /* synthetic */ aB[] b;

    public static aB[] a() {
        return (aB[])b.clone();
    }

    public static aB a(String string) {
        return (aB)Enum.valueOf(aB.class, string);
    }

    private aB() {
        super(string, n2);
    }

    public String a(Object object) {
        aU.a(object);
        return object.toString();
    }

    public String toString() {
        return "Functions.toStringFunction()";
    }

    @Override
    public /* synthetic */ Object f(Object object) {
        return this.a(object);
    }

    static {
        b = new aB[]{a};
    }
}

