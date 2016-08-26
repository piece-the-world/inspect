/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.h;

import com.growingio.a.a.h.aj;
import com.growingio.a.a.h.al;
import com.growingio.a.a.h.am;

abstract class ak
extends Enum<ak>
implements am {
    public static final /* enum */ ak a = new al("INSTANCE", 0);
    private static final /* synthetic */ ak[] b;

    public static ak[] a() {
        return (ak[])b.clone();
    }

    public static ak a(String string) {
        return (ak)Enum.valueOf(ak.class, string);
    }

    private ak() {
        super(string, n2);
    }

    /* synthetic */ ak(String string, int n2, aj aj2) {
        this();
    }

    static {
        b = new ak[]{a};
    }
}

