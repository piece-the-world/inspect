/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.aq;

final class ay
extends Enum<ay>
implements aq<Object, Object> {
    public static final /* enum */ ay a = new ay();
    private static final /* synthetic */ ay[] b;

    public static ay[] a() {
        return (ay[])b.clone();
    }

    public static ay a(String string) {
        return (ay)Enum.valueOf(ay.class, string);
    }

    private ay() {
        super(string, n2);
    }

    @Override
    public Object f(Object object) {
        return object;
    }

    public String toString() {
        return "Functions.identity()";
    }

    static {
        b = new ay[]{a};
    }
}

