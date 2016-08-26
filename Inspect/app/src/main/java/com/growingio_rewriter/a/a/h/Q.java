/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.h;

import com.growingio.a.a.b.bG;
import com.growingio.a.a.h.O;
import com.growingio.a.a.h.R;
import com.growingio.a.a.h.S;
import java.util.zip.Checksum;

abstract class Q
extends Enum<Q>
implements bG<Checksum> {
    public static final /* enum */ Q a = new R("CRC_32", 0, 32);
    public static final /* enum */ Q b = new S("ADLER_32", 1, 32);
    private final int c;
    private static final /* synthetic */ Q[] d;

    public static Q[] b() {
        return (Q[])d.clone();
    }

    public static Q a(String string) {
        return (Q)Enum.valueOf(Q.class, string);
    }

    private Q(int n3) {
        super(string, n2);
        this.c = n3;
    }

    public abstract Checksum c();

    @Override
    public /* synthetic */ Object a() {
        return this.c();
    }

    static /* synthetic */ int a(Q q2) {
        return q2.c;
    }

    /* synthetic */ Q(String string, int n2, int n3, O o2) {
        this(n3);
    }

    static {
        d = new Q[]{a, b};
    }
}

