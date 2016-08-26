/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.o.a.bA;
import com.growingio.a.a.o.a.bD;

final class bC
extends Enum<bC>
implements bA {
    public static final /* enum */ bC a = new bC();
    private static final ClassValue<Boolean> b;
    private static final /* synthetic */ bC[] c;

    public static bC[] a() {
        return (bC[])c.clone();
    }

    public static bC a(String string) {
        return (bC)Enum.valueOf(bC.class, string);
    }

    private bC() {
        super(string, n2);
    }

    @Override
    public void a(Class<? extends Exception> class_) {
        b.get(class_);
    }

    static {
        c = new bC[]{a};
        b = new bD();
    }
}

