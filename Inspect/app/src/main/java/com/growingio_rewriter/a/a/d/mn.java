/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.mi;
import com.growingio.a.a.d.mo;
import com.growingio.a.a.d.mp;
import com.growingio.a.a.d.mq;
import com.growingio.a.a.d.mr;
import com.growingio.a.a.d.ms;
import java.util.Comparator;
import java.util.List;

public abstract class mn
extends Enum<mn> {
    public static final /* enum */ mn a = new mo("ANY_PRESENT", 0);
    public static final /* enum */ mn b = new mp("LAST_PRESENT", 1);
    public static final /* enum */ mn c = new mq("FIRST_PRESENT", 2);
    public static final /* enum */ mn d = new mr("FIRST_AFTER", 3);
    public static final /* enum */ mn e = new ms("LAST_BEFORE", 4);
    private static final /* synthetic */ mn[] f;

    public static mn[] a() {
        return (mn[])f.clone();
    }

    public static mn a(String string) {
        return (mn)((Object)Enum.valueOf(mn.class, string));
    }

    private mn() {
        super(string, n2);
    }

    abstract <E> int a(Comparator<? super E> var1, E var2, List<? extends E> var3, int var4);

    /* synthetic */ mn(String string, int n2, mi mi2) {
        this();
    }

    static {
        f = new mn[]{a, b, c, d, e};
    }
}

