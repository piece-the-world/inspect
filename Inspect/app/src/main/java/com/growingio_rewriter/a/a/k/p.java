/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.k;

import com.growingio.a.a.k.o;
import com.growingio.a.a.k.q;
import com.growingio.a.a.k.r;

abstract class p
extends Enum<p> {
    public static final /* enum */ p a = new q("SMALL", 0);
    public static final /* enum */ p b = new r("LARGE", 1);
    private static final /* synthetic */ p[] c;

    public static p[] a() {
        return (p[])c.clone();
    }

    public static p a(String string) {
        return (p)((Object)Enum.valueOf(p.class, string));
    }

    private p() {
        super(string, n2);
    }

    static boolean a(long l2, long l3) {
        return (l3 <= 3037000499L ? a : b).c(l2, l3);
    }

    abstract long a(long var1, long var3, long var5);

    abstract long b(long var1, long var3);

    private long b(long l2, long l3, long l4) {
        long l5 = 1;
        while (l3 != 0) {
            if ((l3 & 1) != 0) {
                l5 = this.a(l5, l2, l4);
            }
            l2 = this.b(l2, l4);
            l3 >>= 1;
        }
        return l5;
    }

    private boolean c(long l2, long l3) {
        int n2 = Long.numberOfTrailingZeros(l3 - 1);
        long l4 = l3 - 1 >> n2;
        if ((l2 %= l3) == 0) {
            return true;
        }
        long l5 = this.b(l2, l4, l3);
        if (l5 == 1) {
            return true;
        }
        int n3 = 0;
        while (l5 != l3 - 1) {
            if (++n3 == n2) {
                return false;
            }
            l5 = this.b(l5, l3);
        }
        return true;
    }

    /* synthetic */ p(String string, int n2, o o2) {
        this();
    }

    static {
        c = new p[]{a, b};
    }
}

