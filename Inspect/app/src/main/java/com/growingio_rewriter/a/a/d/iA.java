/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aq;
import com.growingio.a.a.d.iB;
import com.growingio.a.a.d.iC;
import com.growingio.a.a.d.ij;
import java.util.Map;

abstract class iA
extends Enum<iA>
implements aq<Map.Entry<?, ?>, Object> {
    public static final /* enum */ iA a = new iB("KEY", 0);
    public static final /* enum */ iA b = new iC("VALUE", 1);
    private static final /* synthetic */ iA[] c;

    public static iA[] a() {
        return (iA[])c.clone();
    }

    public static iA a(String string) {
        return (iA)Enum.valueOf(iA.class, string);
    }

    private iA() {
        super(string, n2);
    }

    /* synthetic */ iA(String string, int n2, ij ij2) {
        this();
    }

    static {
        c = new iA[]{a, b};
    }
}

