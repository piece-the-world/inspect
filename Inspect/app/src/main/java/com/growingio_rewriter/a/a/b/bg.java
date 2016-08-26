/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.aV;
import com.growingio.a.a.b.aX;
import com.growingio.a.a.b.bh;
import com.growingio.a.a.b.bi;
import com.growingio.a.a.b.bj;
import com.growingio.a.a.b.bk;

abstract class bg
extends Enum<bg>
implements aV<Object> {
    public static final /* enum */ bg a = new bh("ALWAYS_TRUE", 0);
    public static final /* enum */ bg b = new bi("ALWAYS_FALSE", 1);
    public static final /* enum */ bg c = new bj("IS_NULL", 2);
    public static final /* enum */ bg d = new bk("NOT_NULL", 3);
    private static final /* synthetic */ bg[] e;

    public static bg[] a() {
        return (bg[])e.clone();
    }

    public static bg a(String string) {
        return (bg)Enum.valueOf(bg.class, string);
    }

    private bg() {
        super(string, n2);
    }

    <T> aV<T> b() {
        return this;
    }

    /* synthetic */ bg(String string, int n2, aX aX2) {
        this();
    }

    static {
        e = new bg[]{a, b, c, d};
    }
}

