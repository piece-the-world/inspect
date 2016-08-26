/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.bG;
import com.growingio.a.a.b.bL;

final class bM
extends Enum<bM>
implements bL<Object> {
    public static final /* enum */ bM a = new bM();
    private static final /* synthetic */ bM[] b;

    public static bM[] a() {
        return (bM[])b.clone();
    }

    public static bM a(String string) {
        return (bM)Enum.valueOf(bM.class, string);
    }

    private bM() {
        super(string, n2);
    }

    public Object a(bG<Object> bG2) {
        return bG2.a();
    }

    public String toString() {
        return "Suppliers.supplierFunction()";
    }

    @Override
    public /* synthetic */ Object f(Object object) {
        return this.a((bG)object);
    }

    static {
        b = new bM[]{a};
    }
}

